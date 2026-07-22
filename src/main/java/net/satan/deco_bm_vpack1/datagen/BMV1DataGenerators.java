package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Satans_deco_bm_vpack1.MODID, bus = EventBusSubscriber.Bus.MOD)
public class BMV1DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new BMV1RecipeProvider(lookupProvider, packOutput));
        generator.addProvider(event.includeServer(), BMV1LootTableProvider.create(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new BMV1BlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BMV1BlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BMV1ItemModelProvider(packOutput, existingFileHelper));
    }
}
