package net.satan.deco_bm.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.block.TemplatePanelBlock;
import net.satan.deco_bm.datagen.util.BMSupGen;
import net.satan.deco_bm.register.BMBlocks;
import net.satan.deco_bm.satans_deco_bm;

import java.util.concurrent.CompletableFuture;

public class BMBlockStateProvider extends BlockStateProvider {
    public BMBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_bm.MODID, existingFileHelper);
        this.bmBlockModels = new BMBlockModelProvider(output, existingFileHelper) {
            @Override public CompletableFuture<?> run(CachedOutput cache) { return CompletableFuture.allOf(); }

            @Override protected void registerModels() {}
        };
    }
    private final BMBlockModelProvider bmBlockModels;
//inputs
@Override
    protected void registerStatesAndModels() {
        //bars
    barsNonstraightBlockState(BMBlocks.IRON_BARS1);
    barsBlockState(BMBlocks.IRON_BARS2);
    barsUNoCapBlockState(BMBlocks.IRON_BARS3);
    barsVBlockState(BMBlocks.IRON_BARS4);
    barsUBlockState(BMBlocks.IRON_BARS5);
    barsVBlockState(BMBlocks.IRON_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.IRON_BARS7);
    barsReverseVBlockState(BMBlocks.IRON_BARS8);
    barsReverseUBlockState(BMBlocks.IRON_BARS9);
    barsReverseVBlockState(BMBlocks.IRON_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.IRON_BARS11);
    barsUBlockState(BMBlocks.IRON_BARS13);
    barsReverseUBlockState(BMBlocks.IRON_BARS12);
    barsBlockState(BMBlocks.IRON_BARS14);
    barsBlockState(BMBlocks.IRON_BARS15);
    barsBlockState(BMBlocks.IRON_BARS16);
    barsBlockState(BMBlocks.IRON_BARS17);
    barsBlockState(BMBlocks.IRON_BARS18);
    barsBlockState(BMBlocks.IRON_BARS19);
    barsNonstraightBlockState(BMBlocks.IRON_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.IRON_BARS21);
    barsBlockState(BMBlocks.IRON_BARS22);
    barsBlockState(BMBlocks.IRON_BARS23);
    barsBlockState(BMBlocks.IRON_BARS24);
    barsBlockState(BMBlocks.IRON_BARS26);
    barsBlockState(BMBlocks.IRON_BARS27);
    barsBlockState(BMBlocks.IRON_BARS28);
    barsBlockState(BMBlocks.IRON_BARS30);
    barsBlockState(BMBlocks.IRON_BARS33);
    barsNoCapBlockState(BMBlocks.IRON_BARS34);

    barsBlockState(BMBlocks.GOLD_BARS);
    barsNonstraightBlockState(BMBlocks.GOLD_BARS1);
    barsBlockState(BMBlocks.GOLD_BARS2);
    barsUNoCapBlockState(BMBlocks.GOLD_BARS3);
    barsVBlockState(BMBlocks.GOLD_BARS4);
    barsUBlockState(BMBlocks.GOLD_BARS5);
    barsVBlockState(BMBlocks.GOLD_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.GOLD_BARS7);
    barsReverseVBlockState(BMBlocks.GOLD_BARS8);
    barsReverseUBlockState(BMBlocks.GOLD_BARS9);
    barsReverseVBlockState(BMBlocks.GOLD_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.GOLD_BARS11);
    barsUBlockState(BMBlocks.GOLD_BARS13);
    barsReverseUBlockState(BMBlocks.GOLD_BARS12);
    barsBlockState(BMBlocks.GOLD_BARS14);
    barsBlockState(BMBlocks.GOLD_BARS15);
    barsBlockState(BMBlocks.GOLD_BARS16);
    barsBlockState(BMBlocks.GOLD_BARS17);
    barsBlockState(BMBlocks.GOLD_BARS18);
    barsBlockState(BMBlocks.GOLD_BARS19);
    barsNonstraightBlockState(BMBlocks.GOLD_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.GOLD_BARS21);
    barsBlockState(BMBlocks.GOLD_BARS22);
    barsBlockState(BMBlocks.GOLD_BARS23);
    barsBlockState(BMBlocks.GOLD_BARS24);
    barsBlockState(BMBlocks.GOLD_BARS26);
    barsBlockState(BMBlocks.GOLD_BARS27);
    barsBlockState(BMBlocks.GOLD_BARS28);
    barsBlockState(BMBlocks.GOLD_BARS30);
    barsBlockState(BMBlocks.GOLD_BARS33);
    barsNoCapBlockState(BMBlocks.GOLD_BARS34);

    barsBlockState(BMBlocks.EMERALD_BARS);
    barsNonstraightBlockState(BMBlocks.EMERALD_BARS1);
    barsBlockState(BMBlocks.EMERALD_BARS2);
    barsUNoCapBlockState(BMBlocks.EMERALD_BARS3);
    barsVBlockState(BMBlocks.EMERALD_BARS4);
    barsUBlockState(BMBlocks.EMERALD_BARS5);
    barsVBlockState(BMBlocks.EMERALD_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.EMERALD_BARS7);
    barsReverseVBlockState(BMBlocks.EMERALD_BARS8);
    barsReverseUBlockState(BMBlocks.EMERALD_BARS9);
    barsReverseVBlockState(BMBlocks.EMERALD_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.EMERALD_BARS11);
    barsUBlockState(BMBlocks.EMERALD_BARS13);
    barsReverseUBlockState(BMBlocks.EMERALD_BARS12);
    barsBlockState(BMBlocks.EMERALD_BARS14);
    barsBlockState(BMBlocks.EMERALD_BARS15);
    barsBlockState(BMBlocks.EMERALD_BARS16);
    barsBlockState(BMBlocks.EMERALD_BARS17);
    barsBlockState(BMBlocks.EMERALD_BARS18);
    barsBlockState(BMBlocks.EMERALD_BARS19);
    barsNonstraightBlockState(BMBlocks.EMERALD_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.EMERALD_BARS21);
    barsBlockState(BMBlocks.EMERALD_BARS22);
    barsBlockState(BMBlocks.EMERALD_BARS23);
    barsBlockState(BMBlocks.EMERALD_BARS24);
    barsBlockState(BMBlocks.EMERALD_BARS26);
    barsBlockState(BMBlocks.EMERALD_BARS27);
    barsBlockState(BMBlocks.EMERALD_BARS28);
    barsBlockState(BMBlocks.EMERALD_BARS30);
    barsBlockState(BMBlocks.EMERALD_BARS33);
    barsNoCapBlockState(BMBlocks.EMERALD_BARS34);

    barsBlockState(BMBlocks.DARKMETAL_BARS);
    barsNonstraightBlockState(BMBlocks.DARKMETAL_BARS1);
    barsBlockState(BMBlocks.DARKMETAL_BARS2);
    barsUNoCapBlockState(BMBlocks.DARKMETAL_BARS3);
    barsVBlockState(BMBlocks.DARKMETAL_BARS4);
    barsUBlockState(BMBlocks.DARKMETAL_BARS5);
    barsVBlockState(BMBlocks.DARKMETAL_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.DARKMETAL_BARS7);
    barsReverseVBlockState(BMBlocks.DARKMETAL_BARS8);
    barsReverseUBlockState(BMBlocks.DARKMETAL_BARS9);
    barsReverseVBlockState(BMBlocks.DARKMETAL_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.DARKMETAL_BARS11);
    barsUBlockState(BMBlocks.DARKMETAL_BARS13);
    barsReverseUBlockState(BMBlocks.DARKMETAL_BARS12);
    barsBlockState(BMBlocks.DARKMETAL_BARS14);
    barsBlockState(BMBlocks.DARKMETAL_BARS15);
    barsBlockState(BMBlocks.DARKMETAL_BARS16);
    barsBlockState(BMBlocks.DARKMETAL_BARS17);
    barsBlockState(BMBlocks.DARKMETAL_BARS18);
    barsBlockState(BMBlocks.DARKMETAL_BARS19);
    barsNonstraightBlockState(BMBlocks.DARKMETAL_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.DARKMETAL_BARS21);
    barsBlockState(BMBlocks.DARKMETAL_BARS22);
    barsBlockState(BMBlocks.DARKMETAL_BARS23);
    barsBlockState(BMBlocks.DARKMETAL_BARS24);
    barsBlockState(BMBlocks.DARKMETAL_BARS26);
    barsBlockState(BMBlocks.DARKMETAL_BARS27);
    barsBlockState(BMBlocks.DARKMETAL_BARS28);
    barsBlockState(BMBlocks.DARKMETAL_BARS30);
    barsBlockState(BMBlocks.DARKMETAL_BARS33);
    barsNoCapBlockState(BMBlocks.DARKMETAL_BARS34);

    barsBlockState(BMBlocks.CLOUD_BARS);
    barsNonstraightBlockState(BMBlocks.CLOUD_BARS1);
    barsBlockState(BMBlocks.CLOUD_BARS2);
    barsUNoCapBlockState(BMBlocks.CLOUD_BARS3);
    barsVBlockState(BMBlocks.CLOUD_BARS4);
    barsUBlockState(BMBlocks.CLOUD_BARS5);
    barsVBlockState(BMBlocks.CLOUD_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.CLOUD_BARS7);
    barsReverseVBlockState(BMBlocks.CLOUD_BARS8);
    barsReverseUBlockState(BMBlocks.CLOUD_BARS9);
    barsReverseVBlockState(BMBlocks.CLOUD_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.CLOUD_BARS11);
    barsUBlockState(BMBlocks.CLOUD_BARS13);
    barsReverseUBlockState(BMBlocks.CLOUD_BARS12);
    barsBlockState(BMBlocks.CLOUD_BARS14);
    barsBlockState(BMBlocks.CLOUD_BARS15);
    barsBlockState(BMBlocks.CLOUD_BARS16);
    barsBlockState(BMBlocks.CLOUD_BARS17);
    barsBlockState(BMBlocks.CLOUD_BARS18);
    barsBlockState(BMBlocks.CLOUD_BARS19);
    barsNonstraightBlockState(BMBlocks.CLOUD_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.CLOUD_BARS21);
    barsBlockState(BMBlocks.CLOUD_BARS22);
    barsBlockState(BMBlocks.CLOUD_BARS23);
    barsBlockState(BMBlocks.CLOUD_BARS24);
    barsBlockState(BMBlocks.CLOUD_BARS26);
    barsBlockState(BMBlocks.CLOUD_BARS27);
    barsBlockState(BMBlocks.CLOUD_BARS28);
    barsBlockState(BMBlocks.CLOUD_BARS30);
    barsBlockState(BMBlocks.CLOUD_BARS33);
    barsNoCapBlockState(BMBlocks.CLOUD_BARS34);

    barsBlockState(BMBlocks.COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.COPPER_BARS1);
    barsBlockState(BMBlocks.COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.COPPER_BARS3);
    barsVBlockState(BMBlocks.COPPER_BARS4);
    barsUBlockState(BMBlocks.COPPER_BARS5);
    barsVBlockState(BMBlocks.COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.COPPER_BARS11);
    barsUBlockState(BMBlocks.COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.COPPER_BARS12);
    barsBlockState(BMBlocks.COPPER_BARS14);
    barsBlockState(BMBlocks.COPPER_BARS15);
    barsBlockState(BMBlocks.COPPER_BARS16);
    barsBlockState(BMBlocks.COPPER_BARS17);
    barsBlockState(BMBlocks.COPPER_BARS18);
    barsBlockState(BMBlocks.COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.COPPER_BARS21);
    barsBlockState(BMBlocks.COPPER_BARS22);
    barsBlockState(BMBlocks.COPPER_BARS23);
    barsBlockState(BMBlocks.COPPER_BARS24);
    barsBlockState(BMBlocks.COPPER_BARS26);
    barsBlockState(BMBlocks.COPPER_BARS27);
    barsBlockState(BMBlocks.COPPER_BARS28);
    barsBlockState(BMBlocks.COPPER_BARS30);
    barsBlockState(BMBlocks.COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.COPPER_BARS34);

    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.EXPOSED_COPPER_BARS1);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.EXPOSED_COPPER_BARS3);
    barsVBlockState(BMBlocks.EXPOSED_COPPER_BARS4);
    barsUBlockState(BMBlocks.EXPOSED_COPPER_BARS5);
    barsVBlockState(BMBlocks.EXPOSED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.EXPOSED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.EXPOSED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.EXPOSED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.EXPOSED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.EXPOSED_COPPER_BARS11);
    barsUBlockState(BMBlocks.EXPOSED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.EXPOSED_COPPER_BARS12);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS14);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS15);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS16);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS17);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS18);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.EXPOSED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.EXPOSED_COPPER_BARS21);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS22);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS23);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS24);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS26);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS27);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS28);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS30);
    barsBlockState(BMBlocks.EXPOSED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.EXPOSED_COPPER_BARS34);

    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.WEATHERED_COPPER_BARS1);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.WEATHERED_COPPER_BARS3);
    barsVBlockState(BMBlocks.WEATHERED_COPPER_BARS4);
    barsUBlockState(BMBlocks.WEATHERED_COPPER_BARS5);
    barsVBlockState(BMBlocks.WEATHERED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.WEATHERED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.WEATHERED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.WEATHERED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.WEATHERED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.WEATHERED_COPPER_BARS11);
    barsUBlockState(BMBlocks.WEATHERED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.WEATHERED_COPPER_BARS12);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS14);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS15);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS16);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS17);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS18);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.WEATHERED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.WEATHERED_COPPER_BARS21);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS22);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS23);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS24);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS26);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS27);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS28);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS30);
    barsBlockState(BMBlocks.WEATHERED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.WEATHERED_COPPER_BARS34);

    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.OXIDIZED_COPPER_BARS1);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.OXIDIZED_COPPER_BARS3);
    barsVBlockState(BMBlocks.OXIDIZED_COPPER_BARS4);
    barsUBlockState(BMBlocks.OXIDIZED_COPPER_BARS5);
    barsVBlockState(BMBlocks.OXIDIZED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.OXIDIZED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.OXIDIZED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.OXIDIZED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.OXIDIZED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.OXIDIZED_COPPER_BARS11);
    barsUBlockState(BMBlocks.OXIDIZED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.OXIDIZED_COPPER_BARS12);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS14);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS15);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS16);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS17);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS18);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.OXIDIZED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.OXIDIZED_COPPER_BARS21);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS22);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS23);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS24);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS26);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS27);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS28);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS30);
    barsBlockState(BMBlocks.OXIDIZED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.OXIDIZED_COPPER_BARS34);

    barsBlockState(BMBlocks.WAXED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.WAXED_COPPER_BARS1);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.WAXED_COPPER_BARS3);
    barsVBlockState(BMBlocks.WAXED_COPPER_BARS4);
    barsUBlockState(BMBlocks.WAXED_COPPER_BARS5);
    barsVBlockState(BMBlocks.WAXED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.WAXED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.WAXED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.WAXED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.WAXED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_COPPER_BARS11);
    barsUBlockState(BMBlocks.WAXED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.WAXED_COPPER_BARS12);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS14);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS15);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS16);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS17);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS18);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.WAXED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_COPPER_BARS21);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS22);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS23);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS24);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS26);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS27);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS28);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS30);
    barsBlockState(BMBlocks.WAXED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.WAXED_COPPER_BARS34);

    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS1);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS3);
    barsVBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS4);
    barsUBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS5);
    barsVBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS11);
    barsUBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS12);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS14);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS15);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS16);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS17);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS18);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS21);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS22);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS23);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS24);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS26);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS27);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS28);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS30);
    barsBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.WAXED_EXPOSED_COPPER_BARS34);

    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS1);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS3);
    barsVBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS4);
    barsUBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS5);
    barsVBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS11);
    barsUBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS12);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS14);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS15);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS16);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS17);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS18);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS21);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS22);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS23);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS24);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS26);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS27);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS28);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS30);
    barsBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.WAXED_WEATHERED_COPPER_BARS34);

    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS);
    barsNonstraightBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS1);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS2);
    barsUNoCapBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS3);
    barsVBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS4);
    barsUBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS5);
    barsVBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS6);
    barsReverseUNoCapBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS7);
    barsReverseVBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS8);
    barsReverseUBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS9);
    barsReverseVBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS11);
    barsUBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS13);
    barsReverseUBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS12);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS14);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS15);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS16);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS17);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS18);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS19);
    barsNonstraightBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS21);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS22);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS23);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS24);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS26);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS27);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS28);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS30);
    barsBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS33);
    barsNoCapBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_BARS34);

    //panels
    panelBlockState(BMBlocks.IRON_PANEL1);
    panelBlockState(BMBlocks.IRON_PANEL2);
    panelBlockState(BMBlocks.IRON_PANEL3);

    panelBlockState(BMBlocks.GOLD_PANEL1);
    panelBlockState(BMBlocks.GOLD_PANEL2);
    panelBlockState(BMBlocks.GOLD_PANEL3);

    panelBlockState(BMBlocks.EMERALD_PANEL1);
    panelBlockState(BMBlocks.EMERALD_PANEL2);
    panelBlockState(BMBlocks.EMERALD_PANEL3);

    panelBlockState(BMBlocks.DARKMETAL_PANEL1);
    panelBlockState(BMBlocks.DARKMETAL_PANEL2);
    panelBlockState(BMBlocks.DARKMETAL_PANEL3);

    panelBlockState(BMBlocks.CLOUD_PANEL1);
    panelBlockState(BMBlocks.CLOUD_PANEL2);
    panelBlockState(BMBlocks.CLOUD_PANEL3);

    panelBlockState(BMBlocks.COPPER_PANEL1);
    panelBlockState(BMBlocks.COPPER_PANEL2);
    panelBlockState(BMBlocks.COPPER_PANEL3);

    panelBlockState(BMBlocks.EXPOSED_COPPER_PANEL1);
    panelBlockState(BMBlocks.EXPOSED_COPPER_PANEL2);
    panelBlockState(BMBlocks.EXPOSED_COPPER_PANEL3);

    panelBlockState(BMBlocks.WEATHERED_COPPER_PANEL1);
    panelBlockState(BMBlocks.WEATHERED_COPPER_PANEL2);
    panelBlockState(BMBlocks.WEATHERED_COPPER_PANEL3);

    panelBlockState(BMBlocks.OXIDIZED_COPPER_PANEL1);
    panelBlockState(BMBlocks.OXIDIZED_COPPER_PANEL2);
    panelBlockState(BMBlocks.OXIDIZED_COPPER_PANEL3);

    panelBlockState(BMBlocks.WAXED_COPPER_PANEL1);
    panelBlockState(BMBlocks.WAXED_COPPER_PANEL2);
    panelBlockState(BMBlocks.WAXED_COPPER_PANEL3);

    panelBlockState(BMBlocks.WAXED_EXPOSED_COPPER_PANEL1);
    panelBlockState(BMBlocks.WAXED_EXPOSED_COPPER_PANEL2);
    panelBlockState(BMBlocks.WAXED_EXPOSED_COPPER_PANEL3);

    panelBlockState(BMBlocks.WAXED_WEATHERED_COPPER_PANEL1);
    panelBlockState(BMBlocks.WAXED_WEATHERED_COPPER_PANEL2);
    panelBlockState(BMBlocks.WAXED_WEATHERED_COPPER_PANEL3);

    panelBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL1);
    panelBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL2);
    panelBlockState(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL3);
}

    //inputs manipulation
