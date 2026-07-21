package net.satan.deco_bm.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PanelBigHoleBlock extends TemplatePanelBlock{

    public PanelBigHoleBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.X).setValue(ROTATION,
                0).setValue(WATERLOGGED, false));
    }

    @Override
    public ImmutableMap<BlockState, VoxelShape> makeShapes() {
        return this.getShapeForEachState(state -> {
            if (state.getValue(ROTATION) == 0) {
                return switch (state.getValue(AXIS)) {
                    case Z -> Shapes.or(
                            box(7, 11, 0, 9, 16, 16),
                            box(7, 0, 11, 9, 11, 16));
                    default -> Shapes.or(
                            box(0, 11, 7, 16, 16, 9),
                            box(0, 0, 7, 5, 11, 9));
                };
            } else if (state.getValue(ROTATION) == 1) {
                return switch (state.getValue(AXIS)) {
                    case Z -> Shapes.or(
                            box(7, 11, 0, 9, 16, 16),
                            box(7, 0, 0, 9, 11, 5));
                    default -> Shapes.or(
                            box(0, 11, 7, 16, 16, 9),
                            box(11, 0, 7, 16, 11, 9));
                };
            } else if (state.getValue(ROTATION) == 2) {
                return switch (state.getValue(AXIS)) {
                    case Z -> Shapes.or(
                            box(7, 0, 0, 9, 5, 16),
                            box(7, 5, 0, 9, 16, 5));
                    default -> Shapes.or(
                            box(0, 0, 7, 16, 5, 9),
                            box(11, 5, 7, 16, 16, 9));
                };
            } else if (state.getValue(ROTATION) == 3) {
                return switch (state.getValue(AXIS)) {
                    case Z -> Shapes.or(
                            box(7, 0, 11, 9, 16, 16),
                            box(7, 0, 0, 9, 5, 11));
                    default -> Shapes.or(
                            box(0, 0, 7, 5, 16, 9),
                            box(5, 0, 7, 16, 5, 9));
                };
            }
            return switch (state.getValue(AXIS)) {
                case Z -> Shapes.or(
                        box(0, 11, 7, 16, 16, 9),
                        box(0, 0, 7, 11, 11, 9));
                default -> Shapes.or(
                       box(7, 11, 0, 9, 16, 16),
                        box(7, 0, 0, 9, 11, 11));
            };
        });
    }
}
