package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.block.TemplatePanelBlock;
import net.satan.deco_bm.block.util.VitrageDye;

import net.satan.deco_bm.datagen.util.DecoSupGen;
import net.satan.deco_bm.register.DecoBlocks;
import net.satan.deco_bm.satans_deco_bm;
import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;
import net.satan.deco_bm_vpack1.datagen.util.BMV1SupGen;
import net.satan.deco_bm_vpack1.register.BMV1Blocks;

import java.util.concurrent.CompletableFuture;

public class BMV1BlockStateProvider extends BlockStateProvider {
    public BMV1BlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Satans_deco_bm_vpack1.MODID, existingFileHelper);
        this.bmv1BlockModels = new BMV1BlockModelProvider(output, existingFileHelper) {
            @Override public CompletableFuture<?> run(CachedOutput cache) { return CompletableFuture.allOf(); }

            @Override protected void registerModels() {}
        };
    }
    private final BMV1BlockModelProvider bmv1BlockModels;
//inputs
@Override
    protected void registerStatesAndModels() {
    
    //vitrages
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE34, 0);

    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE34, 0);

    //vitrage panels
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.WAXED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.CLOUD_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.DARKMETAL_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.EMERALD_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.GOLD_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(BMV1Blocks.IRON_VITRAGE_PANEL3, 1);
    

}

    //inputs manipulation
    
    //vitrage panes and panels
    private void vitragePaneBlockState(RegistryObject<Block> block, int option) {
        String blockId = null;
        String mId = null;
        String texturePath = block.getId().getPath();
        String mId1 = satans_deco_bm.MODID;
        RegistryObject<Block> textureBlock = block;
        if (option == 0) {texturePath = block.getId().getPath().replace("_vitrage_pane","_bars");
            if(texturePath.equals("iron_bars")) {
                textureBlock = RegistryObject.create(new ResourceLocation("minecraft", "iron_bars"), ForgeRegistries.BLOCKS);;
                mId1 = "minecraft";}
            else textureBlock = DecoBlocks.getByName(texturePath);

            if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = DecoSupGen.getDecoNonWaxed(textureBlock);
            blockId = BMV1SupGen.BlockIdFilter(textureBlock);
            mId = BMV1SupGen.ModIdFilter(textureBlock);
        }
        if (option == 1) {texturePath = block.getId().getPath().replace("_vitrage_panel","_panel");
            textureBlock = DecoBlocks.getByName(texturePath);
            if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = DecoSupGen.getDecoNonWaxed(textureBlock);
        }


        if(option == 0) {
            vitragePaneBlockInternal(block.get(), block.getId().toString(),
                    new ResourceLocation(mId1, "block/" + textureBlock.getId().getPath()),
                    new ResourceLocation(mId1, "block/" + textureBlock.getId().getPath()),
                    new ResourceLocation(mId, blockId),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(0)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(1)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(2)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(3)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(4)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(5)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(6)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(7)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(8)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(9)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(10)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(11)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(12)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(13)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(14)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(15)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(16)).toString().replace("Optional[","").replace("]",""))
                    );
        }
        if(option == 1) {
            vitragePanelBlockInternal(block.get(), block.getId().toString(),
                    new ResourceLocation(mId1, "block/" + textureBlock.getId().getPath().replace("l", "")),
                    new ResourceLocation(mId1, "block/" + textureBlock.getId().getPath().replace("l", "")),
                    new ResourceLocation(mId1, "block/" + textureBlock.getId().getPath().replace("l", "")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(0)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(1)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(2)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(3)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(4)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(5)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(6)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(7)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(8)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(9)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(10)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(11)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(12)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(13)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(14)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(15)).toString().replace("Optional[","").replace("]","")),
                    new ResourceLocation("minecraft", VitrageDye.getTextureGlass(VitrageDye.getById(16)).toString().replace("Optional[","").replace("]",""))
            );
        }
    }

    private void vitragePaneBlockInternal(Block block, String baseName, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge,
                                          ResourceLocation pane0,  ResourceLocation pane1,  ResourceLocation pane2,
                                          ResourceLocation pane3, ResourceLocation pane4, ResourceLocation pane5,
                                          ResourceLocation pane6,  ResourceLocation pane7,  ResourceLocation pane8,
                                          ResourceLocation pane9, ResourceLocation pane10, ResourceLocation pane11,
                                          ResourceLocation pane12, ResourceLocation pane13, ResourceLocation pane14,
                                          ResourceLocation pane15, ResourceLocation pane16) {
        ModelFile post = bmv1BlockModels.decoPanePost(baseName, bars, edge);

        ResourceLocation[] panes = {pane0,pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12,pane13,pane14,pane15,pane16};
        ModelFile[] sides = new ModelFile[panes.length];
        ModelFile[] sideAlts = new ModelFile[panes.length];
        for (int x = 0; x < panes.length; x++){
            String nameplus = "_"+panes[x].toString().replace("minecraft:block/","").replace("_stained_glass","");
            if(x==0) nameplus = "";
            sides[x] = bmv1BlockModels.vitragePaneSide(baseName+nameplus, particle, bars, panes[x], edge);
            sideAlts[x] = bmv1BlockModels.vitragePaneSideAlt(baseName+nameplus, particle, bars, panes[x], edge);
        }
        vitragePaneBlock(block, post, sides[0], sideAlts[0], sides[1], sideAlts[1], sides[2], sideAlts[2], sides[3], sideAlts[3],
                sides[4], sideAlts[4], sides[5], sideAlts[5], sides[6], sideAlts[6], sides[7], sideAlts[7], sides[8], sideAlts[8], sides[9], sideAlts[9], sides[10], sideAlts[10],
                sides[11], sideAlts[11], sides[12], sideAlts[12], sides[13], sideAlts[13], sides[14], sideAlts[14], sides[15], sideAlts[15], sides[16], sideAlts[16]);
    }

    public void vitragePaneBlock(Block block, ModelFile post,
                                 ModelFile side0, ModelFile sideAlt0, ModelFile side1, ModelFile sideAlt1,
                                 ModelFile side2, ModelFile sideAlt2, ModelFile side3, ModelFile sideAlt3,
                                 ModelFile side4, ModelFile sideAlt4, ModelFile side5, ModelFile sideAlt5,
                                 ModelFile side6, ModelFile sideAlt6, ModelFile side7, ModelFile sideAlt7,
                                 ModelFile side8, ModelFile sideAlt8, ModelFile side9, ModelFile sideAlt9,
                                 ModelFile side10, ModelFile sideAlt10, ModelFile side11, ModelFile sideAlt11,
                                 ModelFile side12, ModelFile sideAlt12, ModelFile side13, ModelFile sideAlt13,
                                 ModelFile side14, ModelFile sideAlt14, ModelFile side15, ModelFile sideAlt15,
                                 ModelFile side16, ModelFile sideAlt16) {

        ModelFile[] sides = {side0,side1,side2,side3,side4,side5,side6,side7,side8,side9,side10,side11,side12,side13,side14,side15,side16};
        ModelFile[] sideAlts = {sideAlt0,sideAlt1,sideAlt2,sideAlt3,sideAlt4,sideAlt5,sideAlt6,sideAlt7,sideAlt8,sideAlt9,sideAlt10,sideAlt11,sideAlt12,sideAlt13,sideAlt14,sideAlt15,sideAlt16};

        MultiPartBlockStateBuilder builder = getMultipartBuilder(block)
                .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false).condition(PipeBlock.NORTH, false)
                .condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end();

        for ( int x = 0; x < 17; x++) {
       final int x1 = x;
        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();
            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlts[x1] : sides[x1]).rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true).condition(VitrageDye.VITRAGE_DYE, VitrageDye.getById(x1));
            }
        });}
    }

    private void vitragePanelBlockInternal(Block block, String baseName, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge,
                                           ResourceLocation pane0,  ResourceLocation pane1,  ResourceLocation pane2,
                                           ResourceLocation pane3, ResourceLocation pane4, ResourceLocation pane5,
                                           ResourceLocation pane6,  ResourceLocation pane7,  ResourceLocation pane8,
                                           ResourceLocation pane9, ResourceLocation pane10, ResourceLocation pane11,
                                           ResourceLocation pane12, ResourceLocation pane13, ResourceLocation pane14,
                                           ResourceLocation pane15, ResourceLocation pane16) {
        ModelFile rot0 = bmv1BlockModels.vitragePanelBars(baseName+"rotation_0", bars, edge);
        ModelFile rot1 = bmv1BlockModels.vitragePanelBars(baseName+"rotation_1", bars, edge);
        ModelFile rot2 = bmv1BlockModels.vitragePanelBars(baseName+"rotation_2", bars, edge);
        ModelFile rot3 = bmv1BlockModels.vitragePanelBars(baseName+"rotation_3", bars, edge);

        ResourceLocation[] panes = {pane0,pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12,pane13,pane14,pane15,pane16};
        ModelFile[] insides = new ModelFile[panes.length];
        for (int x = 0; x < panes.length; x++){
            String nameplus = "_"+panes[x].toString().replace("minecraft:block/","").replace("_stained_glass","");
            if(x==0) nameplus = "";
            insides[x] = bmv1BlockModels.vitragePanelPane(baseName+nameplus, panes[x]);
        }
        vitragePanelBlock(block, rot0, rot1, rot2, rot3, insides[0], insides[1], insides[2], insides[3], insides[4], insides[5], insides[6],
                insides[7], insides[8], insides[9], insides[10], insides[11], insides[12], insides[13], insides[14], insides[15], insides[16]);
    }

    private void vitragePanelBlock (Block block, ModelFile rot0, ModelFile rot1, ModelFile rot2, ModelFile rot3, ModelFile pane0,
                                    ModelFile pane1, ModelFile pane2, ModelFile pane3, ModelFile pane4, ModelFile pane5, ModelFile pane6,
                                    ModelFile pane7, ModelFile pane8, ModelFile pane9, ModelFile pane10, ModelFile pane11, ModelFile pane12,
                                    ModelFile pane13, ModelFile pane14, ModelFile pane15, ModelFile pane16){
        ModelFile[] panes = {pane0, pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12, pane13, pane14, pane15, pane16};
        ModelFile[] rots = {rot0, rot1, rot2, rot3};

        MultiPartBlockStateBuilder builder = getMultipartBuilder(block);
        for (int x=0; x<4; x++){
                          builder.part().modelFile(rots[x]).addModel().condition(TemplatePanelBlock.AXIS, Direction.Axis.X)
                                  .condition(TemplatePanelBlock.ROTATION, x).end()
                                  .part().modelFile(rots[x]).rotationY(270).addModel().condition(TemplatePanelBlock.AXIS, Direction.Axis.Z)
                                  .condition(TemplatePanelBlock.ROTATION, x).end();
               }
        for ( int x = 0; x < 17; x++) {
        builder.part().modelFile(panes[x]).addModel().condition(TemplatePanelBlock.AXIS, Direction.Axis.X)
                .condition(VitrageDye.VITRAGE_DYE, VitrageDye.getById(x)).end()
                .part().modelFile(panes[x]).rotationY(270).addModel().condition(TemplatePanelBlock.AXIS, Direction.Axis.Z)
                .condition(VitrageDye.VITRAGE_DYE, VitrageDye.getById(x)).end();
        }
    }

    //supply methods
BooleanProperty getOppositeProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getOpposite());}

BooleanProperty getLeftProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getCounterClockWise());}

BooleanProperty getRightProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getClockWise());}


}