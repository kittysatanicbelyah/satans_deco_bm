package net.satan.deco_bm.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.datagen.util.DecoSupGen;
import net.satan.deco_bm.register.DecoBlocks;
import net.satan.deco_bm.satans_deco_bm;

import java.util.Arrays;


public class DecoBlockModelProvider extends BlockModelProvider {
    public DecoBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_bm.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
     //blocks go here
            //bars
        barsNonstraightNoCapModels(DecoBlocks.IRON_BARS1);
        barsModels(DecoBlocks.IRON_BARS2);
        barsUNoCapModels(DecoBlocks.IRON_BARS3);
        barsVModels(DecoBlocks.IRON_BARS4);
        barsUModels(DecoBlocks.IRON_BARS5);
        barsVModels(DecoBlocks.IRON_BARS6);
        barsReverseUNoCapModels(DecoBlocks.IRON_BARS7);
        barsReverseVModels(DecoBlocks.IRON_BARS8);
        barsReverseUModels(DecoBlocks.IRON_BARS9);
        barsReverseVModels(DecoBlocks.IRON_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.IRON_BARS11);
        barsUModels(DecoBlocks.IRON_BARS13);
        barsReverseUModels(DecoBlocks.IRON_BARS12);
        barsModels(DecoBlocks.IRON_BARS14);
        barsModels(DecoBlocks.IRON_BARS15);
        barsModels(DecoBlocks.IRON_BARS16);
        barsModels(DecoBlocks.IRON_BARS17);
        barsModels(DecoBlocks.IRON_BARS18);
        barsModels(DecoBlocks.IRON_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.IRON_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.IRON_BARS21);
        barsModels(DecoBlocks.IRON_BARS22);
        barsModels(DecoBlocks.IRON_BARS23);
        barsModels(DecoBlocks.IRON_BARS24);
        barsModels(DecoBlocks.IRON_BARS26);
        barsModels(DecoBlocks.IRON_BARS27);
        barsModels(DecoBlocks.IRON_BARS28);
        barsModels(DecoBlocks.IRON_BARS30);
        barsModels(DecoBlocks.IRON_BARS33);
        barsNoCapModels(DecoBlocks.IRON_BARS34);

        barsModels(DecoBlocks.GOLD_BARS);
        barsNonstraightNoCapModels(DecoBlocks.GOLD_BARS1);
        barsModels(DecoBlocks.GOLD_BARS2);
        barsUNoCapModels(DecoBlocks.GOLD_BARS3);
        barsVModels(DecoBlocks.GOLD_BARS4);
        barsUModels(DecoBlocks.GOLD_BARS5);
        barsVModels(DecoBlocks.GOLD_BARS6);
        barsReverseUNoCapModels(DecoBlocks.GOLD_BARS7);
        barsReverseVModels(DecoBlocks.GOLD_BARS8);
        barsReverseUModels(DecoBlocks.GOLD_BARS9);
        barsReverseVModels(DecoBlocks.GOLD_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.GOLD_BARS11);
        barsUModels(DecoBlocks.GOLD_BARS13);
        barsReverseUModels(DecoBlocks.GOLD_BARS12);
        barsModels(DecoBlocks.GOLD_BARS14);
        barsModels(DecoBlocks.GOLD_BARS15);
        barsModels(DecoBlocks.GOLD_BARS16);
        barsModels(DecoBlocks.GOLD_BARS17);
        barsModels(DecoBlocks.GOLD_BARS18);
        barsModels(DecoBlocks.GOLD_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.GOLD_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.GOLD_BARS21);
        barsModels(DecoBlocks.GOLD_BARS22);
        barsModels(DecoBlocks.GOLD_BARS23);
        barsModels(DecoBlocks.GOLD_BARS24);
        barsModels(DecoBlocks.GOLD_BARS26);
        barsModels(DecoBlocks.GOLD_BARS27);
        barsModels(DecoBlocks.GOLD_BARS28);
        barsModels(DecoBlocks.GOLD_BARS30);
        barsModels(DecoBlocks.GOLD_BARS33);
        barsNoCapModels(DecoBlocks.GOLD_BARS34);

