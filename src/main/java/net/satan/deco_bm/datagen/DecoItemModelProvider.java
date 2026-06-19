package net.satan.deco_bm.datagen;

import net.minecraft.data.PackOutput;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_bm.datagen.util.DecoSupGen;
import net.satan.deco_bm.register.DecoBlocks;
import net.satan.deco_bm.satans_deco_bm;

public class DecoItemModelProvider extends ItemModelProvider {
    public DecoItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_bm.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
            //bars
        simpleBlockItem(DecoBlocks.IRON_BARS1);
        simpleBlockItem(DecoBlocks.IRON_BARS2);
        simpleBlockItem(DecoBlocks.IRON_BARS3);
        simpleBlockItem(DecoBlocks.IRON_BARS4);
        simpleBlockItem(DecoBlocks.IRON_BARS5);
        simpleBlockItem(DecoBlocks.IRON_BARS6);
        simpleBlockItem(DecoBlocks.IRON_BARS7);
        simpleBlockItem(DecoBlocks.IRON_BARS8);
        simpleBlockItem(DecoBlocks.IRON_BARS9);
        simpleBlockItem(DecoBlocks.IRON_BARS10);
        simpleBlockItem(DecoBlocks.IRON_BARS11);
        simpleBlockItem(DecoBlocks.IRON_BARS12);
        simpleBlockItem(DecoBlocks.IRON_BARS13);
        simpleBlockItem(DecoBlocks.IRON_BARS14);
        simpleBlockItem(DecoBlocks.IRON_BARS15);
        simpleBlockItem(DecoBlocks.IRON_BARS16);
        simpleBlockItem(DecoBlocks.IRON_BARS17);
        simpleBlockItem(DecoBlocks.IRON_BARS18);
        simpleBlockItem(DecoBlocks.IRON_BARS19);
        simpleBlockItem(DecoBlocks.IRON_BARS20);
        simpleBlockItem(DecoBlocks.IRON_BARS21);
        simpleBlockItem(DecoBlocks.IRON_BARS22);
        simpleBlockItem(DecoBlocks.IRON_BARS23);
        simpleBlockItem(DecoBlocks.IRON_BARS24);
        simpleBlockItem(DecoBlocks.IRON_BARS26);
        simpleBlockItem(DecoBlocks.IRON_BARS27);
        simpleBlockItem(DecoBlocks.IRON_BARS28);
        simpleBlockItem(DecoBlocks.IRON_BARS30);
        simpleBlockItem(DecoBlocks.IRON_BARS33);
        simpleBlockItem(DecoBlocks.IRON_BARS34);

        simpleBlockItem(DecoBlocks.GOLD_BARS);
        simpleBlockItem(DecoBlocks.GOLD_BARS1);
        simpleBlockItem(DecoBlocks.GOLD_BARS2);
        simpleBlockItem(DecoBlocks.GOLD_BARS3);
        simpleBlockItem(DecoBlocks.GOLD_BARS4);
        simpleBlockItem(DecoBlocks.GOLD_BARS5);
        simpleBlockItem(DecoBlocks.GOLD_BARS6);
        simpleBlockItem(DecoBlocks.GOLD_BARS7);
        simpleBlockItem(DecoBlocks.GOLD_BARS8);
        simpleBlockItem(DecoBlocks.GOLD_BARS9);
        simpleBlockItem(DecoBlocks.GOLD_BARS10);
        simpleBlockItem(DecoBlocks.GOLD_BARS11);
        simpleBlockItem(DecoBlocks.GOLD_BARS12);
        simpleBlockItem(DecoBlocks.GOLD_BARS13);
        simpleBlockItem(DecoBlocks.GOLD_BARS14);
        simpleBlockItem(DecoBlocks.GOLD_BARS15);
        simpleBlockItem(DecoBlocks.GOLD_BARS16);
        simpleBlockItem(DecoBlocks.GOLD_BARS17);
        simpleBlockItem(DecoBlocks.GOLD_BARS18);
        simpleBlockItem(DecoBlocks.GOLD_BARS19);
        simpleBlockItem(DecoBlocks.GOLD_BARS20);
        simpleBlockItem(DecoBlocks.GOLD_BARS21);
        simpleBlockItem(DecoBlocks.GOLD_BARS22);
        simpleBlockItem(DecoBlocks.GOLD_BARS23);
        simpleBlockItem(DecoBlocks.GOLD_BARS24);
        simpleBlockItem(DecoBlocks.GOLD_BARS26);
        simpleBlockItem(DecoBlocks.GOLD_BARS27);
        simpleBlockItem(DecoBlocks.GOLD_BARS28);
        simpleBlockItem(DecoBlocks.GOLD_BARS30);
        simpleBlockItem(DecoBlocks.GOLD_BARS33);
        simpleBlockItem(DecoBlocks.GOLD_BARS34);

