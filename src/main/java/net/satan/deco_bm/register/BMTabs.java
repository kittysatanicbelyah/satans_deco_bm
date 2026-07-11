package net.satan.deco_bm.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_bm.satans_deco_bm;

public class BMTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, satans_deco_bm.MODID);
//Tabs go here
public static final RegistryObject<CreativeModeTab> BARS_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("bars_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(BMBlocks.GOLD_BARS.get()))
                .title(Component.translatable("creativetab.bars_tab"))
                .displayItems((ItemDisplayParameters, output) -> {
                    output.accept(BMBlocks.IRON_BARS1.get());
                    output.accept(BMBlocks.IRON_BARS2.get());
                    output.accept(BMBlocks.IRON_BARS3.get());
                    output.accept(BMBlocks.IRON_BARS4.get());
                    output.accept(BMBlocks.IRON_BARS5.get());
                    output.accept(BMBlocks.IRON_BARS6.get());
                    output.accept(BMBlocks.IRON_BARS7.get());
                    output.accept(BMBlocks.IRON_BARS8.get());
                    output.accept(BMBlocks.IRON_BARS9.get());
                    output.accept(BMBlocks.IRON_BARS10.get());
                    output.accept(BMBlocks.IRON_BARS11.get());
                    output.accept(BMBlocks.IRON_BARS12.get());
                    output.accept(BMBlocks.IRON_BARS13.get());
                    output.accept(BMBlocks.IRON_BARS14.get());
                    output.accept(BMBlocks.IRON_BARS15.get());
                    output.accept(BMBlocks.IRON_BARS16.get());
                    output.accept(BMBlocks.IRON_BARS17.get());
                    output.accept(BMBlocks.IRON_BARS18.get());
                    output.accept(BMBlocks.IRON_BARS19.get());
                    output.accept(BMBlocks.IRON_BARS20.get());
                    output.accept(BMBlocks.IRON_BARS21.get());
                    output.accept(BMBlocks.IRON_BARS22.get());
                    output.accept(BMBlocks.IRON_BARS23.get());
                    output.accept(BMBlocks.IRON_BARS24.get());
                    output.accept(BMBlocks.IRON_BARS26.get());
                    output.accept(BMBlocks.IRON_BARS27.get());
                    output.accept(BMBlocks.IRON_BARS28.get());
                    output.accept(BMBlocks.IRON_BARS30.get());
                    output.accept(BMBlocks.IRON_BARS33.get());
                    output.accept(BMBlocks.IRON_BARS34.get());

                    output.accept(BMBlocks.GOLD_BARS.get());
                    output.accept(BMBlocks.GOLD_BARS1.get());
                    output.accept(BMBlocks.GOLD_BARS2.get());
                    output.accept(BMBlocks.GOLD_BARS3.get());
                    output.accept(BMBlocks.GOLD_BARS4.get());
                    output.accept(BMBlocks.GOLD_BARS5.get());
                    output.accept(BMBlocks.GOLD_BARS6.get());
                    output.accept(BMBlocks.GOLD_BARS7.get());
                    output.accept(BMBlocks.GOLD_BARS8.get());
                    output.accept(BMBlocks.GOLD_BARS9.get());
                    output.accept(BMBlocks.GOLD_BARS10.get());
                    output.accept(BMBlocks.GOLD_BARS11.get());
                    output.accept(BMBlocks.GOLD_BARS12.get());
                    output.accept(BMBlocks.GOLD_BARS13.get());
                    output.accept(BMBlocks.GOLD_BARS14.get());
                    output.accept(BMBlocks.GOLD_BARS15.get());
                    output.accept(BMBlocks.GOLD_BARS16.get());
                    output.accept(BMBlocks.GOLD_BARS17.get());
                    output.accept(BMBlocks.GOLD_BARS18.get());
                    output.accept(BMBlocks.GOLD_BARS19.get());
                    output.accept(BMBlocks.GOLD_BARS20.get());
                    output.accept(BMBlocks.GOLD_BARS21.get());
                    output.accept(BMBlocks.GOLD_BARS22.get());
                    output.accept(BMBlocks.GOLD_BARS23.get());
                    output.accept(BMBlocks.GOLD_BARS24.get());
                    output.accept(BMBlocks.GOLD_BARS26.get());
                    output.accept(BMBlocks.GOLD_BARS27.get());
                    output.accept(BMBlocks.GOLD_BARS28.get());
                    output.accept(BMBlocks.GOLD_BARS30.get());
                    output.accept(BMBlocks.GOLD_BARS33.get());
                    output.accept(BMBlocks.GOLD_BARS34.get());

                    output.accept(BMBlocks.EMERALD_BARS.get());
                    output.accept(BMBlocks.EMERALD_BARS1.get());
                    output.accept(BMBlocks.EMERALD_BARS2.get());
                    output.accept(BMBlocks.EMERALD_BARS3.get());
                    output.accept(BMBlocks.EMERALD_BARS4.get());
                    output.accept(BMBlocks.EMERALD_BARS5.get());
                    output.accept(BMBlocks.EMERALD_BARS6.get());
                    output.accept(BMBlocks.EMERALD_BARS7.get());
                    output.accept(BMBlocks.EMERALD_BARS8.get());
                    output.accept(BMBlocks.EMERALD_BARS9.get());
                    output.accept(BMBlocks.EMERALD_BARS10.get());
                    output.accept(BMBlocks.EMERALD_BARS11.get());
                    output.accept(BMBlocks.EMERALD_BARS12.get());
                    output.accept(BMBlocks.EMERALD_BARS13.get());
                    output.accept(BMBlocks.EMERALD_BARS14.get());
                    output.accept(BMBlocks.EMERALD_BARS15.get());
                    output.accept(BMBlocks.EMERALD_BARS16.get());
                    output.accept(BMBlocks.EMERALD_BARS17.get());
                    output.accept(BMBlocks.EMERALD_BARS18.get());
                    output.accept(BMBlocks.EMERALD_BARS19.get());
                    output.accept(BMBlocks.EMERALD_BARS20.get());
                    output.accept(BMBlocks.EMERALD_BARS21.get());
                    output.accept(BMBlocks.EMERALD_BARS22.get());
                    output.accept(BMBlocks.EMERALD_BARS23.get());
                    output.accept(BMBlocks.EMERALD_BARS24.get());
                    output.accept(BMBlocks.EMERALD_BARS26.get());
                    output.accept(BMBlocks.EMERALD_BARS27.get());
                    output.accept(BMBlocks.EMERALD_BARS28.get());
                    output.accept(BMBlocks.EMERALD_BARS30.get());
                    output.accept(BMBlocks.EMERALD_BARS33.get());
                    output.accept(BMBlocks.EMERALD_BARS34.get());

                    output.accept(BMBlocks.DARKMETAL_BARS.get());
                    output.accept(BMBlocks.DARKMETAL_BARS1.get());
                    output.accept(BMBlocks.DARKMETAL_BARS2.get());
                    output.accept(BMBlocks.DARKMETAL_BARS3.get());
                    output.accept(BMBlocks.DARKMETAL_BARS4.get());
                    output.accept(BMBlocks.DARKMETAL_BARS5.get());
                    output.accept(BMBlocks.DARKMETAL_BARS6.get());
                    output.accept(BMBlocks.DARKMETAL_BARS7.get());
                    output.accept(BMBlocks.DARKMETAL_BARS8.get());
                    output.accept(BMBlocks.DARKMETAL_BARS9.get());
                    output.accept(BMBlocks.DARKMETAL_BARS10.get());
                    output.accept(BMBlocks.DARKMETAL_BARS11.get());
                    output.accept(BMBlocks.DARKMETAL_BARS12.get());
                    output.accept(BMBlocks.DARKMETAL_BARS13.get());
                    output.accept(BMBlocks.DARKMETAL_BARS14.get());
                    output.accept(BMBlocks.DARKMETAL_BARS15.get());
                    output.accept(BMBlocks.DARKMETAL_BARS16.get());
                    output.accept(BMBlocks.DARKMETAL_BARS17.get());
                    output.accept(BMBlocks.DARKMETAL_BARS18.get());
                    output.accept(BMBlocks.DARKMETAL_BARS19.get());
                    output.accept(BMBlocks.DARKMETAL_BARS20.get());
                    output.accept(BMBlocks.DARKMETAL_BARS21.get());
                    output.accept(BMBlocks.DARKMETAL_BARS22.get());
                    output.accept(BMBlocks.DARKMETAL_BARS23.get());
                    output.accept(BMBlocks.DARKMETAL_BARS24.get());
                    output.accept(BMBlocks.DARKMETAL_BARS26.get());
                    output.accept(BMBlocks.DARKMETAL_BARS27.get());
                    output.accept(BMBlocks.DARKMETAL_BARS28.get());
                    output.accept(BMBlocks.DARKMETAL_BARS30.get());
                    output.accept(BMBlocks.DARKMETAL_BARS33.get());
                    output.accept(BMBlocks.DARKMETAL_BARS34.get());

                    output.accept(BMBlocks.CLOUD_BARS.get());
                    output.accept(BMBlocks.CLOUD_BARS1.get());
                    output.accept(BMBlocks.CLOUD_BARS2.get());
                    output.accept(BMBlocks.CLOUD_BARS3.get());
                    output.accept(BMBlocks.CLOUD_BARS4.get());
                    output.accept(BMBlocks.CLOUD_BARS5.get());
                    output.accept(BMBlocks.CLOUD_BARS6.get());
                    output.accept(BMBlocks.CLOUD_BARS7.get());
                    output.accept(BMBlocks.CLOUD_BARS8.get());
                    output.accept(BMBlocks.CLOUD_BARS9.get());
                    output.accept(BMBlocks.CLOUD_BARS10.get());
                    output.accept(BMBlocks.CLOUD_BARS11.get());
                    output.accept(BMBlocks.CLOUD_BARS12.get());
                    output.accept(BMBlocks.CLOUD_BARS13.get());
                    output.accept(BMBlocks.CLOUD_BARS14.get());
                    output.accept(BMBlocks.CLOUD_BARS15.get());
                    output.accept(BMBlocks.CLOUD_BARS16.get());
                    output.accept(BMBlocks.CLOUD_BARS17.get());
                    output.accept(BMBlocks.CLOUD_BARS18.get());
                    output.accept(BMBlocks.CLOUD_BARS19.get());
                    output.accept(BMBlocks.CLOUD_BARS20.get());
                    output.accept(BMBlocks.CLOUD_BARS21.get());
                    output.accept(BMBlocks.CLOUD_BARS22.get());
                    output.accept(BMBlocks.CLOUD_BARS23.get());
                    output.accept(BMBlocks.CLOUD_BARS24.get());
                    output.accept(BMBlocks.CLOUD_BARS26.get());
                    output.accept(BMBlocks.CLOUD_BARS27.get());
                    output.accept(BMBlocks.CLOUD_BARS28.get());
                    output.accept(BMBlocks.CLOUD_BARS30.get());
                    output.accept(BMBlocks.CLOUD_BARS33.get());
                    output.accept(BMBlocks.CLOUD_BARS34.get());

                    output.accept(BMBlocks.COPPER_BARS.get());
                    output.accept(BMBlocks.COPPER_BARS1.get());
                    output.accept(BMBlocks.COPPER_BARS2.get());
                    output.accept(BMBlocks.COPPER_BARS3.get());
                    output.accept(BMBlocks.COPPER_BARS4.get());
                    output.accept(BMBlocks.COPPER_BARS5.get());
                    output.accept(BMBlocks.COPPER_BARS6.get());
                    output.accept(BMBlocks.COPPER_BARS7.get());
                    output.accept(BMBlocks.COPPER_BARS8.get());
                    output.accept(BMBlocks.COPPER_BARS9.get());
                    output.accept(BMBlocks.COPPER_BARS10.get());
                    output.accept(BMBlocks.COPPER_BARS11.get());
                    output.accept(BMBlocks.COPPER_BARS12.get());
                    output.accept(BMBlocks.COPPER_BARS13.get());
                    output.accept(BMBlocks.COPPER_BARS14.get());
                    output.accept(BMBlocks.COPPER_BARS15.get());
                    output.accept(BMBlocks.COPPER_BARS16.get());
                    output.accept(BMBlocks.COPPER_BARS17.get());
                    output.accept(BMBlocks.COPPER_BARS18.get());
                    output.accept(BMBlocks.COPPER_BARS19.get());
                    output.accept(BMBlocks.COPPER_BARS20.get());
                    output.accept(BMBlocks.COPPER_BARS21.get());
                    output.accept(BMBlocks.COPPER_BARS22.get());
                    output.accept(BMBlocks.COPPER_BARS23.get());
                    output.accept(BMBlocks.COPPER_BARS24.get());
                    output.accept(BMBlocks.COPPER_BARS26.get());
                    output.accept(BMBlocks.COPPER_BARS27.get());
                    output.accept(BMBlocks.COPPER_BARS28.get());
                    output.accept(BMBlocks.COPPER_BARS30.get());
                    output.accept(BMBlocks.COPPER_BARS33.get());
                    output.accept(BMBlocks.COPPER_BARS34.get());

                    output.accept(BMBlocks.EXPOSED_COPPER_BARS.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS1.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS2.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS3.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS4.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS5.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS6.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS7.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS8.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS9.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS10.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS11.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS12.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS13.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS14.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS15.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS16.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS17.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS18.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS19.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS20.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS21.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS22.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS23.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS24.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS26.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS27.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS28.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS30.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS33.get());
                    output.accept(BMBlocks.EXPOSED_COPPER_BARS34.get());

                    output.accept(BMBlocks.WEATHERED_COPPER_BARS.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS1.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS2.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS3.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS4.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS5.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS6.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS7.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS8.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS9.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS10.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS11.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS12.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS13.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS14.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS15.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS16.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS17.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS18.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS19.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS20.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS21.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS22.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS23.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS24.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS26.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS27.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS28.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS30.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS33.get());
                    output.accept(BMBlocks.WEATHERED_COPPER_BARS34.get());

                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS1.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS2.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS3.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS4.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS5.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS6.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS7.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS8.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS9.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS10.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS11.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS12.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS13.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS14.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS15.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS16.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS17.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS18.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS19.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS20.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS21.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS22.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS23.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS24.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS26.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS27.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS28.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS30.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS33.get());
                    output.accept(BMBlocks.OXIDIZED_COPPER_BARS34.get());

                    output.accept(BMBlocks.WAXED_COPPER_BARS.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS1.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS2.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS3.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS4.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS5.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS6.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS7.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS8.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS9.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS10.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS11.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS12.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS13.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS14.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS15.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS16.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS17.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS18.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS19.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS20.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS21.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS22.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS23.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS24.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS26.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS27.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS28.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS30.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS33.get());
                    output.accept(BMBlocks.WAXED_COPPER_BARS34.get());

                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS1.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS2.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS3.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS4.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS5.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS6.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS7.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS8.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS9.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS10.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS11.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS12.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS13.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS14.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS15.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS16.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS17.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS18.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS19.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS20.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS21.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS22.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS23.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS24.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS26.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS27.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS28.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS30.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS33.get());
                    output.accept(BMBlocks.WAXED_EXPOSED_COPPER_BARS34.get());

                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS1.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS2.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS3.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS4.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS5.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS6.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS7.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS8.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS9.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS10.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS11.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS12.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS13.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS14.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS15.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS16.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS17.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS18.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS19.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS20.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS21.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS22.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS23.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS24.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS26.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS27.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS28.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS30.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS33.get());
                    output.accept(BMBlocks.WAXED_WEATHERED_COPPER_BARS34.get());

                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS1.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS2.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS3.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS4.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS5.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS6.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS7.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS8.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS9.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS10.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS11.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS12.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS13.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS14.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS15.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS16.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS17.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS18.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS19.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS20.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS21.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS22.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS23.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS24.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS26.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS27.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS28.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS30.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS33.get());
                    output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_BARS34.get());

                })
                .build());

    public static final RegistryObject<CreativeModeTab> PANELS_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("panels_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BMBlocks.GOLD_PANEL3.get()))
                    .title(Component.translatable("creativetab.panels_tab"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(BMBlocks.IRON_PANEL1.get());
                        output.accept(BMBlocks.IRON_PANEL2.get());
                        output.accept(BMBlocks.IRON_PANEL3.get());

                        output.accept(BMBlocks.GOLD_PANEL1.get());
                        output.accept(BMBlocks.GOLD_PANEL2.get());
                        output.accept(BMBlocks.GOLD_PANEL3.get());

                        output.accept(BMBlocks.EMERALD_PANEL1.get());
                        output.accept(BMBlocks.EMERALD_PANEL2.get());
                        output.accept(BMBlocks.EMERALD_PANEL3.get());

                        output.accept(BMBlocks.DARKMETAL_PANEL1.get());
                        output.accept(BMBlocks.DARKMETAL_PANEL2.get());
                        output.accept(BMBlocks.DARKMETAL_PANEL3.get());

                        output.accept(BMBlocks.CLOUD_PANEL1.get());
                        output.accept(BMBlocks.CLOUD_PANEL2.get());
                        output.accept(BMBlocks.CLOUD_PANEL3.get());

                        output.accept(BMBlocks.COPPER_PANEL1.get());
                        output.accept(BMBlocks.COPPER_PANEL2.get());
                        output.accept(BMBlocks.COPPER_PANEL3.get());

                        output.accept(BMBlocks.EXPOSED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.EXPOSED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.EXPOSED_COPPER_PANEL3.get());

                        output.accept(BMBlocks.WEATHERED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.WEATHERED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.WEATHERED_COPPER_PANEL3.get());

                        output.accept(BMBlocks.OXIDIZED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.OXIDIZED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.OXIDIZED_COPPER_PANEL3.get());

                        output.accept(BMBlocks.WAXED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.WAXED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.WAXED_COPPER_PANEL3.get());

                        output.accept(BMBlocks.WAXED_EXPOSED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.WAXED_EXPOSED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.WAXED_EXPOSED_COPPER_PANEL3.get());

                        output.accept(BMBlocks.WAXED_WEATHERED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.WAXED_WEATHERED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.WAXED_WEATHERED_COPPER_PANEL3.get());

                        output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get());
                        output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get());
                        output.accept(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL3.get());

                    })
                    .build());


    //Tabs end here
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
