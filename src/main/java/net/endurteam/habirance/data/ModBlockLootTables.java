package net.endurteam.habirance.data;

import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
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

        this.add(ModBlocks.TUFF_IRON_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.TUFF_IRON_ORE.get(), Items.RAW_IRON);
        });
        this.add(ModBlocks.REDROCK_REDSTONE_ORE.get(), BlockLoot::createRedstoneOreDrops);
        this.add(ModBlocks.GRANITE_COPPER_ORE.get(), BlockLoot::createCopperOreDrops);
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


        this.add(ModBlocks.SLATE_BLOCK.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, ModBlocks.COBBLED_SLATE_BLOCK.get());
        });
        this.dropSelf(ModBlocks.COBBLED_SLATE_BLOCK.get());
        this.dropSelf(ModBlocks.COBBLED_SLATE_WALL.get());
        this.dropSelf(ModBlocks.COBBLED_SLATE_STAIRS.get());
        this.add(ModBlocks.COBBLED_SLATE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.COBBLED_SLATE_SLAB.get());
        });
        this.dropSelf(ModBlocks.SLATE_WALL.get());
        this.dropSelf(ModBlocks.SLATE_STAIRS.get());
        this.add(ModBlocks.SLATE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.SLATE_SLAB.get());
        });
        this.dropSelf(ModBlocks.CHISELED_SLATE_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_SLATE_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_SLATE_STAIRS.get());
        this.add(ModBlocks.POLISHED_SLATE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_SLATE_SLAB.get());
        });
        this.dropSelf(ModBlocks.SLATE_BRICKS.get());
        this.dropSelf(ModBlocks.SLATE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SLATE_BRICK_WALL.get());
        this.add(ModBlocks.SLATE_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.SLATE_BRICK_SLAB.get());
        });

        this.dropSelf(ModBlocks.COBBLESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.COBBLESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.COBBLESTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.COBBLESTONE_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.COBBLESTONE_BRICK_SLAB.get());
        });
        this.dropSelf(ModBlocks.CRACKED_COBBLESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_COBBLESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_COBBLESTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.POLISHED_COBBLESTONE_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_COBBLESTONE_BRICK_SLAB.get());
        });
        this.dropSelf(ModBlocks.CRACKED_POLISHED_COBBLESTONE_BRICKS.get());

        this.dropSelf(ModBlocks.POLISHED_COBBLESTONE_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_COBBLESTONE_STAIRS.get());
        this.add(ModBlocks.POLISHED_COBBLESTONE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_COBBLESTONE_SLAB.get());
        });
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
