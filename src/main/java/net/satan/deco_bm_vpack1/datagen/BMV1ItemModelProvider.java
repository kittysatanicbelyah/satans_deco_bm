package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.data.PackOutput;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.datagen.util.BMSupGen;
import net.satan.deco_bm.register.BMBlocks;
import net.satan.deco_bm_vpack1.register.BMV1Blocks;

import net.satan.deco_bm.satans_deco_bm;
import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

public class BMV1ItemModelProvider extends ItemModelProvider {
    public BMV1ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Satans_deco_bm_vpack1.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //vitrages
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.IRON_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.GOLD_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE34);

        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE1);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE2);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE3);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE4);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE5);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE6);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE7);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE8);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE9);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE10);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE11);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE12);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE13);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE14);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE15);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE16);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE17);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE18);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE19);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE20);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE21);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE22);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE23);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE24);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE26);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE27);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE28);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE30);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE33);
        vitrageTwoLayeredBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE34);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.IRON_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.IRON_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.IRON_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.GOLD_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.GOLD_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.GOLD_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.EMERALD_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.DARKMETAL_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.CLOUD_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL3);

        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL1);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL2);
        vitrageTwoLayeredPanelBlockItem(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL3);

    }

    private ItemModelBuilder vitrageTwoLayeredBlockItem(RegistryObject<Block> block) {
        RegistryObject<Block> textureBlock = block;
        String mId = satans_deco_bm.MODID;
        String texturePath = block.getId().getPath().replace("_vitrage_pane","_bars");
        if(texturePath.equals("iron_bars")) {textureBlock = RegistryObject.create(
                    new ResourceLocation("minecraft", "iron_bars"), ForgeRegistries.BLOCKS);
        mId = "minecraft";
        }
        else textureBlock = BMBlocks.getByName(texturePath);
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = BMSupGen.getDecoNonWaxed(textureBlock);
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation("minecraft", "block/glass"))
                .texture("layer1", new ResourceLocation(mId, "block/" + textureBlock.getId().getPath()));
    }

    private ItemModelBuilder vitrageTwoLayeredPanelBlockItem(RegistryObject<Block> block) {
        String mId = satans_deco_bm.MODID;
        String texturePath = block.getId().getPath().replace("_vitrage_panel","_panel");
        RegistryObject<Block> textureBlock = BMBlocks.getByName(texturePath);
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = BMSupGen.getDecoNonWaxed(textureBlock);

        int num1 = (Integer.parseInt(textureBlock.getId().getPath().replaceAll("[^\\d]", "")) * 4) - 3;
        String panel1 = textureBlock.getId().getPath().replaceAll("[\\dl]", "") + num1;

        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation("minecraft", "block/glass"))
                .texture("layer1", new ResourceLocation(mId, "block/" + panel1));
    }
}