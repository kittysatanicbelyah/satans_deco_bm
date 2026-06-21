package net.satan.deco_bm.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.satan.deco_bm.block.util.VitrageDye;
import net.satan.deco_bm.register.DecoSounds;

public class VitragePaneBlock extends IronBarsBlock {

    public static final EnumProperty<VitrageDye> VITRAGE_DYE = VitrageDye.VITRAGE_DYE;

    public VitragePaneBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(NORTH, Boolean.valueOf(false))
                .setValue(EAST, Boolean.valueOf(false))
                .setValue(SOUTH, Boolean.valueOf(false))
                .setValue(WEST, Boolean.valueOf(false))
                .setValue(WATERLOGGED, Boolean.valueOf(false))
                .setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, "NONE")));
    }

@Override
protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(NORTH, EAST, WEST, SOUTH, WATERLOGGED, VITRAGE_DYE);
}

@Override
public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return hasCollision ? super.getCollisionShape(state, level, pos, context) : Shapes.empty();
}

@Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        VitrageDye dye = VitrageDye.getDye(state);
        int dyeId = 0;
        if (entity.getMainHandItem().getItem() instanceof DyeItem) {
            ItemStack itemStack = entity.getMainHandItem();
            dyeId = (DyeColor.getColor(itemStack).getId() + 1);
            if (dyeId == dye.getId()) return InteractionResult.PASS;

            if (dye != VitrageDye.NONE) {
                level.addFreshEntity(vitrageDyeDropEntity(level, pos, dye));
            }

            level.playSound(entity, pos, DecoSounds.VITRAGE_IMPORT.get(), SoundSource.BLOCKS, 1.0F, 1.0F);

            String dyeName = VitrageDye.getById(dyeId).getSerializedName().toUpperCase();
            level.setBlock(pos, state.setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, dyeName)), 4);

            if (!entity.isCreative()) itemStack.shrink(1);
            return InteractionResult.SUCCESS;
        }
        else if (!entity.isShiftKeyDown() && entity.getMainHandItem().isEmpty() && dye != VitrageDye.NONE) {
            level.setBlock(pos, state.setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, "NONE")), 4);

            level.addFreshEntity(vitrageDyeDropEntity(level, pos, dye));

            level.playSound(entity, pos, DecoSounds.VITRAGE_EXPORT.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, moving);
        boolean isPowered = level.hasNeighborSignal(pos);
        if (!level.isClientSide() && isPowered && VitrageDye.getDye(state) != VitrageDye.NONE) {
                VitrageDye dye = VitrageDye.getDye(state);
                level.setBlockAndUpdate(pos, state.setValue(VITRAGE_DYE, Enum.valueOf(VitrageDye.class, "NONE")));
                level.addFreshEntity(vitrageDyeDropEntity(level, pos, dye));

                level.playSound((Entity) null, pos, DecoSounds.VITRAGE_EXPORT.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
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

    //supply methods

    public static ItemEntity vitrageDyeDropEntity(Level level, BlockPos pos, VitrageDye dye) {
        Item item = VitrageDye.getVanillaDye(dye).get();
        ItemStack itemDrop = new ItemStack(item, 1);
        ItemEntity dropEntity = new ItemEntity(
                level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, itemDrop);
        dropEntity.setDefaultPickUpDelay();
        return dropEntity;
    }
}