//default bars. Don't think much about textures. They're set in DecoBlockModProvider currently
    private void barsBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);
    barsBlockInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockInternal(Block block, String baseName,
                                                 ResourceLocation particle, ResourceLocation bars,
                                                 ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSide(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAlt(baseName, particle, bars, edge);
        ModelFile cap = bmBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = bmBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    private void barsNoCapBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);
        barsNoCapBlockInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsNoCapBlockInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSide(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAlt(baseName, particle, bars, edge);
        barsNoCapBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with different side and side_alt UV
    private void barsNonstraightBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);
        barsBlockNonstraightInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockNonstraightInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideNonstraight(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltNonstraight(baseName, particle, bars, edge);
        barsNoCapBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with different side and side_alt UV and false ends
    private void barsNonstraightFalseEndsBlockState(RegistryObject<Block> block) {
        barsBlockNonstraightFalseEndsInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));

    }
    private void barsBlockNonstraightFalseEndsInternal(Block block, String baseName,
                                              ResourceLocation particle, ResourceLocation bars,
                                              ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideNonstraight(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltNonstraight(baseName, particle, bars, edge);
        barsNoCapFalseEndsBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with no lower cap of side and side_alt
    private void barsVBlockState(RegistryObject<Block> block) {
        barsBlockVInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));

    }
    private void barsBlockVInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideV(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltV(baseName, particle, bars, edge);
        ModelFile cap = bmBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = bmBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    //bars with no lower parts of side and side_alt + false post_ends
    private void barsUBlockState(RegistryObject<Block> block) {
        barsBlockUInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));

    }
    private void barsBlockUInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideU(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltU(baseName, particle, bars, edge);
        ModelFile cap = bmBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = bmBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsFalseEndsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }
    //bars with no cap and cap_alt + no lower parts of side and side_alt + false post_ends
    private void barsUNoCapBlockState(RegistryObject<Block> block) {
        barsBlockUNoCapInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));
    }
    private void barsBlockUNoCapInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideU(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltU(baseName, particle, bars, edge);
        barsNoCapFalseEndsBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with no lower cap of side and side_alt and upside down
    private void barsReverseVBlockState(RegistryObject<Block> block) {
        barsBlockReverseVInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));

    }
    private void barsBlockReverseVInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideReverseV(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltReverseV(baseName, particle, bars, edge);
        ModelFile cap = bmBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = bmBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    //bars with no lower parts of side and side_alt
    private void barsReverseUBlockState(RegistryObject<Block> block) {
        barsBlockReverseUInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));

    }
    private void barsBlockReverseUInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideReverseU(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltReverseU(baseName, particle, bars, edge);
        ModelFile cap = bmBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = bmBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsFalseEndsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    //bars with no cap and cap_alt + no lower parts of side and side_alt
    private void barsReverseUNoCapBlockState(RegistryObject<Block> block) {
        barsBlockReverseUNoCapInternal(block.get(), block.getId().toString(),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"),
                new ResourceLocation("block/iron_bars"));

    }
    private void barsBlockReverseUNoCapInternal(Block block, String baseName,
                                           ResourceLocation particle, ResourceLocation bars,
                                           ResourceLocation edge) {
        ModelFile post = bmBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = bmBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = bmBlockModels.barsSideReverseU(baseName, particle, bars, edge);
        ModelFile sideAlt = bmBlockModels.barsSideAltReverseU(baseName, particle, bars, edge);
        barsNoCapFalseEndsBlock(block, post, postEnds, side, sideAlt);
    }

    //bars models definitions
    private void barsBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile side, ModelFile sideAlt,
                           ModelFile cap, ModelFile capAlt) {
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel().end()
                .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false)
                .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end();
        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();

            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlt : side)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true).end()

                        .part().modelFile(alt || dir == Direction.WEST ? capAlt : cap)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false);
            }
        });
    }

    private void barsNoCapBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile side, ModelFile sideAlt) {
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel().end()
                .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false)
                .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end();
        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();
            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlt : side)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true).end();
            }
        });
    }

    private void barsNoCapFalseEndsBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile side, ModelFile sideAlt) {
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel()
                .condition(PipeBlock.SOUTH, false).condition(PipeBlock.NORTH, false)
                .condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end()

                .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false)
                .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end();
        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();
            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlt : side)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true).end();
            }
        });
    }

    private void barsFalseEndsBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile side, ModelFile sideAlt,
                                    ModelFile cap, ModelFile capAlt) {
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel()
                .condition(PipeBlock.SOUTH, false).condition(PipeBlock.NORTH, false)
                .condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end()

                .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false)
                .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end();
        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();
            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlt : side)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true).end()

                        .part().modelFile(alt || dir == Direction.WEST ? capAlt : cap)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false);
            }
        });
    }

    //default panels. Dont think much about textures just make sure they actually exist. In actuality they're set in DecoBlockModelProvider
    private void panelBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        panelBlockInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath().replace("l", "")),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath().replace("l", "")));
    }
    private void panelBlockInternal(Block block, String baseName,
                                    ResourceLocation bars, ResourceLocation edge) {
        ModelFile rot0 = bmBlockModels.panelRot0(baseName, bars, edge);
        ModelFile rot1 = bmBlockModels.panelRot1(baseName, bars, edge);
        ModelFile rot2 = bmBlockModels.panelRot2(baseName, bars, edge);
        ModelFile rot3 = bmBlockModels.panelRot3(baseName, bars, edge);
        panelBlock(block, rot0, rot1, rot2, rot3);
        }
        private void panelBlock (Block block, ModelFile rot0, ModelFile rot1, ModelFile rot2, ModelFile rot3){
            getVariantBuilder(block).forAllStates(state -> {
                            int YRot = 0;
                                if (state.getValue(TemplatePanelBlock.AXIS) == Direction.Axis.Z) YRot = 270;
                            ModelFile model = rot0;
                              if (state.getValue(TemplatePanelBlock.ROTATION) == 0) {model = rot0;}
                              if (state.getValue(TemplatePanelBlock.ROTATION) == 1) {model = rot1;}
                              if (state.getValue(TemplatePanelBlock.ROTATION) == 2) {model = rot2;}
                              if (state.getValue(TemplatePanelBlock.ROTATION) == 3) {model = rot3;}
                              return ConfiguredModel.builder()
                                      .modelFile(model)
                                      .rotationY(YRot)
                                      .build();
        });
}

    //supply methods
BooleanProperty getOppositeProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getOpposite());}

BooleanProperty getLeftProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getCounterClockWise());}

BooleanProperty getRightProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getClockWise());}


}