package net.satan.deco_bm.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import net.minecraftforge.common.Tags;
import net.satan.deco_bm.satans_deco_bm;

public class DecoTags {
    public static class CItems {
        public static final TagKey<Item> BARS = tag("bars");
        public static final TagKey<Item> IRON_BARS = tag("bars/iron");
        public static final TagKey<Item> GOLD_BARS = tag("bars/gold");
        public static final TagKey<Item> EMERALD_BARS = tag("bars/emerald");
        public static final TagKey<Item> COPPER_BARS = tag("bars/copper");
        public static final TagKey<Item> EXPOSED_COPPER_BARS = tag("bars/exposed_copper");
        public static final TagKey<Item> WEATHERED_COPPER_BARS = tag("bars/weathered_copper");
        public static final TagKey<Item> OXIDIZED_COPPER_BARS = tag("bars/oxidizedd_copper");
        public static final TagKey<Item> WAXED_COPPER_BARS = tag("bars/waxed_copper");
        public static final TagKey<Item> WAXED_EXPOSED_COPPER_BARS = tag("bars/waxed_exposed_copper");
        public static final TagKey<Item> WAXED_WEATHERED_COPPER_BARS = tag("bars/waxed_weathered_copper");
        public static final TagKey<Item> WAXED_OXIDIZED_COPPER_BARS = tag("bars/waxed_oxidized_copper");

        public static final TagKey<Item> COPPER_INGOTS = tag("ingots/copper");
        public static final TagKey<Item> GOLD_INGOTS = tag("ingots/gold");
        public static final TagKey<Item> IRON_INGOTS = tag("ingots/iron");
        public static final TagKey<Item> WOODEN_RODS = tag("rods/wooden");

        private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation("c", name));}
    }

    public static class DecoItems {
        public static final TagKey<Item> DARKMETAL_BARS = tag("bars/darkmetal");
        public static final TagKey<Item> CLOUD_BARS = tag("bars/cloud");

        public static final TagKey<Item> PANELS = tag("panels");
        public static final TagKey<Item> IRON_PANELS = tag("panels/iron");
        public static final TagKey<Item> GOLD_PANELS = tag("panels/gold");
        public static final TagKey<Item> EMERALD_PANELS = tag("panels/emerald");
        public static final TagKey<Item> DARKMETAL_PANELS = tag("panels/darkmetal");
        public static final TagKey<Item> CLOUD_PANELS= tag("panels/cloud");
        public static final TagKey<Item> COPPER_PANELS = tag("panels/copper");
        public static final TagKey<Item> EXPOSED_COPPER_PANELS = tag("panels/exposed_copper");
        public static final TagKey<Item> WEATHERED_COPPER_PANELS = tag("panels/weathered_copper");
        public static final TagKey<Item> OXIDIZED_COPPER_PANELS = tag("panels/oxidizedd_copper");
        public static final TagKey<Item> WAXED_COPPER_PANELS = tag("panels/waxed_copper");
        public static final TagKey<Item> WAXED_EXPOSED_COPPER_PANELS = tag("panels/waxed_exposed_copper");
        public static final TagKey<Item> WAXED_WEATHERED_COPPER_PANELS = tag("panels/waxed_weathered_copper");
        public static final TagKey<Item> WAXED_OXIDIZED_COPPER_PANELS = tag("panels/waxed_oxidized_copper");

        private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation(satans_deco_bm.MODID, name));}
    }
}
