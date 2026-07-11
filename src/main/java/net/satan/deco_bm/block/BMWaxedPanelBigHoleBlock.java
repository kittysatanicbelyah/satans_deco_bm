package net.satan.deco_bm.block;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import net.satan.deco_bm.block.util.BMWeatheringCopper;

public class BMWaxedPanelBigHoleBlock extends PanelBigHoleBlock {
    public BMWaxedPanelBigHoleBlock(Properties properties) {
        super(properties);
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