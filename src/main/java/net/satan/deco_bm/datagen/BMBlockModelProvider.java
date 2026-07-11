package net.satan.deco_bm.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.datagen.util.BMSupGen;
import net.satan.deco_bm.register.BMBlocks;
import net.satan.deco_bm.satans_deco_bm;

import java.util.Arrays;


public class BMBlockModelProvider extends BlockModelProvider {
    public BMBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_bm.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
     //blocks go here
            //bars
        barsNonstraightNoCapModels(BMBlocks.IRON_BARS1);
        barsModels(BMBlocks.IRON_BARS2);
        barsUNoCapModels(BMBlocks.IRON_BARS3);
        barsVModels(BMBlocks.IRON_BARS4);
        barsUModels(BMBlocks.IRON_BARS5);
        barsVModels(BMBlocks.IRON_BARS6);
        barsReverseUNoCapModels(BMBlocks.IRON_BARS7);
        barsReverseVModels(BMBlocks.IRON_BARS8);
        barsReverseUModels(BMBlocks.IRON_BARS9);
        barsReverseVModels(BMBlocks.IRON_BARS10);
        barsNonstraightNoCapModels(BMBlocks.IRON_BARS11);
        barsUModels(BMBlocks.IRON_BARS13);
        barsReverseUModels(BMBlocks.IRON_BARS12);
        barsModels(BMBlocks.IRON_BARS14);
        barsModels(BMBlocks.IRON_BARS15);
        barsModels(BMBlocks.IRON_BARS16);
        barsModels(BMBlocks.IRON_BARS17);
        barsModels(BMBlocks.IRON_BARS18);
        barsModels(BMBlocks.IRON_BARS19);
        barsNonstraightNoCapModels(BMBlocks.IRON_BARS20);
        barsNonstraightNoCapModels(BMBlocks.IRON_BARS21);
        barsModels(BMBlocks.IRON_BARS22);
        barsModels(BMBlocks.IRON_BARS23);
        barsModels(BMBlocks.IRON_BARS24);
        barsModels(BMBlocks.IRON_BARS26);
        barsModels(BMBlocks.IRON_BARS27);
        barsModels(BMBlocks.IRON_BARS28);
        barsModels(BMBlocks.IRON_BARS30);
        barsModels(BMBlocks.IRON_BARS33);
        barsNoCapModels(BMBlocks.IRON_BARS34);

        barsModels(BMBlocks.GOLD_BARS);
        barsNonstraightNoCapModels(BMBlocks.GOLD_BARS1);
        barsModels(BMBlocks.GOLD_BARS2);
        barsUNoCapModels(BMBlocks.GOLD_BARS3);
        barsVModels(BMBlocks.GOLD_BARS4);
        barsUModels(BMBlocks.GOLD_BARS5);
        barsVModels(BMBlocks.GOLD_BARS6);
        barsReverseUNoCapModels(BMBlocks.GOLD_BARS7);
        barsReverseVModels(BMBlocks.GOLD_BARS8);
        barsReverseUModels(BMBlocks.GOLD_BARS9);
        barsReverseVModels(BMBlocks.GOLD_BARS10);
        barsNonstraightNoCapModels(BMBlocks.GOLD_BARS11);
        barsUModels(BMBlocks.GOLD_BARS13);
        barsReverseUModels(BMBlocks.GOLD_BARS12);
        barsModels(BMBlocks.GOLD_BARS14);
        barsModels(BMBlocks.GOLD_BARS15);
        barsModels(BMBlocks.GOLD_BARS16);
        barsModels(BMBlocks.GOLD_BARS17);
        barsModels(BMBlocks.GOLD_BARS18);
        barsModels(BMBlocks.GOLD_BARS19);
        barsNonstraightNoCapModels(BMBlocks.GOLD_BARS20);
        barsNonstraightNoCapModels(BMBlocks.GOLD_BARS21);
        barsModels(BMBlocks.GOLD_BARS22);
        barsModels(BMBlocks.GOLD_BARS23);
        barsModels(BMBlocks.GOLD_BARS24);
        barsModels(BMBlocks.GOLD_BARS26);
        barsModels(BMBlocks.GOLD_BARS27);
        barsModels(BMBlocks.GOLD_BARS28);
        barsModels(BMBlocks.GOLD_BARS30);
        barsModels(BMBlocks.GOLD_BARS33);
        barsNoCapModels(BMBlocks.GOLD_BARS34);

