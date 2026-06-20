package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.block.util.VitrageDye;

import net.satan.deco_bm.datagen.util.DecoSupGen;
import net.satan.deco_bm.register.DecoBlocks;
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

    private BlockModelBuilder vitragePaneModels (RegistryObject<Block> block) {
        String mId1 = satans_deco_bm.MODID;
        RegistryObject<Block> textureBlock = block;
        String texturePath = block.getId().getPath().replace("_vitrage_pane","_bars");
        if(texturePath.equals("iron_bars")) {
            textureBlock = RegistryObject.create(new ResourceLocation("minecraft", "iron_bars"), ForgeRegistries.BLOCKS);;
            mId1 = "minecraft";}
        else textureBlock = DecoBlocks.getByName(texturePath);

        String name = block.getId().toString();
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = DecoSupGen.getDecoNonWaxed(textureBlock);
        String blockId = BMV1SupGen.BlockIdFilter(textureBlock);
        String mId = BMV1SupGen.ModIdFilter(textureBlock);

        ResourceLocation bars = new ResourceLocation(mId1, "block/" + textureBlock.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);

        ResourceLocation pane0 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(0)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane1 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(1)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane2 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(2)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane3 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(3)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane4 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(4)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane5 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(5)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane6 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(6)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane7 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(7)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane8 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(8)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane9 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(9)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane10 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(10)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane11 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(11)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane12 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(12)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane13 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(13)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane14 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(14)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane15 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(15)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane16 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(16)).toString().replace("Optional[","").replace("]",""));


        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                decoPanePost(name, bars, edge),
                vitragePaneSide(name, bars, bars, pane0, edge), vitragePaneSideAlt(name, bars, bars, pane0, edge),
                vitragePaneSide(name+"_white", bars, bars, pane1, edge), vitragePaneSideAlt(name+"_white", bars, bars, pane1, edge),
                vitragePaneSide(name+"_orange", bars, bars, pane2, edge), vitragePaneSideAlt(name+"_orange", bars, bars, pane2, edge),
                vitragePaneSide(name+"_magenta", bars, bars, pane3, edge), vitragePaneSideAlt(name+"_magenta", bars, bars, pane3, edge),
                vitragePaneSide(name+"_light_blue", bars, bars, pane4, edge), vitragePaneSideAlt(name+"_light_blue", bars, bars, pane4, edge),
                vitragePaneSide(name+"_yellow", bars, bars, pane5, edge), vitragePaneSideAlt(name+"_yellow", bars, bars, pane5, edge),
                vitragePaneSide(name+"_lime", bars, bars, pane6, edge), vitragePaneSideAlt(name+"_lime", bars, bars, pane6, edge),
                vitragePaneSide(name+"_pink", bars, bars, pane7, edge), vitragePaneSideAlt(name+"_pink", bars, bars, pane7, edge),
                vitragePaneSide(name+"_gray", bars, bars, pane8, edge), vitragePaneSideAlt(name+"_gray", bars, bars, pane8, edge),
                vitragePaneSide(name+"_light_gray", bars, bars, pane9, edge), vitragePaneSideAlt(name+"_light_gray", bars, bars, pane9, edge),
                vitragePaneSide(name+"_cyan", bars, bars, pane10, edge), vitragePaneSideAlt(name+"_cyan", bars, bars, pane10, edge),
                vitragePaneSide(name+"_purple", bars, bars, pane11, edge), vitragePaneSideAlt(name+"_purple", bars, bars, pane11, edge),
                vitragePaneSide(name+"_blue", bars, bars, pane12, edge), vitragePaneSideAlt(name+"_blue", bars, bars, pane12, edge),
                vitragePaneSide(name+"_brown", bars, bars, pane13, edge), vitragePaneSideAlt(name+"_brown", bars, bars, pane13, edge),
                vitragePaneSide(name+"_green", bars, bars, pane14, edge), vitragePaneSideAlt(name+"_green", bars, bars, pane14, edge),
                vitragePaneSide(name+"_red", bars, bars, pane15, edge), vitragePaneSideAlt(name+"_red", bars, bars, pane15, edge),
                vitragePaneSide(name+"_black", bars, bars, pane16, edge), vitragePaneSideAlt(name+"_black", bars, bars, pane16, edge)
                )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder vitragePanelModels(RegistryObject<Block> block) {
        String texturePath = block.getId().getPath().replace("_vitrage_panel", "_panel");
        RegistryObject<Block> textureBlock = DecoBlocks.getByName(texturePath);
        String name = block.getId().toString();
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = DecoSupGen.getDecoNonWaxed(textureBlock);

        ResourceLocation texture1 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,0));
        ResourceLocation texture2 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,1));
        ResourceLocation texture3 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,2));
        ResourceLocation texture4 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMV1SupGen.getPanelTexture(textureBlock,3));

        ResourceLocation pane0 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(0)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane1 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(1)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane2 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(2)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane3 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(3)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane4 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(4)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane5 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(5)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane6 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(6)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane7 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(7)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane8 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(8)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane9 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(9)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane10 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(10)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane11 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(11)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane12 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(12)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane13 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(13)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane14 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(14)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane15 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(15)).toString().replace("Optional[","").replace("]",""));
        ResourceLocation pane16 = new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(16)).toString().replace("Optional[","").replace("]",""));

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(vitragePanelBars(name+"rotation_0", texture1, texture1),
                vitragePanelBars(name+"rotation_1", texture2, texture2),
                vitragePanelBars(name+"rotation_2", texture3, texture3),
                vitragePanelBars(name+"rotation_3", texture4, texture4),

                vitragePanelPane(name, pane0), vitragePanelPane(name+"_white", pane1),
                vitragePanelPane(name+"_orange", pane2), vitragePanelPane(name+"_magenta", pane3),
                vitragePanelPane(name+"_light_blue", pane4), vitragePanelPane(name+"_yellow", pane5),
                vitragePanelPane(name+"_lime", pane6), vitragePanelPane(name+"_pink", pane7),
                vitragePanelPane(name+"_gray", pane8), vitragePanelPane(name+"_light_gray", pane9),
                vitragePanelPane(name+"_cyan", pane10), vitragePanelPane(name+"_purple", pane11),
                vitragePanelPane(name+"_blue", pane12), vitragePanelPane(name+"_brown", pane13),
                vitragePanelPane(name+"_green", pane14), vitragePanelPane(name+"_red", pane15),
                vitragePanelPane(name+"_black", pane16)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    //models
    public BlockModelBuilder barsPost(String name, ResourceLocation particle, ResourceLocation bars) {
        return withExistingParent(name + "_post", new ResourceLocation("block/iron_bars_post"))
                .texture("particle", particle)
                .texture("bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsPostEnds(String name, ResourceLocation particle, ResourceLocation edge) {
        return withExistingParent(name + "_post_ends", new ResourceLocation("block/iron_bars_post_ends"))
                .texture("particle", particle)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsCap(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_cap", new ResourceLocation("block/iron_bars_cap"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsCapAlt(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_cap_alt", new ResourceLocation("block/iron_bars_cap_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder vitragePaneSide(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation pane, ResourceLocation edge) {
        return withExistingParent(name + "_side", new ResourceLocation(satans_deco_bm.MODID, "block/vitrage/vitrage_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("pane", pane)
                .texture("edge", edge).renderType("translucent");
    }

    public BlockModelBuilder vitragePaneSideAlt(String name, ResourceLocation particle, ResourceLocation bars,
                                                ResourceLocation pane, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt", new ResourceLocation(satans_deco_bm.MODID, "block/vitrage/vitrage_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("pane", pane)
                .texture("edge", edge).renderType("translucent");
    }

    public BlockModelBuilder decoPanePost(String name, ResourceLocation pane, ResourceLocation edge) {
        return withExistingParent(name + "_post",  new ResourceLocation(satans_deco_bm.MODID, "block/vitrage/vitrage_post"))
                .texture("edge", edge);
    }

    public BlockModelBuilder decoPaneNoSide(String name, ResourceLocation pane) {
        return singleTexture(name + "_noside", new ResourceLocation( "block/template_glass_pane_noside"), "pane", pane);
    }

    public BlockModelBuilder decoPaneNoSideAlt(String name, ResourceLocation pane) {
        return singleTexture(name + "_noside_alt", new ResourceLocation("block/template_glass_pane_noside_alt"), "pane", pane);
    }

    public BlockModelBuilder vitragePanelPane(String name, ResourceLocation pane) {
        return singleTexture(name + "_pane", new ResourceLocation(satans_deco_bm.MODID, "block/vitrage/vitrage_panel_pane"), "pane", pane).renderType("translucent");
    }

    public BlockModelBuilder vitragePanelBars(String name, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name, new ResourceLocation(satans_deco_bm.MODID, "block/vitrage/vitrage_panel_bars"))
                .texture("particle", bars)
                .texture("edge", edge)
                .texture("bars", bars).renderType("cutout_mipped");
    }
    
}