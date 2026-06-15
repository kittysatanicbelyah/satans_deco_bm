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
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.block.TemplateCurtainBlock;
import net.satan.deco_bm.block.TemplatePanelBlock;
import net.satan.deco_bm.block.util.VitrageDye;
import net.satan.deco_bm.datagen.util.DecoSupGen;
import net.satan.deco_bm.register.DecoBlocks;
import net.satan.deco_bm.satans_deco_bm;

import java.util.concurrent.CompletableFuture;

public class DecoBlockStateProvider extends BlockStateProvider {
    public DecoBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_bm.MODID, existingFileHelper);
        this.decoBlockModels = new DecoBlockModelProvider(output, existingFileHelper) {
            @Override public CompletableFuture<?> run(CachedOutput cache) { return CompletableFuture.allOf(); }

            @Override protected void registerModels() {}
        };
    }
    private final DecoBlockModelProvider decoBlockModels;
//inputs
@Override
    protected void registerStatesAndModels() {
        //bars
    barsNonstraightBlockState(DecoBlocks.IRON_BARS1);
    barsBlockState(DecoBlocks.IRON_BARS2);
    barsUNoCapBlockState(DecoBlocks.IRON_BARS3);
    barsVBlockState(DecoBlocks.IRON_BARS4);
    barsUBlockState(DecoBlocks.IRON_BARS5);
    barsVBlockState(DecoBlocks.IRON_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.IRON_BARS7);
    barsReverseVBlockState(DecoBlocks.IRON_BARS8);
    barsReverseUBlockState(DecoBlocks.IRON_BARS9);
    barsReverseVBlockState(DecoBlocks.IRON_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.IRON_BARS11);
    barsUBlockState(DecoBlocks.IRON_BARS13);
    barsReverseUBlockState(DecoBlocks.IRON_BARS12);
    barsBlockState(DecoBlocks.IRON_BARS14);
    barsBlockState(DecoBlocks.IRON_BARS15);
    barsBlockState(DecoBlocks.IRON_BARS16);
    barsBlockState(DecoBlocks.IRON_BARS17);
    barsBlockState(DecoBlocks.IRON_BARS18);
    barsBlockState(DecoBlocks.IRON_BARS19);
    barsNonstraightBlockState(DecoBlocks.IRON_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.IRON_BARS21);
    barsBlockState(DecoBlocks.IRON_BARS22);
    barsBlockState(DecoBlocks.IRON_BARS23);
    barsBlockState(DecoBlocks.IRON_BARS24);
    barsBlockState(DecoBlocks.IRON_BARS26);
    barsBlockState(DecoBlocks.IRON_BARS27);
    barsBlockState(DecoBlocks.IRON_BARS28);
    barsBlockState(DecoBlocks.IRON_BARS30);
    barsBlockState(DecoBlocks.IRON_BARS33);
    barsNoCapBlockState(DecoBlocks.IRON_BARS34);

    barsBlockState(DecoBlocks.GOLD_BARS);
    barsNonstraightBlockState(DecoBlocks.GOLD_BARS1);
    barsBlockState(DecoBlocks.GOLD_BARS2);
    barsUNoCapBlockState(DecoBlocks.GOLD_BARS3);
    barsVBlockState(DecoBlocks.GOLD_BARS4);
    barsUBlockState(DecoBlocks.GOLD_BARS5);
    barsVBlockState(DecoBlocks.GOLD_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.GOLD_BARS7);
    barsReverseVBlockState(DecoBlocks.GOLD_BARS8);
    barsReverseUBlockState(DecoBlocks.GOLD_BARS9);
    barsReverseVBlockState(DecoBlocks.GOLD_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.GOLD_BARS11);
    barsUBlockState(DecoBlocks.GOLD_BARS13);
    barsReverseUBlockState(DecoBlocks.GOLD_BARS12);
    barsBlockState(DecoBlocks.GOLD_BARS14);
    barsBlockState(DecoBlocks.GOLD_BARS15);
    barsBlockState(DecoBlocks.GOLD_BARS16);
    barsBlockState(DecoBlocks.GOLD_BARS17);
    barsBlockState(DecoBlocks.GOLD_BARS18);
    barsBlockState(DecoBlocks.GOLD_BARS19);
    barsNonstraightBlockState(DecoBlocks.GOLD_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.GOLD_BARS21);
    barsBlockState(DecoBlocks.GOLD_BARS22);
    barsBlockState(DecoBlocks.GOLD_BARS23);
    barsBlockState(DecoBlocks.GOLD_BARS24);
    barsBlockState(DecoBlocks.GOLD_BARS26);
    barsBlockState(DecoBlocks.GOLD_BARS27);
    barsBlockState(DecoBlocks.GOLD_BARS28);
    barsBlockState(DecoBlocks.GOLD_BARS30);
    barsBlockState(DecoBlocks.GOLD_BARS33);
    barsNoCapBlockState(DecoBlocks.GOLD_BARS34);

    barsBlockState(DecoBlocks.EMERALD_BARS);
    barsNonstraightBlockState(DecoBlocks.EMERALD_BARS1);
    barsBlockState(DecoBlocks.EMERALD_BARS2);
    barsUNoCapBlockState(DecoBlocks.EMERALD_BARS3);
    barsVBlockState(DecoBlocks.EMERALD_BARS4);
    barsUBlockState(DecoBlocks.EMERALD_BARS5);
    barsVBlockState(DecoBlocks.EMERALD_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.EMERALD_BARS7);
    barsReverseVBlockState(DecoBlocks.EMERALD_BARS8);
    barsReverseUBlockState(DecoBlocks.EMERALD_BARS9);
    barsReverseVBlockState(DecoBlocks.EMERALD_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.EMERALD_BARS11);
    barsUBlockState(DecoBlocks.EMERALD_BARS13);
    barsReverseUBlockState(DecoBlocks.EMERALD_BARS12);
    barsBlockState(DecoBlocks.EMERALD_BARS14);
    barsBlockState(DecoBlocks.EMERALD_BARS15);
    barsBlockState(DecoBlocks.EMERALD_BARS16);
    barsBlockState(DecoBlocks.EMERALD_BARS17);
    barsBlockState(DecoBlocks.EMERALD_BARS18);
    barsBlockState(DecoBlocks.EMERALD_BARS19);
    barsNonstraightBlockState(DecoBlocks.EMERALD_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.EMERALD_BARS21);
    barsBlockState(DecoBlocks.EMERALD_BARS22);
    barsBlockState(DecoBlocks.EMERALD_BARS23);
    barsBlockState(DecoBlocks.EMERALD_BARS24);
    barsBlockState(DecoBlocks.EMERALD_BARS26);
    barsBlockState(DecoBlocks.EMERALD_BARS27);
    barsBlockState(DecoBlocks.EMERALD_BARS28);
    barsBlockState(DecoBlocks.EMERALD_BARS30);
    barsBlockState(DecoBlocks.EMERALD_BARS33);
    barsNoCapBlockState(DecoBlocks.EMERALD_BARS34);

    barsBlockState(DecoBlocks.DARKMETAL_BARS);
    barsNonstraightBlockState(DecoBlocks.DARKMETAL_BARS1);
    barsBlockState(DecoBlocks.DARKMETAL_BARS2);
    barsUNoCapBlockState(DecoBlocks.DARKMETAL_BARS3);
    barsVBlockState(DecoBlocks.DARKMETAL_BARS4);
    barsUBlockState(DecoBlocks.DARKMETAL_BARS5);
    barsVBlockState(DecoBlocks.DARKMETAL_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.DARKMETAL_BARS7);
    barsReverseVBlockState(DecoBlocks.DARKMETAL_BARS8);
    barsReverseUBlockState(DecoBlocks.DARKMETAL_BARS9);
    barsReverseVBlockState(DecoBlocks.DARKMETAL_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.DARKMETAL_BARS11);
    barsUBlockState(DecoBlocks.DARKMETAL_BARS13);
    barsReverseUBlockState(DecoBlocks.DARKMETAL_BARS12);
    barsBlockState(DecoBlocks.DARKMETAL_BARS14);
    barsBlockState(DecoBlocks.DARKMETAL_BARS15);
    barsBlockState(DecoBlocks.DARKMETAL_BARS16);
    barsBlockState(DecoBlocks.DARKMETAL_BARS17);
    barsBlockState(DecoBlocks.DARKMETAL_BARS18);
    barsBlockState(DecoBlocks.DARKMETAL_BARS19);
    barsNonstraightBlockState(DecoBlocks.DARKMETAL_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.DARKMETAL_BARS21);
    barsBlockState(DecoBlocks.DARKMETAL_BARS22);
    barsBlockState(DecoBlocks.DARKMETAL_BARS23);
    barsBlockState(DecoBlocks.DARKMETAL_BARS24);
    barsBlockState(DecoBlocks.DARKMETAL_BARS26);
    barsBlockState(DecoBlocks.DARKMETAL_BARS27);
    barsBlockState(DecoBlocks.DARKMETAL_BARS28);
    barsBlockState(DecoBlocks.DARKMETAL_BARS30);
    barsBlockState(DecoBlocks.DARKMETAL_BARS33);
    barsNoCapBlockState(DecoBlocks.DARKMETAL_BARS34);

    barsBlockState(DecoBlocks.CLOUD_BARS);
    barsNonstraightBlockState(DecoBlocks.CLOUD_BARS1);
    barsBlockState(DecoBlocks.CLOUD_BARS2);
    barsUNoCapBlockState(DecoBlocks.CLOUD_BARS3);
    barsVBlockState(DecoBlocks.CLOUD_BARS4);
    barsUBlockState(DecoBlocks.CLOUD_BARS5);
    barsVBlockState(DecoBlocks.CLOUD_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.CLOUD_BARS7);
    barsReverseVBlockState(DecoBlocks.CLOUD_BARS8);
    barsReverseUBlockState(DecoBlocks.CLOUD_BARS9);
    barsReverseVBlockState(DecoBlocks.CLOUD_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.CLOUD_BARS11);
    barsUBlockState(DecoBlocks.CLOUD_BARS13);
    barsReverseUBlockState(DecoBlocks.CLOUD_BARS12);
    barsBlockState(DecoBlocks.CLOUD_BARS14);
    barsBlockState(DecoBlocks.CLOUD_BARS15);
    barsBlockState(DecoBlocks.CLOUD_BARS16);
    barsBlockState(DecoBlocks.CLOUD_BARS17);
    barsBlockState(DecoBlocks.CLOUD_BARS18);
    barsBlockState(DecoBlocks.CLOUD_BARS19);
    barsNonstraightBlockState(DecoBlocks.CLOUD_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.CLOUD_BARS21);
    barsBlockState(DecoBlocks.CLOUD_BARS22);
    barsBlockState(DecoBlocks.CLOUD_BARS23);
    barsBlockState(DecoBlocks.CLOUD_BARS24);
    barsBlockState(DecoBlocks.CLOUD_BARS26);
    barsBlockState(DecoBlocks.CLOUD_BARS27);
    barsBlockState(DecoBlocks.CLOUD_BARS28);
    barsBlockState(DecoBlocks.CLOUD_BARS30);
    barsBlockState(DecoBlocks.CLOUD_BARS33);
    barsNoCapBlockState(DecoBlocks.CLOUD_BARS34);

    barsBlockState(DecoBlocks.COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.COPPER_BARS1);
    barsBlockState(DecoBlocks.COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.COPPER_BARS3);
    barsVBlockState(DecoBlocks.COPPER_BARS4);
    barsUBlockState(DecoBlocks.COPPER_BARS5);
    barsVBlockState(DecoBlocks.COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.COPPER_BARS11);
    barsUBlockState(DecoBlocks.COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.COPPER_BARS12);
    barsBlockState(DecoBlocks.COPPER_BARS14);
    barsBlockState(DecoBlocks.COPPER_BARS15);
    barsBlockState(DecoBlocks.COPPER_BARS16);
    barsBlockState(DecoBlocks.COPPER_BARS17);
    barsBlockState(DecoBlocks.COPPER_BARS18);
    barsBlockState(DecoBlocks.COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.COPPER_BARS21);
    barsBlockState(DecoBlocks.COPPER_BARS22);
    barsBlockState(DecoBlocks.COPPER_BARS23);
    barsBlockState(DecoBlocks.COPPER_BARS24);
    barsBlockState(DecoBlocks.COPPER_BARS26);
    barsBlockState(DecoBlocks.COPPER_BARS27);
    barsBlockState(DecoBlocks.COPPER_BARS28);
    barsBlockState(DecoBlocks.COPPER_BARS30);
    barsBlockState(DecoBlocks.COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.COPPER_BARS34);

    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.EXPOSED_COPPER_BARS1);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.EXPOSED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.EXPOSED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.EXPOSED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.EXPOSED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.EXPOSED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.EXPOSED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.EXPOSED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.EXPOSED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.EXPOSED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.EXPOSED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.EXPOSED_COPPER_BARS12);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS14);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS15);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS16);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS17);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS18);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.EXPOSED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.EXPOSED_COPPER_BARS21);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS22);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS23);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS24);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS26);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS27);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS28);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS30);
    barsBlockState(DecoBlocks.EXPOSED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.EXPOSED_COPPER_BARS34);

    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.WEATHERED_COPPER_BARS1);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.WEATHERED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.WEATHERED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.WEATHERED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.WEATHERED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.WEATHERED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.WEATHERED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.WEATHERED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.WEATHERED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WEATHERED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.WEATHERED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.WEATHERED_COPPER_BARS12);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS14);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS15);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS16);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS17);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS18);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.WEATHERED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WEATHERED_COPPER_BARS21);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS22);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS23);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS24);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS26);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS27);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS28);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS30);
    barsBlockState(DecoBlocks.WEATHERED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.WEATHERED_COPPER_BARS34);

    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.OXIDIZED_COPPER_BARS1);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.OXIDIZED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.OXIDIZED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.OXIDIZED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.OXIDIZED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.OXIDIZED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.OXIDIZED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.OXIDIZED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.OXIDIZED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.OXIDIZED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.OXIDIZED_COPPER_BARS12);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS14);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS15);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS16);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS17);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS18);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.OXIDIZED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS21);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS22);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS23);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS24);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS26);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS27);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS28);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS30);
    barsBlockState(DecoBlocks.OXIDIZED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.OXIDIZED_COPPER_BARS34);

    barsBlockState(DecoBlocks.WAXED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.WAXED_COPPER_BARS1);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.WAXED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.WAXED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.WAXED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.WAXED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.WAXED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.WAXED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.WAXED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.WAXED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.WAXED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.WAXED_COPPER_BARS12);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS14);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS15);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS16);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS17);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS18);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.WAXED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_COPPER_BARS21);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS22);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS23);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS24);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS26);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS27);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS28);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS30);
    barsBlockState(DecoBlocks.WAXED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.WAXED_COPPER_BARS34);

    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS1);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS12);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS14);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS15);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS16);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS17);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS18);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS21);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS22);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS23);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS24);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS26);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS27);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS28);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS30);
    barsBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_BARS34);

    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS1);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS12);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS14);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS15);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS16);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS17);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS18);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS21);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS22);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS23);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS24);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS26);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS27);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS28);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS30);
    barsBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_BARS34);

    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);
    barsNonstraightBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2);
    barsUNoCapBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3);
    barsVBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4);
    barsUBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5);
    barsVBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6);
    barsReverseUNoCapBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7);
    barsReverseVBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8);
    barsReverseUBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9);
    barsReverseVBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11);
    barsUBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13);
    barsReverseUBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19);
    barsNonstraightBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20);
    barsNonstraightFalseEndsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30);
    barsBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33);
    barsNoCapBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34);

    //panels
    panelBlockState(DecoBlocks.IRON_PANEL1);
    panelBlockState(DecoBlocks.IRON_PANEL2);
    panelBlockState(DecoBlocks.IRON_PANEL3);

    panelBlockState(DecoBlocks.GOLD_PANEL1);
    panelBlockState(DecoBlocks.GOLD_PANEL2);
    panelBlockState(DecoBlocks.GOLD_PANEL3);

    panelBlockState(DecoBlocks.EMERALD_PANEL1);
    panelBlockState(DecoBlocks.EMERALD_PANEL2);
    panelBlockState(DecoBlocks.EMERALD_PANEL3);

    panelBlockState(DecoBlocks.DARKMETAL_PANEL1);
    panelBlockState(DecoBlocks.DARKMETAL_PANEL2);
    panelBlockState(DecoBlocks.DARKMETAL_PANEL3);

    panelBlockState(DecoBlocks.CLOUD_PANEL1);
    panelBlockState(DecoBlocks.CLOUD_PANEL2);
    panelBlockState(DecoBlocks.CLOUD_PANEL3);

    panelBlockState(DecoBlocks.COPPER_PANEL1);
    panelBlockState(DecoBlocks.COPPER_PANEL2);
    panelBlockState(DecoBlocks.COPPER_PANEL3);

    panelBlockState(DecoBlocks.EXPOSED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.EXPOSED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.EXPOSED_COPPER_PANEL3);

    panelBlockState(DecoBlocks.WEATHERED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.WEATHERED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.WEATHERED_COPPER_PANEL3);

    panelBlockState(DecoBlocks.OXIDIZED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.OXIDIZED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.OXIDIZED_COPPER_PANEL3);

    panelBlockState(DecoBlocks.WAXED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.WAXED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.WAXED_COPPER_PANEL3);

    panelBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3);

    panelBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3);

    panelBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1);
    panelBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2);
    panelBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3);

    //vitrages
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANE34, 0);

    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE1, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE2, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE3, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE4, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE5, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE6, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE7, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE8, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE9, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE10, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE11, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE12, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE13, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE14, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE15, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE16, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE17, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE18, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE19, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE20, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE21, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE22, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE23, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE24, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE26, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE27, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE28, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE30, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE33, 0);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANE34, 0);

    //vitrage panels
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_OXIDIZED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_WEATHERED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_EXPOSED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.WAXED_COPPER_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.CLOUD_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.DARKMETAL_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.EMERALD_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.GOLD_VITRAGE_PANEL3, 1);

    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANEL1, 1);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANEL2, 1);
    vitragePaneBlockState(DecoBlocks.IRON_VITRAGE_PANEL3, 1);

    //curtains
    curtainsBlockState(DecoBlocks.CURTAIN_BLACK);
    curtainsBlockState(DecoBlocks.CURTAIN_BLUE);
    curtainsBlockState(DecoBlocks.CURTAIN_BROWN);
    curtainsBlockState(DecoBlocks.CURTAIN_CYAN);
    curtainsBlockState(DecoBlocks.CURTAIN_YELLOW);
    curtainsBlockState(DecoBlocks.CURTAIN_GRAY);
    curtainsBlockState(DecoBlocks.CURTAIN_GREEN);
    curtainsBlockState(DecoBlocks.CURTAIN_LIGHT_BLUE);
    curtainsBlockState(DecoBlocks.CURTAIN_LIGHT_GRAY);
    curtainsBlockState(DecoBlocks.CURTAIN_MAGENTA);
    curtainsBlockState(DecoBlocks.CURTAIN_ORANGE);
    curtainsBlockState(DecoBlocks.CURTAIN_PINK);
    curtainsBlockState(DecoBlocks.CURTAIN_LIME);
    curtainsBlockState(DecoBlocks.CURTAIN_PURPLE);
    curtainsBlockState(DecoBlocks.CURTAIN_RED);
    curtainsBlockState(DecoBlocks.CURTAIN_WHITE);

}

    //inputs manipulation
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
    simpleBlockWithItem (blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

//default bars. Dont think much about textures. They're set in DecoBlockModProvider currently
    private void barsBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
    barsBlockInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockInternal(Block block, String baseName,
                                                 ResourceLocation particle, ResourceLocation bars,
                                                 ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSide(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAlt(baseName, particle, bars, edge);
        ModelFile cap = decoBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = decoBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    private void barsNoCapBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsNoCapBlockInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsNoCapBlockInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSide(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAlt(baseName, particle, bars, edge);
        barsNoCapBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with different side and side_alt UV
    private void barsNonstraightBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockNonstraightInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockNonstraightInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideNonstraight(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltNonstraight(baseName, particle, bars, edge);
        barsNoCapBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with different side and side_alt UV and false ends
    private void barsNonstraightFalseEndsBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockNonstraightFalseEndsInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockNonstraightFalseEndsInternal(Block block, String baseName,
                                              ResourceLocation particle, ResourceLocation bars,
                                              ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideNonstraight(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltNonstraight(baseName, particle, bars, edge);
        barsNoCapFalseEndsBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with no lower cap of side and side_alt
    private void barsVBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockVInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockVInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideV(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltV(baseName, particle, bars, edge);
        ModelFile cap = decoBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = decoBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    //bars with no lower parts of side and side_alt + false post_ends
    private void barsUBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockUInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockUInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideU(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltU(baseName, particle, bars, edge);
        ModelFile cap = decoBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = decoBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsFalseEndsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }
    //bars with no cap and cap_alt + no lower parts of side and side_alt + false post_ends
    private void barsUNoCapBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockUNoCapInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));
    }
    private void barsBlockUNoCapInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideU(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltU(baseName, particle, bars, edge);
        barsNoCapFalseEndsBlock(block, post, postEnds, side, sideAlt);
    }

    //bars with no lower cap of side and side_alt and upside down
    private void barsReverseVBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockReverseVInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockReverseVInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideReverseV(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltReverseV(baseName, particle, bars, edge);
        ModelFile cap = decoBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = decoBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    //bars with no lower parts of side and side_alt
    private void barsReverseUBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockReverseUInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockReverseUInternal(Block block, String baseName,
                                    ResourceLocation particle, ResourceLocation bars,
                                    ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideReverseU(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltReverseU(baseName, particle, bars, edge);
        ModelFile cap = decoBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = decoBlockModels.barsCapAlt(baseName, particle, bars, edge);
        barsFalseEndsBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
    }

    //bars with no cap and cap_alt + no lower parts of side and side_alt
    private void barsReverseUNoCapBlockState(RegistryObject<Block> block) {
        RegistryObject<Block> wax = block;
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);
        barsBlockReverseUNoCapInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()),
                new ResourceLocation(mId, blockId));

    }
    private void barsBlockReverseUNoCapInternal(Block block, String baseName,
                                           ResourceLocation particle, ResourceLocation bars,
                                           ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, bars);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile side = decoBlockModels.barsSideReverseU(baseName, particle, bars, edge);
        ModelFile sideAlt = decoBlockModels.barsSideAltReverseU(baseName, particle, bars, edge);
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
            BooleanProperty dir1 = e.getValue();

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
            BooleanProperty dir1 = e.getValue();
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
            BooleanProperty dir1 = e.getValue();
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
            BooleanProperty dir1 = e.getValue();
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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        panelBlockInternal(wax.get(), wax.getId().toString(),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath().replace("l", "")),
                new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath().replace("l", "")));
    }
    private void panelBlockInternal(Block block, String baseName,
                                    ResourceLocation bars, ResourceLocation edge) {
        ModelFile rot0 = decoBlockModels.panelRot0(baseName, bars, edge);
        ModelFile rot1 = decoBlockModels.panelRot1(baseName, bars, edge);
        ModelFile rot2 = decoBlockModels.panelRot2(baseName, bars, edge);
        ModelFile rot3 = decoBlockModels.panelRot3(baseName, bars, edge);
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
            blockId = DecoSupGen.BlockIdFilter(textureBlock);
            mId = DecoSupGen.ModIdFilter(textureBlock);
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
        ModelFile post = decoBlockModels.decoPanePost(baseName, bars, edge);

        ResourceLocation[] panes = {pane0,pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12,pane13,pane14,pane15,pane16};
        ModelFile[] sides = new ModelFile[panes.length];
        ModelFile[] sideAlts = new ModelFile[panes.length];
        for (int x = 0; x < panes.length; x++){
            String nameplus = "_"+panes[x].toString().replace("minecraft:block/","").replace("_stained_glass","");
            if(x==0) nameplus = "";
            sides[x] = decoBlockModels.vitragePaneSide(baseName+nameplus, particle, bars, panes[x], edge);
            sideAlts[x] = decoBlockModels.vitragePaneSideAlt(baseName+nameplus, particle, bars, panes[x], edge);
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
        ModelFile rot0 = decoBlockModels.vitragePanelBars(baseName+"rotation_0", bars, edge);
        ModelFile rot1 = decoBlockModels.vitragePanelBars(baseName+"rotation_1", bars, edge);
        ModelFile rot2 = decoBlockModels.vitragePanelBars(baseName+"rotation_2", bars, edge);
        ModelFile rot3 = decoBlockModels.vitragePanelBars(baseName+"rotation_3", bars, edge);

        ResourceLocation[] panes = {pane0,pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12,pane13,pane14,pane15,pane16};
        ModelFile[] insides = new ModelFile[panes.length];
        for (int x = 0; x < panes.length; x++){
            String nameplus = "_"+panes[x].toString().replace("minecraft:block/","").replace("_stained_glass","");
            if(x==0) nameplus = "";
            insides[x] = decoBlockModels.vitragePanelPane(baseName+nameplus, panes[x]);
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


    private void curtainsBlockState(RegistryObject<Block> block) {
        curtainsBlockInternal(block.get(), block.getId().toString(),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"));

    }
    private void curtainsBlockInternal(Block block, String baseName,
                                   ResourceLocation particle, ResourceLocation bars,
                                   ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, edge);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile cap = decoBlockModels.barsCap(baseName, particle, bars, edge);
        ModelFile capAlt = decoBlockModels.barsCapAlt(baseName, particle, bars, edge);
        ModelFile rodSide = decoBlockModels.curtainRodSide(baseName, bars);
        ModelFile rodSideAlt = decoBlockModels.curtainRodSideAlt(baseName, bars);
        ModelFile capDown = decoBlockModels.curtainDownCap(baseName, bars);
        ModelFile capDownAlt = decoBlockModels.curtainDownCapAlt(baseName, bars);

        ModelFile side_single = decoBlockModels.barsSideNonstraight(baseName +"_single_upper", particle, bars, edge);
        ModelFile sideAlt_single = decoBlockModels.barsSideAltNonstraight(baseName +"_single_upper", particle, bars, edge);
        ModelFile side_right = decoBlockModels.barsSideNonstraight(baseName +"_three_right_upper", particle, bars, edge);
        ModelFile sideAlt_right = decoBlockModels.barsSideAltNonstraight(baseName +"_three_right_upper", particle, bars, edge);
        ModelFile side_left = decoBlockModels.barsSideNonstraight(baseName +"_three_left_upper", particle, bars, edge);
        ModelFile sideAlt_left = decoBlockModels.barsSideAltNonstraight(baseName +"_three_left_upper", particle, bars, edge);
        ModelFile side_middle = decoBlockModels.barsSideNonstraight(baseName +"_three_middle_upper", particle, bars, edge);
        ModelFile sideAlt_middle = decoBlockModels.barsSideAltNonstraight(baseName +"_three_middle_upper", particle, bars, edge);
        ModelFile side_singleDown = decoBlockModels.barsSideNonstraight(baseName +"_single_lower", particle, bars, edge);
        ModelFile sideAlt_singleDown = decoBlockModels.barsSideAltNonstraight(baseName +"_single_lower", particle, bars, edge);
        ModelFile side_rightDown = decoBlockModels.barsSideNonstraight(baseName +"_three_right_lower", particle, bars, edge);
        ModelFile sideAlt_rightDown = decoBlockModels.barsSideAltNonstraight(baseName +"_three_right_lower", particle, bars, edge);
        ModelFile side_leftDown = decoBlockModels.barsSideNonstraight(baseName +"_three_left_lower", particle, bars, edge);
        ModelFile sideAlt_leftDown = decoBlockModels.barsSideAltNonstraight(baseName +"_three_left_lower", particle, bars, edge);
        ModelFile side_middleDown = decoBlockModels.barsSideNonstraight(baseName +"_three_middle_lower", particle, bars, edge);
        ModelFile sideAlt_middleDown = decoBlockModels.barsSideAltNonstraight(baseName +"_three_middle_lower", particle, bars, edge);

        ModelFile side_singleOpen = decoBlockModels.barsSideNonstraight(baseName +"_single_upper_open", particle, bars, edge);
        ModelFile sideAlt_singleOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_single_upper_open", particle, bars, edge);
        ModelFile side_rightOpen = decoBlockModels.barsSideNonstraight(baseName +"_three_right_upper_open", particle, bars, edge);
        ModelFile sideAlt_rightOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_three_right_upper_open", particle, bars, edge);
        ModelFile side_leftOpen = decoBlockModels.barsSideNonstraight(baseName +"_three_left_upper_open", particle, bars, edge);
        ModelFile sideAlt_leftOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_three_left_upper_open", particle, bars, edge);
        ModelFile side_middleOpen = decoBlockModels.barsSideNonstraight(baseName +"_three_middle_upper_open", particle, bars, edge);
        ModelFile sideAlt_middleOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_three_middle_upper_open", particle, bars, edge);
        ModelFile side_singleDownOpen = decoBlockModels.barsSideNonstraight(baseName +"_single_lower_open", particle, bars, edge);
        ModelFile sideAlt_singleDownOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_single_lower_open", particle, bars, edge);
        ModelFile side_rightDownOpen = decoBlockModels.barsSideNonstraight(baseName +"_three_right_lower_open", particle, bars, edge);
        ModelFile sideAlt_rightDownOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_three_right_lower_open", particle, bars, edge);
        ModelFile side_leftDownOpen = decoBlockModels.barsSideNonstraight(baseName +"_three_left_lower_open", particle, bars, edge);
        ModelFile sideAlt_leftDownOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_three_left_lower_open", particle, bars, edge);
        ModelFile side_middleDownOpen = decoBlockModels.barsSideNonstraight(baseName +"_three_middle_lower_open", particle, bars, edge);
        ModelFile sideAlt_middleDownOpen = decoBlockModels.barsSideAltNonstraight(baseName +"_three_middle_lower_open", particle, bars, edge);


        curtainBlock(block, post, postEnds, rodSide, rodSideAlt, cap, capAlt, capDown, capDownAlt, side_single, sideAlt_single, side_right, sideAlt_right,
                side_left, sideAlt_left, side_middle, sideAlt_middle, side_singleDown, sideAlt_singleDown, side_rightDown, sideAlt_rightDown,
                side_leftDown, sideAlt_leftDown, side_middleDown, sideAlt_middleDown, side_singleOpen, sideAlt_singleOpen, side_rightOpen,
                sideAlt_rightOpen, side_leftOpen, sideAlt_leftOpen, side_middleOpen, sideAlt_middleOpen, side_singleDownOpen, sideAlt_singleDownOpen,
                side_rightDownOpen, sideAlt_rightDownOpen, side_leftDownOpen, sideAlt_leftDownOpen, side_middleDownOpen, sideAlt_middleDownOpen);
    }

    private void curtainBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile rodSide, ModelFile rodSideAlt,
                              ModelFile cap, ModelFile capAlt, ModelFile capDown, ModelFile capDownAlt,
                              ModelFile side_single, ModelFile sideAlt_single, ModelFile side_right, ModelFile sideAlt_right,
                              ModelFile side_left, ModelFile sideAlt_left, ModelFile side_middle, ModelFile sideAlt_middle,
                              ModelFile side_singleDown, ModelFile sideAlt_singleDown, ModelFile side_rightDown, ModelFile sideAlt_rightDown,
                              ModelFile side_leftDown, ModelFile sideAlt_leftDown, ModelFile side_middleDown, ModelFile sideAlt_middleDown,

                              ModelFile side_singleOpen, ModelFile sideAlt_singleOpen, ModelFile side_rightOpen, ModelFile sideAlt_rightOpen,
                              ModelFile side_leftOpen, ModelFile sideAlt_leftOpen, ModelFile side_middleOpen, ModelFile sideAlt_middleOpen,
                              ModelFile side_singleDownOpen, ModelFile sideAlt_singleDownOpen, ModelFile side_rightDownOpen, ModelFile sideAlt_rightDownOpen,
                              ModelFile side_leftDownOpen, ModelFile sideAlt_leftDownOpen, ModelFile side_middleDownOpen, ModelFile sideAlt_middleDownOpen) {

        ModelFile[] sides = {side_single, side_left, side_middle, side_right};
        ModelFile[] sideAlts = {sideAlt_single, sideAlt_left, sideAlt_middle, sideAlt_right};
        ModelFile[] sidesDown = {side_singleDown, side_leftDown, side_middleDown, side_rightDown};
        ModelFile[] sideAltsDown = {sideAlt_singleDown, sideAlt_leftDown, sideAlt_middleDown, sideAlt_rightDown};
        ModelFile[] sidesOpen = {side_singleOpen, side_leftOpen, side_middleOpen, side_rightOpen};
        ModelFile[] sideAltsOpen = {sideAlt_singleOpen, sideAlt_leftOpen, sideAlt_middleOpen, sideAlt_rightOpen};
        ModelFile[] sidesDownOpen = {side_singleDownOpen, side_leftDownOpen, side_middleDownOpen, side_rightDownOpen};
        ModelFile[] sideAltsDownOpen = {sideAlt_singleDownOpen, sideAlt_leftDownOpen, sideAlt_middleDownOpen, sideAlt_rightDownOpen};

    MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel().condition(PipeBlock.SOUTH, false)
            .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
            .end()
            .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false)
            .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
            .end();

        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();

            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? capAlt : cap)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false)
                        .condition(TemplateCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, false).end()
                .part().modelFile(alt || dir == Direction.WEST ? capDownAlt : capDown)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false)
                        .condition(TemplateCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, true).end()
                .part().modelFile(alt || dir == Direction.WEST ? rodSideAlt : rodSide)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(PipeBlock.UP, false).end();

                       for (int x=0; x<4; x++) {
                            builder.part().modelFile(alt || dir == Direction.WEST ? sideAlts[x] : sides[x])
                                    .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                                    .condition(e.getValue(), true)
                                    .condition(TemplateCurtainBlock.POSITION, x)
                                    .condition(TemplateCurtainBlock.OPEN, false)
                                    .condition(PipeBlock.DOWN, true).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDown[x] : sidesDown[x])
                                   .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                                   .condition(e.getValue(), true)
                                   .condition(TemplateCurtainBlock.POSITION, x)
                                   .condition(TemplateCurtainBlock.OPEN, false)
                                   .condition(PipeBlock.DOWN, false).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsOpen[x] : sidesOpen[x])
                                   .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                                   .condition(e.getValue(), true)
                                   .condition(TemplateCurtainBlock.POSITION, x)
                                   .condition(TemplateCurtainBlock.OPEN, true)
                                   .condition(PipeBlock.DOWN, true).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDownOpen[x] : sidesDownOpen[x])
                                   .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                                   .condition(e.getValue(), true)
                                   .condition(TemplateCurtainBlock.POSITION, x)
                                   .condition(TemplateCurtainBlock.OPEN, true)
                                   .condition(PipeBlock.DOWN, false).end();
                       }
            }
        });
    }


    //supply methods
BooleanProperty getOppositeProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getOpposite());}

BooleanProperty getLeftProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getCounterClockWise());}

BooleanProperty getRightProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getClockWise());}


}