        barsModels(BMBlocks.EMERALD_BARS);
        barsNonstraightNoCapModels(BMBlocks.EMERALD_BARS1);
        barsModels(BMBlocks.EMERALD_BARS2);
        barsUNoCapModels(BMBlocks.EMERALD_BARS3);
        barsVModels(BMBlocks.EMERALD_BARS4);
        barsUModels(BMBlocks.EMERALD_BARS5);
        barsVModels(BMBlocks.EMERALD_BARS6);
        barsReverseUNoCapModels(BMBlocks.EMERALD_BARS7);
        barsReverseVModels(BMBlocks.EMERALD_BARS8);
        barsReverseUModels(BMBlocks.EMERALD_BARS9);
        barsReverseVModels(BMBlocks.EMERALD_BARS10);
        barsNonstraightNoCapModels(BMBlocks.EMERALD_BARS11);
        barsUModels(BMBlocks.EMERALD_BARS13);
        barsReverseUModels(BMBlocks.EMERALD_BARS12);
        barsModels(BMBlocks.EMERALD_BARS14);
        barsModels(BMBlocks.EMERALD_BARS15);
        barsModels(BMBlocks.EMERALD_BARS16);
        barsModels(BMBlocks.EMERALD_BARS17);
        barsModels(BMBlocks.EMERALD_BARS18);
        barsModels(BMBlocks.EMERALD_BARS19);
        barsNonstraightNoCapModels(BMBlocks.EMERALD_BARS20);
        barsNonstraightNoCapModels(BMBlocks.EMERALD_BARS21);
        barsModels(BMBlocks.EMERALD_BARS22);
        barsModels(BMBlocks.EMERALD_BARS23);
        barsModels(BMBlocks.EMERALD_BARS24);
        barsModels(BMBlocks.EMERALD_BARS26);
        barsModels(BMBlocks.EMERALD_BARS27);
        barsModels(BMBlocks.EMERALD_BARS28);
        barsModels(BMBlocks.EMERALD_BARS30);
        barsModels(BMBlocks.EMERALD_BARS33);
        barsNoCapModels(BMBlocks.EMERALD_BARS34);

        barsModels(BMBlocks.DARKMETAL_BARS);
        barsNonstraightNoCapModels(BMBlocks.DARKMETAL_BARS1);
        barsModels(BMBlocks.DARKMETAL_BARS2);
        barsUNoCapModels(BMBlocks.DARKMETAL_BARS3);
        barsVModels(BMBlocks.DARKMETAL_BARS4);
        barsUModels(BMBlocks.DARKMETAL_BARS5);
        barsVModels(BMBlocks.DARKMETAL_BARS6);
        barsReverseUNoCapModels(BMBlocks.DARKMETAL_BARS7);
        barsReverseVModels(BMBlocks.DARKMETAL_BARS8);
        barsReverseUModels(BMBlocks.DARKMETAL_BARS9);
        barsReverseVModels(BMBlocks.DARKMETAL_BARS10);
        barsNonstraightNoCapModels(BMBlocks.DARKMETAL_BARS11);
        barsUModels(BMBlocks.DARKMETAL_BARS13);
        barsReverseUModels(BMBlocks.DARKMETAL_BARS12);
        barsModels(BMBlocks.DARKMETAL_BARS14);
        barsModels(BMBlocks.DARKMETAL_BARS15);
        barsModels(BMBlocks.DARKMETAL_BARS16);
        barsModels(BMBlocks.DARKMETAL_BARS17);
        barsModels(BMBlocks.DARKMETAL_BARS18);
        barsModels(BMBlocks.DARKMETAL_BARS19);
        barsNonstraightNoCapModels(BMBlocks.DARKMETAL_BARS20);
        barsNonstraightNoCapModels(BMBlocks.DARKMETAL_BARS21);
        barsModels(BMBlocks.DARKMETAL_BARS22);
        barsModels(BMBlocks.DARKMETAL_BARS23);
        barsModels(BMBlocks.DARKMETAL_BARS24);
        barsModels(BMBlocks.DARKMETAL_BARS26);
        barsModels(BMBlocks.DARKMETAL_BARS27);
        barsModels(BMBlocks.DARKMETAL_BARS28);
        barsModels(BMBlocks.DARKMETAL_BARS30);
        barsModels(BMBlocks.DARKMETAL_BARS33);
        barsNoCapModels(BMBlocks.DARKMETAL_BARS34);


