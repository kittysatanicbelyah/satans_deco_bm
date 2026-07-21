package net.satan.deco_bm;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import net.satan.deco_bm.register.BMBlocks;
import net.satan.deco_bm.register.BMItems;
import net.satan.deco_bm.register.BMSounds;
import net.satan.deco_bm.register.BMTabs;

import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(satans_deco_bm.MODID)
public class satans_deco_bm {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "satans_deco_bm";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public satans_deco_bm(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        BMTabs.register(modEventBus);
        BMBlocks.register(modEventBus);
        BMItems.register(modEventBus);
        BMSounds.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
}
