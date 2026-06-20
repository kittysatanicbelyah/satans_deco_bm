package net.satan.deco_bm_vpack1.register;

import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

public class BMV1Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Satans_deco_bm_vpack1.MODID);
//Items go here
//Items end here
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