        barsModels(BMBlocks.CLOUD_BARS);
        barsNonstraightNoCapModels(BMBlocks.CLOUD_BARS1);
        barsModels(BMBlocks.CLOUD_BARS2);
        barsUNoCapModels(BMBlocks.CLOUD_BARS3);
        barsVModels(BMBlocks.CLOUD_BARS4);
        barsUModels(BMBlocks.CLOUD_BARS5);
        barsVModels(BMBlocks.CLOUD_BARS6);
        barsReverseUNoCapModels(BMBlocks.CLOUD_BARS7);
        barsReverseVModels(BMBlocks.CLOUD_BARS8);
        barsReverseUModels(BMBlocks.CLOUD_BARS9);
        barsReverseVModels(BMBlocks.CLOUD_BARS10);
        barsNonstraightNoCapModels(BMBlocks.CLOUD_BARS11);
        barsUModels(BMBlocks.CLOUD_BARS13);
        barsReverseUModels(BMBlocks.CLOUD_BARS12);
        barsModels(BMBlocks.CLOUD_BARS14);
        barsModels(BMBlocks.CLOUD_BARS15);
        barsModels(BMBlocks.CLOUD_BARS16);
        barsModels(BMBlocks.CLOUD_BARS17);
        barsModels(BMBlocks.CLOUD_BARS18);
        barsModels(BMBlocks.CLOUD_BARS19);
        barsNonstraightNoCapModels(BMBlocks.CLOUD_BARS20);
        barsNonstraightNoCapModels(BMBlocks.CLOUD_BARS21);
        barsModels(BMBlocks.CLOUD_BARS22);
        barsModels(BMBlocks.CLOUD_BARS23);
        barsModels(BMBlocks.CLOUD_BARS24);
        barsModels(BMBlocks.CLOUD_BARS26);
        barsModels(BMBlocks.CLOUD_BARS27);
        barsModels(BMBlocks.CLOUD_BARS28);
        barsModels(BMBlocks.CLOUD_BARS30);
        barsModels(BMBlocks.CLOUD_BARS33);
        barsNoCapModels(BMBlocks.CLOUD_BARS34);

        barsModels(BMBlocks.COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.COPPER_BARS1);
        barsModels(BMBlocks.COPPER_BARS2);
        barsUNoCapModels(BMBlocks.COPPER_BARS3);
        barsVModels(BMBlocks.COPPER_BARS4);
        barsUModels(BMBlocks.COPPER_BARS5);
        barsVModels(BMBlocks.COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.COPPER_BARS7);
        barsReverseVModels(BMBlocks.COPPER_BARS8);
        barsReverseUModels(BMBlocks.COPPER_BARS9);
        barsReverseVModels(BMBlocks.COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.COPPER_BARS11);
        barsUModels(BMBlocks.COPPER_BARS13);
        barsReverseUModels(BMBlocks.COPPER_BARS12);
        barsModels(BMBlocks.COPPER_BARS14);
        barsModels(BMBlocks.COPPER_BARS15);
        barsModels(BMBlocks.COPPER_BARS16);
        barsModels(BMBlocks.COPPER_BARS17);
        barsModels(BMBlocks.COPPER_BARS18);
        barsModels(BMBlocks.COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.COPPER_BARS21);
        barsModels(BMBlocks.COPPER_BARS22);
        barsModels(BMBlocks.COPPER_BARS23);
        barsModels(BMBlocks.COPPER_BARS24);
        barsModels(BMBlocks.COPPER_BARS26);
        barsModels(BMBlocks.COPPER_BARS27);
        barsModels(BMBlocks.COPPER_BARS28);
        barsModels(BMBlocks.COPPER_BARS30);
        barsModels(BMBlocks.COPPER_BARS33);
        barsNoCapModels(BMBlocks.COPPER_BARS34);

