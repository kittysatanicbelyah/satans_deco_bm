package net.satan.deco_bm.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import net.satan.deco_bm.satans_deco_bm;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = satans_deco_bm.MODID, bus = EventBusSubscriber.Bus.MOD)
public class BMDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new BMRecipeProvider(lookupProvider, packOutput));
        generator.addProvider(event.includeServer(), BMLootTableProvider.create(packOutput, lookupProvider.join()));

        generator.addProvider(event.includeClient(), new BMBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BMBlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BMItemModelProvider(packOutput, existingFileHelper));
    }
}