        barsModels(DecoBlocks.EMERALD_BARS);
        barsNonstraightNoCapModels(DecoBlocks.EMERALD_BARS1);
        barsModels(DecoBlocks.EMERALD_BARS2);
        barsUNoCapModels(DecoBlocks.EMERALD_BARS3);
        barsVModels(DecoBlocks.EMERALD_BARS4);
        barsUModels(DecoBlocks.EMERALD_BARS5);
        barsVModels(DecoBlocks.EMERALD_BARS6);
        barsReverseUNoCapModels(DecoBlocks.EMERALD_BARS7);
        barsReverseVModels(DecoBlocks.EMERALD_BARS8);
        barsReverseUModels(DecoBlocks.EMERALD_BARS9);
        barsReverseVModels(DecoBlocks.EMERALD_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.EMERALD_BARS11);
        barsUModels(DecoBlocks.EMERALD_BARS13);
        barsReverseUModels(DecoBlocks.EMERALD_BARS12);
        barsModels(DecoBlocks.EMERALD_BARS14);
        barsModels(DecoBlocks.EMERALD_BARS15);
        barsModels(DecoBlocks.EMERALD_BARS16);
        barsModels(DecoBlocks.EMERALD_BARS17);
        barsModels(DecoBlocks.EMERALD_BARS18);
        barsModels(DecoBlocks.EMERALD_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.EMERALD_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.EMERALD_BARS21);
        barsModels(DecoBlocks.EMERALD_BARS22);
        barsModels(DecoBlocks.EMERALD_BARS23);
        barsModels(DecoBlocks.EMERALD_BARS24);
        barsModels(DecoBlocks.EMERALD_BARS26);
        barsModels(DecoBlocks.EMERALD_BARS27);
        barsModels(DecoBlocks.EMERALD_BARS28);
        barsModels(DecoBlocks.EMERALD_BARS30);
        barsModels(DecoBlocks.EMERALD_BARS33);
        barsNoCapModels(DecoBlocks.EMERALD_BARS34);

        barsModels(DecoBlocks.DARKMETAL_BARS);
        barsNonstraightNoCapModels(DecoBlocks.DARKMETAL_BARS1);
        barsModels(DecoBlocks.DARKMETAL_BARS2);
        barsUNoCapModels(DecoBlocks.DARKMETAL_BARS3);
        barsVModels(DecoBlocks.DARKMETAL_BARS4);
        barsUModels(DecoBlocks.DARKMETAL_BARS5);
        barsVModels(DecoBlocks.DARKMETAL_BARS6);
        barsReverseUNoCapModels(DecoBlocks.DARKMETAL_BARS7);
        barsReverseVModels(DecoBlocks.DARKMETAL_BARS8);
        barsReverseUModels(DecoBlocks.DARKMETAL_BARS9);
        barsReverseVModels(DecoBlocks.DARKMETAL_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.DARKMETAL_BARS11);
        barsUModels(DecoBlocks.DARKMETAL_BARS13);
        barsReverseUModels(DecoBlocks.DARKMETAL_BARS12);
        barsModels(DecoBlocks.DARKMETAL_BARS14);
        barsModels(DecoBlocks.DARKMETAL_BARS15);
        barsModels(DecoBlocks.DARKMETAL_BARS16);
        barsModels(DecoBlocks.DARKMETAL_BARS17);
        barsModels(DecoBlocks.DARKMETAL_BARS18);
        barsModels(DecoBlocks.DARKMETAL_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.DARKMETAL_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.DARKMETAL_BARS21);
        barsModels(DecoBlocks.DARKMETAL_BARS22);
        barsModels(DecoBlocks.DARKMETAL_BARS23);
        barsModels(DecoBlocks.DARKMETAL_BARS24);
        barsModels(DecoBlocks.DARKMETAL_BARS26);
        barsModels(DecoBlocks.DARKMETAL_BARS27);
        barsModels(DecoBlocks.DARKMETAL_BARS28);
        barsModels(DecoBlocks.DARKMETAL_BARS30);
        barsModels(DecoBlocks.DARKMETAL_BARS33);
        barsNoCapModels(DecoBlocks.DARKMETAL_BARS34);


