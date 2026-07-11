package net.satan.deco_bm.block;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.satan.deco_bm.block.util.BMWeatheringCopper;

public class ArchBMWeatheringCopperBarsBlock extends BMWeatheringCopperBarsBlock {
    public final int archVar;
    private final Object2IntMap<BlockState> stateToIndex = new Object2IntOpenHashMap<>();
    protected final VoxelShape[] archCollisionShapeByIndex;


    public ArchBMWeatheringCopperBarsBlock(BMWeatheringCopper.WeatherState weatherState, Properties properties, int archVariation) {
        super(weatherState, properties);
        this.archVar = archVariation;
        this.archCollisionShapeByIndex = archVar==0 ? this.makeArch() : archVar==1 ? this.makeArchAlt()
        : archVar==2 ? this.makeReversedArch() : archVar==3 ? this.makeReversedArchAlt()
        : archVar==4 ? this.makeStraightHorizontalBars()
        : makeShapes(1,1, 16,16,16);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter p_52358_, BlockPos p_52359_, CollisionContext p_52360_) {
        return this.archCollisionShapeByIndex[this.getArchIndex(state)];
    }

    public VoxelShape[] makeArch() {
        VoxelShape post = Block.box(7, 0, 7, 9, 16, 9);

        VoxelShape east = Shapes.or(
                Block.box(7, 0, 0, 9, 13, 2),
                Block.box(7, 13, 0, 9, 16, 9)
        );
        VoxelShape north = Shapes.or(
                Block.box(7, 0, 14, 9, 13, 16),
                Block.box(7, 13, 7, 9, 16, 16)
        );
        VoxelShape south = Shapes.or(
                Block.box(0, 0, 7, 2, 13, 9),
                Block.box(0, 13, 7, 9, 16, 9)
        );
        VoxelShape west = Shapes.or(
                Block.box(14, 0, 7, 16, 13, 9),
                Block.box(7, 13, 7, 16, 16, 9)
        );
        VoxelShape voxelshape5 = Shapes.or(east, west);
        VoxelShape voxelshape6 = Shapes.or(north, south);

        return  new VoxelShape[]{ post, north, south, voxelshape6, east,

                Shapes.or(north, east), Shapes.or(south, east),
                Shapes.or(voxelshape6, east), west,
                Shapes.or(north, west), Shapes.or(south, west),
                Shapes.or(voxelshape6, west), voxelshape5,
                Shapes.or(north, voxelshape5), Shapes.or(south, voxelshape5),
                Shapes.or(voxelshape6, voxelshape5)
        };
    }

    public VoxelShape[] makeArchAlt() {
        VoxelShape post = Block.box(7, 0, 7, 9, 16, 9);

        VoxelShape east = Shapes.or(
                Block.box(7, 0, 7, 9, 13, 9),
                Block.box(7, 13, 7, 9, 16, 16)
        );
        VoxelShape north = Shapes.or(
                Block.box(7, 0, 7, 9, 13, 9),
                Block.box(7, 13, 0, 9, 16, 9)
        );
        VoxelShape south = Shapes.or(
                Block.box(7, 0, 7, 9, 13, 9),
                Block.box(7, 13, 7, 16, 16, 9)
        );
        VoxelShape west = Shapes.or(
                Block.box(7, 0, 7, 9, 13, 9),
                Block.box(0, 13, 7, 9, 16, 9)
        );
        VoxelShape voxelshape5 = Shapes.or(east, west);
        VoxelShape voxelshape6 = Shapes.or(north, south);

        return new VoxelShape[]{post, east, west, voxelshape5, north,

                Shapes.or(east, north), Shapes.or(west, north),
                Shapes.or(voxelshape5, north), south,
                Shapes.or(east, south), Shapes.or(west, south),
                Shapes.or(voxelshape5, south), voxelshape6,
                Shapes.or(east, voxelshape6), Shapes.or(west, voxelshape6),
                Shapes.or(voxelshape5, voxelshape6)
        };
    }

