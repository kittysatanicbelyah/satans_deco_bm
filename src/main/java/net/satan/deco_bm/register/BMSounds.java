package net.satan.deco_bm.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_bm.satans_deco_bm;

public class BMSounds {
public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
        satans_deco_bm.MODID);

//sounds go here

    public static final RegistryObject<SoundEvent> PANEL_ROTATES = registerSoundEvents("panel_rotates");
    public static final RegistryObject<SoundEvent> VITRAGE_IMPORT = registerSoundEvents("vitrage_import");
    public static final RegistryObject<SoundEvent> VITRAGE_EXPORT = registerSoundEvents("vitrage_export");

// sounds end here

private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
    return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(satans_deco_bm.MODID, name)));
}

public static void register (IEventBus evenBus) {
    SOUND_EVENTS.register(evenBus);
    }
}
