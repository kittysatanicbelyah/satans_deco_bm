package net.satan.deco_bm.register;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_bm.block.*;
import net.satan.deco_bm.block.util.BMWeatheringCopper;
import net.satan.deco_bm.satans_deco_bm;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BMBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, satans_deco_bm.MODID);
//Blocks go here
    //bars
    public static final RegistryObject<Block> IRON_BARS1 = registerBlock("iron_bars1",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS2 = registerBlock("iron_bars2",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS3 = registerBlock("iron_bars3",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 0));
    public static final RegistryObject<Block> IRON_BARS4 = registerBlock("iron_bars4",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 1));
    public static final RegistryObject<Block> IRON_BARS5 = registerBlock("iron_bars5",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS6 = registerBlock("iron_bars6",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS7 = registerBlock("iron_bars7",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 2));
    public static final RegistryObject<Block> IRON_BARS8 = registerBlock("iron_bars8",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 3));
    public static final RegistryObject<Block> IRON_BARS9 = registerBlock("iron_bars9",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS10 = registerBlock("iron_bars10",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS11 = registerBlock("iron_bars11",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS12 = registerBlock("iron_bars12",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS13 = registerBlock("iron_bars13",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS14 = registerBlock("iron_bars14",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS15 = registerBlock("iron_bars15",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS16 = registerBlock("iron_bars16",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS17 = registerBlock("iron_bars17",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS18 = registerBlock("iron_bars18",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS19 = registerBlock("iron_bars19",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS20 = registerBlock("iron_bars20",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS21 = registerBlock("iron_bars21",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 4));
    public static final RegistryObject<Block> IRON_BARS22 = registerBlock("iron_bars22",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS23 = registerBlock("iron_bars23",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS24 = registerBlock("iron_bars24",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS26 = registerBlock("iron_bars26",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS27 = registerBlock("iron_bars27",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS28 = registerBlock("iron_bars28",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS30 = registerBlock("iron_bars30",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS33 = registerBlock("iron_bars33",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_BARS34 = registerBlock("iron_bars34",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> GOLD_BARS = registerBlock("gold_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS1 = registerBlock("gold_bars1",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS2 = registerBlock("gold_bars2",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS3 = registerBlock("gold_bars3",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> GOLD_BARS4 = registerBlock("gold_bars4",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> GOLD_BARS5 = registerBlock("gold_bars5",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS6 = registerBlock("gold_bars6",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS7 = registerBlock("gold_bars7",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> GOLD_BARS8 = registerBlock("gold_bars8",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> GOLD_BARS9 = registerBlock("gold_bars9",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS10 = registerBlock("gold_bars10",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS11 = registerBlock("gold_bars11",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS12 = registerBlock("gold_bars12",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS13 = registerBlock("gold_bars13",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS14 = registerBlock("gold_bars14",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS15 = registerBlock("gold_bars15",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS16 = registerBlock("gold_bars16",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS17 = registerBlock("gold_bars17",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS18 = registerBlock("gold_bars18",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS19 = registerBlock("gold_bars19",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS20 = registerBlock("gold_bars20",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS21 = registerBlock("gold_bars21",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> GOLD_BARS22 = registerBlock("gold_bars22",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS23 = registerBlock("gold_bars23",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS24 = registerBlock("gold_bars24",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS26 = registerBlock("gold_bars26",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS27 = registerBlock("gold_bars27",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS28 = registerBlock("gold_bars28",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS30 = registerBlock("gold_bars30",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS33 = registerBlock("gold_bars33",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_BARS34 = registerBlock("gold_bars34",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> EMERALD_BARS = registerBlock("emerald_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS1 = registerBlock("emerald_bars1",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS2 = registerBlock("emerald_bars2",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS3 = registerBlock("emerald_bars3",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 0));
    public static final RegistryObject<Block> EMERALD_BARS4 = registerBlock("emerald_bars4",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 1));
    public static final RegistryObject<Block> EMERALD_BARS5 = registerBlock("emerald_bars5",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS6 = registerBlock("emerald_bars6",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS7 = registerBlock("emerald_bars7",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 2));
    public static final RegistryObject<Block> EMERALD_BARS8 = registerBlock("emerald_bars8",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 3));
    public static final RegistryObject<Block> EMERALD_BARS9 = registerBlock("emerald_bars9",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS10 = registerBlock("emerald_bars10",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS11 = registerBlock("emerald_bars11",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS12 = registerBlock("emerald_bars12",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS13 = registerBlock("emerald_bars13",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS14 = registerBlock("emerald_bars14",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS15 = registerBlock("emerald_bars15",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS16 = registerBlock("emerald_bars16",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS17 = registerBlock("emerald_bars17",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS18 = registerBlock("emerald_bars18",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS19 = registerBlock("emerald_bars19",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS20 = registerBlock("emerald_bars20",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS21 = registerBlock("emerald_bars21",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS), 4));
    public static final RegistryObject<Block> EMERALD_BARS22 = registerBlock("emerald_bars22",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS23 = registerBlock("emerald_bars23",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS24 = registerBlock("emerald_bars24",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
   public static final RegistryObject<Block> EMERALD_BARS26 = registerBlock("emerald_bars26",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS27 = registerBlock("emerald_bars27",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS28 = registerBlock("emerald_bars28",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS30 = registerBlock("emerald_bars30",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS33 = registerBlock("emerald_bars33",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_BARS34 = registerBlock("emerald_bars34",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> DARKMETAL_BARS = registerBlock("darkmetal_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS1 = registerBlock("darkmetal_bars1",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS2 = registerBlock("darkmetal_bars2",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS3 = registerBlock("darkmetal_bars3",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F), 0));
    public static final RegistryObject<Block> DARKMETAL_BARS4 = registerBlock("darkmetal_bars4",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F), 1));
    public static final RegistryObject<Block> DARKMETAL_BARS5 = registerBlock("darkmetal_bars5",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS6 = registerBlock("darkmetal_bars6",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS7 = registerBlock("darkmetal_bars7",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F), 2));
    public static final RegistryObject<Block> DARKMETAL_BARS8 = registerBlock("darkmetal_bars8",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F), 3));
    public static final RegistryObject<Block> DARKMETAL_BARS9 = registerBlock("darkmetal_bars9",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS10 = registerBlock("darkmetal_bars10",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS11 = registerBlock("darkmetal_bars11",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS12 = registerBlock("darkmetal_bars12",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS13 = registerBlock("darkmetal_bars13",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS14 = registerBlock("darkmetal_bars14",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS15 = registerBlock("darkmetal_bars15",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS16 = registerBlock("darkmetal_bars16",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS17 = registerBlock("darkmetal_bars17",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS18 = registerBlock("darkmetal_bars18",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS19 = registerBlock("darkmetal_bars19",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS20 = registerBlock("darkmetal_bars20",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS21 = registerBlock("darkmetal_bars21",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F), 4));
    public static final RegistryObject<Block> DARKMETAL_BARS22 = registerBlock("darkmetal_bars22",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS23 = registerBlock("darkmetal_bars23",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS24 = registerBlock("darkmetal_bars24",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS26 = registerBlock("darkmetal_bars26",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS27 = registerBlock("darkmetal_bars27",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS28 = registerBlock("darkmetal_bars28",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
   public static final RegistryObject<Block> DARKMETAL_BARS30 = registerBlock("darkmetal_bars30",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
   public static final RegistryObject<Block> DARKMETAL_BARS33 = registerBlock("darkmetal_bars33",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_BARS34 = registerBlock("darkmetal_bars34",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> CLOUD_BARS = registerBlock("cloud_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS1 = registerBlock("cloud_bars1",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS2 = registerBlock("cloud_bars2",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS3 = registerBlock("cloud_bars3",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F), 0));
    public static final RegistryObject<Block> CLOUD_BARS4 = registerBlock("cloud_bars4",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F), 1));
    public static final RegistryObject<Block> CLOUD_BARS5 = registerBlock("cloud_bars5",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS6 = registerBlock("cloud_bars6",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS7 = registerBlock("cloud_bars7",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F), 2));
    public static final RegistryObject<Block> CLOUD_BARS8 = registerBlock("cloud_bars8",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F), 3));
    public static final RegistryObject<Block> CLOUD_BARS9 = registerBlock("cloud_bars9",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS10 = registerBlock("cloud_bars10",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS11 = registerBlock("cloud_bars11",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS12 = registerBlock("cloud_bars12",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS13 = registerBlock("cloud_bars13",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS14 = registerBlock("cloud_bars14",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS15 = registerBlock("cloud_bars15",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS16 = registerBlock("cloud_bars16",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS17 = registerBlock("cloud_bars17",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS18 = registerBlock("cloud_bars18",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS19 = registerBlock("cloud_bars19",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS20 = registerBlock("cloud_bars20",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS21 = registerBlock("cloud_bars21",
            () -> new ArchIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F), 4));
    public static final RegistryObject<Block> CLOUD_BARS22 = registerBlock("cloud_bars22",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS23 = registerBlock("cloud_bars23",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS24 = registerBlock("cloud_bars24",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS26 = registerBlock("cloud_bars26",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS27 = registerBlock("cloud_bars27",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS28 = registerBlock("cloud_bars28",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
     public static final RegistryObject<Block> CLOUD_BARS30 = registerBlock("cloud_bars30",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS33 = registerBlock("cloud_bars33",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_BARS34 = registerBlock("cloud_bars34",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));

//    copper bars
public static final RegistryObject<Block> COPPER_BARS = registerBlock("copper_bars",
        () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                        .strength(3.0F, 6.0F)));
public static final RegistryObject<Block> COPPER_BARS1 = registerBlock("copper_bars1",
        () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                        .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS2 = registerBlock("copper_bars2",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS3 = registerBlock("copper_bars3",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> COPPER_BARS4 = registerBlock("copper_bars4",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> COPPER_BARS5 = registerBlock("copper_bars5",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS6 = registerBlock("copper_bars6",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS7 = registerBlock("copper_bars7",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> COPPER_BARS8 = registerBlock("copper_bars8",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> COPPER_BARS9 = registerBlock("copper_bars9",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS10 = registerBlock("copper_bars10",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS11 = registerBlock("copper_bars11",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS12 = registerBlock("copper_bars12",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS13 = registerBlock("copper_bars13",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS14 = registerBlock("copper_bars14",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS15 = registerBlock("copper_bars15",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS16 = registerBlock("copper_bars16",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS17 = registerBlock("copper_bars17",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS18 = registerBlock("copper_bars18",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS19 = registerBlock("copper_bars19",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS20 = registerBlock("copper_bars20",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS21 = registerBlock("copper_bars21",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> COPPER_BARS22 = registerBlock("copper_bars22",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS23 = registerBlock("copper_bars23",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS24 = registerBlock("copper_bars24",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> COPPER_BARS26 = registerBlock("copper_bars26",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS27 = registerBlock("copper_bars27",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS28 = registerBlock("copper_bars28",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
     public static final RegistryObject<Block> COPPER_BARS30 = registerBlock("copper_bars30",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS33 = registerBlock("copper_bars33",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_BARS34 = registerBlock("copper_bars34",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS1 = registerBlock("exposed_copper_bars1",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS2 = registerBlock("exposed_copper_bars2",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS3 = registerBlock("exposed_copper_bars3",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS4 = registerBlock("exposed_copper_bars4",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS5 = registerBlock("exposed_copper_bars5",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS6 = registerBlock("exposed_copper_bars6",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS7 = registerBlock("exposed_copper_bars7",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS8 = registerBlock("exposed_copper_bars8",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS9 = registerBlock("exposed_copper_bars9",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS10 = registerBlock("exposed_copper_bars10",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS11 = registerBlock("exposed_copper_bars11",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS12 = registerBlock("exposed_copper_bars12",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS13 = registerBlock("exposed_copper_bars13",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS14 = registerBlock("exposed_copper_bars14",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS15 = registerBlock("exposed_copper_bars15",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS16 = registerBlock("exposed_copper_bars16",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS17 = registerBlock("exposed_copper_bars17",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS18 = registerBlock("exposed_copper_bars18",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS19 = registerBlock("exposed_copper_bars19",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS20 = registerBlock("exposed_copper_bars20",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS21 = registerBlock("exposed_copper_bars21",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS22 = registerBlock("exposed_copper_bars22",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS23 = registerBlock("exposed_copper_bars23",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS24 = registerBlock("exposed_copper_bars24",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS26 = registerBlock("exposed_copper_bars26",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS27 = registerBlock("exposed_copper_bars27",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS28 = registerBlock("exposed_copper_bars28",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS30 = registerBlock("exposed_copper_bars30",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS33 = registerBlock("exposed_copper_bars33",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BARS34 = registerBlock("exposed_copper_bars34",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS1 = registerBlock("weathered_copper_bars1",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS2 = registerBlock("weathered_copper_bars2",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS3 = registerBlock("weathered_copper_bars3",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS4 = registerBlock("weathered_copper_bars4",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS5 = registerBlock("weathered_copper_bars5",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS6 = registerBlock("weathered_copper_bars6",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS7 = registerBlock("weathered_copper_bars7",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS8 = registerBlock("weathered_copper_bars8",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS9 = registerBlock("weathered_copper_bars9",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS10 = registerBlock("weathered_copper_bars10",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS11 = registerBlock("weathered_copper_bars11",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS12 = registerBlock("weathered_copper_bars12",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS13 = registerBlock("weathered_copper_bars13",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS14 = registerBlock("weathered_copper_bars14",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS15 = registerBlock("weathered_copper_bars15",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS16 = registerBlock("weathered_copper_bars16",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS17 = registerBlock("weathered_copper_bars17",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS18 = registerBlock("weathered_copper_bars18",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS19 = registerBlock("weathered_copper_bars19",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS20 = registerBlock("weathered_copper_bars20",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS21 = registerBlock("weathered_copper_bars21",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS22 = registerBlock("weathered_copper_bars22",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS23 = registerBlock("weathered_copper_bars23",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS24 = registerBlock("weathered_copper_bars24",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WEATHERED_COPPER_BARS26 = registerBlock("weathered_copper_bars26",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS27 = registerBlock("weathered_copper_bars27",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS28 = registerBlock("weathered_copper_bars28",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS30 = registerBlock("weathered_copper_bars30",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS33 = registerBlock("weathered_copper_bars33",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BARS34 = registerBlock("weathered_copper_bars34",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS1 = registerBlock("oxidized_copper_bars1",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS2 = registerBlock("oxidized_copper_bars2",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS3 = registerBlock("oxidized_copper_bars3",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS4 = registerBlock("oxidized_copper_bars4",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS5 = registerBlock("oxidized_copper_bars5",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS6 = registerBlock("oxidized_copper_bars6",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS7 = registerBlock("oxidized_copper_bars7",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS8 = registerBlock("oxidized_copper_bars8",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS9 = registerBlock("oxidized_copper_bars9",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS10 = registerBlock("oxidized_copper_bars10",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS11 = registerBlock("oxidized_copper_bars11",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS12 = registerBlock("oxidized_copper_bars12",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS13 = registerBlock("oxidized_copper_bars13",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS14 = registerBlock("oxidized_copper_bars14",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS15 = registerBlock("oxidized_copper_bars15",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS16 = registerBlock("oxidized_copper_bars16",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS17 = registerBlock("oxidized_copper_bars17",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS18 = registerBlock("oxidized_copper_bars18",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS19 = registerBlock("oxidized_copper_bars19",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS20 = registerBlock("oxidized_copper_bars20",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS21 = registerBlock("oxidized_copper_bars21",
            () -> new ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS22 = registerBlock("oxidized_copper_bars22",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS23 = registerBlock("oxidized_copper_bars23",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS24 = registerBlock("oxidized_copper_bars24",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS26 = registerBlock("oxidized_copper_bars26",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS27 = registerBlock("oxidized_copper_bars27",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS28 = registerBlock("oxidized_copper_bars28",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS30 = registerBlock("oxidized_copper_bars30",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> OXIDIZED_COPPER_BARS33 = registerBlock("oxidized_copper_bars33",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BARS34 = registerBlock("oxidized_copper_bars34",
            () -> new BMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                    .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS1 = registerBlock("waxed_copper_bars1",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS2 = registerBlock("waxed_copper_bars2",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS3 = registerBlock("waxed_copper_bars3",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> WAXED_COPPER_BARS4 = registerBlock("waxed_copper_bars4",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> WAXED_COPPER_BARS5 = registerBlock("waxed_copper_bars5",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS6 = registerBlock("waxed_copper_bars6",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS7 = registerBlock("waxed_copper_bars7",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> WAXED_COPPER_BARS8 = registerBlock("waxed_copper_bars8",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> WAXED_COPPER_BARS9 = registerBlock("waxed_copper_bars9",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS10 = registerBlock("waxed_copper_bars10",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS11 = registerBlock("waxed_copper_bars11",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS12 = registerBlock("waxed_copper_bars12",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS13 = registerBlock("waxed_copper_bars13",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS14 = registerBlock("waxed_copper_bars14",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS15 = registerBlock("waxed_copper_bars15",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS16 = registerBlock("waxed_copper_bars16",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS17 = registerBlock("waxed_copper_bars17",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS18 = registerBlock("waxed_copper_bars18",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS19 = registerBlock("waxed_copper_bars19",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS20 = registerBlock("waxed_copper_bars20",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS21 = registerBlock("waxed_copper_bars21",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> WAXED_COPPER_BARS22 = registerBlock("waxed_copper_bars22",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS23 = registerBlock("waxed_copper_bars23",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS24 = registerBlock("waxed_copper_bars24",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS26 = registerBlock("waxed_copper_bars26",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS27 = registerBlock("waxed_copper_bars27",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS28 = registerBlock("waxed_copper_bars28",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_COPPER_BARS30 = registerBlock("waxed_copper_bars30",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_COPPER_BARS33 = registerBlock("waxed_copper_bars33",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_BARS34 = registerBlock("waxed_copper_bars34",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS1 = registerBlock("waxed_exposed_copper_bars1",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS2 = registerBlock("waxed_exposed_copper_bars2",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS3 = registerBlock("waxed_exposed_copper_bars3",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS4 = registerBlock("waxed_exposed_copper_bars4",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F),1 ));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS5 = registerBlock("waxed_exposed_copper_bars5",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS6 = registerBlock("waxed_exposed_copper_bars6",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS7 = registerBlock("waxed_exposed_copper_bars7",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS8 = registerBlock("waxed_exposed_copper_bars8",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS9 = registerBlock("waxed_exposed_copper_bars9",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS10 = registerBlock("waxed_exposed_copper_bars10",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS11 = registerBlock("waxed_exposed_copper_bars11",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS12 = registerBlock("waxed_exposed_copper_bars12",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS13 = registerBlock("waxed_exposed_copper_bars13",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS14 = registerBlock("waxed_exposed_copper_bars14",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS15 = registerBlock("waxed_exposed_copper_bars15",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS16 = registerBlock("waxed_exposed_copper_bars16",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS17 = registerBlock("waxed_exposed_copper_bars17",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS18 = registerBlock("waxed_exposed_copper_bars18",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS19 = registerBlock("waxed_exposed_copper_bars19",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS20 = registerBlock("waxed_exposed_copper_bars20",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS21 = registerBlock("waxed_exposed_copper_bars21",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS22 = registerBlock("waxed_exposed_copper_bars22",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS23 = registerBlock("waxed_exposed_copper_bars23",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS24 = registerBlock("waxed_exposed_copper_bars24",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS26 = registerBlock("waxed_exposed_copper_bars26",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS27 = registerBlock("waxed_exposed_copper_bars27",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS28 = registerBlock("waxed_exposed_copper_bars28",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS30 = registerBlock("waxed_exposed_copper_bars30",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS33 = registerBlock("waxed_exposed_copper_bars33",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BARS34 = registerBlock("waxed_exposed_copper_bars34",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS1 = registerBlock("waxed_weathered_copper_bars1",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS2 = registerBlock("waxed_weathered_copper_bars2",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS3 = registerBlock("waxed_weathered_copper_bars3",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS4 = registerBlock("waxed_weathered_copper_bars4",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS5 = registerBlock("waxed_weathered_copper_bars5",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS6 = registerBlock("waxed_weathered_copper_bars6",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS7 = registerBlock("waxed_weathered_copper_bars7",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS8 = registerBlock("waxed_weathered_copper_bars8",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS9 = registerBlock("waxed_weathered_copper_bars9",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS10 = registerBlock("waxed_weathered_copper_bars10",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS11 = registerBlock("waxed_weathered_copper_bars11",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS12 = registerBlock("waxed_weathered_copper_bars12",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS13 = registerBlock("waxed_weathered_copper_bars13",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS14 = registerBlock("waxed_weathered_copper_bars14",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS15 = registerBlock("waxed_weathered_copper_bars15",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS16 = registerBlock("waxed_weathered_copper_bars16",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS17 = registerBlock("waxed_weathered_copper_bars17",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS18 = registerBlock("waxed_weathered_copper_bars18",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS19 = registerBlock("waxed_weathered_copper_bars19",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS20 = registerBlock("waxed_weathered_copper_bars20",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS21 = registerBlock("waxed_weathered_copper_bars21",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS22 = registerBlock("waxed_weathered_copper_bars22",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS23 = registerBlock("waxed_weathered_copper_bars23",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS24 = registerBlock("waxed_weathered_copper_bars24",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS26 = registerBlock("waxed_weathered_copper_bars26",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS27 = registerBlock("waxed_weathered_copper_bars27",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS28 = registerBlock("waxed_weathered_copper_bars28",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS30 = registerBlock("waxed_weathered_copper_bars30",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS33 = registerBlock("waxed_weathered_copper_bars33",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BARS34 = registerBlock("waxed_weathered_copper_bars34",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS1 = registerBlock("waxed_oxidized_copper_bars1",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS2 = registerBlock("waxed_oxidized_copper_bars2",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS3 = registerBlock("waxed_oxidized_copper_bars3",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 0));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS4 = registerBlock("waxed_oxidized_copper_bars4",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 1));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS5 = registerBlock("waxed_oxidized_copper_bars5",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS6 = registerBlock("waxed_oxidized_copper_bars6",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS7 = registerBlock("waxed_oxidized_copper_bars7",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 2));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS8 = registerBlock("waxed_oxidized_copper_bars8",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 3));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS9 = registerBlock("waxed_oxidized_copper_bars9",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS10 = registerBlock("waxed_oxidized_copper_bars10",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS11 = registerBlock("waxed_oxidized_copper_bars11",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS12 = registerBlock("waxed_oxidized_copper_bars12",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS13 = registerBlock("waxed_oxidized_copper_bars13",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS14 = registerBlock("waxed_oxidized_copper_bars14",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS15 = registerBlock("waxed_oxidized_copper_bars15",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS16 = registerBlock("waxed_oxidized_copper_bars16",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS17 = registerBlock("waxed_oxidized_copper_bars17",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS18 = registerBlock("waxed_oxidized_copper_bars18",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS19 = registerBlock("waxed_oxidized_copper_bars19",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS20 = registerBlock("waxed_oxidized_copper_bars20",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS21 = registerBlock("waxed_oxidized_copper_bars21",
            () -> new ArchBMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F), 4));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS22 = registerBlock("waxed_oxidized_copper_bars22",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS23 = registerBlock("waxed_oxidized_copper_bars23",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS24 = registerBlock("waxed_oxidized_copper_bars24",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
   public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS26 = registerBlock("waxed_oxidized_copper_bars26",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS27 = registerBlock("waxed_oxidized_copper_bars27",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS28 = registerBlock("waxed_oxidized_copper_bars28",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS30 = registerBlock("waxed_oxidized_copper_bars30",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS33 = registerBlock("waxed_oxidized_copper_bars33",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BARS34 = registerBlock("waxed_oxidized_copper_bars34",
            () -> new BMWaxedBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    //panels
    public static final RegistryObject<Block> IRON_PANEL1 = registerBlock("iron_panel1",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_PANEL2 = registerBlock("iron_panel2",
            () -> new TemplatePanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> IRON_PANEL3 = registerBlock("iron_panel3",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> GOLD_PANEL1 = registerBlock("gold_panel1",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_PANEL2 = registerBlock("gold_panel2",
            () -> new TemplatePanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> GOLD_PANEL3 = registerBlock("gold_panel3",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> EMERALD_PANEL1 = registerBlock("emerald_panel1",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_PANEL2 = registerBlock("emerald_panel2",
            () -> new TemplatePanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> EMERALD_PANEL3 = registerBlock("emerald_panel3",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> DARKMETAL_PANEL1 = registerBlock("darkmetal_panel1",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_PANEL2 = registerBlock("darkmetal_panel2",
            () -> new TemplatePanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> DARKMETAL_PANEL3 = registerBlock("darkmetal_panel3",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> CLOUD_PANEL1 = registerBlock("cloud_panel1",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_PANEL2 = registerBlock("cloud_panel2",
            () -> new TemplatePanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> CLOUD_PANEL3 = registerBlock("cloud_panel3",
            () -> new PanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(3.0F, 3.0F)));

    //copper panels
    public static final RegistryObject<Block> COPPER_PANEL1 = registerBlock("copper_panel1",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_PANEL2 = registerBlock("copper_panel2",
            () -> new BMWeatheringCopperPanelBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> COPPER_PANEL3 = registerBlock("copper_panel3",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> EXPOSED_COPPER_PANEL1 = registerBlock("exposed_copper_panel1",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_PANEL2 = registerBlock("exposed_copper_panel2",
            () -> new BMWeatheringCopperPanelBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> EXPOSED_COPPER_PANEL3 = registerBlock("exposed_copper_panel3",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WEATHERED_COPPER_PANEL1 = registerBlock("weathered_copper_panel1",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_PANEL2 = registerBlock("weathered_copper_panel2",
            () -> new BMWeatheringCopperPanelBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WEATHERED_COPPER_PANEL3 = registerBlock("weathered_copper_panel3",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> OXIDIZED_COPPER_PANEL1 = registerBlock("oxidized_copper_panel1",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_PANEL2 = registerBlock("oxidized_copper_panel2",
            () -> new BMWeatheringCopperPanelBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_PANEL3 = registerBlock("oxidized_copper_panel3",
            () -> new BMWeatheringCopperPanelBigHoleBlock(BMWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_COPPER_PANEL1 = registerBlock("waxed_copper_panel1",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_PANEL2 = registerBlock("waxed_copper_panel2",
            () -> new BMWaxedPanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_COPPER_PANEL3 = registerBlock("waxed_copper_panel3",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_PANEL1 = registerBlock("waxed_exposed_copper_panel1",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_PANEL2 = registerBlock("waxed_exposed_copper_panel2",
            () -> new BMWaxedPanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_PANEL3 = registerBlock("waxed_exposed_copper_panel3",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_PANEL1 = registerBlock("waxed_weathered_copper_panel1",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_PANEL2 = registerBlock("waxed_weathered_copper_panel2",
            () -> new BMWaxedPanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_PANEL3 = registerBlock("waxed_weathered_copper_panel3",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_PANEL1 = registerBlock("waxed_oxidized_copper_panel1",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_PANEL2 = registerBlock("waxed_oxidized_copper_panel2",
            () -> new BMWaxedPanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_PANEL3 = registerBlock("waxed_oxidized_copper_panel3",
            () -> new BMWaxedPanelBigHoleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).sound(SoundType.COPPER)
                            .strength(3.0F, 6.0F)));

    //Blocks end here
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BMItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static final Map<String, RegistryObject<Block>> BLOCK_MAP = new HashMap<>();
    static {
        BLOCKS.getEntries().forEach(entry ->
                BLOCK_MAP.put(entry.getId().getPath(), entry)
        );
    }

    public static RegistryObject<Block> getByName(String name) {
        return BLOCK_MAP.get(name);

    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
