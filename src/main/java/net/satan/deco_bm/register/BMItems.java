package net.satan.deco_bm.register;

import net.minecraft.world.item.Item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.satan.deco_bm.satans_deco_bm;

public class BMItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(satans_deco_bm.MODID);
//Items go here

    //Items end here
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
