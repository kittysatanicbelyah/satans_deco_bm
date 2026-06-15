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

    //supply methods
BooleanProperty getOppositeProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getOpposite());}

BooleanProperty getLeftProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getCounterClockWise());}

BooleanProperty getRightProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getClockWise());}


}