package net.satan.deco_bm_vpack1.register;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.locating.IModFile;
import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

import java.nio.file.Path;

@Mod.EventBusSubscriber(
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = net.minecraftforge.api.distmarker.Dist.CLIENT
)
public class BMV1ResourcePacks {

    @SubscribeEvent
    public static void addPack(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.CLIENT_RESOURCES) return;

        var modFileInfo = ModList.get().getModFileById(Satans_deco_bm_vpack1.MODID);
        if (modFileInfo == null) return;

        IModFile modFile = modFileInfo.getFile();
        Path packPath = modFile.findResource("resourcepacks/connected_glass_vitrage");

        event.addRepositorySource(consumer -> {
            Pack pack = Pack.readMetaAndCreate(
                    "resource_pack_name",
                    Component.literal("Connected Glass For Vitrages"),
                    false,
                    id -> new PathPackResources(id, packPath, false),
                    PackType.CLIENT_RESOURCES,
                    Pack.Position.TOP,
                    PackSource.BUILT_IN
            );
            if (pack != null) {
                consumer.accept(pack);
            }
        });
    }
}