        barsModels(DecoBlocks.CLOUD_BARS);
        barsNonstraightNoCapModels(DecoBlocks.CLOUD_BARS1);
        barsModels(DecoBlocks.CLOUD_BARS2);
        barsUNoCapModels(DecoBlocks.CLOUD_BARS3);
        barsVModels(DecoBlocks.CLOUD_BARS4);
        barsUModels(DecoBlocks.CLOUD_BARS5);
        barsVModels(DecoBlocks.CLOUD_BARS6);
        barsReverseUNoCapModels(DecoBlocks.CLOUD_BARS7);
        barsReverseVModels(DecoBlocks.CLOUD_BARS8);
        barsReverseUModels(DecoBlocks.CLOUD_BARS9);
        barsReverseVModels(DecoBlocks.CLOUD_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.CLOUD_BARS11);
        barsUModels(DecoBlocks.CLOUD_BARS13);
        barsReverseUModels(DecoBlocks.CLOUD_BARS12);
        barsModels(DecoBlocks.CLOUD_BARS14);
        barsModels(DecoBlocks.CLOUD_BARS15);
        barsModels(DecoBlocks.CLOUD_BARS16);
        barsModels(DecoBlocks.CLOUD_BARS17);
        barsModels(DecoBlocks.CLOUD_BARS18);
        barsModels(DecoBlocks.CLOUD_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.CLOUD_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.CLOUD_BARS21);
        barsModels(DecoBlocks.CLOUD_BARS22);
        barsModels(DecoBlocks.CLOUD_BARS23);
        barsModels(DecoBlocks.CLOUD_BARS24);
        barsModels(DecoBlocks.CLOUD_BARS26);
        barsModels(DecoBlocks.CLOUD_BARS27);
        barsModels(DecoBlocks.CLOUD_BARS28);
        barsModels(DecoBlocks.CLOUD_BARS30);
        barsModels(DecoBlocks.CLOUD_BARS33);
        barsNoCapModels(DecoBlocks.CLOUD_BARS34);

        barsModels(DecoBlocks.COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.COPPER_BARS1);
        barsModels(DecoBlocks.COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.COPPER_BARS3);
        barsVModels(DecoBlocks.COPPER_BARS4);
        barsUModels(DecoBlocks.COPPER_BARS5);
        barsVModels(DecoBlocks.COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.COPPER_BARS7);
        barsReverseVModels(DecoBlocks.COPPER_BARS8);
        barsReverseUModels(DecoBlocks.COPPER_BARS9);
        barsReverseVModels(DecoBlocks.COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.COPPER_BARS11);
        barsUModels(DecoBlocks.COPPER_BARS13);
        barsReverseUModels(DecoBlocks.COPPER_BARS12);
        barsModels(DecoBlocks.COPPER_BARS14);
        barsModels(DecoBlocks.COPPER_BARS15);
        barsModels(DecoBlocks.COPPER_BARS16);
        barsModels(DecoBlocks.COPPER_BARS17);
        barsModels(DecoBlocks.COPPER_BARS18);
        barsModels(DecoBlocks.COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.COPPER_BARS21);
        barsModels(DecoBlocks.COPPER_BARS22);
        barsModels(DecoBlocks.COPPER_BARS23);
        barsModels(DecoBlocks.COPPER_BARS24);
        barsModels(DecoBlocks.COPPER_BARS26);
        barsModels(DecoBlocks.COPPER_BARS27);
        barsModels(DecoBlocks.COPPER_BARS28);
        barsModels(DecoBlocks.COPPER_BARS30);
        barsModels(DecoBlocks.COPPER_BARS33);
        barsNoCapModels(DecoBlocks.COPPER_BARS34);