        simpleBlockItem(DecoBlocks.EMERALD_BARS);
        simpleBlockItem(DecoBlocks.EMERALD_BARS1);
        simpleBlockItem(DecoBlocks.EMERALD_BARS2);
        simpleBlockItem(DecoBlocks.EMERALD_BARS3);
        simpleBlockItem(DecoBlocks.EMERALD_BARS4);
        simpleBlockItem(DecoBlocks.EMERALD_BARS5);
        simpleBlockItem(DecoBlocks.EMERALD_BARS6);
        simpleBlockItem(DecoBlocks.EMERALD_BARS7);
        simpleBlockItem(DecoBlocks.EMERALD_BARS8);
        simpleBlockItem(DecoBlocks.EMERALD_BARS9);
        simpleBlockItem(DecoBlocks.EMERALD_BARS10);
        simpleBlockItem(DecoBlocks.EMERALD_BARS11);
        simpleBlockItem(DecoBlocks.EMERALD_BARS12);
        simpleBlockItem(DecoBlocks.EMERALD_BARS13);
        simpleBlockItem(DecoBlocks.EMERALD_BARS14);
        simpleBlockItem(DecoBlocks.EMERALD_BARS15);
        simpleBlockItem(DecoBlocks.EMERALD_BARS16);
        simpleBlockItem(DecoBlocks.EMERALD_BARS17);
        simpleBlockItem(DecoBlocks.EMERALD_BARS18);
        simpleBlockItem(DecoBlocks.EMERALD_BARS19);
        simpleBlockItem(DecoBlocks.EMERALD_BARS20);
        simpleBlockItem(DecoBlocks.EMERALD_BARS21);
        simpleBlockItem(DecoBlocks.EMERALD_BARS22);
        simpleBlockItem(DecoBlocks.EMERALD_BARS23);
        simpleBlockItem(DecoBlocks.EMERALD_BARS24);
        simpleBlockItem(DecoBlocks.EMERALD_BARS26);
        simpleBlockItem(DecoBlocks.EMERALD_BARS27);
        simpleBlockItem(DecoBlocks.EMERALD_BARS28);
        simpleBlockItem(DecoBlocks.EMERALD_BARS30);
        simpleBlockItem(DecoBlocks.EMERALD_BARS33);
        simpleBlockItem(DecoBlocks.EMERALD_BARS34);

