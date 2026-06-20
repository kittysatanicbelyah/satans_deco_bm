package net.satan.deco_bm_vpack1.datagen.util;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_bm.satans_deco_bm;
import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;
import net.satan.deco_bm_vpack1.register.BMV1Blocks;

public interface BMV1SupGen {
// A collection of methods made specifically to make datagen less messy
    // It does heavy lifting bullshit

    static String BlockIdFilter(RegistryObject<Block> block) {
        int end = block.getId().getPath().replace("bars","").replaceAll("[\\d_]","").length();
       String blockId = "block/" + block.getId().getPath().substring(0, end) + "_bars";

        if (block.getId().getPath().replace("bars", "").replaceAll("[\\d_]", "").equals("iron")) {
            blockId = "block/iron_bars";
        }
        else if (block.getId().getPath().replace("bars", "").replaceAll("[\\d_]", "").equals("exposedcopper"))
        {
            blockId = "block/exposed_copper_bars";
        }
        else if (block.getId().getPath().replace("bars", "").replaceAll("[\\d_]", "").equals("weatheredcopper"))
        {
            blockId = "block/weathered_copper_bars";
        }
        else if (block.getId().getPath().replace("bars", "").replaceAll("[\\d_]", "").equals("oxidizedcopper"))
        {
            blockId = "block/oxidized_copper_bars";
        }
        return blockId;
    }

    static String ModIdFilter(RegistryObject<Block> block) {
        String mId = satans_deco_bm.MODID;
        if (block.getId().getPath().replace("bars", "").replaceAll("[\\d_]", "").equals("iron")) {
            mId = "minecraft";
        }
        return mId;
    }

    static RegistryObject<Block> getDecoNonWaxed (RegistryObject<Block> block) {
        String newPath = block.getId().getPath().replace("waxed_", "");
       RegistryObject<Block> nonwax = BMV1Blocks.getByName(newPath);
       return nonwax;
    }

    static String getPanelTexture (RegistryObject<Block> block, int option) {
        int num4 = (Integer.parseInt(block.getId().getPath().replaceAll("[^\\d]", "")) * 4);
        String panel4 = block.getId().getPath().replaceAll("[\\dl]", "") + num4;
        int num3 = num4 - 1;
        String panel3 = block.getId().getPath().replaceAll("[\\dl]", "") + num3;
        int num2 = num3 - 1;
        String panel2 = block.getId().getPath().replaceAll("[\\dl]", "") + num2;
        int num1 = num2 - 1;
        String panel1 = block.getId().getPath().replaceAll("[\\dl]", "") + num1;

        String[] panels = {panel1,panel2,panel3,panel4};
        return panels[option];
    }

}
