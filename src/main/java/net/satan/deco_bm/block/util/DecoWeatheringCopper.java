package net.satan.deco_bm.block.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

import net.satan.deco_bm.register.DecoBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface DecoWeatheringCopper extends ChangeOverTimeBlock<DecoWeatheringCopper.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                //bars
                .put(DecoBlocks.COPPER_BARS.get(), DecoBlocks.EXPOSED_COPPER_BARS.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoBlocks.WEATHERED_COPPER_BARS.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoBlocks.OXIDIZED_COPPER_BARS.get())
                .put(DecoBlocks.COPPER_BARS1.get(), DecoBlocks.EXPOSED_COPPER_BARS1.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS1.get(), DecoBlocks.WEATHERED_COPPER_BARS1.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS1.get(), DecoBlocks.OXIDIZED_COPPER_BARS1.get())
                .put(DecoBlocks.COPPER_BARS2.get(), DecoBlocks.EXPOSED_COPPER_BARS2.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS2.get(), DecoBlocks.WEATHERED_COPPER_BARS2.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS2.get(), DecoBlocks.OXIDIZED_COPPER_BARS2.get())
                .put(DecoBlocks.COPPER_BARS3.get(), DecoBlocks.EXPOSED_COPPER_BARS3.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS3.get(), DecoBlocks.WEATHERED_COPPER_BARS3.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS3.get(), DecoBlocks.OXIDIZED_COPPER_BARS3.get())
                .put(DecoBlocks.COPPER_BARS4.get(), DecoBlocks.EXPOSED_COPPER_BARS4.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS4.get(), DecoBlocks.WEATHERED_COPPER_BARS4.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS4.get(), DecoBlocks.OXIDIZED_COPPER_BARS4.get())
                .put(DecoBlocks.COPPER_BARS5.get(), DecoBlocks.EXPOSED_COPPER_BARS5.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS5.get(), DecoBlocks.WEATHERED_COPPER_BARS5.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS5.get(), DecoBlocks.OXIDIZED_COPPER_BARS5.get())
                .put(DecoBlocks.COPPER_BARS6.get(), DecoBlocks.EXPOSED_COPPER_BARS6.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS6.get(), DecoBlocks.WEATHERED_COPPER_BARS6.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS6.get(), DecoBlocks.OXIDIZED_COPPER_BARS6.get())
                .put(DecoBlocks.COPPER_BARS7.get(), DecoBlocks.EXPOSED_COPPER_BARS7.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS7.get(), DecoBlocks.WEATHERED_COPPER_BARS7.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS7.get(), DecoBlocks.OXIDIZED_COPPER_BARS7.get())
                .put(DecoBlocks.COPPER_BARS8.get(), DecoBlocks.EXPOSED_COPPER_BARS8.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS8.get(), DecoBlocks.WEATHERED_COPPER_BARS8.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS8.get(), DecoBlocks.OXIDIZED_COPPER_BARS8.get())
                .put(DecoBlocks.COPPER_BARS9.get(), DecoBlocks.EXPOSED_COPPER_BARS9.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS9.get(), DecoBlocks.WEATHERED_COPPER_BARS9.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS9.get(), DecoBlocks.OXIDIZED_COPPER_BARS9.get())
                .put(DecoBlocks.COPPER_BARS10.get(), DecoBlocks.EXPOSED_COPPER_BARS10.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS10.get(), DecoBlocks.WEATHERED_COPPER_BARS10.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS10.get(), DecoBlocks.OXIDIZED_COPPER_BARS10.get())
                .put(DecoBlocks.COPPER_BARS11.get(), DecoBlocks.EXPOSED_COPPER_BARS11.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS11.get(), DecoBlocks.WEATHERED_COPPER_BARS11.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS11.get(), DecoBlocks.OXIDIZED_COPPER_BARS11.get())
                .put(DecoBlocks.COPPER_BARS12.get(), DecoBlocks.EXPOSED_COPPER_BARS12.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS12.get(), DecoBlocks.WEATHERED_COPPER_BARS12.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS12.get(), DecoBlocks.OXIDIZED_COPPER_BARS12.get())
                .put(DecoBlocks.COPPER_BARS13.get(), DecoBlocks.EXPOSED_COPPER_BARS13.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS13.get(), DecoBlocks.WEATHERED_COPPER_BARS13.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS13.get(), DecoBlocks.OXIDIZED_COPPER_BARS13.get())
                .put(DecoBlocks.COPPER_BARS14.get(), DecoBlocks.EXPOSED_COPPER_BARS14.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS14.get(), DecoBlocks.WEATHERED_COPPER_BARS14.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS14.get(), DecoBlocks.OXIDIZED_COPPER_BARS14.get())
                .put(DecoBlocks.COPPER_BARS15.get(), DecoBlocks.EXPOSED_COPPER_BARS15.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS15.get(), DecoBlocks.WEATHERED_COPPER_BARS15.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS15.get(), DecoBlocks.OXIDIZED_COPPER_BARS15.get())
                .put(DecoBlocks.COPPER_BARS16.get(), DecoBlocks.EXPOSED_COPPER_BARS16.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS16.get(), DecoBlocks.WEATHERED_COPPER_BARS16.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS16.get(), DecoBlocks.OXIDIZED_COPPER_BARS16.get())
                .put(DecoBlocks.COPPER_BARS17.get(), DecoBlocks.EXPOSED_COPPER_BARS17.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS17.get(), DecoBlocks.WEATHERED_COPPER_BARS17.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS17.get(), DecoBlocks.OXIDIZED_COPPER_BARS17.get())
                .put(DecoBlocks.COPPER_BARS18.get(), DecoBlocks.EXPOSED_COPPER_BARS18.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS18.get(), DecoBlocks.WEATHERED_COPPER_BARS18.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS18.get(), DecoBlocks.OXIDIZED_COPPER_BARS18.get())
                .put(DecoBlocks.COPPER_BARS19.get(), DecoBlocks.EXPOSED_COPPER_BARS19.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS19.get(), DecoBlocks.WEATHERED_COPPER_BARS19.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS19.get(), DecoBlocks.OXIDIZED_COPPER_BARS19.get())
                .put(DecoBlocks.COPPER_BARS20.get(), DecoBlocks.EXPOSED_COPPER_BARS20.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS20.get(), DecoBlocks.WEATHERED_COPPER_BARS20.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS20.get(), DecoBlocks.OXIDIZED_COPPER_BARS20.get())
                .put(DecoBlocks.COPPER_BARS21.get(), DecoBlocks.EXPOSED_COPPER_BARS21.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS21.get(), DecoBlocks.WEATHERED_COPPER_BARS21.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS21.get(), DecoBlocks.OXIDIZED_COPPER_BARS21.get())
                .put(DecoBlocks.COPPER_BARS22.get(), DecoBlocks.EXPOSED_COPPER_BARS22.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS22.get(), DecoBlocks.WEATHERED_COPPER_BARS22.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS22.get(), DecoBlocks.OXIDIZED_COPPER_BARS22.get())
                .put(DecoBlocks.COPPER_BARS23.get(), DecoBlocks.EXPOSED_COPPER_BARS23.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS23.get(), DecoBlocks.WEATHERED_COPPER_BARS23.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS23.get(), DecoBlocks.OXIDIZED_COPPER_BARS23.get())
                .put(DecoBlocks.COPPER_BARS24.get(), DecoBlocks.EXPOSED_COPPER_BARS24.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS24.get(), DecoBlocks.WEATHERED_COPPER_BARS24.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS24.get(), DecoBlocks.OXIDIZED_COPPER_BARS24.get())
                .put(DecoBlocks.COPPER_BARS26.get(), DecoBlocks.EXPOSED_COPPER_BARS26.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS26.get(), DecoBlocks.WEATHERED_COPPER_BARS26.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS26.get(), DecoBlocks.OXIDIZED_COPPER_BARS26.get())
                .put(DecoBlocks.COPPER_BARS27.get(), DecoBlocks.EXPOSED_COPPER_BARS27.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS27.get(), DecoBlocks.WEATHERED_COPPER_BARS27.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS27.get(), DecoBlocks.OXIDIZED_COPPER_BARS27.get())
                .put(DecoBlocks.COPPER_BARS28.get(), DecoBlocks.EXPOSED_COPPER_BARS28.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS28.get(), DecoBlocks.WEATHERED_COPPER_BARS28.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS28.get(), DecoBlocks.OXIDIZED_COPPER_BARS28.get())
                .put(DecoBlocks.COPPER_BARS30.get(), DecoBlocks.EXPOSED_COPPER_BARS30.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS30.get(), DecoBlocks.WEATHERED_COPPER_BARS30.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS30.get(), DecoBlocks.OXIDIZED_COPPER_BARS30.get())
                .put(DecoBlocks.COPPER_BARS33.get(), DecoBlocks.EXPOSED_COPPER_BARS33.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS33.get(), DecoBlocks.WEATHERED_COPPER_BARS33.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS33.get(), DecoBlocks.OXIDIZED_COPPER_BARS33.get())
                .put(DecoBlocks.COPPER_BARS34.get(), DecoBlocks.EXPOSED_COPPER_BARS34.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS34.get(), DecoBlocks.WEATHERED_COPPER_BARS34.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS34.get(), DecoBlocks.OXIDIZED_COPPER_BARS34.get())

                //panels

                .put(DecoBlocks.COPPER_PANEL1.get(), DecoBlocks.EXPOSED_COPPER_PANEL1.get())
                .put(DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoBlocks.WEATHERED_COPPER_PANEL1.get())
                .put(DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoBlocks.OXIDIZED_COPPER_PANEL1.get())
                .put(DecoBlocks.COPPER_PANEL2.get(), DecoBlocks.EXPOSED_COPPER_PANEL2.get())
                .put(DecoBlocks.EXPOSED_COPPER_PANEL2.get(), DecoBlocks.WEATHERED_COPPER_PANEL2.get())
                .put(DecoBlocks.WEATHERED_COPPER_PANEL2.get(), DecoBlocks.OXIDIZED_COPPER_PANEL2.get())
                .put(DecoBlocks.COPPER_PANEL3.get(), DecoBlocks.EXPOSED_COPPER_PANEL3.get())
                .put(DecoBlocks.EXPOSED_COPPER_PANEL3.get(), DecoBlocks.WEATHERED_COPPER_PANEL3.get())
                .put(DecoBlocks.WEATHERED_COPPER_PANEL3.get(), DecoBlocks.OXIDIZED_COPPER_PANEL3.get())


                .build();
    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return NEXT_BY_BLOCK.get().inverse();
    });
    Supplier<BiMap<Block, Block>> WAX_ON_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                //bars
                .put(DecoBlocks.COPPER_BARS.get(), DecoBlocks.WAXED_COPPER_BARS.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get())
                .put(DecoBlocks.COPPER_BARS1.get(), DecoBlocks.WAXED_COPPER_BARS1.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS1.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS1.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS1.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS1.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS1.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1.get())
                .put(DecoBlocks.COPPER_BARS2.get(), DecoBlocks.WAXED_COPPER_BARS2.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS2.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS2.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS2.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS2.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS2.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2.get())
                .put(DecoBlocks.COPPER_BARS3.get(), DecoBlocks.WAXED_COPPER_BARS3.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS3.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS3.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS3.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS3.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS3.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3.get())
                .put(DecoBlocks.COPPER_BARS4.get(), DecoBlocks.WAXED_COPPER_BARS4.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS4.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS4.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS4.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS4.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS4.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4.get())
                .put(DecoBlocks.COPPER_BARS5.get(), DecoBlocks.WAXED_COPPER_BARS5.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS5.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS5.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS5.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS5.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS5.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5.get())
                .put(DecoBlocks.COPPER_BARS6.get(), DecoBlocks.WAXED_COPPER_BARS6.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS6.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS6.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS6.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS6.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS6.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6.get())
                .put(DecoBlocks.COPPER_BARS7.get(), DecoBlocks.WAXED_COPPER_BARS7.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS7.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS7.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS7.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS7.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS7.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7.get())
                .put(DecoBlocks.COPPER_BARS8.get(), DecoBlocks.WAXED_COPPER_BARS8.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS8.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS8.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS8.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS8.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS8.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8.get())
                .put(DecoBlocks.COPPER_BARS9.get(), DecoBlocks.WAXED_COPPER_BARS9.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS9.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS9.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS9.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS9.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS9.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9.get())
                .put(DecoBlocks.COPPER_BARS10.get(), DecoBlocks.WAXED_COPPER_BARS10.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS10.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS10.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS10.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS10.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS10.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10.get())
                .put(DecoBlocks.COPPER_BARS11.get(), DecoBlocks.WAXED_COPPER_BARS11.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS11.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS11.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS11.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS11.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS11.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11.get())
                .put(DecoBlocks.COPPER_BARS12.get(), DecoBlocks.WAXED_COPPER_BARS12.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS12.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS12.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS12.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS12.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS12.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12.get())
                .put(DecoBlocks.COPPER_BARS13.get(), DecoBlocks.WAXED_COPPER_BARS13.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS13.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS13.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS13.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS13.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS13.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13.get())
                .put(DecoBlocks.COPPER_BARS14.get(), DecoBlocks.WAXED_COPPER_BARS14.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS14.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS14.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS14.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS14.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS14.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14.get())
                .put(DecoBlocks.COPPER_BARS15.get(), DecoBlocks.WAXED_COPPER_BARS15.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS15.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS15.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS15.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS15.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS15.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15.get())
                .put(DecoBlocks.COPPER_BARS16.get(), DecoBlocks.WAXED_COPPER_BARS16.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS16.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS16.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS16.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS16.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS16.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16.get())
                .put(DecoBlocks.COPPER_BARS17.get(), DecoBlocks.WAXED_COPPER_BARS17.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS17.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS17.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS17.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS17.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS17.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17.get())
                .put(DecoBlocks.COPPER_BARS18.get(), DecoBlocks.WAXED_COPPER_BARS18.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS18.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS18.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS18.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS18.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS18.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18.get())
                .put(DecoBlocks.COPPER_BARS19.get(), DecoBlocks.WAXED_COPPER_BARS19.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS19.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS19.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS19.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS19.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS19.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19.get())
                .put(DecoBlocks.COPPER_BARS20.get(), DecoBlocks.WAXED_COPPER_BARS20.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS20.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS20.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS20.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS20.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS20.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20.get())
                .put(DecoBlocks.COPPER_BARS21.get(), DecoBlocks.WAXED_COPPER_BARS21.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS21.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS21.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS21.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS21.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS21.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21.get())
                .put(DecoBlocks.COPPER_BARS22.get(), DecoBlocks.WAXED_COPPER_BARS22.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS22.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS22.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS22.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS22.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS22.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22.get())
                .put(DecoBlocks.COPPER_BARS23.get(), DecoBlocks.WAXED_COPPER_BARS23.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS23.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS23.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS23.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS23.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS23.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23.get())
                .put(DecoBlocks.COPPER_BARS24.get(), DecoBlocks.WAXED_COPPER_BARS24.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS24.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS24.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS24.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS24.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS24.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24.get())
                .put(DecoBlocks.COPPER_BARS26.get(), DecoBlocks.WAXED_COPPER_BARS26.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS26.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS26.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS26.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS26.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS26.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26.get())
                .put(DecoBlocks.COPPER_BARS27.get(), DecoBlocks.WAXED_COPPER_BARS27.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS27.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS27.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS27.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS27.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS27.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27.get())
                .put(DecoBlocks.COPPER_BARS28.get(), DecoBlocks.WAXED_COPPER_BARS28.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS28.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS28.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS28.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS28.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS28.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28.get())
                .put(DecoBlocks.COPPER_BARS30.get(), DecoBlocks.WAXED_COPPER_BARS30.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS30.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS30.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS30.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS30.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS30.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30.get())
                .put(DecoBlocks.COPPER_BARS33.get(), DecoBlocks.WAXED_COPPER_BARS33.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS33.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS33.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS33.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS33.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS33.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33.get())
                .put(DecoBlocks.COPPER_BARS34.get(), DecoBlocks.WAXED_COPPER_BARS34.get())
                .put(DecoBlocks.EXPOSED_COPPER_BARS34.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS34.get())
                .put(DecoBlocks.WEATHERED_COPPER_BARS34.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS34.get())
                .put(DecoBlocks.OXIDIZED_COPPER_BARS34.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34.get())

                //panels

                .put(DecoBlocks.COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get())
                .put(DecoBlocks.COPPER_PANEL2.get(), DecoBlocks.WAXED_COPPER_PANEL2.get())
                .put(DecoBlocks.COPPER_PANEL3.get(), DecoBlocks.WAXED_COPPER_PANEL3.get())
                .put(DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1.get())
                .put(DecoBlocks.EXPOSED_COPPER_PANEL2.get(), DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2.get())
                .put(DecoBlocks.EXPOSED_COPPER_PANEL3.get(), DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3.get())
                .put(DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1.get())
                .put(DecoBlocks.WEATHERED_COPPER_PANEL2.get(), DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2.get())
                .put(DecoBlocks.WEATHERED_COPPER_PANEL3.get(), DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3.get())
                .put(DecoBlocks.OXIDIZED_COPPER_PANEL1.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get())
                .put(DecoBlocks.OXIDIZED_COPPER_PANEL2.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get())
                .put(DecoBlocks.OXIDIZED_COPPER_PANEL3.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3.get())

                .build();
    });
    Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> {
        return WAX_ON_BY_BLOCK.get().inverse();
    });

    static Optional<BlockState> getWaxed(BlockState state) {
        return getWaxed(state.getBlock()).map((block) -> {
            return block.withPropertiesOf(state);
        });
    }
    static Optional<Block> getWaxed(Block state) {
        return Optional.ofNullable(WAX_ON_BY_BLOCK.get().get(state));
    }

    static Optional<BlockState> getNonWaxed(BlockState state) {
        return getNonWaxed(state.getBlock()).map((block) -> {
            return block.withPropertiesOf(state);
        });
    }
    static Optional<Block> getNonWaxed(Block block) {
        return Optional.ofNullable(WAX_OFF_BY_BLOCK.get().get(block));
    }

    static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }
    static Block getFirst(Block block) {
        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(block); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }
        return block;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((block) -> {
            return block.withPropertiesOf(state);
        });
    }
    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((block) -> {
            return block.withPropertiesOf(state);
        });
    }
    static Optional<Block> getNext(Block state) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(state));
    }

    default float getChanceModifier() {
        return this.getAge() == DecoWeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED
    }
}