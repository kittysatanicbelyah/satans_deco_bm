package net.satan.deco_bm.block;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import net.satan.deco_bm.block.util.BMWeatheringCopper;

public class BMWeatheringCopperBarsBlock extends IronBarsBlock implements BMWeatheringCopper {
    private final WeatherState weatherState;

    public BMWeatheringCopperBarsBlock(WeatherState p_154951_, Properties p_154953_) {
        super(p_154953_);
        this.weatherState = p_154951_;
    }

 //   public void randomTick(BlockState p_222675_, ServerLevel p_222676_, BlockPos p_222677_, RandomSource p_222678_) {
  //      this.randomTick(p_222675_, p_222676_, p_222677_, p_222678_);
  //  }

    public boolean isRandomlyTicking(BlockState p_154961_) {
        return BMWeatheringCopper.getNext(p_154961_.getBlock()).isPresent();
    }
    

    @Override
    public ItemInteractionResult useItemOn(ItemStack item, BlockState state, Level level, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        if (item.is(Items.HONEYCOMB)) {
            BMWeatheringCopper.getWaxed(state).map((blockState) -> {
                if (entity instanceof ServerPlayer) {CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)entity, pos, item);}
                if (!entity.isCreative()) {
                    item.shrink(1);
                }
                level.setBlock(pos, blockState, 11);
                level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(entity, blockState));
                level.playSound(entity, pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(entity, 3003, pos, 0);
                return InteractionResult.sidedSuccess(level.isClientSide);
            });
        }
        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (ItemAbilities.AXE_SCRAPE == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
            return BMWeatheringCopper.getNonWaxed(blockstate.getBlock()).map((state) ->
                    state.withPropertiesOf(blockstate)).orElse(null);
        }
        return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
    }

    public WeatherState getAge() {
        return this.weatherState;
    }
}