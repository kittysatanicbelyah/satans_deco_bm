package net.satan.deco_bm.block.util;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.EnumProperty;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nullable;

import java.util.Optional;
import java.util.function.IntFunction;

public enum VitrageDye implements StringRepresentable {
    NONE (0, "none"),
    WHITE(1, "white"),
    ORANGE(2, "orange"),
    MAGENTA(3, "magenta"),
    LIGHT_BLUE(4, "light_blue"),
    YELLOW(5, "yellow"),
    LIME(6, "lime"),
    PINK(7, "pink"),
    GRAY(8, "gray"),
    LIGHT_GRAY(9, "light_gray"),
    CYAN(10, "cyan"),
    PURPLE(11, "purple"),
    BLUE(12, "blue"),
    BROWN(13, "brown"),
    GREEN(14, "green"),
    RED(15, "red"),
    BLACK(16, "black");
    public static final IntFunction<VitrageDye> BY_ID = ByIdMap.continuous(VitrageDye::getId, values(), ByIdMap.OutOfBoundsStrategy.ZERO);
    public static final StringRepresentable.EnumCodec<VitrageDye> CODEC = StringRepresentable.fromEnum(VitrageDye::values);

    public final int id;
    public final String name;

    VitrageDye(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {return this.id;}
    public static VitrageDye getById(int id) {return BY_ID.apply(id);}

    public static VitrageDye getDye(BlockState state) {
        if (state.hasProperty(VITRAGE_DYE)) {
            return state.getValue(VITRAGE_DYE);
        }
        return VitrageDye.NONE;
    }

    public String toString() {return this.name;}

    @Nullable
    @Contract("_,!null->!null;_,null->_")
    public static VitrageDye getByName(String name, @Nullable VitrageDye dye) {
        VitrageDye dyecolor = CODEC.byName(name);
        return dyecolor != null ? dyecolor : dye;
    }
    public String getSerializedName() {
        return this.name;
    }

    public static final EnumProperty<VitrageDye> VITRAGE_DYE = EnumProperty.create("vitrage_dye", VitrageDye.class);

    public static final BiMap<VitrageDye, Item> DYE_TO_VANILLA_PANES;
    static { DYE_TO_VANILLA_PANES = ImmutableBiMap.<VitrageDye, Item>builder()
                .put(VitrageDye.NONE, Items.GLASS_PANE)
                .put(VitrageDye.WHITE, Items.WHITE_STAINED_GLASS_PANE)
                .put(VitrageDye.ORANGE, Items.ORANGE_STAINED_GLASS_PANE)
                .put(VitrageDye.MAGENTA, Items.MAGENTA_STAINED_GLASS_PANE)
                .put(VitrageDye.LIGHT_BLUE, Items.LIGHT_BLUE_STAINED_GLASS_PANE)
                .put(VitrageDye.YELLOW, Items.YELLOW_STAINED_GLASS_PANE)
                .put(VitrageDye.LIME, Items.LIME_STAINED_GLASS_PANE)
                .put(VitrageDye.PINK, Items.PINK_STAINED_GLASS_PANE)
                .put(VitrageDye.GRAY, Items.GRAY_STAINED_GLASS_PANE)
                .put(VitrageDye.LIGHT_GRAY, Items.LIGHT_GRAY_STAINED_GLASS_PANE)
                .put(VitrageDye.CYAN, Items.CYAN_STAINED_GLASS_PANE)
                .put(VitrageDye.PURPLE, Items.PURPLE_STAINED_GLASS_PANE)
                .put(VitrageDye.BLUE, Items.BLUE_STAINED_GLASS_PANE)
                .put(VitrageDye.BROWN, Items.BROWN_STAINED_GLASS_PANE)
                .put(VitrageDye.GREEN, Items.GREEN_STAINED_GLASS_PANE)
                .put(VitrageDye.RED, Items.RED_STAINED_GLASS_PANE)
                .put(VitrageDye.BLACK, Items.BLACK_STAINED_GLASS_PANE)
                .build();
    }
    public static final BiMap<Item, VitrageDye> VANILLA_PANES_TO_DYE;
    static {VANILLA_PANES_TO_DYE = DYE_TO_VANILLA_PANES.inverse();}

  public static Optional<Item> getStainedPane(VitrageDye dye) {
        return Optional.ofNullable(DYE_TO_VANILLA_PANES.get(dye));
    }
   public static Optional<VitrageDye> getDyeByPane(Item block) {
        return Optional.ofNullable(VANILLA_PANES_TO_DYE.get(block));
    }

    public static final BiMap<VitrageDye, Item> DYE_TO_VANILLA_GLASS;
    static { DYE_TO_VANILLA_GLASS = ImmutableBiMap.<VitrageDye, Item>builder()
            .put(VitrageDye.NONE, Items.GLASS)
            .put(VitrageDye.WHITE, Items.WHITE_STAINED_GLASS)
            .put(VitrageDye.ORANGE, Items.ORANGE_STAINED_GLASS)
            .put(VitrageDye.MAGENTA, Items.MAGENTA_STAINED_GLASS)
            .put(VitrageDye.LIGHT_BLUE, Items.LIGHT_BLUE_STAINED_GLASS)
            .put(VitrageDye.YELLOW, Items.YELLOW_STAINED_GLASS)
            .put(VitrageDye.LIME, Items.LIME_STAINED_GLASS)
            .put(VitrageDye.PINK, Items.PINK_STAINED_GLASS)
            .put(VitrageDye.GRAY, Items.GRAY_STAINED_GLASS)
            .put(VitrageDye.LIGHT_GRAY, Items.LIGHT_GRAY_STAINED_GLASS)
            .put(VitrageDye.CYAN, Items.CYAN_STAINED_GLASS)
            .put(VitrageDye.PURPLE, Items.PURPLE_STAINED_GLASS)
            .put(VitrageDye.BLUE, Items.BLUE_STAINED_GLASS)
            .put(VitrageDye.BROWN, Items.BROWN_STAINED_GLASS)
            .put(VitrageDye.GREEN, Items.GREEN_STAINED_GLASS)
            .put(VitrageDye.RED, Items.RED_STAINED_GLASS)
            .put(VitrageDye.BLACK, Items.BLACK_STAINED_GLASS)
            .build();
    }
    public static final BiMap<Item, VitrageDye> VANILLA_GLASS_TO_DYE;
    static {VANILLA_GLASS_TO_DYE = DYE_TO_VANILLA_GLASS.inverse();}

    public static Optional<Item> getStainedGlass(VitrageDye dye) {
        return Optional.ofNullable(DYE_TO_VANILLA_GLASS.get(dye));
    }
    public static Optional<VitrageDye> getDyeByGlass(Item block) {
        return Optional.ofNullable(VANILLA_GLASS_TO_DYE.get(block));
    }

    public static final BiMap<VitrageDye, String> DYE_TO_VANILLA_GLASS_STRING;
    static { DYE_TO_VANILLA_GLASS_STRING = ImmutableBiMap.<VitrageDye, String>builder()
            .put(VitrageDye.NONE, "block/glass")
            .put(VitrageDye.WHITE, "block/white_stained_glass")
            .put(VitrageDye.ORANGE, "block/orange_stained_glass")
            .put(VitrageDye.MAGENTA, "block/magenta_stained_glass")
            .put(VitrageDye.LIGHT_BLUE, "block/light_blue_stained_glass")
            .put(VitrageDye.YELLOW, "block/yellow_stained_glass")
            .put(VitrageDye.LIME,  "block/lime_stained_glass")
            .put(VitrageDye.PINK, "block/pink_stained_glass")
            .put(VitrageDye.GRAY, "block/gray_stained_glass")
            .put(VitrageDye.LIGHT_GRAY, "block/light_gray_stained_glass")
            .put(VitrageDye.CYAN,  "block/cyan_stained_glass")
            .put(VitrageDye.PURPLE, "block/purple_stained_glass")
            .put(VitrageDye.BLUE, "block/blue_stained_glass")
            .put(VitrageDye.BROWN, "block/brown_stained_glass")
            .put(VitrageDye.GREEN, "block/green_stained_glass")
            .put(VitrageDye.RED, "block/red_stained_glass")
            .put(VitrageDye.BLACK, "block/black_stained_glass")
            .build();
    }

    public static Optional<String> getTextureGlass(VitrageDye dye) {
        return Optional.ofNullable(DYE_TO_VANILLA_GLASS_STRING.get(dye));
    }
    public static final BiMap<VitrageDye, Item> DYE_TO_VANILLA_DYE;
    static { DYE_TO_VANILLA_DYE = ImmutableBiMap.<VitrageDye, Item>builder()
            .put(VitrageDye.WHITE, Items.WHITE_DYE)
            .put(VitrageDye.ORANGE, Items.ORANGE_DYE)
            .put(VitrageDye.MAGENTA, Items.MAGENTA_DYE)
            .put(VitrageDye.LIGHT_BLUE, Items.LIGHT_BLUE_DYE)
            .put(VitrageDye.YELLOW, Items.YELLOW_DYE)
            .put(VitrageDye.LIME, Items.LIME_DYE)
            .put(VitrageDye.PINK, Items.PINK_DYE)
            .put(VitrageDye.GRAY, Items.GRAY_DYE)
            .put(VitrageDye.LIGHT_GRAY, Items.LIGHT_GRAY_DYE)
            .put(VitrageDye.CYAN, Items.CYAN_DYE)
            .put(VitrageDye.PURPLE, Items.PURPLE_DYE)
            .put(VitrageDye.BLUE, Items.BLUE_DYE)
            .put(VitrageDye.BROWN, Items.BROWN_DYE)
            .put(VitrageDye.GREEN, Items.GREEN_DYE)
            .put(VitrageDye.RED, Items.RED_DYE)
            .put(VitrageDye.BLACK, Items.BLACK_DYE)
            .build();
    }

    public static Optional<Item> getVanillaDye(VitrageDye dye) {
        return Optional.ofNullable(DYE_TO_VANILLA_DYE.get(dye));
    }

}