    public VoxelShape[] makeReversedArch() {
        VoxelShape post = Block.box(7, 0, 7, 9, 16, 9);

        VoxelShape east = Shapes.or(
                Block.box(7, 3, 0, 9, 16, 2),
                Block.box(7, 0, 0, 9, 3, 9)
        );
        VoxelShape north = Shapes.or(
                Block.box(7, 3, 14, 9, 16, 16),
                Block.box(7, 0, 7, 9, 3, 16)
        );
        VoxelShape south = Shapes.or(
                Block.box(0, 3, 7, 2, 16, 9),
                Block.box(0, 0, 7, 9, 3, 9)
        );
        VoxelShape west = Shapes.or(
                Block.box(14, 3, 7, 16, 16, 9),
                Block.box(7, 0, 7, 16, 3, 9)
        );
        VoxelShape voxelshape5 = Shapes.or(east, west);
        VoxelShape voxelshape6 = Shapes.or(north, south);

        return  new VoxelShape[]{ post, north, south, voxelshape6, east,

                Shapes.or(north, east), Shapes.or(south, east),
                Shapes.or(voxelshape6, east), west,
                Shapes.or(north, west), Shapes.or(south, west),
                Shapes.or(voxelshape6, west), voxelshape5,
                Shapes.or(north, voxelshape5), Shapes.or(south, voxelshape5),
                Shapes.or(voxelshape6, voxelshape5)
        };
    }

    public VoxelShape[] makeReversedArchAlt() {
        VoxelShape post = Block.box(7, 0, 7, 9, 16, 9);

        VoxelShape east = Shapes.or(
                Block.box(7, 3, 7, 9, 16, 9),
                Block.box(7, 0, 7, 9, 3, 16)
        );
        VoxelShape north = Shapes.or(
                Block.box(7, 3, 7, 9, 16, 9),
                Block.box(7, 0, 0, 9, 3, 9)
        );
        VoxelShape south = Shapes.or(
                Block.box(7, 3, 7, 9, 16, 9),
                Block.box(7, 0, 7, 16, 3, 9)
        );
        VoxelShape west = Shapes.or(
                Block.box(7, 3, 7, 9, 16, 9),
                Block.box(0, 0, 7, 9, 3, 9)
        );
        VoxelShape voxelshape5 = Shapes.or(east, west);
        VoxelShape voxelshape6 = Shapes.or(north, south);

        return new VoxelShape[]{post, east, west, voxelshape5, north,

                Shapes.or(east, north), Shapes.or(west, north),
                Shapes.or(voxelshape5, north), south,
                Shapes.or(east, south), Shapes.or(west, south),
                Shapes.or(voxelshape5, south), voxelshape6,
                Shapes.or(east, voxelshape6), Shapes.or(west, voxelshape6),
                Shapes.or(voxelshape5, voxelshape6)
        };
    }

    public VoxelShape[] makeStraightHorizontalBars() {
        VoxelShape post = Block.box(7, 0, 7, 9, 16, 9);

        VoxelShape east = Block.box(7, 2, 0, 9, 14, 9);
        VoxelShape north = Block.box(7, 2, 7, 9, 14, 16);
        VoxelShape south = Block.box(0, 2, 7, 9, 14, 9);
        VoxelShape west = Block.box(7, 2, 7, 16, 14, 9);

        VoxelShape voxelshape5 = Shapes.or(east, west);
        VoxelShape voxelshape6 = Shapes.or(north, south);
        return new VoxelShape[]{
                post, north, south, voxelshape6, east,

                Shapes.or(north, east), Shapes.or(south, east),
                Shapes.or(voxelshape6, east), west,
                Shapes.or(north, west), Shapes.or(south, west),
                Shapes.or(voxelshape6, west), voxelshape5,
                Shapes.or(north, voxelshape5), Shapes.or(south, voxelshape5),
                Shapes.or(voxelshape6, voxelshape5)
        };
    }

    public static int indexFor(Direction p_52344_) {
        return 1 << p_52344_.get2DDataValue();
    }

    public int getArchIndex(BlockState p_52364_) {
        return this.stateToIndex.computeIntIfAbsent(p_52364_, (p_52366_) -> {
            int i = 0;
            if (p_52366_.getValue(NORTH)) {
                i |= indexFor(Direction.NORTH);
            }

            if (p_52366_.getValue(EAST)) {
                i |= indexFor(Direction.EAST);
            }

            if (p_52366_.getValue(SOUTH)) {
                i |= indexFor(Direction.SOUTH);
            }

            if (p_52366_.getValue(WEST)) {
                i |= indexFor(Direction.WEST);
            }

            return i;
        });
    }

}