        barsModels(DecoBlocks.EXPOSED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS1);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS3);
        barsVModels(DecoBlocks.EXPOSED_COPPER_BARS4);
        barsUModels(DecoBlocks.EXPOSED_COPPER_BARS5);
        barsVModels(DecoBlocks.EXPOSED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.EXPOSED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.EXPOSED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.EXPOSED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS11);
        barsUModels(DecoBlocks.EXPOSED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.EXPOSED_COPPER_BARS12);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS14);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS15);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS16);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS17);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS18);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS21);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS22);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS23);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS24);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS26);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS27);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS28);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS30);
        barsModels(DecoBlocks.EXPOSED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.EXPOSED_COPPER_BARS34);

        barsModels(DecoBlocks.WEATHERED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS1);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS3);
        barsVModels(DecoBlocks.WEATHERED_COPPER_BARS4);
        barsUModels(DecoBlocks.WEATHERED_COPPER_BARS5);
        barsVModels(DecoBlocks.WEATHERED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.WEATHERED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.WEATHERED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.WEATHERED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS11);
        barsUModels(DecoBlocks.WEATHERED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.WEATHERED_COPPER_BARS12);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS14);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS15);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS16);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS17);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS18);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS21);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS22);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS23);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS24);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS26);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS27);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS28);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS30);
        barsModels(DecoBlocks.WEATHERED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.WEATHERED_COPPER_BARS34);

        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS1);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS3);
        barsVModels(DecoBlocks.OXIDIZED_COPPER_BARS4);
        barsUModels(DecoBlocks.OXIDIZED_COPPER_BARS5);
        barsVModels(DecoBlocks.OXIDIZED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.OXIDIZED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.OXIDIZED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.OXIDIZED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS11);
        barsUModels(DecoBlocks.OXIDIZED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.OXIDIZED_COPPER_BARS12);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS14);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS15);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS16);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS17);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS18);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS21);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS22);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS23);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS24);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS26);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS27);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS28);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS30);
        barsModels(DecoBlocks.OXIDIZED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.OXIDIZED_COPPER_BARS34);

        barsModels(DecoBlocks.WAXED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_COPPER_BARS1);
        barsModels(DecoBlocks.WAXED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.WAXED_COPPER_BARS3);
        barsVModels(DecoBlocks.WAXED_COPPER_BARS4);
        barsUModels(DecoBlocks.WAXED_COPPER_BARS5);
        barsVModels(DecoBlocks.WAXED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.WAXED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.WAXED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.WAXED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.WAXED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_COPPER_BARS11);
        barsUModels(DecoBlocks.WAXED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.WAXED_COPPER_BARS12);
        barsModels(DecoBlocks.WAXED_COPPER_BARS14);
        barsModels(DecoBlocks.WAXED_COPPER_BARS15);
        barsModels(DecoBlocks.WAXED_COPPER_BARS16);
        barsModels(DecoBlocks.WAXED_COPPER_BARS17);
        barsModels(DecoBlocks.WAXED_COPPER_BARS18);
        barsModels(DecoBlocks.WAXED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_COPPER_BARS21);
        barsModels(DecoBlocks.WAXED_COPPER_BARS22);
        barsModels(DecoBlocks.WAXED_COPPER_BARS23);
        barsModels(DecoBlocks.WAXED_COPPER_BARS24);
        barsModels(DecoBlocks.WAXED_COPPER_BARS26);
        barsModels(DecoBlocks.WAXED_COPPER_BARS27);
        barsModels(DecoBlocks.WAXED_COPPER_BARS28);
        barsModels(DecoBlocks.WAXED_COPPER_BARS30);
        barsModels(DecoBlocks.WAXED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.WAXED_COPPER_BARS34);

        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS1);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS3);
        barsVModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS4);
        barsUModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS5);
        barsVModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS11);
        barsUModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS12);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS14);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS15);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS16);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS17);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS18);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS21);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS22);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS23);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS24);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS26);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS27);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS28);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS30);
        barsModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.WAXED_EXPOSED_COPPER_BARS34);

        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS1);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS3);
        barsVModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS4);
        barsUModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS5);
        barsVModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS11);
        barsUModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS12);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS14);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS15);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS16);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS17);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS18);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS21);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS22);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS23);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS24);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS26);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS27);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS28);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS30);
        barsModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.WAXED_WEATHERED_COPPER_BARS34);

        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2);
        barsUNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3);
        barsVModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4);
        barsUModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5);
        barsVModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6);
        barsReverseUNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7);
        barsReverseVModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8);
        barsReverseUModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9);
        barsReverseVModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11);
        barsUModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13);
        barsReverseUModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20);
        barsNonstraightNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30);
        barsModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33);
        barsNoCapModels(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34);

        //panels
        panelModels(DecoBlocks.IRON_PANEL1);
        panelModels(DecoBlocks.IRON_PANEL2);
        panelModels(DecoBlocks.IRON_PANEL3);

        panelModels(DecoBlocks.GOLD_PANEL1);
        panelModels(DecoBlocks.GOLD_PANEL2);
        panelModels(DecoBlocks.GOLD_PANEL3);

        panelModels(DecoBlocks.EMERALD_PANEL1);
        panelModels(DecoBlocks.EMERALD_PANEL2);
        panelModels(DecoBlocks.EMERALD_PANEL3);

        panelModels(DecoBlocks.DARKMETAL_PANEL1);
        panelModels(DecoBlocks.DARKMETAL_PANEL2);
        panelModels(DecoBlocks.DARKMETAL_PANEL3);

        panelModels(DecoBlocks.CLOUD_PANEL1);
        panelModels(DecoBlocks.CLOUD_PANEL2);
        panelModels(DecoBlocks.CLOUD_PANEL3);

        panelModels(DecoBlocks.COPPER_PANEL1);
        panelModels(DecoBlocks.COPPER_PANEL2);
        panelModels(DecoBlocks.COPPER_PANEL3);

        panelModels(DecoBlocks.EXPOSED_COPPER_PANEL1);
        panelModels(DecoBlocks.EXPOSED_COPPER_PANEL2);
        panelModels(DecoBlocks.EXPOSED_COPPER_PANEL3);

        panelModels(DecoBlocks.WEATHERED_COPPER_PANEL1);
        panelModels(DecoBlocks.WEATHERED_COPPER_PANEL2);
        panelModels(DecoBlocks.WEATHERED_COPPER_PANEL3);

        panelModels(DecoBlocks.OXIDIZED_COPPER_PANEL1);
        panelModels(DecoBlocks.OXIDIZED_COPPER_PANEL2);
        panelModels(DecoBlocks.OXIDIZED_COPPER_PANEL3);

        panelModels(DecoBlocks.WAXED_COPPER_PANEL1);
        panelModels(DecoBlocks.WAXED_COPPER_PANEL2);
        panelModels(DecoBlocks.WAXED_COPPER_PANEL3);

        panelModels(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1);
        panelModels(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2);
        panelModels(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3);

        panelModels(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1);
        panelModels(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2);
        panelModels(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3);

        panelModels(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1);
        panelModels(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2);
        panelModels(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3);

        //blocks end here
    }
    //registry objects

    private BlockModelBuilder barsModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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

    private BlockModelBuilder barsVNoCapModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideV(name, bars, bars, bars),
                barsSideAltV(name, bars, bars, bars))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsUModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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

    private BlockModelBuilder barsReverseVNoCapModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

        ResourceLocation bars = new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath());
        ResourceLocation edge = new ResourceLocation(mId, blockId);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPost(name, bars, edge),
                barsPostEnds(name, bars, edge),
                barsSideReverseV(name, bars, bars, bars),
                barsSideAltReverseV(name, bars, bars, bars))) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder barsReverseUModels(RegistryObject<Block> block) {
        String name = block.getId().toString();
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        String blockId = DecoSupGen.BlockIdFilter(block);
        String mId = DecoSupGen.ModIdFilter(block);

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
        if (block.getId().getPath().contains("waxed_")) block = DecoSupGen.getDecoNonWaxed(block);
        ResourceLocation texture1 = new ResourceLocation(satans_deco_bm.MODID, "block/" + DecoSupGen.getPanelTexture(block,0));
        ResourceLocation texture2 = new ResourceLocation(satans_deco_bm.MODID, "block/" + DecoSupGen.getPanelTexture(block,1));
        ResourceLocation texture3 = new ResourceLocation(satans_deco_bm.MODID, "block/" + DecoSupGen.getPanelTexture(block,2));
        ResourceLocation texture4 = new ResourceLocation(satans_deco_bm.MODID, "block/" + DecoSupGen.getPanelTexture(block,3));

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