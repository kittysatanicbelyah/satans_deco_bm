package net.satan.deco_bm.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import net.satan.deco_bm.datagen.loot.DecoBlockLootTables;

import java.util.List;
import java.util.Set;

public class BMLootTableProvider {
    public static LootTableProvider create(PackOutput packOutput) {
     return new LootTableProvider(packOutput, Set.of(), List.of(
             new LootTableProvider.SubProviderEntry(DecoBlockLootTables::new, LootContextParamSets.BLOCK
     )));
    }
}
