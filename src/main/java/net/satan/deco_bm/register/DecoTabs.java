package net.satan.deco_bm.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_bm.satans_deco_bm;

public class DecoTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, satans_deco_bm.MODID);
//Tabs go here
public static final RegistryObject<CreativeModeTab> BARS_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("bars_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(DecoBlocks.GOLD_BARS.get()))
                .title(Component.translatable("creativetab.bars_tab"))
                .displayItems((ItemDisplayParameters, output) -> {
                    output.accept(DecoBlocks.IRON_BARS1.get());
                    output.accept(DecoBlocks.IRON_BARS2.get());
                    output.accept(DecoBlocks.IRON_BARS3.get());
                    output.accept(DecoBlocks.IRON_BARS4.get());
                    output.accept(DecoBlocks.IRON_BARS5.get());
                    output.accept(DecoBlocks.IRON_BARS6.get());
                    output.accept(DecoBlocks.IRON_BARS7.get());
                    output.accept(DecoBlocks.IRON_BARS8.get());
                    output.accept(DecoBlocks.IRON_BARS9.get());
                    output.accept(DecoBlocks.IRON_BARS10.get());
                    output.accept(DecoBlocks.IRON_BARS11.get());
                    output.accept(DecoBlocks.IRON_BARS12.get());
                    output.accept(DecoBlocks.IRON_BARS13.get());
                    output.accept(DecoBlocks.IRON_BARS14.get());
                    output.accept(DecoBlocks.IRON_BARS15.get());
                    output.accept(DecoBlocks.IRON_BARS16.get());
                    output.accept(DecoBlocks.IRON_BARS17.get());
                    output.accept(DecoBlocks.IRON_BARS18.get());
                    output.accept(DecoBlocks.IRON_BARS19.get());
                    output.accept(DecoBlocks.IRON_BARS20.get());
                    output.accept(DecoBlocks.IRON_BARS21.get());
                    output.accept(DecoBlocks.IRON_BARS22.get());
                    output.accept(DecoBlocks.IRON_BARS23.get());
                    output.accept(DecoBlocks.IRON_BARS24.get());
                    output.accept(DecoBlocks.IRON_BARS26.get());
                    output.accept(DecoBlocks.IRON_BARS27.get());
                    output.accept(DecoBlocks.IRON_BARS28.get());
                    output.accept(DecoBlocks.IRON_BARS30.get());
                    output.accept(DecoBlocks.IRON_BARS33.get());
                    output.accept(DecoBlocks.IRON_BARS34.get());

                    output.accept(DecoBlocks.GOLD_BARS.get());
                    output.accept(DecoBlocks.GOLD_BARS1.get());
                    output.accept(DecoBlocks.GOLD_BARS2.get());
                    output.accept(DecoBlocks.GOLD_BARS3.get());
                    output.accept(DecoBlocks.GOLD_BARS4.get());
                    output.accept(DecoBlocks.GOLD_BARS5.get());
                    output.accept(DecoBlocks.GOLD_BARS6.get());
                    output.accept(DecoBlocks.GOLD_BARS7.get());
                    output.accept(DecoBlocks.GOLD_BARS8.get());
                    output.accept(DecoBlocks.GOLD_BARS9.get());
                    output.accept(DecoBlocks.GOLD_BARS10.get());
                    output.accept(DecoBlocks.GOLD_BARS11.get());
                    output.accept(DecoBlocks.GOLD_BARS12.get());
                    output.accept(DecoBlocks.GOLD_BARS13.get());
                    output.accept(DecoBlocks.GOLD_BARS14.get());
                    output.accept(DecoBlocks.GOLD_BARS15.get());
                    output.accept(DecoBlocks.GOLD_BARS16.get());
                    output.accept(DecoBlocks.GOLD_BARS17.get());
                    output.accept(DecoBlocks.GOLD_BARS18.get());
                    output.accept(DecoBlocks.GOLD_BARS19.get());
                    output.accept(DecoBlocks.GOLD_BARS20.get());
                    output.accept(DecoBlocks.GOLD_BARS21.get());
                    output.accept(DecoBlocks.GOLD_BARS22.get());
                    output.accept(DecoBlocks.GOLD_BARS23.get());
                    output.accept(DecoBlocks.GOLD_BARS24.get());
                    output.accept(DecoBlocks.GOLD_BARS26.get());
                    output.accept(DecoBlocks.GOLD_BARS27.get());
                    output.accept(DecoBlocks.GOLD_BARS28.get());
                    output.accept(DecoBlocks.GOLD_BARS30.get());
                    output.accept(DecoBlocks.GOLD_BARS33.get());
                    output.accept(DecoBlocks.GOLD_BARS34.get());

                    output.accept(DecoBlocks.EMERALD_BARS.get());
                    output.accept(DecoBlocks.EMERALD_BARS1.get());
                    output.accept(DecoBlocks.EMERALD_BARS2.get());
                    output.accept(DecoBlocks.EMERALD_BARS3.get());
                    output.accept(DecoBlocks.EMERALD_BARS4.get());
                    output.accept(DecoBlocks.EMERALD_BARS5.get());
                    output.accept(DecoBlocks.EMERALD_BARS6.get());
                    output.accept(DecoBlocks.EMERALD_BARS7.get());
                    output.accept(DecoBlocks.EMERALD_BARS8.get());
                    output.accept(DecoBlocks.EMERALD_BARS9.get());
                    output.accept(DecoBlocks.EMERALD_BARS10.get());
                    output.accept(DecoBlocks.EMERALD_BARS11.get());
                    output.accept(DecoBlocks.EMERALD_BARS12.get());
                    output.accept(DecoBlocks.EMERALD_BARS13.get());
                    output.accept(DecoBlocks.EMERALD_BARS14.get());
                    output.accept(DecoBlocks.EMERALD_BARS15.get());
                    output.accept(DecoBlocks.EMERALD_BARS16.get());
                    output.accept(DecoBlocks.EMERALD_BARS17.get());
                    output.accept(DecoBlocks.EMERALD_BARS18.get());
                    output.accept(DecoBlocks.EMERALD_BARS19.get());
                    output.accept(DecoBlocks.EMERALD_BARS20.get());
                    output.accept(DecoBlocks.EMERALD_BARS21.get());
                    output.accept(DecoBlocks.EMERALD_BARS22.get());
                    output.accept(DecoBlocks.EMERALD_BARS23.get());
                    output.accept(DecoBlocks.EMERALD_BARS24.get());
                    output.accept(DecoBlocks.EMERALD_BARS26.get());
                    output.accept(DecoBlocks.EMERALD_BARS27.get());
                    output.accept(DecoBlocks.EMERALD_BARS28.get());
                    output.accept(DecoBlocks.EMERALD_BARS30.get());
                    output.accept(DecoBlocks.EMERALD_BARS33.get());
                    output.accept(DecoBlocks.EMERALD_BARS34.get());

                    output.accept(DecoBlocks.DARKMETAL_BARS.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS1.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS2.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS3.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS4.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS5.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS6.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS7.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS8.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS9.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS10.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS11.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS12.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS13.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS14.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS15.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS16.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS17.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS18.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS19.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS20.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS21.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS22.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS23.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS24.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS26.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS27.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS28.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS30.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS33.get());
                    output.accept(DecoBlocks.DARKMETAL_BARS34.get());

                    output.accept(DecoBlocks.CLOUD_BARS.get());
                    output.accept(DecoBlocks.CLOUD_BARS1.get());
                    output.accept(DecoBlocks.CLOUD_BARS2.get());
                    output.accept(DecoBlocks.CLOUD_BARS3.get());
                    output.accept(DecoBlocks.CLOUD_BARS4.get());
                    output.accept(DecoBlocks.CLOUD_BARS5.get());
                    output.accept(DecoBlocks.CLOUD_BARS6.get());
                    output.accept(DecoBlocks.CLOUD_BARS7.get());
                    output.accept(DecoBlocks.CLOUD_BARS8.get());
                    output.accept(DecoBlocks.CLOUD_BARS9.get());
                    output.accept(DecoBlocks.CLOUD_BARS10.get());
                    output.accept(DecoBlocks.CLOUD_BARS11.get());
                    output.accept(DecoBlocks.CLOUD_BARS12.get());
                    output.accept(DecoBlocks.CLOUD_BARS13.get());
                    output.accept(DecoBlocks.CLOUD_BARS14.get());
                    output.accept(DecoBlocks.CLOUD_BARS15.get());
                    output.accept(DecoBlocks.CLOUD_BARS16.get());
                    output.accept(DecoBlocks.CLOUD_BARS17.get());
                    output.accept(DecoBlocks.CLOUD_BARS18.get());
                    output.accept(DecoBlocks.CLOUD_BARS19.get());
                    output.accept(DecoBlocks.CLOUD_BARS20.get());
                    output.accept(DecoBlocks.CLOUD_BARS21.get());
                    output.accept(DecoBlocks.CLOUD_BARS22.get());
                    output.accept(DecoBlocks.CLOUD_BARS23.get());
                    output.accept(DecoBlocks.CLOUD_BARS24.get());
                    output.accept(DecoBlocks.CLOUD_BARS26.get());
                    output.accept(DecoBlocks.CLOUD_BARS27.get());
                    output.accept(DecoBlocks.CLOUD_BARS28.get());
                    output.accept(DecoBlocks.CLOUD_BARS30.get());
                    output.accept(DecoBlocks.CLOUD_BARS33.get());
                    output.accept(DecoBlocks.CLOUD_BARS34.get());

                    output.accept(DecoBlocks.COPPER_BARS.get());
                    output.accept(DecoBlocks.COPPER_BARS1.get());
                    output.accept(DecoBlocks.COPPER_BARS2.get());
                    output.accept(DecoBlocks.COPPER_BARS3.get());
                    output.accept(DecoBlocks.COPPER_BARS4.get());
                    output.accept(DecoBlocks.COPPER_BARS5.get());
                    output.accept(DecoBlocks.COPPER_BARS6.get());
                    output.accept(DecoBlocks.COPPER_BARS7.get());
                    output.accept(DecoBlocks.COPPER_BARS8.get());
                    output.accept(DecoBlocks.COPPER_BARS9.get());
                    output.accept(DecoBlocks.COPPER_BARS10.get());
                    output.accept(DecoBlocks.COPPER_BARS11.get());
                    output.accept(DecoBlocks.COPPER_BARS12.get());
                    output.accept(DecoBlocks.COPPER_BARS13.get());
                    output.accept(DecoBlocks.COPPER_BARS14.get());
                    output.accept(DecoBlocks.COPPER_BARS15.get());
                    output.accept(DecoBlocks.COPPER_BARS16.get());
                    output.accept(DecoBlocks.COPPER_BARS17.get());
                    output.accept(DecoBlocks.COPPER_BARS18.get());
                    output.accept(DecoBlocks.COPPER_BARS19.get());
                    output.accept(DecoBlocks.COPPER_BARS20.get());
                    output.accept(DecoBlocks.COPPER_BARS21.get());
                    output.accept(DecoBlocks.COPPER_BARS22.get());
                    output.accept(DecoBlocks.COPPER_BARS23.get());
                    output.accept(DecoBlocks.COPPER_BARS24.get());
                    output.accept(DecoBlocks.COPPER_BARS26.get());
                    output.accept(DecoBlocks.COPPER_BARS27.get());
                    output.accept(DecoBlocks.COPPER_BARS28.get());
                    output.accept(DecoBlocks.COPPER_BARS30.get());
                    output.accept(DecoBlocks.COPPER_BARS33.get());
                    output.accept(DecoBlocks.COPPER_BARS34.get());

                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.EXPOSED_COPPER_BARS34.get());

                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.WEATHERED_COPPER_BARS34.get());

                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.OXIDIZED_COPPER_BARS34.get());

                    output.accept(DecoBlocks.WAXED_COPPER_BARS.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.WAXED_COPPER_BARS34.get());

                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_BARS34.get());

                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_BARS34.get());

                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33.get());
                    output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34.get());

                })
                .build());

    public static final RegistryObject<CreativeModeTab> PANELS_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("panels_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DecoBlocks.GOLD_PANEL3.get()))
                    .title(Component.translatable("creativetab.panels_tab"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(DecoBlocks.IRON_PANEL1.get());
                        output.accept(DecoBlocks.IRON_PANEL2.get());
                        output.accept(DecoBlocks.IRON_PANEL3.get());

                        output.accept(DecoBlocks.GOLD_PANEL1.get());
                        output.accept(DecoBlocks.GOLD_PANEL2.get());
                        output.accept(DecoBlocks.GOLD_PANEL3.get());

                        output.accept(DecoBlocks.EMERALD_PANEL1.get());
                        output.accept(DecoBlocks.EMERALD_PANEL2.get());
                        output.accept(DecoBlocks.EMERALD_PANEL3.get());

                        output.accept(DecoBlocks.DARKMETAL_PANEL1.get());
                        output.accept(DecoBlocks.DARKMETAL_PANEL2.get());
                        output.accept(DecoBlocks.DARKMETAL_PANEL3.get());

                        output.accept(DecoBlocks.CLOUD_PANEL1.get());
                        output.accept(DecoBlocks.CLOUD_PANEL2.get());
                        output.accept(DecoBlocks.CLOUD_PANEL3.get());

                        output.accept(DecoBlocks.COPPER_PANEL1.get());
                        output.accept(DecoBlocks.COPPER_PANEL2.get());
                        output.accept(DecoBlocks.COPPER_PANEL3.get());

                        output.accept(DecoBlocks.EXPOSED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.EXPOSED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.EXPOSED_COPPER_PANEL3.get());

                        output.accept(DecoBlocks.WEATHERED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.WEATHERED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.WEATHERED_COPPER_PANEL3.get());

                        output.accept(DecoBlocks.OXIDIZED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.OXIDIZED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.OXIDIZED_COPPER_PANEL3.get());

                        output.accept(DecoBlocks.WAXED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.WAXED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.WAXED_COPPER_PANEL3.get());

                        output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3.get());

                        output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3.get());

                        output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get());
                        output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get());
                        output.accept(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3.get());

                    })
                    .build());


    //Tabs end here
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
