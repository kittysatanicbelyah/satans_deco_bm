package net.satan.deco_bm.block;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import net.satan.deco_bm.block.util.BMWeatheringCopper;

public class BMWaxedBarsBlock extends IronBarsBlock {
    public BMWaxedBarsBlock(Properties p_154953_) {
        super(p_154953_);
    }

    @Override
    public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ToolAction itemAbility, boolean simulate) {
        if (ToolActions.AXE_WAX_OFF == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
            return BMWeatheringCopper.getNonWaxed(blockstate.getBlock()).map((state) ->
                    state.withPropertiesOf(blockstate)).orElse(null);
        }
        return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
    }
}