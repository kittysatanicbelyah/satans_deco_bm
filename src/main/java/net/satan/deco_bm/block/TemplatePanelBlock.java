package net.satan.deco_bm.block;

import com.google.common.collect.ImmutableMap;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.satan.deco_bm.register.BMSounds;

import java.util.Objects;

public class TemplatePanelBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.HORIZONTAL_AXIS;
    public static final IntegerProperty ROTATION = IntegerProperty.create("rotation", 0, 3);
    private final ImmutableMap<BlockState, VoxelShape> shapes = this.makeShapes();

    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public TemplatePanelBlock (Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.X).setValue(ROTATION,
                0).setValue(WATERLOGGED, false).setValue(POWERED, false));
    }
    public ImmutableMap<BlockState, VoxelShape> makeShapes() {
        return this.getShapeForEachState(state -> {
            if (state.getValue(ROTATION) == 0) {
                return switch (state.getValue(AXIS)) {
                    case Z -> box(7, 0, 0, 9, 16, 16);
                    default -> box(0, 0, 7, 16, 16, 9);
                };
            } else if (state.getValue(ROTATION) == 1) {
                return switch (state.getValue(AXIS)) {
                    case Z -> box(7, 0, 0, 9, 16, 16);
                    default -> box(0, 0, 7, 16, 16, 9);
                };
            } else if (state.getValue(ROTATION) == 2) {
                return switch (state.getValue(AXIS)) {
                    case Z -> box(7, 0, 0, 9, 16, 16);
                    default -> box(0, 0, 7, 16, 16, 9);
                };
            } else if (state.getValue(ROTATION) == 3) {
                return switch (state.getValue(AXIS)) {
                    case Z -> box(7, 0, 0, 9, 16, 16);
                    default -> box(0, 0, 7, 16, 16, 9);
                };
            }
            return switch (state.getValue(AXIS)) {
                case Z -> box(7, 0, 0, 9, 16, 16);
                default -> box(0, 0, 7, 16, 16, 9);
            };
        });
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return shapes.get(state);
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(AXIS, ROTATION, WATERLOGGED, POWERED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
        return Objects.requireNonNull(super.getStateForPlacement(context)).setValue(AXIS, context.getHorizontalDirection().getClockWise().getAxis())
                .setValue(WATERLOGGED, flag);

    }

    @Override
    public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
        return true;
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side);
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        switch (rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch (state.getValue(AXIS)) {
                    case Z:
                        return state.setValue(AXIS, Direction.Axis.X);
                    case X:
                        return state.setValue(AXIS, Direction.Axis.Z);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player entity, BlockHitResult hit) {
        if (!entity.isShiftKeyDown())  {
            level.playSound(entity, pos, BMSounds.PANEL_ROTATES.get(), SoundSource.BLOCKS, 0.75F, 0.75F);
           level.setBlock(pos, state.setValue(ROTATION, defineNextRotation(state.getValue(ROTATION))), 4);
           return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, moving);
        if (!level.isClientSide) {
            boolean isPowered = level.hasNeighborSignal(pos);
            boolean wasPowered = state.getValue(POWERED);
            if (isPowered && !wasPowered) {
                level.setBlock(pos, state.setValue(ROTATION, defineNextRotation(state.getValue(ROTATION))).setValue(POWERED, true), 2);
                level.playSound((Entity) null, pos, BMSounds.PANEL_ROTATES.get(), SoundSource.BLOCKS, 0.75F, 0.75F);
            }
            else if (!isPowered && wasPowered) {
                level.setBlock(pos, state.setValue(POWERED, false), 3);
            }
        }
    }

    // supply methods
    public int defineNextRotation (int currentRotation) {
        return currentRotation < 3 ? currentRotation + 1 : 0;
    }
}