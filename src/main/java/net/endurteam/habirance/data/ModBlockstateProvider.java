package net.endurteam.habirance.data;

import net.endurteam.habirance.Habirance;
import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Habirance.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        /**
         * Regular block blockstates and models
         */
        simpleBlock(ModBlocks.ALABASTER_BLOCK.get());
        simpleBlock(ModBlocks.CHISELED_REDROCK_BLOCK.get());
        simpleBlock(ModBlocks.CHISELED_SLATE_BLOCK.get());
        simpleBlock(ModBlocks.COBBLED_SLATE_BLOCK.get());
        simpleBlock(ModBlocks.COBBLESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CRACKED_COBBLESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CRACKED_POLISHED_COBBLESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CRACKED_REDROCK_BRICKS.get());
        simpleBlock(ModBlocks.GRANITE_COPPER_ORE.get());
        simpleBlock(ModBlocks.LIMESTONE_BLOCK.get());
        simpleBlock(ModBlocks.POLISHED_ALABASTER_BLOCK.get());
        simpleBlock(ModBlocks.POLISHED_COBBLESTONE_BLOCK.get());
        simpleBlock(ModBlocks.POLISHED_COBBLESTONE_BRICKS.get());
        simpleBlock(ModBlocks.POLISHED_LIMESTONE_BLOCK.get());
        simpleBlock(ModBlocks.POLISHED_REDROCK_BLOCK.get());
        simpleBlock(ModBlocks.POLISHED_SLATE_BLOCK.get());
        simpleBlock(ModBlocks.REDROCK_BLOCK.get());
        simpleBlock(ModBlocks.REDROCK_BRICKS.get());
        simpleBlock(ModBlocks.REDROCK_REDSTONE_ORE.get());
        simpleBlock(ModBlocks.SLATE_BLOCK.get());
        simpleBlock(ModBlocks.SLATE_BRICKS.get());
        simpleBlock(ModBlocks.TUFF_IRON_ORE.get());

        /**
         * Stair blockstates and models
         */
        stairsBlock((StairBlock) ModBlocks.ALABASTER_STAIRS.get(), modLoc("block/alabaster_block"));
        stairsBlock((StairBlock) ModBlocks.COBBLED_SLATE_STAIRS.get(), modLoc("block/cobbled_slate_block"));
        stairsBlock((StairBlock) ModBlocks.COBBLESTONE_BRICK_STAIRS.get(), modLoc("block/cobblestone_bricks"));
        stairsBlock((StairBlock) ModBlocks.LIMESTONE_STAIRS.get(), modLoc("block/limestone_block"));
        stairsBlock((StairBlock) ModBlocks.POLISHED_ALABASTER_STAIRS.get(), modLoc("block/polished_alabaster_block"));
        stairsBlock((StairBlock) ModBlocks.POLISHED_COBBLESTONE_BRICK_STAIRS.get(), modLoc("block/polished_cobblestone_bricks"));
        stairsBlock((StairBlock) ModBlocks.POLISHED_COBBLESTONE_STAIRS.get(), modLoc("block/polished_cobblestone_block"));
        stairsBlock((StairBlock) ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), modLoc("block/polished_limestone_block"));
        stairsBlock((StairBlock) ModBlocks.POLISHED_REDROCK_STAIRS.get(), modLoc("block/polished_redrock_block"));
        stairsBlock((StairBlock) ModBlocks.POLISHED_SLATE_STAIRS.get(), modLoc("block/polished_slate_block"));
        stairsBlock((StairBlock) ModBlocks.REDROCK_BRICK_STAIRS.get(), modLoc("block/redrock_bricks"));
        stairsBlock((StairBlock) ModBlocks.REDROCK_STAIRS.get(), modLoc("block/redrock_block"));
        stairsBlock((StairBlock) ModBlocks.SLATE_STAIRS.get(), modLoc("block/slate_block"));
        stairsBlock((StairBlock) ModBlocks.SLATE_BRICK_STAIRS.get(), modLoc("block/slate_bricks"));

        /**
         * Slab blockstates and models
         */
        slabBlock((SlabBlock) ModBlocks.ALABASTER_SLAB.get(), modLoc("block/alabaster_block"), modLoc("block/alabaster_block"));
        slabBlock((SlabBlock) ModBlocks.COBBLED_SLATE_SLAB.get(), modLoc("block/cobbled_slate_block"), modLoc("block/cobbled_slate_block"));
        slabBlock((SlabBlock) ModBlocks.COBBLESTONE_BRICK_SLAB.get(), modLoc("block/cobblestone_bricks"), modLoc("block/cobblestone_bricks"));
        slabBlock((SlabBlock) ModBlocks.LIMESTONE_SLAB.get(), modLoc("block/limestone_block"), modLoc("block/limestone_block"));
        slabBlock((SlabBlock) ModBlocks.POLISHED_ALABASTER_SLAB.get(), modLoc("block/polished_alabaster_block"), modLoc("block/polished_alabaster_block"));
        slabBlock((SlabBlock) ModBlocks.POLISHED_COBBLESTONE_BRICK_SLAB.get(), modLoc("block/polished_cobblestone_bricks"), modLoc("block/polished_cobblestone_bricks"));
        slabBlock((SlabBlock) ModBlocks.POLISHED_COBBLESTONE_SLAB.get(), modLoc("block/polished_cobblestone_block"), modLoc("block/polished_cobblestone_block"));
        slabBlock((SlabBlock) ModBlocks.POLISHED_LIMESTONE_SLAB.get(), modLoc("block/polished_limestone_block"), modLoc("block/polished_limestone_block"));
        slabBlock((SlabBlock) ModBlocks.POLISHED_REDROCK_SLAB.get(), modLoc("block/polished_redrock_block"), modLoc("block/polished_redrock_block"));
        slabBlock((SlabBlock) ModBlocks.POLISHED_SLATE_SLAB.get(), modLoc("block/polished_slate_block"), modLoc("block/polished_slate_block"));
        slabBlock((SlabBlock) ModBlocks.REDROCK_BRICK_SLAB.get(), modLoc("block/redrock_bricks"), modLoc("block/redrock_bricks"));
        slabBlock((SlabBlock) ModBlocks.REDROCK_SLAB.get(), modLoc("block/redrock_block"), modLoc("block/redrock_block"));
        slabBlock((SlabBlock) ModBlocks.SLATE_BRICK_SLAB.get(), modLoc("block/slate_bricks"), modLoc("block/slate_bricks"));
        slabBlock((SlabBlock) ModBlocks.SLATE_SLAB.get(), modLoc("block/slate_block"), modLoc("block/slate_block"));

        /**
         * Wall blockstates and models
         */
        wallBlock((WallBlock) ModBlocks.ALABASTER_WALL.get(), modLoc("block/alabaster_block"));
        wallBlock((WallBlock) ModBlocks.COBBLED_SLATE_WALL.get(), modLoc("block/cobbled_slate_block"));
        wallBlock((WallBlock) ModBlocks.COBBLESTONE_BRICK_WALL.get(), modLoc("block/cobblestone_bricks"));
        wallBlock((WallBlock) ModBlocks.LIMESTONE_WALL.get(), modLoc("block/limestone_block"));
        wallBlock((WallBlock) ModBlocks.REDROCK_BRICK_WALL.get(), modLoc("block/redrock_bricks"));
        wallBlock((WallBlock) ModBlocks.REDROCK_WALL.get(), modLoc("block/redrock_block"));
        wallBlock((WallBlock) ModBlocks.SLATE_BRICK_WALL.get(), modLoc("block/slate_bricks"));
        wallBlock((WallBlock) ModBlocks.SLATE_WALL.get(), modLoc("block/slate_block"));
        models().wallInventory("alabaster_wall_inventory", modLoc("block/alabaster_block"));
        models().wallInventory("cobbled_slate_wall_inventory", modLoc("block/cobbled_slate_block"));
        models().wallInventory("cobblestone_brick_wall_inventory", modLoc("block/cobblestone_bricks"));
        models().wallInventory("limestone_wall_inventory", modLoc("block/limestone_block"));
        models().wallInventory("redrock_brick_wall_inventory", modLoc("block/redrock_bricks"));
        models().wallInventory("redrock_wall_inventory", modLoc("block/redrock_block"));
        models().wallInventory("slate_brick_wall_inventory", modLoc("block/slate_bricks"));
        models().wallInventory("slate_wall_inventory", modLoc("block/slate_block"));
    }


}
