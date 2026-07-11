package net.satan.deco_bm.block;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import net.satan.deco_bm.block.util.BMWeatheringCopper;

public class BMWeatheringCopperBarsBlock extends IronBarsBlock implements BMWeatheringCopper {
    private final BMWeatheringCopper.WeatherState weatherState;

    public BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState p_154951_, BlockBehaviour.Properties p_154953_) {
        super(p_154953_);
        this.weatherState = p_154951_;
    }

    public void randomTick(BlockState p_222675_, ServerLevel p_222676_, BlockPos p_222677_, RandomSource p_222678_) {
        this.onRandomTick(p_222675_, p_222676_, p_222677_, p_222678_);
    }

    public boolean isRandomlyTicking(BlockState p_154961_) {
        return BMWeatheringCopper.getNext(p_154961_.getBlock()).isPresent();
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = entity.getMainHandItem();
        if (itemStack.is(Items.HONEYCOMB)) {
            BMWeatheringCopper.getWaxed(state).map((blockState) -> {
                if (entity instanceof ServerPlayer) {CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)entity, pos, itemStack);}
                if (!entity.isCreative()) {
                    itemStack.shrink(1);
                }
                level.setBlock(pos, blockState, 11);
                level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(entity, blockState));
                level.playSound(entity, pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(entity, 3003, pos, 0);
                return InteractionResult.sidedSuccess(level.isClientSide);
            });
        }
        return InteractionResult.PASS;
    }

    @Override
    public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ToolAction itemAbility, boolean simulate) {
        if (ToolActions.AXE_SCRAPE == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
            return BMWeatheringCopper.getPrevious(blockstate.getBlock()).map((state) ->
                    state.withPropertiesOf(blockstate)).orElse(null);
        }
        return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
    }

    public BMWeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}