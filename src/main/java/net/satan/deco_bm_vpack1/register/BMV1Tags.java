package net.satan.deco_bm_vpack1.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

public class BMV1Tags {

    public static class BMV1Items {
        public static final TagKey<Item> VITRAGES = tag("vitrages");
        public static final TagKey<Item> IRON_VITRAGES = tag("vitrages/iron");
        public static final TagKey<Item> GOLD_VITRAGES = tag("vitrages/gold");
        public static final TagKey<Item> EMERALD_VITRAGES = tag("vitrages/emerald");
        public static final TagKey<Item> DARKMETAL_VITRAGES = tag("vitrages/darkmetal");
        public static final TagKey<Item> CLOUD_VITRAGES= tag("vitrages/cloud");
        public static final TagKey<Item> WAXED_COPPER_VITRAGES = tag("vitrages/waxed_copper");
        public static final TagKey<Item> WAXED_EXPOSED_COPPER_VITRAGES = tag("vitrages/waxed_exposed_copper");
        public static final TagKey<Item> WAXED_WEATHERED_COPPER_VITRAGES = tag("vitrages/waxed_weathered_copper");
        public static final TagKey<Item> WAXED_OXIDIZED_COPPER_VITRAGES = tag("vitrages/waxed_oxidized_copper");

        private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation(Satans_deco_bm_vpack1.MODID, name));}
    }
}
