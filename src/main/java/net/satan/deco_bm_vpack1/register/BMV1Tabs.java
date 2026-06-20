package net.satan.deco_bm_vpack1.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.satans_deco_bm;

public class BMV1Tabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, satans_deco_bm.MODID);
    //Tabs go here

    public static final RegistryObject<CreativeModeTab> VITRAGES_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("vitrages_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BMV1Blocks.GOLD_VITRAGE_PANE4.get()))
                    .title(Component.translatable("creativetab.vitrages_tab"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.IRON_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.IRON_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.GOLD_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.EMERALD_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.DARKMETAL_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.CLOUD_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL3.get());

                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE1.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE2.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE3.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE4.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE5.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE6.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE7.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE8.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE9.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE10.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE11.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE12.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE13.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE14.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE15.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE16.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE17.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE18.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE19.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE20.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE21.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE22.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE23.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE24.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE26.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE27.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE28.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE30.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE33.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE34.get());

                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL1.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL2.get());
                        output.accept(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL3.get());
                    })
                    .build());
    //Tabs end here
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
