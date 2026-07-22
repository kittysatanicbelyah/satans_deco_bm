package net.satan.deco_bm_vpack1.register;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.satan.deco_bm.block.VitragePaneBlock;
import net.satan.deco_bm.block.VitragePanelBlock;

import net.satan.deco_bm_vpack1.Satans_deco_bm_vpack1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BMV1Blocks {
public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(Satans_deco_bm_vpack1.MODID);
//Blocks go here
//vitrages
public static final DeferredBlock<Block> IRON_VITRAGE_PANE = registerBlock("iron_vitrage_pane",
        () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE1 = registerBlock("iron_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE2 = registerBlock("iron_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE3 = registerBlock("iron_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE4 = registerBlock("iron_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE5 = registerBlock("iron_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE6 = registerBlock("iron_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE7 = registerBlock("iron_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE8 = registerBlock("iron_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE9 = registerBlock("iron_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE10 = registerBlock("iron_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE11 = registerBlock("iron_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE12 = registerBlock("iron_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE13 = registerBlock("iron_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE14 = registerBlock("iron_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE15 = registerBlock("iron_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE16 = registerBlock("iron_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE17 = registerBlock("iron_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE18 = registerBlock("iron_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE19 = registerBlock("iron_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE20 = registerBlock("iron_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE21 = registerBlock("iron_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE22 = registerBlock("iron_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE23 = registerBlock("iron_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE24 = registerBlock("iron_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE26 = registerBlock("iron_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE27 = registerBlock("iron_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE28 = registerBlock("iron_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE30 = registerBlock("iron_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE33 = registerBlock("iron_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANE34 = registerBlock("iron_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));

    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE = registerBlock("gold_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE1 = registerBlock("gold_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE2 = registerBlock("gold_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE3 = registerBlock("gold_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE4 = registerBlock("gold_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE5 = registerBlock("gold_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE6 = registerBlock("gold_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE7 = registerBlock("gold_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE8 = registerBlock("gold_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE9 = registerBlock("gold_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE10 = registerBlock("gold_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE11 = registerBlock("gold_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE12 = registerBlock("gold_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE13 = registerBlock("gold_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE14 = registerBlock("gold_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE15 = registerBlock("gold_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE16 = registerBlock("gold_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE17 = registerBlock("gold_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE18 = registerBlock("gold_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE19 = registerBlock("gold_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE20 = registerBlock("gold_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE21 = registerBlock("gold_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE22 = registerBlock("gold_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE23 = registerBlock("gold_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE24 = registerBlock("gold_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE26 = registerBlock("gold_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE27 = registerBlock("gold_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE28 = registerBlock("gold_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE30 = registerBlock("gold_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE33 = registerBlock("gold_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANE34 = registerBlock("gold_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE = registerBlock("emerald_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE1 = registerBlock("emerald_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE2 = registerBlock("emerald_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE3 = registerBlock("emerald_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE4 = registerBlock("emerald_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE5 = registerBlock("emerald_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE6 = registerBlock("emerald_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE7 = registerBlock("emerald_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE8 = registerBlock("emerald_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE9 = registerBlock("emerald_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE10 = registerBlock("emerald_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE11 = registerBlock("emerald_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE12 = registerBlock("emerald_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE13 = registerBlock("emerald_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE14 = registerBlock("emerald_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE15 = registerBlock("emerald_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE16 = registerBlock("emerald_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE17 = registerBlock("emerald_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE18 = registerBlock("emerald_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE19 = registerBlock("emerald_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE20 = registerBlock("emerald_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE21 = registerBlock("emerald_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE22 = registerBlock("emerald_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE23 = registerBlock("emerald_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE24 = registerBlock("emerald_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE26 = registerBlock("emerald_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE27 = registerBlock("emerald_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE28 = registerBlock("emerald_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE30 = registerBlock("emerald_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE33 = registerBlock("emerald_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANE34 = registerBlock("emerald_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));

    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE = registerBlock("darkmetal_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE1 = registerBlock("darkmetal_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE2 = registerBlock("darkmetal_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE3 = registerBlock("darkmetal_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE4 = registerBlock("darkmetal_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE5 = registerBlock("darkmetal_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE6 = registerBlock("darkmetal_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE7 = registerBlock("darkmetal_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE8 = registerBlock("darkmetal_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE9 = registerBlock("darkmetal_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE10 = registerBlock("darkmetal_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE11 = registerBlock("darkmetal_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE12 = registerBlock("darkmetal_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE13 = registerBlock("darkmetal_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE14 = registerBlock("darkmetal_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE15 = registerBlock("darkmetal_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE16 = registerBlock("darkmetal_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE17 = registerBlock("darkmetal_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE18 = registerBlock("darkmetal_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE19 = registerBlock("darkmetal_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE20 = registerBlock("darkmetal_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE21 = registerBlock("darkmetal_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE22 = registerBlock("darkmetal_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE23 = registerBlock("darkmetal_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE24 = registerBlock("darkmetal_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE26 = registerBlock("darkmetal_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE27 = registerBlock("darkmetal_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE28 = registerBlock("darkmetal_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE30 = registerBlock("darkmetal_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE33 = registerBlock("darkmetal_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANE34 = registerBlock("darkmetal_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE = registerBlock("cloud_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE1 = registerBlock("cloud_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE2 = registerBlock("cloud_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE3 = registerBlock("cloud_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE4 = registerBlock("cloud_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE5 = registerBlock("cloud_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE6 = registerBlock("cloud_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE7 = registerBlock("cloud_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE8 = registerBlock("cloud_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE9 = registerBlock("cloud_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE10 = registerBlock("cloud_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE11 = registerBlock("cloud_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE12 = registerBlock("cloud_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE13 = registerBlock("cloud_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE14 = registerBlock("cloud_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE15 = registerBlock("cloud_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE16 = registerBlock("cloud_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE17 = registerBlock("cloud_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE18 = registerBlock("cloud_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE19 = registerBlock("cloud_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE20 = registerBlock("cloud_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE21 = registerBlock("cloud_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE22 = registerBlock("cloud_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE23 = registerBlock("cloud_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE24 = registerBlock("cloud_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE26 = registerBlock("cloud_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE27 = registerBlock("cloud_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE28 = registerBlock("cloud_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE30 = registerBlock("cloud_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE33 = registerBlock("cloud_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANE34 = registerBlock("cloud_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE = registerBlock("waxed_copper_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE1 = registerBlock("waxed_copper_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE2 = registerBlock("waxed_copper_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE3 = registerBlock("waxed_copper_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE4 = registerBlock("waxed_copper_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE5 = registerBlock("waxed_copper_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE6 = registerBlock("waxed_copper_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE7 = registerBlock("waxed_copper_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE8 = registerBlock("waxed_copper_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE9 = registerBlock("waxed_copper_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE10 = registerBlock("waxed_copper_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE11 = registerBlock("waxed_copper_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE12 = registerBlock("waxed_copper_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE13 = registerBlock("waxed_copper_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE14 = registerBlock("waxed_copper_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE15 = registerBlock("waxed_copper_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE16 = registerBlock("waxed_copper_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE17 = registerBlock("waxed_copper_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE18 = registerBlock("waxed_copper_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE19 = registerBlock("waxed_copper_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE20 = registerBlock("waxed_copper_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE21 = registerBlock("waxed_copper_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE22 = registerBlock("waxed_copper_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE23 = registerBlock("waxed_copper_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE24 = registerBlock("waxed_copper_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE26 = registerBlock("waxed_copper_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE27 = registerBlock("waxed_copper_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE28 = registerBlock("waxed_copper_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE30 = registerBlock("waxed_copper_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE33 = registerBlock("waxed_copper_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANE34 = registerBlock("waxed_copper_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE = registerBlock("waxed_exposed_copper_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE1 = registerBlock("waxed_exposed_copper_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE2 = registerBlock("waxed_exposed_copper_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE3 = registerBlock("waxed_exposed_copper_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE4 = registerBlock("waxed_exposed_copper_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE5 = registerBlock("waxed_exposed_copper_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE6 = registerBlock("waxed_exposed_copper_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE7 = registerBlock("waxed_exposed_copper_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE8 = registerBlock("waxed_exposed_copper_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE9 = registerBlock("waxed_exposed_copper_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE10 = registerBlock("waxed_exposed_copper_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE11 = registerBlock("waxed_exposed_copper_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE12 = registerBlock("waxed_exposed_copper_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE13 = registerBlock("waxed_exposed_copper_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE14 = registerBlock("waxed_exposed_copper_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE15 = registerBlock("waxed_exposed_copper_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE16 = registerBlock("waxed_exposed_copper_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE17 = registerBlock("waxed_exposed_copper_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE18 = registerBlock("waxed_exposed_copper_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE19 = registerBlock("waxed_exposed_copper_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE20 = registerBlock("waxed_exposed_copper_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE21 = registerBlock("waxed_exposed_copper_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE22 = registerBlock("waxed_exposed_copper_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE23 = registerBlock("waxed_exposed_copper_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE24 = registerBlock("waxed_exposed_copper_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE26 = registerBlock("waxed_exposed_copper_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE27 = registerBlock("waxed_exposed_copper_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE28 = registerBlock("waxed_exposed_copper_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE30 = registerBlock("waxed_exposed_copper_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE33 = registerBlock("waxed_exposed_copper_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANE34 = registerBlock("waxed_exposed_copper_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE = registerBlock("waxed_weathered_copper_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE1 = registerBlock("waxed_weathered_copper_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE2 = registerBlock("waxed_weathered_copper_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE3 = registerBlock("waxed_weathered_copper_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE4 = registerBlock("waxed_weathered_copper_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE5 = registerBlock("waxed_weathered_copper_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE6 = registerBlock("waxed_weathered_copper_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE7 = registerBlock("waxed_weathered_copper_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE8 = registerBlock("waxed_weathered_copper_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE9 = registerBlock("waxed_weathered_copper_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE10 = registerBlock("waxed_weathered_copper_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE11 = registerBlock("waxed_weathered_copper_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE12 = registerBlock("waxed_weathered_copper_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE13 = registerBlock("waxed_weathered_copper_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE14 = registerBlock("waxed_weathered_copper_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE15 = registerBlock("waxed_weathered_copper_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE16 = registerBlock("waxed_weathered_copper_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE17 = registerBlock("waxed_weathered_copper_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE18 = registerBlock("waxed_weathered_copper_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE19 = registerBlock("waxed_weathered_copper_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE20 = registerBlock("waxed_weathered_copper_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE21 = registerBlock("waxed_weathered_copper_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE22 = registerBlock("waxed_weathered_copper_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE23 = registerBlock("waxed_weathered_copper_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE24 = registerBlock("waxed_weathered_copper_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE26 = registerBlock("waxed_weathered_copper_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE27 = registerBlock("waxed_weathered_copper_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE28 = registerBlock("waxed_weathered_copper_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE30 = registerBlock("waxed_weathered_copper_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE33 = registerBlock("waxed_weathered_copper_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANE34 = registerBlock("waxed_weathered_copper_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE = registerBlock("waxed_oxidized_copper_vitrage_pane",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE1 = registerBlock("waxed_oxidized_copper_vitrage_pane1",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE2 = registerBlock("waxed_oxidized_copper_vitrage_pane2",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE3 = registerBlock("waxed_oxidized_copper_vitrage_pane3",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE4 = registerBlock("waxed_oxidized_copper_vitrage_pane4",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE5 = registerBlock("waxed_oxidized_copper_vitrage_pane5",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE6 = registerBlock("waxed_oxidized_copper_vitrage_pane6",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE7 = registerBlock("waxed_oxidized_copper_vitrage_pane7",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE8 = registerBlock("waxed_oxidized_copper_vitrage_pane8",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE9 = registerBlock("waxed_oxidized_copper_vitrage_pane9",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE10 = registerBlock("waxed_oxidized_copper_vitrage_pane10",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE11 = registerBlock("waxed_oxidized_copper_vitrage_pane11",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE12 = registerBlock("waxed_oxidized_copper_vitrage_pane12",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE13 = registerBlock("waxed_oxidized_copper_vitrage_pane13",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE14 = registerBlock("waxed_oxidized_copper_vitrage_pane14",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE15 = registerBlock("waxed_oxidized_copper_vitrage_pane15",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE16 = registerBlock("waxed_oxidized_copper_vitrage_pane16",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE17 = registerBlock("waxed_oxidized_copper_vitrage_pane17",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE18 = registerBlock("waxed_oxidized_copper_vitrage_pane18",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE19 = registerBlock("waxed_oxidized_copper_vitrage_pane19",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE20 = registerBlock("waxed_oxidized_copper_vitrage_pane20",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE21 = registerBlock("waxed_oxidized_copper_vitrage_pane21",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE22 = registerBlock("waxed_oxidized_copper_vitrage_pane22",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE23 = registerBlock("waxed_oxidized_copper_vitrage_pane23",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE24 = registerBlock("waxed_oxidized_copper_vitrage_pane24",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE26 = registerBlock("waxed_oxidized_copper_vitrage_pane26",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE27 = registerBlock("waxed_oxidized_copper_vitrage_pane27",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE28 = registerBlock("waxed_oxidized_copper_vitrage_pane28",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE30 = registerBlock("waxed_oxidized_copper_vitrage_pane30",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE33 = registerBlock("waxed_oxidized_copper_vitrage_pane33",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANE34 = registerBlock("waxed_oxidized_copper_vitrage_pane34",
            () -> new VitragePaneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANEL1 = registerBlock("waxed_oxidized_copper_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANEL2 = registerBlock("waxed_oxidized_copper_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_VITRAGE_PANEL3 = registerBlock("waxed_oxidized_copper_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANEL1 = registerBlock("waxed_weathered_copper_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANEL2 = registerBlock("waxed_weathered_copper_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_VITRAGE_PANEL3 = registerBlock("waxed_weathered_copper_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANEL1 = registerBlock("waxed_exposed_copper_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANEL2 = registerBlock("waxed_exposed_copper_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_VITRAGE_PANEL3 = registerBlock("waxed_exposed_copper_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANEL1 = registerBlock("waxed_copper_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANEL2 = registerBlock("waxed_copper_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_VITRAGE_PANEL3 = registerBlock("waxed_copper_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANEL1 = registerBlock("cloud_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANEL2 = registerBlock("cloud_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> CLOUD_VITRAGE_PANEL3 = registerBlock("cloud_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANEL1 = registerBlock("darkmetal_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANEL2 = registerBlock("darkmetal_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(2.0F, 6.0F)));
    public static final DeferredBlock<Block> DARKMETAL_VITRAGE_PANEL3 = registerBlock("darkmetal_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANEL1 = registerBlock("emerald_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANEL2 = registerBlock("emerald_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> EMERALD_VITRAGE_PANEL3 = registerBlock("emerald_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER)));

    public static final DeferredBlock<Block> GOLD_VITRAGE_PANEL1 = registerBlock("gold_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANEL2 = registerBlock("gold_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> GOLD_VITRAGE_PANEL3 = registerBlock("gold_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER).strength(3.0F, 6.0F)));

    public static final DeferredBlock<Block> IRON_VITRAGE_PANEL1 = registerBlock("iron_vitrage_panel1",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANEL2 = registerBlock("iron_vitrage_panel2",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> IRON_VITRAGE_PANEL3 = registerBlock("iron_vitrage_panel3",
            () -> new VitragePanelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.COPPER)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock<T>) BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> DeferredHolder<Item, BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
        return BMV1Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static final Map<String, DeferredBlock<Block>> BLOCK_MAP = new HashMap<>();
    static {
        BLOCKS.getEntries().forEach(entry ->
                BLOCK_MAP.put(entry.getId().getPath(), (DeferredBlock<Block>) entry)
        );
    }

    public static DeferredBlock<Block> getByName(String name) {
        return BLOCK_MAP.get(name);

    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

