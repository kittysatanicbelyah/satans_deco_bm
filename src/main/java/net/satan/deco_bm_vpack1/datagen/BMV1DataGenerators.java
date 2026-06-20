package net.satan.deco_bm_vpack1.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Satans_deco_bm_vpack1.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BMV1DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new BMV1RecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), BMV1LootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new BMV1BlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BMV1BlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BMV1ItemModelProvider(packOutput, existingFileHelper));
    }
}
