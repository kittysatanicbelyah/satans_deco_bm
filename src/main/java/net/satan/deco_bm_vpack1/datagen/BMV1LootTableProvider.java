package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import net.satan.deco_bm_vpack1.datagen.loot.BMV1BlockLootTables;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class BMV1LootTableProvider {
    public static LootTableProvider create(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
     return new LootTableProvider(packOutput, Set.of(), List.of(
             new LootTableProvider.SubProviderEntry(BMV1BlockLootTables::new, LootContextParamSets.BLOCK)), lookupProvider
     );
    }
}
