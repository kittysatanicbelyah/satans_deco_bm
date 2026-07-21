package net.satan.deco_bm.datagen.util;

import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.satan.deco_bm.register.BMBlocks;
import net.satan.deco_bm.satans_deco_bm;

public interface BMSupGen {
// A collection of methods made specifically to make datagen less messy
    // It does heavy lifting bullshit

    static String BlockIdFilter(DeferredBlock<Block> block) {
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

    static String ModIdFilter(DeferredBlock<Block> block) {
        String mId = satans_deco_bm.MODID;
        if (block.getId().getPath().replace("bars", "").replaceAll("[\\d_]", "").equals("iron")) {
            mId = "minecraft";
        }
        return mId;
    }

    static DeferredBlock<Block> getDecoNonWaxed (DeferredBlock<Block> block) {
        String newPath = block.getId().getPath().replace("waxed_", "");
       return (DeferredBlock<Block>) BMBlocks.getByName(newPath);
    }

    static String getPanelTexture (DeferredBlock<Block> block, int option) {
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
