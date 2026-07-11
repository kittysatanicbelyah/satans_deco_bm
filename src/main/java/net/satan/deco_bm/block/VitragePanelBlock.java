package net.satan.deco_bm.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;

import net.satan.deco_bm.block.util.VitrageDye;
import net.satan.deco_bm.register.BMSounds;

public class VitragePanelBlock extends TemplatePanelBlock {

    public static final EnumProperty<VitrageDye> VITRAGE_DYE = VitrageDye.VITRAGE_DYE;
    public static final IntegerProperty ROTATION = TemplatePanelBlock.ROTATION;
    public static final EnumProperty<Direction.Axis> AXIS = TemplatePanelBlock.AXIS;

    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public VitragePanelBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.X).setValue(ROTATION,
                        0).setValue(WATERLOGGED, false)
                .setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, "NONE")).setValue(POWERED, false));
    }
@Override
protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(AXIS, ROTATION, WATERLOGGED, VITRAGE_DYE, POWERED);
}
@Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        VitrageDye dye = VitrageDye.getDye(state);
        int dyeId;
        if (entity.getMainHandItem().getItem() instanceof DyeItem) {
            ItemStack itemStack = entity.getMainHandItem();
            dyeId = (DyeColor.getColor(itemStack).getId() + 1);
            if (dyeId == dye.getId()) return InteractionResult.PASS;

            if (dye != VitrageDye.NONE) {
                level.addFreshEntity(VitragePaneBlock.vitrageDyeDropEntity(level, pos, dye));
            }

            level.playSound(entity, pos, BMSounds.VITRAGE_IMPORT.get(), SoundSource.BLOCKS, 1.0F, 1.0F);

            String dyeName = VitrageDye.getById(dyeId).getSerializedName().toUpperCase();
            level.setBlock(pos, state.setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, dyeName)), 4);

            if (!entity.isCreative()) itemStack.shrink(1);
            return InteractionResult.SUCCESS;
        }
        else if (entity.getMainHandItem().isEmpty() && dye != VitrageDye.NONE && entity.isShiftKeyDown()) {
            level.setBlock(pos, state.setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, "NONE")), 4);
            level.addFreshEntity(VitragePaneBlock.vitrageDyeDropEntity(level, pos, dye));

            level.playSound(entity, pos, BMSounds.VITRAGE_EXPORT.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }
            else if (!entity.isShiftKeyDown() && entity.getMainHandItem().isEmpty()) {
            level.playSound(entity, pos, BMSounds.PANEL_ROTATES.get(), SoundSource.BLOCKS, 0.75F, 0.75F);

            level.setBlock(pos, state.setValue(ROTATION, defineNextRotation(state.getValue(ROTATION))), 4);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, moving);
        if (!level.isClientSide) {
            boolean isPowered = level.hasNeighborSignal(pos);
            boolean wasPowered = state.getValue(POWERED);
            if (!wasPowered && isPowered) {
                if (VitrageDye.getDye(state) != VitrageDye.NONE && level.getBestNeighborSignal(pos) <= 7) {
                    VitrageDye dye = VitrageDye.getDye(state);
                    level.setBlock(pos, state.setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, "NONE")), 2);
                    level.addFreshEntity(VitragePaneBlock.vitrageDyeDropEntity(level, pos, dye));

                    level.playSound((Entity) null, pos, BMSounds.VITRAGE_EXPORT.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
                }
                else if (level.getBestNeighborSignal(pos) >= 7) {
                    level.setBlock(pos, state.setValue(ROTATION, defineNextRotation(state.getValue(ROTATION))), 2);

                    level.playSound((Entity) null, pos, BMSounds.PANEL_ROTATES.get(), SoundSource.BLOCKS, 0.75F, 0.75F);
                }
            }
            else if (!isPowered && wasPowered) {
                level.setBlock(pos, state.setValue(POWERED, false), 3);
            }
        }
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState blockstate, Level level, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = super.onDestroyedByPlayer(blockstate, level, pos, entity, willHarvest, fluid);
        VitrageDye dye = VitrageDye.getDye(blockstate);

        if (dye != VitrageDye.NONE) {
            Item item = VitrageDye.getVanillaDye(dye).get();
            ItemStack itemDrop = new ItemStack(item, 1);
            ItemEntity dropEntity = new ItemEntity(
                    level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, itemDrop);
            dropEntity.setDefaultPickUpDelay();
            level.addFreshEntity(dropEntity);
        }
        return retval;
    }

}