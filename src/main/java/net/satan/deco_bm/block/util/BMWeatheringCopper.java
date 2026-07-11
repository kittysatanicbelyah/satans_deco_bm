package net.satan.deco_bm.block.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

import net.satan.deco_bm.register.BMBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface BMWeatheringCopper extends ChangeOverTimeBlock<BMWeatheringCopper.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                //bars
                .put(BMBlocks.COPPER_BARS.get(), BMBlocks.EXPOSED_COPPER_BARS.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS.get(), BMBlocks.WEATHERED_COPPER_BARS.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS.get(), BMBlocks.OXIDIZED_COPPER_BARS.get())
                .put(BMBlocks.COPPER_BARS1.get(), BMBlocks.EXPOSED_COPPER_BARS1.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS1.get(), BMBlocks.WEATHERED_COPPER_BARS1.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS1.get(), BMBlocks.OXIDIZED_COPPER_BARS1.get())
                .put(BMBlocks.COPPER_BARS2.get(), BMBlocks.EXPOSED_COPPER_BARS2.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS2.get(), BMBlocks.WEATHERED_COPPER_BARS2.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS2.get(), BMBlocks.OXIDIZED_COPPER_BARS2.get())
                .put(BMBlocks.COPPER_BARS3.get(), BMBlocks.EXPOSED_COPPER_BARS3.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS3.get(), BMBlocks.WEATHERED_COPPER_BARS3.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS3.get(), BMBlocks.OXIDIZED_COPPER_BARS3.get())
                .put(BMBlocks.COPPER_BARS4.get(), BMBlocks.EXPOSED_COPPER_BARS4.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS4.get(), BMBlocks.WEATHERED_COPPER_BARS4.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS4.get(), BMBlocks.OXIDIZED_COPPER_BARS4.get())
                .put(BMBlocks.COPPER_BARS5.get(), BMBlocks.EXPOSED_COPPER_BARS5.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS5.get(), BMBlocks.WEATHERED_COPPER_BARS5.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS5.get(), BMBlocks.OXIDIZED_COPPER_BARS5.get())
                .put(BMBlocks.COPPER_BARS6.get(), BMBlocks.EXPOSED_COPPER_BARS6.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS6.get(), BMBlocks.WEATHERED_COPPER_BARS6.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS6.get(), BMBlocks.OXIDIZED_COPPER_BARS6.get())
                .put(BMBlocks.COPPER_BARS7.get(), BMBlocks.EXPOSED_COPPER_BARS7.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS7.get(), BMBlocks.WEATHERED_COPPER_BARS7.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS7.get(), BMBlocks.OXIDIZED_COPPER_BARS7.get())
                .put(BMBlocks.COPPER_BARS8.get(), BMBlocks.EXPOSED_COPPER_BARS8.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS8.get(), BMBlocks.WEATHERED_COPPER_BARS8.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS8.get(), BMBlocks.OXIDIZED_COPPER_BARS8.get())
                .put(BMBlocks.COPPER_BARS9.get(), BMBlocks.EXPOSED_COPPER_BARS9.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS9.get(), BMBlocks.WEATHERED_COPPER_BARS9.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS9.get(), BMBlocks.OXIDIZED_COPPER_BARS9.get())
                .put(BMBlocks.COPPER_BARS10.get(), BMBlocks.EXPOSED_COPPER_BARS10.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS10.get(), BMBlocks.WEATHERED_COPPER_BARS10.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS10.get(), BMBlocks.OXIDIZED_COPPER_BARS10.get())
                .put(BMBlocks.COPPER_BARS11.get(), BMBlocks.EXPOSED_COPPER_BARS11.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS11.get(), BMBlocks.WEATHERED_COPPER_BARS11.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS11.get(), BMBlocks.OXIDIZED_COPPER_BARS11.get())
                .put(BMBlocks.COPPER_BARS12.get(), BMBlocks.EXPOSED_COPPER_BARS12.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS12.get(), BMBlocks.WEATHERED_COPPER_BARS12.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS12.get(), BMBlocks.OXIDIZED_COPPER_BARS12.get())
                .put(BMBlocks.COPPER_BARS13.get(), BMBlocks.EXPOSED_COPPER_BARS13.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS13.get(), BMBlocks.WEATHERED_COPPER_BARS13.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS13.get(), BMBlocks.OXIDIZED_COPPER_BARS13.get())
                .put(BMBlocks.COPPER_BARS14.get(), BMBlocks.EXPOSED_COPPER_BARS14.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS14.get(), BMBlocks.WEATHERED_COPPER_BARS14.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS14.get(), BMBlocks.OXIDIZED_COPPER_BARS14.get())
                .put(BMBlocks.COPPER_BARS15.get(), BMBlocks.EXPOSED_COPPER_BARS15.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS15.get(), BMBlocks.WEATHERED_COPPER_BARS15.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS15.get(), BMBlocks.OXIDIZED_COPPER_BARS15.get())
                .put(BMBlocks.COPPER_BARS16.get(), BMBlocks.EXPOSED_COPPER_BARS16.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS16.get(), BMBlocks.WEATHERED_COPPER_BARS16.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS16.get(), BMBlocks.OXIDIZED_COPPER_BARS16.get())
                .put(BMBlocks.COPPER_BARS17.get(), BMBlocks.EXPOSED_COPPER_BARS17.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS17.get(), BMBlocks.WEATHERED_COPPER_BARS17.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS17.get(), BMBlocks.OXIDIZED_COPPER_BARS17.get())
                .put(BMBlocks.COPPER_BARS18.get(), BMBlocks.EXPOSED_COPPER_BARS18.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS18.get(), BMBlocks.WEATHERED_COPPER_BARS18.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS18.get(), BMBlocks.OXIDIZED_COPPER_BARS18.get())
                .put(BMBlocks.COPPER_BARS19.get(), BMBlocks.EXPOSED_COPPER_BARS19.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS19.get(), BMBlocks.WEATHERED_COPPER_BARS19.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS19.get(), BMBlocks.OXIDIZED_COPPER_BARS19.get())
                .put(BMBlocks.COPPER_BARS20.get(), BMBlocks.EXPOSED_COPPER_BARS20.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS20.get(), BMBlocks.WEATHERED_COPPER_BARS20.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS20.get(), BMBlocks.OXIDIZED_COPPER_BARS20.get())
                .put(BMBlocks.COPPER_BARS21.get(), BMBlocks.EXPOSED_COPPER_BARS21.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS21.get(), BMBlocks.WEATHERED_COPPER_BARS21.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS21.get(), BMBlocks.OXIDIZED_COPPER_BARS21.get())
                .put(BMBlocks.COPPER_BARS22.get(), BMBlocks.EXPOSED_COPPER_BARS22.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS22.get(), BMBlocks.WEATHERED_COPPER_BARS22.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS22.get(), BMBlocks.OXIDIZED_COPPER_BARS22.get())
                .put(BMBlocks.COPPER_BARS23.get(), BMBlocks.EXPOSED_COPPER_BARS23.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS23.get(), BMBlocks.WEATHERED_COPPER_BARS23.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS23.get(), BMBlocks.OXIDIZED_COPPER_BARS23.get())
                .put(BMBlocks.COPPER_BARS24.get(), BMBlocks.EXPOSED_COPPER_BARS24.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS24.get(), BMBlocks.WEATHERED_COPPER_BARS24.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS24.get(), BMBlocks.OXIDIZED_COPPER_BARS24.get())
                .put(BMBlocks.COPPER_BARS26.get(), BMBlocks.EXPOSED_COPPER_BARS26.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS26.get(), BMBlocks.WEATHERED_COPPER_BARS26.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS26.get(), BMBlocks.OXIDIZED_COPPER_BARS26.get())
                .put(BMBlocks.COPPER_BARS27.get(), BMBlocks.EXPOSED_COPPER_BARS27.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS27.get(), BMBlocks.WEATHERED_COPPER_BARS27.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS27.get(), BMBlocks.OXIDIZED_COPPER_BARS27.get())
                .put(BMBlocks.COPPER_BARS28.get(), BMBlocks.EXPOSED_COPPER_BARS28.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS28.get(), BMBlocks.WEATHERED_COPPER_BARS28.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS28.get(), BMBlocks.OXIDIZED_COPPER_BARS28.get())
                .put(BMBlocks.COPPER_BARS30.get(), BMBlocks.EXPOSED_COPPER_BARS30.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS30.get(), BMBlocks.WEATHERED_COPPER_BARS30.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS30.get(), BMBlocks.OXIDIZED_COPPER_BARS30.get())
                .put(BMBlocks.COPPER_BARS33.get(), BMBlocks.EXPOSED_COPPER_BARS33.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS33.get(), BMBlocks.WEATHERED_COPPER_BARS33.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS33.get(), BMBlocks.OXIDIZED_COPPER_BARS33.get())
                .put(BMBlocks.COPPER_BARS34.get(), BMBlocks.EXPOSED_COPPER_BARS34.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS34.get(), BMBlocks.WEATHERED_COPPER_BARS34.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS34.get(), BMBlocks.OXIDIZED_COPPER_BARS34.get())

                //panels

                .put(BMBlocks.COPPER_PANEL1.get(), BMBlocks.EXPOSED_COPPER_PANEL1.get())
                .put(BMBlocks.EXPOSED_COPPER_PANEL1.get(), BMBlocks.WEATHERED_COPPER_PANEL1.get())
                .put(BMBlocks.WEATHERED_COPPER_PANEL1.get(), BMBlocks.OXIDIZED_COPPER_PANEL1.get())
                .put(BMBlocks.COPPER_PANEL2.get(), BMBlocks.EXPOSED_COPPER_PANEL2.get())
                .put(BMBlocks.EXPOSED_COPPER_PANEL2.get(), BMBlocks.WEATHERED_COPPER_PANEL2.get())
                .put(BMBlocks.WEATHERED_COPPER_PANEL2.get(), BMBlocks.OXIDIZED_COPPER_PANEL2.get())
                .put(BMBlocks.COPPER_PANEL3.get(), BMBlocks.EXPOSED_COPPER_PANEL3.get())
                .put(BMBlocks.EXPOSED_COPPER_PANEL3.get(), BMBlocks.WEATHERED_COPPER_PANEL3.get())
                .put(BMBlocks.WEATHERED_COPPER_PANEL3.get(), BMBlocks.OXIDIZED_COPPER_PANEL3.get())


                .build();
    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return NEXT_BY_BLOCK.get().inverse();
    });
    Supplier<BiMap<Block, Block>> WAX_ON_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                //bars
                .put(BMBlocks.COPPER_BARS.get(), BMBlocks.WAXED_COPPER_BARS.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS.get())
                .put(BMBlocks.COPPER_BARS1.get(), BMBlocks.WAXED_COPPER_BARS1.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS1.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS1.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS1.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS1.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS1.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS1.get())
                .put(BMBlocks.COPPER_BARS2.get(), BMBlocks.WAXED_COPPER_BARS2.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS2.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS2.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS2.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS2.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS2.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS2.get())
                .put(BMBlocks.COPPER_BARS3.get(), BMBlocks.WAXED_COPPER_BARS3.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS3.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS3.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS3.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS3.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS3.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS3.get())
                .put(BMBlocks.COPPER_BARS4.get(), BMBlocks.WAXED_COPPER_BARS4.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS4.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS4.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS4.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS4.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS4.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS4.get())
                .put(BMBlocks.COPPER_BARS5.get(), BMBlocks.WAXED_COPPER_BARS5.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS5.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS5.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS5.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS5.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS5.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS5.get())
                .put(BMBlocks.COPPER_BARS6.get(), BMBlocks.WAXED_COPPER_BARS6.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS6.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS6.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS6.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS6.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS6.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS6.get())
                .put(BMBlocks.COPPER_BARS7.get(), BMBlocks.WAXED_COPPER_BARS7.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS7.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS7.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS7.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS7.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS7.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS7.get())
                .put(BMBlocks.COPPER_BARS8.get(), BMBlocks.WAXED_COPPER_BARS8.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS8.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS8.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS8.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS8.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS8.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS8.get())
                .put(BMBlocks.COPPER_BARS9.get(), BMBlocks.WAXED_COPPER_BARS9.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS9.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS9.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS9.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS9.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS9.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS9.get())
                .put(BMBlocks.COPPER_BARS10.get(), BMBlocks.WAXED_COPPER_BARS10.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS10.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS10.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS10.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS10.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS10.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS10.get())
                .put(BMBlocks.COPPER_BARS11.get(), BMBlocks.WAXED_COPPER_BARS11.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS11.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS11.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS11.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS11.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS11.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS11.get())
                .put(BMBlocks.COPPER_BARS12.get(), BMBlocks.WAXED_COPPER_BARS12.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS12.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS12.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS12.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS12.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS12.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS12.get())
                .put(BMBlocks.COPPER_BARS13.get(), BMBlocks.WAXED_COPPER_BARS13.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS13.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS13.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS13.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS13.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS13.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS13.get())
                .put(BMBlocks.COPPER_BARS14.get(), BMBlocks.WAXED_COPPER_BARS14.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS14.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS14.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS14.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS14.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS14.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS14.get())
                .put(BMBlocks.COPPER_BARS15.get(), BMBlocks.WAXED_COPPER_BARS15.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS15.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS15.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS15.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS15.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS15.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS15.get())
                .put(BMBlocks.COPPER_BARS16.get(), BMBlocks.WAXED_COPPER_BARS16.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS16.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS16.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS16.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS16.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS16.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS16.get())
                .put(BMBlocks.COPPER_BARS17.get(), BMBlocks.WAXED_COPPER_BARS17.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS17.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS17.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS17.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS17.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS17.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS17.get())
                .put(BMBlocks.COPPER_BARS18.get(), BMBlocks.WAXED_COPPER_BARS18.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS18.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS18.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS18.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS18.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS18.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS18.get())
                .put(BMBlocks.COPPER_BARS19.get(), BMBlocks.WAXED_COPPER_BARS19.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS19.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS19.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS19.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS19.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS19.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS19.get())
                .put(BMBlocks.COPPER_BARS20.get(), BMBlocks.WAXED_COPPER_BARS20.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS20.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS20.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS20.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS20.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS20.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS20.get())
                .put(BMBlocks.COPPER_BARS21.get(), BMBlocks.WAXED_COPPER_BARS21.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS21.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS21.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS21.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS21.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS21.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS21.get())
                .put(BMBlocks.COPPER_BARS22.get(), BMBlocks.WAXED_COPPER_BARS22.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS22.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS22.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS22.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS22.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS22.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS22.get())
                .put(BMBlocks.COPPER_BARS23.get(), BMBlocks.WAXED_COPPER_BARS23.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS23.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS23.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS23.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS23.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS23.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS23.get())
                .put(BMBlocks.COPPER_BARS24.get(), BMBlocks.WAXED_COPPER_BARS24.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS24.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS24.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS24.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS24.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS24.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS24.get())
                .put(BMBlocks.COPPER_BARS26.get(), BMBlocks.WAXED_COPPER_BARS26.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS26.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS26.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS26.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS26.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS26.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS26.get())
                .put(BMBlocks.COPPER_BARS27.get(), BMBlocks.WAXED_COPPER_BARS27.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS27.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS27.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS27.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS27.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS27.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS27.get())
                .put(BMBlocks.COPPER_BARS28.get(), BMBlocks.WAXED_COPPER_BARS28.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS28.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS28.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS28.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS28.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS28.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS28.get())
                .put(BMBlocks.COPPER_BARS30.get(), BMBlocks.WAXED_COPPER_BARS30.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS30.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS30.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS30.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS30.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS30.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS30.get())
                .put(BMBlocks.COPPER_BARS33.get(), BMBlocks.WAXED_COPPER_BARS33.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS33.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS33.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS33.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS33.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS33.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS33.get())
                .put(BMBlocks.COPPER_BARS34.get(), BMBlocks.WAXED_COPPER_BARS34.get())
                .put(BMBlocks.EXPOSED_COPPER_BARS34.get(), BMBlocks.WAXED_EXPOSED_COPPER_BARS34.get())
                .put(BMBlocks.WEATHERED_COPPER_BARS34.get(), BMBlocks.WAXED_WEATHERED_COPPER_BARS34.get())
                .put(BMBlocks.OXIDIZED_COPPER_BARS34.get(), BMBlocks.WAXED_OXIDIZED_COPPER_BARS34.get())

                //panels

                .put(BMBlocks.COPPER_PANEL1.get(), BMBlocks.WAXED_COPPER_PANEL1.get())
                .put(BMBlocks.COPPER_PANEL2.get(), BMBlocks.WAXED_COPPER_PANEL2.get())
                .put(BMBlocks.COPPER_PANEL3.get(), BMBlocks.WAXED_COPPER_PANEL3.get())
                .put(BMBlocks.EXPOSED_COPPER_PANEL1.get(), BMBlocks.WAXED_EXPOSED_COPPER_PANEL1.get())
                .put(BMBlocks.EXPOSED_COPPER_PANEL2.get(), BMBlocks.WAXED_EXPOSED_COPPER_PANEL2.get())
                .put(BMBlocks.EXPOSED_COPPER_PANEL3.get(), BMBlocks.WAXED_EXPOSED_COPPER_PANEL3.get())
                .put(BMBlocks.WEATHERED_COPPER_PANEL1.get(), BMBlocks.WAXED_WEATHERED_COPPER_PANEL1.get())
                .put(BMBlocks.WEATHERED_COPPER_PANEL2.get(), BMBlocks.WAXED_WEATHERED_COPPER_PANEL2.get())
                .put(BMBlocks.WEATHERED_COPPER_PANEL3.get(), BMBlocks.WAXED_WEATHERED_COPPER_PANEL3.get())
                .put(BMBlocks.OXIDIZED_COPPER_PANEL1.get(), BMBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get())
                .put(BMBlocks.OXIDIZED_COPPER_PANEL2.get(), BMBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get())
                .put(BMBlocks.OXIDIZED_COPPER_PANEL3.get(), BMBlocks.WAXED_OXIDIZED_COPPER_PANEL3.get())

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
        return this.getAge() == BMWeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED
    }
}