        simpleBlockItem(DecoBlocks.DARKMETAL_BARS);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS1);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS2);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS3);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS4);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS5);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS6);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS7);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS8);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS9);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS10);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS11);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS12);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS13);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS14);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS15);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS16);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS17);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS18);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS19);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS20);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS21);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS22);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS23);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS24);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS26);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS27);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS28);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS30);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS33);
        simpleBlockItem(DecoBlocks.DARKMETAL_BARS34);

        simpleBlockItem(DecoBlocks.CLOUD_BARS);
        simpleBlockItem(DecoBlocks.CLOUD_BARS1);
        simpleBlockItem(DecoBlocks.CLOUD_BARS2);
        simpleBlockItem(DecoBlocks.CLOUD_BARS3);
        simpleBlockItem(DecoBlocks.CLOUD_BARS4);
        simpleBlockItem(DecoBlocks.CLOUD_BARS5);
        simpleBlockItem(DecoBlocks.CLOUD_BARS6);
        simpleBlockItem(DecoBlocks.CLOUD_BARS7);
        simpleBlockItem(DecoBlocks.CLOUD_BARS8);
        simpleBlockItem(DecoBlocks.CLOUD_BARS9);
        simpleBlockItem(DecoBlocks.CLOUD_BARS10);
        simpleBlockItem(DecoBlocks.CLOUD_BARS11);
        simpleBlockItem(DecoBlocks.CLOUD_BARS12);
        simpleBlockItem(DecoBlocks.CLOUD_BARS13);
        simpleBlockItem(DecoBlocks.CLOUD_BARS14);
        simpleBlockItem(DecoBlocks.CLOUD_BARS15);
        simpleBlockItem(DecoBlocks.CLOUD_BARS16);
        simpleBlockItem(DecoBlocks.CLOUD_BARS17);
        simpleBlockItem(DecoBlocks.CLOUD_BARS18);
        simpleBlockItem(DecoBlocks.CLOUD_BARS19);
        simpleBlockItem(DecoBlocks.CLOUD_BARS20);
        simpleBlockItem(DecoBlocks.CLOUD_BARS21);
        simpleBlockItem(DecoBlocks.CLOUD_BARS22);
        simpleBlockItem(DecoBlocks.CLOUD_BARS23);
        simpleBlockItem(DecoBlocks.CLOUD_BARS24);
        simpleBlockItem(DecoBlocks.CLOUD_BARS26);
        simpleBlockItem(DecoBlocks.CLOUD_BARS27);
        simpleBlockItem(DecoBlocks.CLOUD_BARS28);
        simpleBlockItem(DecoBlocks.CLOUD_BARS30);
        simpleBlockItem(DecoBlocks.CLOUD_BARS33);
        simpleBlockItem(DecoBlocks.CLOUD_BARS34);

        simpleBlockItem(DecoBlocks.COPPER_BARS);
        simpleBlockItem(DecoBlocks.COPPER_BARS1);
        simpleBlockItem(DecoBlocks.COPPER_BARS2);
        simpleBlockItem(DecoBlocks.COPPER_BARS3);
        simpleBlockItem(DecoBlocks.COPPER_BARS4);
        simpleBlockItem(DecoBlocks.COPPER_BARS5);
        simpleBlockItem(DecoBlocks.COPPER_BARS6);
        simpleBlockItem(DecoBlocks.COPPER_BARS7);
        simpleBlockItem(DecoBlocks.COPPER_BARS8);
        simpleBlockItem(DecoBlocks.COPPER_BARS9);
        simpleBlockItem(DecoBlocks.COPPER_BARS10);
        simpleBlockItem(DecoBlocks.COPPER_BARS11);
        simpleBlockItem(DecoBlocks.COPPER_BARS12);
        simpleBlockItem(DecoBlocks.COPPER_BARS13);
        simpleBlockItem(DecoBlocks.COPPER_BARS14);
        simpleBlockItem(DecoBlocks.COPPER_BARS15);
        simpleBlockItem(DecoBlocks.COPPER_BARS16);
        simpleBlockItem(DecoBlocks.COPPER_BARS17);
        simpleBlockItem(DecoBlocks.COPPER_BARS18);
        simpleBlockItem(DecoBlocks.COPPER_BARS19);
        simpleBlockItem(DecoBlocks.COPPER_BARS20);
        simpleBlockItem(DecoBlocks.COPPER_BARS21);
        simpleBlockItem(DecoBlocks.COPPER_BARS22);
        simpleBlockItem(DecoBlocks.COPPER_BARS23);
        simpleBlockItem(DecoBlocks.COPPER_BARS24);
        simpleBlockItem(DecoBlocks.COPPER_BARS26);
        simpleBlockItem(DecoBlocks.COPPER_BARS27);
        simpleBlockItem(DecoBlocks.COPPER_BARS28);
        simpleBlockItem(DecoBlocks.COPPER_BARS30);
        simpleBlockItem(DecoBlocks.COPPER_BARS33);
        simpleBlockItem(DecoBlocks.COPPER_BARS34);

        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS1);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS2);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS3);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS4);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS5);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS6);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS7);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS8);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS9);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS10);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS11);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS12);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS13);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS14);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS15);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS16);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS17);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS18);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS19);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS20);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS21);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS22);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS23);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS24);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS26);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS27);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS28);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS30);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS33);
        simpleBlockItem(DecoBlocks.EXPOSED_COPPER_BARS34);

        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS1);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS2);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS3);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS4);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS5);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS6);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS7);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS8);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS9);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS10);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS11);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS12);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS13);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS14);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS15);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS16);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS17);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS18);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS19);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS20);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS21);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS22);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS23);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS24);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS26);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS27);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS28);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS30);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS33);
        simpleBlockItem(DecoBlocks.WEATHERED_COPPER_BARS34);

        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS1);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS2);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS3);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS4);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS5);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS6);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS7);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS8);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS9);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS10);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS11);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS12);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS13);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS14);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS15);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS16);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS17);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS18);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS19);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS20);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS21);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS22);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS23);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS24);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS26);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS27);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS28);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS30);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS33);
        simpleBlockItem(DecoBlocks.OXIDIZED_COPPER_BARS34);

        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS1);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS2);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS3);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS4);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS5);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS6);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS7);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS8);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS9);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS10);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS11);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS12);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS13);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS14);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS15);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS16);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS17);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS18);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS19);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS20);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS21);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS22);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS23);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS24);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS26);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS27);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS28);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS30);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS33);
        simpleBlockItemWaxed(DecoBlocks.WAXED_COPPER_BARS34);

        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS1);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS2);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS3);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS4);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS5);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS6);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS7);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS8);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS9);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS10);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS11);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS12);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS13);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS14);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS15);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS16);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS17);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS18);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS19);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS20);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS21);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS22);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS23);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS24);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS26);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS27);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS28);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS30);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS33);
        simpleBlockItemWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_BARS34);

        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS1);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS2);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS3);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS4);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS5);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS6);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS7);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS8);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS9);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS10);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS11);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS12);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS13);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS14);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS15);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS16);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS17);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS18);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS19);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS20);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS21);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS22);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS23);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS24);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS26);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS27);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS28);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS30);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS33);
        simpleBlockItemWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_BARS34);

        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33);
        simpleBlockItemWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34);

        //panel
        simpleBlockItemNoL(DecoBlocks.IRON_PANEL1);
        simpleBlockItemNoL(DecoBlocks.IRON_PANEL2);
        simpleBlockItemNoL(DecoBlocks.IRON_PANEL3);

        simpleBlockItemNoL(DecoBlocks.GOLD_PANEL1);
        simpleBlockItemNoL(DecoBlocks.GOLD_PANEL2);
        simpleBlockItemNoL(DecoBlocks.GOLD_PANEL3);

        simpleBlockItemNoL(DecoBlocks.EMERALD_PANEL1);
        simpleBlockItemNoL(DecoBlocks.EMERALD_PANEL2);
        simpleBlockItemNoL(DecoBlocks.EMERALD_PANEL3);

        simpleBlockItemNoL(DecoBlocks.DARKMETAL_PANEL1);
        simpleBlockItemNoL(DecoBlocks.DARKMETAL_PANEL2);
        simpleBlockItemNoL(DecoBlocks.DARKMETAL_PANEL3);

        simpleBlockItemNoL(DecoBlocks.CLOUD_PANEL1);
        simpleBlockItemNoL(DecoBlocks.CLOUD_PANEL2);
        simpleBlockItemNoL(DecoBlocks.CLOUD_PANEL3);

        simpleBlockItemNoL(DecoBlocks.COPPER_PANEL1);
        simpleBlockItemNoL(DecoBlocks.COPPER_PANEL2);
        simpleBlockItemNoL(DecoBlocks.COPPER_PANEL3);

        simpleBlockItemNoL(DecoBlocks.EXPOSED_COPPER_PANEL1);
        simpleBlockItemNoL(DecoBlocks.EXPOSED_COPPER_PANEL2);
        simpleBlockItemNoL(DecoBlocks.EXPOSED_COPPER_PANEL3);

        simpleBlockItemNoL(DecoBlocks.WEATHERED_COPPER_PANEL1);
        simpleBlockItemNoL(DecoBlocks.WEATHERED_COPPER_PANEL2);
        simpleBlockItemNoL(DecoBlocks.WEATHERED_COPPER_PANEL3);

        simpleBlockItemNoL(DecoBlocks.OXIDIZED_COPPER_PANEL1);
        simpleBlockItemNoL(DecoBlocks.OXIDIZED_COPPER_PANEL2);
        simpleBlockItemNoL(DecoBlocks.OXIDIZED_COPPER_PANEL3);

        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_COPPER_PANEL1);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_COPPER_PANEL2);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_COPPER_PANEL3);

        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3);

        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3);

        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2);
        simpleBlockItemNoLWaxed(DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3);
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemWaxed(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_bm.MODID, "block/" + block.getId().getPath()).toString()
                        .replace("waxed_",""));
    }

    private ItemModelBuilder simpleBlockItemNoL(RegistryObject<Block> block) {
        int num1 = (Integer.parseInt(block.getId().getPath().replaceAll("[^\\d]", "")) * 4) - 3;
        String panel1 = block.getId().getPath().replaceAll("[\\dl]", "") + num1;
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_bm.MODID, "block/" + panel1
                        .replace("l","")));
    }
    private ItemModelBuilder simpleBlockItemNoLWaxed(RegistryObject<Block> block) {
        int num1 = (Integer.parseInt(block.getId().getPath().replaceAll("[^\\d]", "")) * 4) - 3;
        String panel1 = block.getId().getPath().replaceAll("[\\dl]", "") + num1;
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_bm.MODID, "block/" + panel1
                        .replace("l","").replace("waxed_", "")));
    }

    private ItemModelBuilder vitrageTwoLayeredBlockItem(RegistryObject<Block> block) {
        RegistryObject<Block> textureBlock = block;
        String mId = satans_deco_bm.MODID;
        String texturePath = block.getId().getPath().replace("_vitrage_pane","_bars");
        if(texturePath.equals("iron_bars")) {textureBlock = RegistryObject.create(
                    new ResourceLocation("minecraft", "iron_bars"), ForgeRegistries.BLOCKS);
        mId = "minecraft";
        }
        else textureBlock = DecoBlocks.getByName(texturePath);
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = DecoSupGen.getDecoNonWaxed(textureBlock);
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation("minecraft", "block/glass"))
                .texture("layer1", new ResourceLocation(mId, "block/" + textureBlock.getId().getPath()));
    }

    private ItemModelBuilder vitrageTwoLayeredPanelBlockItem(RegistryObject<Block> block) {
        String mId = satans_deco_bm.MODID;
        String texturePath = block.getId().getPath().replace("_vitrage_panel","_panel");
        RegistryObject<Block> textureBlock = DecoBlocks.getByName(texturePath);
        if (textureBlock.getId().getPath().contains("waxed_")) textureBlock = DecoSupGen.getDecoNonWaxed(textureBlock);

        int num1 = (Integer.parseInt(textureBlock.getId().getPath().replaceAll("[^\\d]", "")) * 4) - 3;
        String panel1 = textureBlock.getId().getPath().replaceAll("[\\dl]", "") + num1;

        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation("minecraft", "block/glass"))
                .texture("layer1", new ResourceLocation(mId, "block/" + panel1));
    }
}