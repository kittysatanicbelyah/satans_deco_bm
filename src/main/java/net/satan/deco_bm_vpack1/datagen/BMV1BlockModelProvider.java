package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.satan.deco_bm.datagen.util.BMSupGen;
import net.satan.deco_bm.register.BMBlocks;
import net.satan.deco_bm.satans_deco_bm;

import net.satan.deco_bm_vpack1.datagen.util.BMV1SupGen;
import net.satan.deco_bm_vpack1.register.BMV1Blocks;
import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

import java.util.Arrays;


public class BMV1BlockModelProvider extends BlockModelProvider {
    public BMV1BlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Satans_deco_bm_vpack1.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
     //blocks go here
        //vitrages
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.IRON_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.GOLD_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.EMERALD_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.DARKMETAL_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.CLOUD_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE34);

        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE1);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE2);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE3);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE4);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE5);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE6);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE7);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE8);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE9);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE10);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE11);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE12);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE13);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE14);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE15);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE16);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE17);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE18);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE19);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE20);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE21);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE22);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE23);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE24);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE26);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE27);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE28);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE30);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE33);
        vitragePaneModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE34);

        //vitrage panels
        vitragePanelModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.CLOUD_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.CLOUD_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.CLOUD_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.DARKMETAL_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.DARKMETAL_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.DARKMETAL_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.EMERALD_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.EMERALD_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.EMERALD_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.GOLD_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.GOLD_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.GOLD_VITRAGE_PANEL3);

        vitragePanelModels(BMV1Blocks.IRON_VITRAGE_PANEL1);
        vitragePanelModels(BMV1Blocks.IRON_VITRAGE_PANEL2);
        vitragePanelModels(BMV1Blocks.IRON_VITRAGE_PANEL3);

        //blocks end here
    }
    //registry objects

    private BlockModelBuilder vitragePaneModels (DeferredBlock<Block> block) {
        String mId1 = satans_deco_bm.MODID;
        DeferredBlock<Block> textureBlock = block;
        String texturePath = block.getId().getPath().replace("_vitrage_pane","_bars");
        if(texturePath.equals("iron_bars")) {
            textureBlock = DeferredBlock.createBlock(ResourceLocation.withDefaultNamespace("iron_bars"));
            mId1 = "minecraft";}
        else textureBlock = (DeferredBlock<Block>) BMBlocks.getByName(texturePath);

        String name = block.getId().toString();
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = BMSupGen.getDecoNonWaxed(textureBlock);
        String blockId = BMV1SupGen.BlockIdFilter(textureBlock);
        String mId = BMV1SupGen.ModIdFilter(textureBlock);

        ResourceLocation bars = ResourceLocation.fromNamespaceAndPath(mId1, "block/" + textureBlock.getId().getPath());
        ResourceLocation edge = ResourceLocation.fromNamespaceAndPath(mId, blockId);

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                decoPanePost(name, edge),
                vitragePaneSide(name, bars, bars, edge),
                vitragePaneSideAlt(name, bars, bars, edge)
                )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder vitragePanelModels(DeferredBlock<Block> block) {
        String texturePath = block.getId().getPath().replace("_vitrage_panel", "_panel");
        DeferredBlock<Block> textureBlock = (DeferredBlock<Block>) BMBlocks.getByName(texturePath);
        String name = block.getId().toString();
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = BMSupGen.getDecoNonWaxed(textureBlock);

        ResourceLocation texture1 = ResourceLocation.fromNamespaceAndPath(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,0));
        ResourceLocation texture2 = ResourceLocation.fromNamespaceAndPath(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,1));
        ResourceLocation texture3 = ResourceLocation.fromNamespaceAndPath(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,2));
        ResourceLocation texture4 = ResourceLocation.fromNamespaceAndPath(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,3));

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(vitragePanelBars(name+"rotation_0", texture1, texture1),
                vitragePanelBars(name+"rotation_1", texture2, texture2),
                vitragePanelBars(name+"rotation_2", texture3, texture3),
                vitragePanelBars(name+"rotation_3", texture4, texture4)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    //models
    public BlockModelBuilder barsPost(String name, ResourceLocation particle, ResourceLocation bars) {
        return withExistingParent(name + "_post", ResourceLocation.withDefaultNamespace("block/iron_bars_post"))
                .texture("particle", particle)
                .texture("bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder vitragePaneSide(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side", ResourceLocation.fromNamespaceAndPath(Satans_deco_bm_vpack1.MODID, "block/vitrage/vitrage_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("translucent");
    }

    public BlockModelBuilder vitragePaneSideAlt(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt", ResourceLocation.fromNamespaceAndPath(Satans_deco_bm_vpack1.MODID, "block/vitrage/vitrage_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("translucent");
    }

    public BlockModelBuilder decoPanePost(String name, ResourceLocation edge) {
        return withExistingParent(name + "_post",  ResourceLocation.fromNamespaceAndPath(Satans_deco_bm_vpack1.MODID, "block/vitrage/vitrage_post"))
                .texture("edge", edge);
    }

    public BlockModelBuilder vitragePanelBars(String name, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name, ResourceLocation.fromNamespaceAndPath(Satans_deco_bm_vpack1.MODID, "block/vitrage/vitrage_panel_bars"))
                .texture("particle", bars)
                .texture("edge", edge)
                .texture("bars", bars).renderType("cutout_mipped");
    }
    
}