package net.endurteam.habirance.data;

import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.add(ModBlocks.ALABASTER_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.ALABASTER_SLAB.get());
        });
        this.add(ModBlocks.REDROCK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.REDROCK_SLAB.get());
        });
        this.add(ModBlocks.LIMESTONE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get());
        });
        this.add(ModBlocks.POLISHED_ALABASTER_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_ALABASTER_SLAB.get());
        });
        this.add(ModBlocks.POLISHED_REDROCK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_REDROCK_SLAB.get());
        });
        this.add(ModBlocks.POLISHED_LIMESTONE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_LIMESTONE_SLAB.get());
        });
        this.add(ModBlocks.REDROCK_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.REDROCK_BRICK_SLAB.get());
        });

        this.dropSelf(ModBlocks.ALABASTER_BLOCK.get());
        this.dropSelf(ModBlocks.ALABASTER_STAIRS.get());
        this.dropSelf(ModBlocks.ALABASTER_WALL.get());
        this.dropSelf(ModBlocks.REDROCK_BLOCK.get());
        this.dropSelf(ModBlocks.REDROCK_STAIRS.get());
        this.dropSelf(ModBlocks.REDROCK_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_BLOCK.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_ALABASTER_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_ALABASTER_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_REDROCK_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_REDROCK_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.REDROCK_BRICKS.get());
        this.dropSelf(ModBlocks.REDROCK_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.REDROCK_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_REDROCK_BLOCK.get());
        this.dropSelf(ModBlocks.CRACKED_REDROCK_BRICKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