        barsModels(BMBlocks.EXPOSED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.EXPOSED_COPPER_BARS1);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.EXPOSED_COPPER_BARS3);
        barsVModels(BMBlocks.EXPOSED_COPPER_BARS4);
        barsUModels(BMBlocks.EXPOSED_COPPER_BARS5);
        barsVModels(BMBlocks.EXPOSED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.EXPOSED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.EXPOSED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.EXPOSED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.EXPOSED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.EXPOSED_COPPER_BARS11);
        barsUModels(BMBlocks.EXPOSED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.EXPOSED_COPPER_BARS12);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS14);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS15);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS16);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS17);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS18);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.EXPOSED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.EXPOSED_COPPER_BARS21);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS22);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS23);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS24);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS26);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS27);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS28);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS30);
        barsModels(BMBlocks.EXPOSED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.EXPOSED_COPPER_BARS34);

        barsModels(BMBlocks.WEATHERED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.WEATHERED_COPPER_BARS1);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.WEATHERED_COPPER_BARS3);
        barsVModels(BMBlocks.WEATHERED_COPPER_BARS4);
        barsUModels(BMBlocks.WEATHERED_COPPER_BARS5);
        barsVModels(BMBlocks.WEATHERED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.WEATHERED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.WEATHERED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.WEATHERED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.WEATHERED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.WEATHERED_COPPER_BARS11);
        barsUModels(BMBlocks.WEATHERED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.WEATHERED_COPPER_BARS12);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS14);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS15);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS16);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS17);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS18);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.WEATHERED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.WEATHERED_COPPER_BARS21);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS22);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS23);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS24);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS26);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS27);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS28);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS30);
        barsModels(BMBlocks.WEATHERED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.WEATHERED_COPPER_BARS34);

        barsModels(BMBlocks.OXIDIZED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS1);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS3);
        barsVModels(BMBlocks.OXIDIZED_COPPER_BARS4);
        barsUModels(BMBlocks.OXIDIZED_COPPER_BARS5);
        barsVModels(BMBlocks.OXIDIZED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.OXIDIZED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.OXIDIZED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.OXIDIZED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS11);
        barsUModels(BMBlocks.OXIDIZED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.OXIDIZED_COPPER_BARS12);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS14);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS15);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS16);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS17);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS18);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS21);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS22);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS23);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS24);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS26);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS27);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS28);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS30);
        barsModels(BMBlocks.OXIDIZED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.OXIDIZED_COPPER_BARS34);

        barsModels(BMBlocks.WAXED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.WAXED_COPPER_BARS1);
        barsModels(BMBlocks.WAXED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.WAXED_COPPER_BARS3);
        barsVModels(BMBlocks.WAXED_COPPER_BARS4);
        barsUModels(BMBlocks.WAXED_COPPER_BARS5);
        barsVModels(BMBlocks.WAXED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.WAXED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.WAXED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.WAXED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.WAXED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.WAXED_COPPER_BARS11);
        barsUModels(BMBlocks.WAXED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.WAXED_COPPER_BARS12);
        barsModels(BMBlocks.WAXED_COPPER_BARS14);
        barsModels(BMBlocks.WAXED_COPPER_BARS15);
        barsModels(BMBlocks.WAXED_COPPER_BARS16);
        barsModels(BMBlocks.WAXED_COPPER_BARS17);
        barsModels(BMBlocks.WAXED_COPPER_BARS18);
        barsModels(BMBlocks.WAXED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.WAXED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.WAXED_COPPER_BARS21);
        barsModels(BMBlocks.WAXED_COPPER_BARS22);
        barsModels(BMBlocks.WAXED_COPPER_BARS23);
        barsModels(BMBlocks.WAXED_COPPER_BARS24);
        barsModels(BMBlocks.WAXED_COPPER_BARS26);
        barsModels(BMBlocks.WAXED_COPPER_BARS27);
        barsModels(BMBlocks.WAXED_COPPER_BARS28);
        barsModels(BMBlocks.WAXED_COPPER_BARS30);
        barsModels(BMBlocks.WAXED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.WAXED_COPPER_BARS34);

        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS1);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS3);
        barsVModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS4);
        barsUModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS5);
        barsVModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS11);
        barsUModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS12);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS14);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS15);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS16);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS17);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS18);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS21);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS22);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS23);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS24);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS26);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS27);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS28);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS30);
        barsModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.WAXED_EXPOSED_COPPER_BARS34);

        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS1);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS3);
        barsVModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS4);
        barsUModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS5);
        barsVModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS11);
        barsUModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS12);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS14);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS15);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS16);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS17);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS18);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS21);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS22);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS23);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS24);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS26);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS27);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS28);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS30);
        barsModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.WAXED_WEATHERED_COPPER_BARS34);

        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS);
        barsNonstraightNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS1);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS2);
        barsUNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS3);
        barsVModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS4);
        barsUModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS5);
        barsVModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS6);
        barsReverseUNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS7);
        barsReverseVModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS8);
        barsReverseUModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS9);
        barsReverseVModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS10);
        barsNonstraightNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS11);
        barsUModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS13);
        barsReverseUModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS12);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS14);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS15);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS16);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS17);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS18);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS19);
        barsNonstraightNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS20);
        barsNonstraightNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS21);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS22);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS23);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS24);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS26);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS27);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS28);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS30);
        barsModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS33);
        barsNoCapModels(BMBlocks.WAXED_OXIDIZED_COPPER_BARS34);

        //panels
        panelModels(BMBlocks.IRON_PANEL1);
        panelModels(BMBlocks.IRON_PANEL2);
        panelModels(BMBlocks.IRON_PANEL3);

        panelModels(BMBlocks.GOLD_PANEL1);
        panelModels(BMBlocks.GOLD_PANEL2);
        panelModels(BMBlocks.GOLD_PANEL3);

        panelModels(BMBlocks.EMERALD_PANEL1);
        panelModels(BMBlocks.EMERALD_PANEL2);
        panelModels(BMBlocks.EMERALD_PANEL3);

        panelModels(BMBlocks.DARKMETAL_PANEL1);
        panelModels(BMBlocks.DARKMETAL_PANEL2);
        panelModels(BMBlocks.DARKMETAL_PANEL3);

        panelModels(BMBlocks.CLOUD_PANEL1);
        panelModels(BMBlocks.CLOUD_PANEL2);
        panelModels(BMBlocks.CLOUD_PANEL3);

        panelModels(BMBlocks.COPPER_PANEL1);
        panelModels(BMBlocks.COPPER_PANEL2);
        panelModels(BMBlocks.COPPER_PANEL3);

        panelModels(BMBlocks.EXPOSED_COPPER_PANEL1);
        panelModels(BMBlocks.EXPOSED_COPPER_PANEL2);
        panelModels(BMBlocks.EXPOSED_COPPER_PANEL3);

        panelModels(BMBlocks.WEATHERED_COPPER_PANEL1);
        panelModels(BMBlocks.WEATHERED_COPPER_PANEL2);
        panelModels(BMBlocks.WEATHERED_COPPER_PANEL3);

        panelModels(BMBlocks.OXIDIZED_COPPER_PANEL1);
        panelModels(BMBlocks.OXIDIZED_COPPER_PANEL2);
        panelModels(BMBlocks.OXIDIZED_COPPER_PANEL3);

        panelModels(BMBlocks.WAXED_COPPER_PANEL1);
        panelModels(BMBlocks.WAXED_COPPER_PANEL2);
        panelModels(BMBlocks.WAXED_COPPER_PANEL3);

        panelModels(BMBlocks.WAXED_EXPOSED_COPPER_PANEL1);
        panelModels(BMBlocks.WAXED_EXPOSED_COPPER_PANEL2);
        panelModels(BMBlocks.WAXED_EXPOSED_COPPER_PANEL3);

        panelModels(BMBlocks.WAXED_WEATHERED_COPPER_PANEL1);
        panelModels(BMBlocks.WAXED_WEATHERED_COPPER_PANEL2);
        panelModels(BMBlocks.WAXED_WEATHERED_COPPER_PANEL3);

        panelModels(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL1);
        panelModels(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL2);
        panelModels(BMBlocks.WAXED_OXIDIZED_COPPER_PANEL3);

        //blocks end here
    }
    //registry objects

    private BlockModelBuilder barsModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSide(name, bars, bars, edge),
                barsSideAlt(name, bars, bars, edge),
                barsCap(name, bars, edge, edge),
                barsCapAlt(name, bars, edge, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsNoCapModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSide(name, bars, bars, edge),
                barsSideAlt(name, bars, bars, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsNonstraightNoCapModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideNonstraight(name, bars, bars, bars),
                barsSideAltNonstraight(name, bars, bars, bars))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsNonstraightModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideNonstraight(name, bars, bars, bars),
                barsSideAltNonstraight(name, bars, bars, bars),
                barsCap(name, bars, edge, edge),
                barsCapAlt(name, bars, edge, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsVModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideV(name, bars, bars, bars),
                barsSideAltV(name, bars, bars, bars),
                barsCap(name, bars, edge, edge),
                barsCapAlt(name, bars, edge, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsUNoCapModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideU(name, bars, bars, edge),
                barsSideAltU(name, bars, bars, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsReverseVModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideReverseV(name, bars, bars, bars),
                barsSideAltReverseV(name, bars, bars, bars),
                barsCap(name, bars, edge, edge),
                barsCapAlt(name, bars, edge, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsReverseUNoCapModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideReverseU(name, bars, bars, edge),
                barsSideAltReverseU(name, bars, bars, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsUModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideU(name, bars, bars, edge),
                barsSideAltU(name, bars, bars, edge),
                barsCap(name, bars, edge, edge),
                barsCapAlt(name, bars, edge, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsReverseUModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        String blockId = BMSupGen.BlockIdFilter(block);
        String mId = BMSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideReverseU(name, bars, bars, edge),
                barsSideAltReverseU(name, bars, bars, edge),
                barsCap(name, bars, edge, edge),
                barsCapAlt(name, bars, edge, edge))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder panelModels(RegistryObject<Block> block) {
       String name = block.getId().getPath();
        if (block.getId().getPath().contains("waxed_")) block = BMSupGen.getDecoNonWaxed(block);
        ResourceLocation texture1 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMSupGen.getPanelTexture(block,0));
        ResourceLocation texture2 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMSupGen.getPanelTexture(block,1));
        ResourceLocation texture3 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMSupGen.getPanelTexture(block,2));
        ResourceLocation texture4 = new ResourceLocation(satans_deco_bm.MODID, "block/" + BMSupGen.getPanelTexture(block,3));

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(panelRot0(name, texture1, texture1),
                panelRot1(name, texture2, texture2),
                panelRot2(name, texture3, texture3),
                panelRot3(name, texture4, texture4))) {
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

    public BlockModelBuilder barsSide(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side", new ResourceLocation("block/iron_bars_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideAlt(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt", new ResourceLocation("block/iron_bars_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
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

    public BlockModelBuilder barsSideNonstraight(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/nonstraight_bars_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideAltNonstraight(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/nonstraight_bars_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideV(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/v_bars_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideAltV(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/v_bars_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideReverseV(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/reverse_v_bars_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideAltReverseV(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/reverse_v_bars_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideU(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/u_bars_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideAltU(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/u_bars_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideReverseU(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/reverse_u_bars_side"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsSideAltReverseU(String name, ResourceLocation particle, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_side_alt",
                new ResourceLocation(satans_deco_bm.MODID,"block/bars/reverse_u_bars_side_alt"))
                .texture("particle", particle)
                .texture("bars", bars)
                .texture("edge", edge).renderType("cutout_mipped");
    }

    public BlockModelBuilder panelRot0(String name, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_rotation_0",
                new ResourceLocation(satans_deco_bm.MODID,"block/panel/template_panel"))
                .texture("bars", bars)
                .texture("edge", edge)
                .texture("particle", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder panelRot1(String name, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_rotation_1",
                new ResourceLocation(satans_deco_bm.MODID,"block/panel/template_panel"))
                .texture("bars", bars)
                .texture("edge", edge)
                .texture("particle", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder panelRot2(String name, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_rotation_2",
                new ResourceLocation(satans_deco_bm.MODID,"block/panel/template_panel"))
                .texture("bars", bars)
                .texture("edge", edge)
                .texture("particle", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder panelRot3(String name, ResourceLocation bars, ResourceLocation edge) {
        return withExistingParent(name + "_rotation_3",
                new ResourceLocation(satans_deco_bm.MODID,"block/panel/template_panel"))
                .texture("bars", bars)
                .texture("edge", edge)
                .texture("particle", bars).renderType("cutout_mipped");
    }
}