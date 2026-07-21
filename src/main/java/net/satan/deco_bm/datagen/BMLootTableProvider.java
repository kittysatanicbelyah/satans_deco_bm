package net.satan.deco_bm.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import net.satan.deco_bm.datagen.loot.BMBlockLootTables;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class BMLootTableProvider {
    public static LootTableProvider create(PackOutput packOutput, HolderLookup.Provider lookupProvider) {
     return new LootTableProvider(packOutput, Set.of(), List.of(
             new LootTableProvider.SubProviderEntry(BMBlockLootTables::new, LootContextParamSets.BLOCK)), (CompletableFuture<HolderLookup.Provider>) lookupProvider);
    }
}
