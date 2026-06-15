package net.satan.deco_bm.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import net.satan.deco_bm.register.DecoBlocks;
import net.satan.deco_bm.register.DecoTags;
import net.satan.deco_bm.satans_deco_bm;

import java.util.function.Consumer;

public class DecoRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public DecoRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipe) {
      //bars
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS1.get(), Blocks.IRON_BARS, 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS2.get(), DecoBlocks.IRON_BARS1.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS3.get(), DecoBlocks.IRON_BARS2.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS4.get(), DecoBlocks.IRON_BARS3.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS5.get(), DecoBlocks.IRON_BARS4.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS6.get(), DecoBlocks.IRON_BARS5.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS7.get(), DecoBlocks.IRON_BARS6.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS8.get(), DecoBlocks.IRON_BARS7.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS9.get(), DecoBlocks.IRON_BARS8.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS10.get(), DecoBlocks.IRON_BARS9.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS11.get(), DecoBlocks.IRON_BARS10.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS12.get(), DecoBlocks.IRON_BARS11.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS13.get(), DecoBlocks.IRON_BARS12.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS14.get(), DecoBlocks.IRON_BARS13.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS15.get(), DecoBlocks.IRON_BARS14.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS16.get(), DecoBlocks.IRON_BARS15.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS17.get(), DecoBlocks.IRON_BARS16.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS18.get(), DecoBlocks.IRON_BARS17.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS19.get(), DecoBlocks.IRON_BARS18.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS20.get(), DecoBlocks.IRON_BARS19.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS21.get(), DecoBlocks.IRON_BARS20.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS22.get(), DecoBlocks.IRON_BARS21.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS23.get(), DecoBlocks.IRON_BARS22.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS24.get(), DecoBlocks.IRON_BARS23.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS26.get(), DecoBlocks.IRON_BARS24.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS27.get(), DecoBlocks.IRON_BARS26.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS28.get(), DecoBlocks.IRON_BARS27.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS30.get(), DecoBlocks.IRON_BARS28.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS33.get(), DecoBlocks.IRON_BARS30.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_BARS34.get(), DecoBlocks.IRON_BARS33.get(), 1, Blocks.IRON_BARS, DecoTags.CItems.IRON_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS1.get(), DecoBlocks.GOLD_BARS.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS2.get(), DecoBlocks.GOLD_BARS1.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS3.get(), DecoBlocks.GOLD_BARS2.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS4.get(), DecoBlocks.GOLD_BARS3.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS5.get(), DecoBlocks.GOLD_BARS4.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS6.get(), DecoBlocks.GOLD_BARS5.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS7.get(), DecoBlocks.GOLD_BARS6.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS8.get(), DecoBlocks.GOLD_BARS7.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS9.get(), DecoBlocks.GOLD_BARS8.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS10.get(), DecoBlocks.GOLD_BARS9.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS11.get(), DecoBlocks.GOLD_BARS10.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS12.get(), DecoBlocks.GOLD_BARS11.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS13.get(), DecoBlocks.GOLD_BARS12.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS14.get(), DecoBlocks.GOLD_BARS13.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS15.get(), DecoBlocks.GOLD_BARS14.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS16.get(), DecoBlocks.GOLD_BARS15.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS17.get(), DecoBlocks.GOLD_BARS16.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS18.get(), DecoBlocks.GOLD_BARS17.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS19.get(), DecoBlocks.GOLD_BARS18.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS20.get(), DecoBlocks.GOLD_BARS19.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS21.get(), DecoBlocks.GOLD_BARS20.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS22.get(), DecoBlocks.GOLD_BARS21.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS23.get(), DecoBlocks.GOLD_BARS22.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS24.get(), DecoBlocks.GOLD_BARS23.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS26.get(), DecoBlocks.GOLD_BARS24.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS27.get(), DecoBlocks.GOLD_BARS26.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS28.get(), DecoBlocks.GOLD_BARS27.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS30.get(), DecoBlocks.GOLD_BARS28.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS33.get(), DecoBlocks.GOLD_BARS30.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS34.get(), DecoBlocks.GOLD_BARS33.get(), 1, DecoBlocks.GOLD_BARS.get(), DecoTags.CItems.GOLD_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS1.get(), DecoBlocks.EMERALD_BARS.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS2.get(), DecoBlocks.EMERALD_BARS1.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS3.get(), DecoBlocks.EMERALD_BARS2.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS4.get(), DecoBlocks.EMERALD_BARS3.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS5.get(), DecoBlocks.EMERALD_BARS4.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS6.get(), DecoBlocks.EMERALD_BARS5.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS7.get(), DecoBlocks.EMERALD_BARS6.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS8.get(), DecoBlocks.EMERALD_BARS7.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS9.get(), DecoBlocks.EMERALD_BARS8.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS10.get(), DecoBlocks.EMERALD_BARS9.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS11.get(), DecoBlocks.EMERALD_BARS10.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS12.get(), DecoBlocks.EMERALD_BARS11.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS13.get(), DecoBlocks.EMERALD_BARS12.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS14.get(), DecoBlocks.EMERALD_BARS13.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS15.get(), DecoBlocks.EMERALD_BARS14.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS16.get(), DecoBlocks.EMERALD_BARS15.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS17.get(), DecoBlocks.EMERALD_BARS16.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS18.get(), DecoBlocks.EMERALD_BARS17.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS19.get(), DecoBlocks.EMERALD_BARS18.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS20.get(), DecoBlocks.EMERALD_BARS19.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS21.get(), DecoBlocks.EMERALD_BARS20.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS22.get(), DecoBlocks.EMERALD_BARS21.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS23.get(), DecoBlocks.EMERALD_BARS22.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS24.get(), DecoBlocks.EMERALD_BARS23.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS26.get(), DecoBlocks.EMERALD_BARS24.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS27.get(), DecoBlocks.EMERALD_BARS26.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS28.get(), DecoBlocks.EMERALD_BARS27.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS30.get(), DecoBlocks.EMERALD_BARS28.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS33.get(), DecoBlocks.EMERALD_BARS30.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_BARS34.get(), DecoBlocks.EMERALD_BARS33.get(), 1, DecoBlocks.EMERALD_BARS.get(), DecoTags.CItems.EMERALD_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS1.get(), DecoBlocks.DARKMETAL_BARS.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS2.get(), DecoBlocks.DARKMETAL_BARS1.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS3.get(), DecoBlocks.DARKMETAL_BARS2.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS4.get(), DecoBlocks.DARKMETAL_BARS3.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS5.get(), DecoBlocks.DARKMETAL_BARS4.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS6.get(), DecoBlocks.DARKMETAL_BARS5.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS7.get(), DecoBlocks.DARKMETAL_BARS6.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS8.get(), DecoBlocks.DARKMETAL_BARS7.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS9.get(), DecoBlocks.DARKMETAL_BARS8.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS10.get(), DecoBlocks.DARKMETAL_BARS9.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS11.get(), DecoBlocks.DARKMETAL_BARS10.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS12.get(), DecoBlocks.DARKMETAL_BARS11.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS13.get(), DecoBlocks.DARKMETAL_BARS12.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS14.get(), DecoBlocks.DARKMETAL_BARS13.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS15.get(), DecoBlocks.DARKMETAL_BARS14.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS16.get(), DecoBlocks.DARKMETAL_BARS15.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS17.get(), DecoBlocks.DARKMETAL_BARS16.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS18.get(), DecoBlocks.DARKMETAL_BARS17.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS19.get(), DecoBlocks.DARKMETAL_BARS18.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS20.get(), DecoBlocks.DARKMETAL_BARS19.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS21.get(), DecoBlocks.DARKMETAL_BARS20.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS22.get(), DecoBlocks.DARKMETAL_BARS21.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS23.get(), DecoBlocks.DARKMETAL_BARS22.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS24.get(), DecoBlocks.DARKMETAL_BARS23.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS26.get(), DecoBlocks.DARKMETAL_BARS24.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS27.get(), DecoBlocks.DARKMETAL_BARS26.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS28.get(), DecoBlocks.DARKMETAL_BARS27.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS30.get(), DecoBlocks.DARKMETAL_BARS28.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS33.get(), DecoBlocks.DARKMETAL_BARS30.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_BARS34.get(), DecoBlocks.DARKMETAL_BARS33.get(), 1, DecoBlocks.DARKMETAL_BARS.get(), DecoTags.DecoItems.DARKMETAL_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS1.get(), DecoBlocks.CLOUD_BARS.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS2.get(), DecoBlocks.CLOUD_BARS1.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS3.get(), DecoBlocks.CLOUD_BARS2.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS4.get(), DecoBlocks.CLOUD_BARS3.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS5.get(), DecoBlocks.CLOUD_BARS4.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS6.get(), DecoBlocks.CLOUD_BARS5.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS7.get(), DecoBlocks.CLOUD_BARS6.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS8.get(), DecoBlocks.CLOUD_BARS7.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS9.get(), DecoBlocks.CLOUD_BARS8.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS10.get(), DecoBlocks.CLOUD_BARS9.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS11.get(), DecoBlocks.CLOUD_BARS10.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS12.get(), DecoBlocks.CLOUD_BARS11.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS13.get(), DecoBlocks.CLOUD_BARS12.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS14.get(), DecoBlocks.CLOUD_BARS13.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS15.get(), DecoBlocks.CLOUD_BARS14.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS16.get(), DecoBlocks.CLOUD_BARS15.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS17.get(), DecoBlocks.CLOUD_BARS16.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS18.get(), DecoBlocks.CLOUD_BARS17.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS19.get(), DecoBlocks.CLOUD_BARS18.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS20.get(), DecoBlocks.CLOUD_BARS19.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS21.get(), DecoBlocks.CLOUD_BARS20.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS22.get(), DecoBlocks.CLOUD_BARS21.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS23.get(), DecoBlocks.CLOUD_BARS22.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS24.get(), DecoBlocks.CLOUD_BARS23.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS26.get(), DecoBlocks.CLOUD_BARS24.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS27.get(), DecoBlocks.CLOUD_BARS26.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS28.get(), DecoBlocks.CLOUD_BARS27.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS30.get(), DecoBlocks.CLOUD_BARS28.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS33.get(), DecoBlocks.CLOUD_BARS30.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BARS34.get(), DecoBlocks.CLOUD_BARS33.get(), 1, DecoBlocks.CLOUD_BARS.get(), DecoTags.DecoItems.CLOUD_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS1.get(), DecoBlocks.COPPER_BARS.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS2.get(), DecoBlocks.COPPER_BARS1.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS3.get(), DecoBlocks.COPPER_BARS2.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS4.get(), DecoBlocks.COPPER_BARS3.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS5.get(), DecoBlocks.COPPER_BARS4.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS6.get(), DecoBlocks.COPPER_BARS5.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS7.get(), DecoBlocks.COPPER_BARS6.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS8.get(), DecoBlocks.COPPER_BARS7.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS9.get(), DecoBlocks.COPPER_BARS8.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS10.get(), DecoBlocks.COPPER_BARS9.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS11.get(), DecoBlocks.COPPER_BARS10.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS12.get(), DecoBlocks.COPPER_BARS11.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS13.get(), DecoBlocks.COPPER_BARS12.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS14.get(), DecoBlocks.COPPER_BARS13.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS15.get(), DecoBlocks.COPPER_BARS14.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS16.get(), DecoBlocks.COPPER_BARS15.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS17.get(), DecoBlocks.COPPER_BARS16.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS18.get(), DecoBlocks.COPPER_BARS17.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS19.get(), DecoBlocks.COPPER_BARS18.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS20.get(), DecoBlocks.COPPER_BARS19.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS21.get(), DecoBlocks.COPPER_BARS20.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS22.get(), DecoBlocks.COPPER_BARS21.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS23.get(), DecoBlocks.COPPER_BARS22.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS24.get(), DecoBlocks.COPPER_BARS23.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS26.get(), DecoBlocks.COPPER_BARS24.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS27.get(), DecoBlocks.COPPER_BARS26.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS28.get(), DecoBlocks.COPPER_BARS27.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS30.get(), DecoBlocks.COPPER_BARS28.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS33.get(), DecoBlocks.COPPER_BARS30.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_BARS34.get(), DecoBlocks.COPPER_BARS33.get(), 1, DecoBlocks.COPPER_BARS.get(), DecoTags.CItems.COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS1.get(), DecoBlocks.EXPOSED_COPPER_BARS.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS2.get(), DecoBlocks.EXPOSED_COPPER_BARS1.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS3.get(), DecoBlocks.EXPOSED_COPPER_BARS2.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS4.get(), DecoBlocks.EXPOSED_COPPER_BARS3.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS5.get(), DecoBlocks.EXPOSED_COPPER_BARS4.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS6.get(), DecoBlocks.EXPOSED_COPPER_BARS5.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS7.get(), DecoBlocks.EXPOSED_COPPER_BARS6.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS8.get(), DecoBlocks.EXPOSED_COPPER_BARS7.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS9.get(), DecoBlocks.EXPOSED_COPPER_BARS8.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS10.get(), DecoBlocks.EXPOSED_COPPER_BARS9.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS11.get(), DecoBlocks.EXPOSED_COPPER_BARS10.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS12.get(), DecoBlocks.EXPOSED_COPPER_BARS11.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS13.get(), DecoBlocks.EXPOSED_COPPER_BARS12.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS14.get(), DecoBlocks.EXPOSED_COPPER_BARS13.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS15.get(), DecoBlocks.EXPOSED_COPPER_BARS14.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS16.get(), DecoBlocks.EXPOSED_COPPER_BARS15.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS17.get(), DecoBlocks.EXPOSED_COPPER_BARS16.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS18.get(), DecoBlocks.EXPOSED_COPPER_BARS17.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS19.get(), DecoBlocks.EXPOSED_COPPER_BARS18.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS20.get(), DecoBlocks.EXPOSED_COPPER_BARS19.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS21.get(), DecoBlocks.EXPOSED_COPPER_BARS20.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS22.get(), DecoBlocks.EXPOSED_COPPER_BARS21.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS23.get(), DecoBlocks.EXPOSED_COPPER_BARS22.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS24.get(), DecoBlocks.EXPOSED_COPPER_BARS23.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS26.get(), DecoBlocks.EXPOSED_COPPER_BARS24.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS27.get(), DecoBlocks.EXPOSED_COPPER_BARS26.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS28.get(), DecoBlocks.EXPOSED_COPPER_BARS27.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS30.get(), DecoBlocks.EXPOSED_COPPER_BARS28.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS33.get(), DecoBlocks.EXPOSED_COPPER_BARS30.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_BARS34.get(), DecoBlocks.EXPOSED_COPPER_BARS33.get(), 1, DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoTags.CItems.EXPOSED_COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS1.get(), DecoBlocks.WEATHERED_COPPER_BARS.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS2.get(), DecoBlocks.WEATHERED_COPPER_BARS1.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS3.get(), DecoBlocks.WEATHERED_COPPER_BARS2.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS4.get(), DecoBlocks.WEATHERED_COPPER_BARS3.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS5.get(), DecoBlocks.WEATHERED_COPPER_BARS4.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS6.get(), DecoBlocks.WEATHERED_COPPER_BARS5.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS7.get(), DecoBlocks.WEATHERED_COPPER_BARS6.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS8.get(), DecoBlocks.WEATHERED_COPPER_BARS7.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS9.get(), DecoBlocks.WEATHERED_COPPER_BARS8.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS10.get(), DecoBlocks.WEATHERED_COPPER_BARS9.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS11.get(), DecoBlocks.WEATHERED_COPPER_BARS10.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS12.get(), DecoBlocks.WEATHERED_COPPER_BARS11.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS13.get(), DecoBlocks.WEATHERED_COPPER_BARS12.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS14.get(), DecoBlocks.WEATHERED_COPPER_BARS13.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS15.get(), DecoBlocks.WEATHERED_COPPER_BARS14.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS16.get(), DecoBlocks.WEATHERED_COPPER_BARS15.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS17.get(), DecoBlocks.WEATHERED_COPPER_BARS16.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS18.get(), DecoBlocks.WEATHERED_COPPER_BARS17.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS19.get(), DecoBlocks.WEATHERED_COPPER_BARS18.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS20.get(), DecoBlocks.WEATHERED_COPPER_BARS19.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS21.get(), DecoBlocks.WEATHERED_COPPER_BARS20.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS22.get(), DecoBlocks.WEATHERED_COPPER_BARS21.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS23.get(), DecoBlocks.WEATHERED_COPPER_BARS22.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS24.get(), DecoBlocks.WEATHERED_COPPER_BARS23.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS26.get(), DecoBlocks.WEATHERED_COPPER_BARS24.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS27.get(), DecoBlocks.WEATHERED_COPPER_BARS26.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS28.get(), DecoBlocks.WEATHERED_COPPER_BARS27.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS30.get(), DecoBlocks.WEATHERED_COPPER_BARS28.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS33.get(), DecoBlocks.WEATHERED_COPPER_BARS30.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_BARS34.get(), DecoBlocks.WEATHERED_COPPER_BARS33.get(), 1, DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WEATHERED_COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS1.get(), DecoBlocks.OXIDIZED_COPPER_BARS.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS2.get(), DecoBlocks.OXIDIZED_COPPER_BARS1.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS3.get(), DecoBlocks.OXIDIZED_COPPER_BARS2.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS4.get(), DecoBlocks.OXIDIZED_COPPER_BARS3.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS5.get(), DecoBlocks.OXIDIZED_COPPER_BARS4.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS6.get(), DecoBlocks.OXIDIZED_COPPER_BARS5.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS7.get(), DecoBlocks.OXIDIZED_COPPER_BARS6.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS8.get(), DecoBlocks.OXIDIZED_COPPER_BARS7.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS9.get(), DecoBlocks.OXIDIZED_COPPER_BARS8.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS10.get(), DecoBlocks.OXIDIZED_COPPER_BARS9.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS11.get(), DecoBlocks.OXIDIZED_COPPER_BARS10.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS12.get(), DecoBlocks.OXIDIZED_COPPER_BARS11.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS13.get(), DecoBlocks.OXIDIZED_COPPER_BARS12.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS14.get(), DecoBlocks.OXIDIZED_COPPER_BARS13.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS15.get(), DecoBlocks.OXIDIZED_COPPER_BARS14.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS16.get(), DecoBlocks.OXIDIZED_COPPER_BARS15.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS17.get(), DecoBlocks.OXIDIZED_COPPER_BARS16.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS18.get(), DecoBlocks.OXIDIZED_COPPER_BARS17.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS19.get(), DecoBlocks.OXIDIZED_COPPER_BARS18.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS20.get(), DecoBlocks.OXIDIZED_COPPER_BARS19.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS21.get(), DecoBlocks.OXIDIZED_COPPER_BARS20.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS22.get(), DecoBlocks.OXIDIZED_COPPER_BARS21.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS23.get(), DecoBlocks.OXIDIZED_COPPER_BARS22.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS24.get(), DecoBlocks.OXIDIZED_COPPER_BARS23.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS26.get(), DecoBlocks.OXIDIZED_COPPER_BARS24.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS27.get(), DecoBlocks.OXIDIZED_COPPER_BARS26.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS28.get(), DecoBlocks.OXIDIZED_COPPER_BARS27.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS30.get(), DecoBlocks.OXIDIZED_COPPER_BARS28.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS33.get(), DecoBlocks.OXIDIZED_COPPER_BARS30.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_BARS34.get(), DecoBlocks.OXIDIZED_COPPER_BARS33.get(), 1, DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.OXIDIZED_COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS1.get(), DecoBlocks.WAXED_COPPER_BARS.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS2.get(), DecoBlocks.WAXED_COPPER_BARS1.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS3.get(), DecoBlocks.WAXED_COPPER_BARS2.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS4.get(), DecoBlocks.WAXED_COPPER_BARS3.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS5.get(), DecoBlocks.WAXED_COPPER_BARS4.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS6.get(), DecoBlocks.WAXED_COPPER_BARS5.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS7.get(), DecoBlocks.WAXED_COPPER_BARS6.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS8.get(), DecoBlocks.WAXED_COPPER_BARS7.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS9.get(), DecoBlocks.WAXED_COPPER_BARS8.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS10.get(), DecoBlocks.WAXED_COPPER_BARS9.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS11.get(), DecoBlocks.WAXED_COPPER_BARS10.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS12.get(), DecoBlocks.WAXED_COPPER_BARS11.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS13.get(), DecoBlocks.WAXED_COPPER_BARS12.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS14.get(), DecoBlocks.WAXED_COPPER_BARS13.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS15.get(), DecoBlocks.WAXED_COPPER_BARS14.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS16.get(), DecoBlocks.WAXED_COPPER_BARS15.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS17.get(), DecoBlocks.WAXED_COPPER_BARS16.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS18.get(), DecoBlocks.WAXED_COPPER_BARS17.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS19.get(), DecoBlocks.WAXED_COPPER_BARS18.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS20.get(), DecoBlocks.WAXED_COPPER_BARS19.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS21.get(), DecoBlocks.WAXED_COPPER_BARS20.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS22.get(), DecoBlocks.WAXED_COPPER_BARS21.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS23.get(), DecoBlocks.WAXED_COPPER_BARS22.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS24.get(), DecoBlocks.WAXED_COPPER_BARS23.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS26.get(), DecoBlocks.WAXED_COPPER_BARS24.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS27.get(), DecoBlocks.WAXED_COPPER_BARS26.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS28.get(), DecoBlocks.WAXED_COPPER_BARS27.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS30.get(), DecoBlocks.WAXED_COPPER_BARS28.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS33.get(), DecoBlocks.WAXED_COPPER_BARS30.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS34.get(), DecoBlocks.WAXED_COPPER_BARS33.get(), 1, DecoBlocks.WAXED_COPPER_BARS.get(), DecoTags.CItems.WAXED_COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS1.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS2.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS1.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS3.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS2.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS4.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS3.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS5.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS4.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS6.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS5.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS7.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS6.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS8.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS7.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS9.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS8.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS10.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS9.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS11.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS10.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS12.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS11.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS13.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS12.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS14.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS13.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS15.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS14.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS16.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS15.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS17.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS16.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS18.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS17.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS19.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS18.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS20.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS19.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS21.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS20.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS22.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS21.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS23.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS22.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS24.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS23.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS26.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS24.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS27.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS26.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS28.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS27.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS30.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS28.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS33.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS30.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS34.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS33.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoTags.CItems.WAXED_EXPOSED_COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS1.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS2.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS1.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS3.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS2.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS4.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS3.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS5.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS4.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS6.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS5.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS7.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS6.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS8.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS7.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS9.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS8.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS10.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS9.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS11.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS10.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS12.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS11.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS13.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS12.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS14.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS13.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS15.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS14.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS16.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS15.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS17.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS16.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS18.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS17.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS19.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS18.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS20.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS19.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS21.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS20.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS22.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS21.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS23.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS22.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS24.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS23.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS26.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS24.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS27.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS26.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS28.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS27.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS30.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS28.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS33.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS30.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS34.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS33.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoTags.CItems.WAXED_WEATHERED_COPPER_BARS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoTags.CItems.WAXED_OXIDIZED_COPPER_BARS);

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS.get(), DecoBlocks.COPPER_BARS1.get(), DecoBlocks.COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS1.get(), DecoBlocks.COPPER_BARS1.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS2.get(), DecoBlocks.COPPER_BARS2.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS3.get(), DecoBlocks.COPPER_BARS3.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS4.get(), DecoBlocks.COPPER_BARS4.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS5.get(), DecoBlocks.COPPER_BARS5.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS6.get(), DecoBlocks.COPPER_BARS6.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS7.get(), DecoBlocks.COPPER_BARS7.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS8.get(), DecoBlocks.COPPER_BARS8.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS9.get(), DecoBlocks.COPPER_BARS9.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS10.get(), DecoBlocks.COPPER_BARS10.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS11.get(), DecoBlocks.COPPER_BARS11.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS12.get(), DecoBlocks.COPPER_BARS12.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS13.get(), DecoBlocks.COPPER_BARS13.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS14.get(), DecoBlocks.COPPER_BARS14.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS15.get(), DecoBlocks.COPPER_BARS15.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS16.get(), DecoBlocks.COPPER_BARS16.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS17.get(), DecoBlocks.COPPER_BARS17.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS18.get(), DecoBlocks.COPPER_BARS18.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS19.get(), DecoBlocks.COPPER_BARS19.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS20.get(), DecoBlocks.COPPER_BARS20.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS21.get(), DecoBlocks.COPPER_BARS21.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS22.get(), DecoBlocks.COPPER_BARS22.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS23.get(), DecoBlocks.COPPER_BARS23.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS24.get(), DecoBlocks.COPPER_BARS24.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS26.get(), DecoBlocks.COPPER_BARS26.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS27.get(), DecoBlocks.COPPER_BARS27.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS28.get(), DecoBlocks.COPPER_BARS28.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS30.get(), DecoBlocks.COPPER_BARS30.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS33.get(), DecoBlocks.COPPER_BARS33.get(), DecoBlocks.WAXED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_BARS34.get(), DecoBlocks.COPPER_BARS34.get(), DecoBlocks.WAXED_COPPER_BARS.get());

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get(), DecoBlocks.EXPOSED_COPPER_BARS.get(), DecoBlocks.EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS1.get(), DecoBlocks.EXPOSED_COPPER_BARS1.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS2.get(), DecoBlocks.EXPOSED_COPPER_BARS2.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS3.get(), DecoBlocks.EXPOSED_COPPER_BARS3.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS4.get(), DecoBlocks.EXPOSED_COPPER_BARS4.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS5.get(), DecoBlocks.EXPOSED_COPPER_BARS5.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS6.get(), DecoBlocks.EXPOSED_COPPER_BARS6.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS7.get(), DecoBlocks.EXPOSED_COPPER_BARS7.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS8.get(), DecoBlocks.EXPOSED_COPPER_BARS8.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS9.get(), DecoBlocks.EXPOSED_COPPER_BARS9.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS10.get(), DecoBlocks.EXPOSED_COPPER_BARS10.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS11.get(), DecoBlocks.EXPOSED_COPPER_BARS11.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS12.get(), DecoBlocks.EXPOSED_COPPER_BARS12.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS13.get(), DecoBlocks.EXPOSED_COPPER_BARS13.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS14.get(), DecoBlocks.EXPOSED_COPPER_BARS14.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS15.get(), DecoBlocks.EXPOSED_COPPER_BARS15.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS16.get(), DecoBlocks.EXPOSED_COPPER_BARS16.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS17.get(), DecoBlocks.EXPOSED_COPPER_BARS17.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS18.get(), DecoBlocks.EXPOSED_COPPER_BARS18.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS19.get(), DecoBlocks.EXPOSED_COPPER_BARS19.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS20.get(), DecoBlocks.EXPOSED_COPPER_BARS20.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS21.get(), DecoBlocks.EXPOSED_COPPER_BARS21.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS22.get(), DecoBlocks.EXPOSED_COPPER_BARS22.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS23.get(), DecoBlocks.EXPOSED_COPPER_BARS23.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS24.get(), DecoBlocks.EXPOSED_COPPER_BARS24.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS26.get(), DecoBlocks.EXPOSED_COPPER_BARS26.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS27.get(), DecoBlocks.EXPOSED_COPPER_BARS27.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS28.get(), DecoBlocks.EXPOSED_COPPER_BARS28.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS30.get(), DecoBlocks.EXPOSED_COPPER_BARS30.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS33.get(), DecoBlocks.EXPOSED_COPPER_BARS33.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS34.get(), DecoBlocks.EXPOSED_COPPER_BARS34.get(), DecoBlocks.WAXED_EXPOSED_COPPER_BARS.get());

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get(), DecoBlocks.WEATHERED_COPPER_BARS.get(), DecoBlocks.WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS1.get(), DecoBlocks.WEATHERED_COPPER_BARS1.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS2.get(), DecoBlocks.WEATHERED_COPPER_BARS2.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS3.get(), DecoBlocks.WEATHERED_COPPER_BARS3.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS4.get(), DecoBlocks.WEATHERED_COPPER_BARS4.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS5.get(), DecoBlocks.WEATHERED_COPPER_BARS5.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS6.get(), DecoBlocks.WEATHERED_COPPER_BARS6.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS7.get(), DecoBlocks.WEATHERED_COPPER_BARS7.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS8.get(), DecoBlocks.WEATHERED_COPPER_BARS8.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS9.get(), DecoBlocks.WEATHERED_COPPER_BARS9.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS10.get(), DecoBlocks.WEATHERED_COPPER_BARS10.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS11.get(), DecoBlocks.WEATHERED_COPPER_BARS11.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS12.get(), DecoBlocks.WEATHERED_COPPER_BARS12.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS13.get(), DecoBlocks.WEATHERED_COPPER_BARS13.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS14.get(), DecoBlocks.WEATHERED_COPPER_BARS14.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS15.get(), DecoBlocks.WEATHERED_COPPER_BARS15.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS16.get(), DecoBlocks.WEATHERED_COPPER_BARS16.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS17.get(), DecoBlocks.WEATHERED_COPPER_BARS17.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS18.get(), DecoBlocks.WEATHERED_COPPER_BARS18.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS19.get(), DecoBlocks.WEATHERED_COPPER_BARS19.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS20.get(), DecoBlocks.WEATHERED_COPPER_BARS20.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS21.get(), DecoBlocks.WEATHERED_COPPER_BARS21.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS22.get(), DecoBlocks.WEATHERED_COPPER_BARS22.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS23.get(), DecoBlocks.WEATHERED_COPPER_BARS23.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS24.get(), DecoBlocks.WEATHERED_COPPER_BARS24.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS26.get(), DecoBlocks.WEATHERED_COPPER_BARS26.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS27.get(), DecoBlocks.WEATHERED_COPPER_BARS27.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS28.get(), DecoBlocks.WEATHERED_COPPER_BARS28.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS30.get(), DecoBlocks.WEATHERED_COPPER_BARS30.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS33.get(), DecoBlocks.WEATHERED_COPPER_BARS33.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS34.get(), DecoBlocks.WEATHERED_COPPER_BARS34.get(), DecoBlocks.WAXED_WEATHERED_COPPER_BARS.get());

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), DecoBlocks.OXIDIZED_COPPER_BARS.get(), DecoBlocks.OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS1.get(), DecoBlocks.OXIDIZED_COPPER_BARS1.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS2.get(), DecoBlocks.OXIDIZED_COPPER_BARS2.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS3.get(), DecoBlocks.OXIDIZED_COPPER_BARS3.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS4.get(), DecoBlocks.OXIDIZED_COPPER_BARS4.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS5.get(), DecoBlocks.OXIDIZED_COPPER_BARS5.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS6.get(), DecoBlocks.OXIDIZED_COPPER_BARS6.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS7.get(), DecoBlocks.OXIDIZED_COPPER_BARS7.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS8.get(), DecoBlocks.OXIDIZED_COPPER_BARS8.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS9.get(), DecoBlocks.OXIDIZED_COPPER_BARS9.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS10.get(), DecoBlocks.OXIDIZED_COPPER_BARS10.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS11.get(), DecoBlocks.OXIDIZED_COPPER_BARS11.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS12.get(), DecoBlocks.OXIDIZED_COPPER_BARS12.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS13.get(), DecoBlocks.OXIDIZED_COPPER_BARS13.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS14.get(), DecoBlocks.OXIDIZED_COPPER_BARS14.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS15.get(), DecoBlocks.OXIDIZED_COPPER_BARS15.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS16.get(), DecoBlocks.OXIDIZED_COPPER_BARS16.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS17.get(), DecoBlocks.OXIDIZED_COPPER_BARS17.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS18.get(), DecoBlocks.OXIDIZED_COPPER_BARS18.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS19.get(), DecoBlocks.OXIDIZED_COPPER_BARS19.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS20.get(), DecoBlocks.OXIDIZED_COPPER_BARS20.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS21.get(), DecoBlocks.OXIDIZED_COPPER_BARS21.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS22.get(), DecoBlocks.OXIDIZED_COPPER_BARS22.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS23.get(), DecoBlocks.OXIDIZED_COPPER_BARS23.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS24.get(), DecoBlocks.OXIDIZED_COPPER_BARS24.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS26.get(), DecoBlocks.OXIDIZED_COPPER_BARS26.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS27.get(), DecoBlocks.OXIDIZED_COPPER_BARS27.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS28.get(), DecoBlocks.OXIDIZED_COPPER_BARS28.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS30.get(), DecoBlocks.OXIDIZED_COPPER_BARS30.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS33.get(), DecoBlocks.OXIDIZED_COPPER_BARS33.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS34.get(), DecoBlocks.OXIDIZED_COPPER_BARS34.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.get());

        //panel
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_PANEL2.get(), DecoBlocks.IRON_PANEL1.get(), 1, DecoBlocks.IRON_PANEL1.get(), DecoTags.DecoItems.IRON_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.IRON_PANEL3.get(), DecoBlocks.IRON_PANEL2.get(), 1, DecoBlocks.IRON_PANEL1.get(), DecoTags.DecoItems.IRON_PANELS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_PANEL2.get(), DecoBlocks.GOLD_PANEL1.get(), 1, DecoBlocks.GOLD_PANEL1.get(), DecoTags.DecoItems.GOLD_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.GOLD_PANEL3.get(), DecoBlocks.GOLD_PANEL2.get(), 1, DecoBlocks.GOLD_PANEL1.get(), DecoTags.DecoItems.GOLD_PANELS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_PANEL2.get(), DecoBlocks.EMERALD_PANEL1.get(), 1, DecoBlocks.EMERALD_PANEL1.get(), DecoTags.DecoItems.EMERALD_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EMERALD_PANEL3.get(), DecoBlocks.EMERALD_PANEL2.get(), 1, DecoBlocks.EMERALD_PANEL1.get(), DecoTags.DecoItems.EMERALD_PANELS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_PANEL2.get(), DecoBlocks.DARKMETAL_PANEL1.get(), 1, DecoBlocks.DARKMETAL_PANEL1.get(), DecoTags.DecoItems.DARKMETAL_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.DARKMETAL_PANEL3.get(), DecoBlocks.DARKMETAL_PANEL2.get(), 1, DecoBlocks.DARKMETAL_PANEL1.get(), DecoTags.DecoItems.DARKMETAL_PANELS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_PANEL2.get(), DecoBlocks.CLOUD_PANEL1.get(), 1, DecoBlocks.CLOUD_PANEL1.get(), DecoTags.DecoItems.CLOUD_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_PANEL3.get(), DecoBlocks.CLOUD_PANEL2.get(), 1, DecoBlocks.CLOUD_PANEL1.get(), DecoTags.DecoItems.CLOUD_PANELS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_PANEL2.get(), DecoBlocks.COPPER_PANEL1.get(), 1, DecoBlocks.COPPER_PANEL1.get(), DecoTags.DecoItems.COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.COPPER_PANEL3.get(), DecoBlocks.COPPER_PANEL2.get(), 1, DecoBlocks.COPPER_PANEL1.get(), DecoTags.DecoItems.COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_PANEL2.get(), DecoBlocks.EXPOSED_COPPER_PANEL1.get(), 1, DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoTags.DecoItems.EXPOSED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.EXPOSED_COPPER_PANEL3.get(), DecoBlocks.EXPOSED_COPPER_PANEL2.get(), 1, DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoTags.DecoItems.EXPOSED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_PANEL2.get(), DecoBlocks.WEATHERED_COPPER_PANEL1.get(), 1, DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoTags.DecoItems.WEATHERED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WEATHERED_COPPER_PANEL3.get(), DecoBlocks.WEATHERED_COPPER_PANEL2.get(), 1, DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoTags.DecoItems.WEATHERED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_PANEL2.get(), DecoBlocks.OXIDIZED_COPPER_PANEL1.get(), 1, DecoBlocks.OXIDIZED_COPPER_PANEL1.get(), DecoTags.DecoItems.OXIDIZED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.OXIDIZED_COPPER_PANEL3.get(), DecoBlocks.OXIDIZED_COPPER_PANEL2.get(), 1, DecoBlocks.OXIDIZED_COPPER_PANEL1.get(), DecoTags.DecoItems.OXIDIZED_COPPER_PANELS);

        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_PANEL2.get(), DecoBlocks.WAXED_COPPER_PANEL1.get(), 1, DecoBlocks.WAXED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_PANEL3.get(), DecoBlocks.WAXED_COPPER_PANEL2.get(), 1, DecoBlocks.WAXED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2.get(), DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_EXPOSED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3.get(), DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2.get(), 1, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_EXPOSED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2.get(), DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_WEATHERED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3.get(), DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2.get(), 1, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_WEATHERED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_OXIDIZED_COPPER_PANELS);
        barsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3.get(), DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get(), 1, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get(), DecoTags.DecoItems.WAXED_OXIDIZED_COPPER_PANELS);

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_PANEL1.get(), DecoBlocks.COPPER_PANEL1.get(), DecoBlocks.COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_PANEL2.get(), DecoBlocks.COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_COPPER_PANEL3.get(), DecoBlocks.COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL1.get(), DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL2.get(), DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_EXPOSED_COPPER_PANEL3.get(), DecoBlocks.EXPOSED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL1.get(), DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL2.get(), DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_WEATHERED_COPPER_PANEL3.get(), DecoBlocks.WEATHERED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());

        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL1.get(), DecoBlocks.OXIDIZED_COPPER_PANEL1.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL2.get(), DecoBlocks.OXIDIZED_COPPER_PANEL2.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());
        waxedMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.WAXED_OXIDIZED_COPPER_PANEL3.get(), DecoBlocks.OXIDIZED_COPPER_PANEL3.get(), DecoBlocks.WAXED_COPPER_PANEL1.get());

        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_BLACK.get(), Blocks.BLACK_WOOL, Items.BLACK_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_RED.get(), Blocks.RED_WOOL, Items.RED_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, DecoBlocks.CURTAIN_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE);
    }
    protected static void vitrageMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                         ItemLike ingredient, ItemLike unlock) {
        ShapedRecipeBuilder.shaped(category, result, 2).pattern("ABA")
                .define('A', ingredient).define('B', Items.GLASS_PANE)
                .unlockedBy(getHasName(unlock), has(unlock)).save(recipe, satans_deco_bm.MODID +":"+ getItemName(result) + "_craft_from_non_vitrage");
    }

    protected static void curtainsMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                          ItemLike ingredient, ItemLike dye) {
        ShapedRecipeBuilder.shaped(category, result, 6).pattern("A").pattern("B")
                .define('A', DecoTags.CItems.WOODEN_RODS).define('B', ingredient).unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                        .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(DecoTags.DecoItems.CURTAINS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_bm.MODID +":"+ "dyed_to_" + getItemName(result));
    }

    protected static void barsMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                     ItemLike ingredient, int amount, ItemLike unlock, TagKey<Item> ingredient1) {
        ShapelessRecipeBuilder.shapeless(category, result, amount).requires(ingredient)
                .unlockedBy(getHasName(unlock), has(unlock))
                .save(recipe);
        stonecutterTag(recipe, category, result, ingredient1, amount, unlock);
    }

    protected static void waxedMaking(Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                      ItemLike ingredient, ItemLike unlock) {
        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(ingredient).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(unlock), has(unlock))
                .save(recipe, satans_deco_bm.MODID+":" + getItemName(result) + "_waxing");
    }

    protected static void stonecutter(Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                      ItemLike ingredient, int amount, ItemLike unlock) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, amount)
                .unlockedBy(getHasName(unlock), has(unlock))
                .save(recipe,  satans_deco_bm.MODID+":" + getItemName(result) + "_stonecutting");
    }

    protected static void stonecutterTag(Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                         TagKey<Item> ingredient, int amount, ItemLike unlock) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, amount)
                .unlockedBy(getHasName(unlock), has(unlock))
                .save(recipe,  satans_deco_bm.MODID+":" + getItemName(result) + "_stonecutting_from_"+ ingredient.toString().replaceAll("[^a-z0-9._-]", "").replace("ageyminecraftitem",""));
    }
}