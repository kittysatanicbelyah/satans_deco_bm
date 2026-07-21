package net.satan.deco_bm.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.satan.deco_bm.satans_deco_bm;

public class BMSounds {
public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT,
        satans_deco_bm.MODID);

//sounds go here

    public static final DeferredHolder<SoundEvent, SoundEvent> PANEL_ROTATES = registerSoundEvents("panel_rotates");
    public static final DeferredHolder<SoundEvent, SoundEvent> VITRAGE_IMPORT = registerSoundEvents("vitrage_import");
    public static final DeferredHolder<SoundEvent, SoundEvent> VITRAGE_EXPORT = registerSoundEvents("vitrage_export");

// sounds end here

private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvents(String name) {
    return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(satans_deco_bm.MODID, name)));
}

public static void register (IEventBus evenBus) {
    SOUND_EVENTS.register(evenBus);
    }
}
