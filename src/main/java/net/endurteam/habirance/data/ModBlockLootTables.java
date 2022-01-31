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
        this.add(ModBlocks.RUSSET_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.RUSSET_SLAB.get());
        });
        this.add(ModBlocks.LIMESTONE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get());
        });
        this.add(ModBlocks.POLISHED_ALABASTER_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_ALABASTER_SLAB.get());
        });
        this.add(ModBlocks.POLISHED_RUSSET_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_RUSSET_SLAB.get());
        });
        this.add(ModBlocks.POLISHED_LIMESTONE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_LIMESTONE_SLAB.get());
        });
        this.add(ModBlocks.RUSSET_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.RUSSET_BRICK_SLAB.get());
        });

        this.add(ModBlocks.TUFF_IRON_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.TUFF_IRON_ORE.get(), Items.RAW_IRON);
        });
        this.add(ModBlocks.RUSSET_REDSTONE_ORE.get(), BlockLoot::createRedstoneOreDrops);
        this.add(ModBlocks.GRANITE_COPPER_ORE.get(), BlockLoot::createCopperOreDrops);
        this.dropSelf(ModBlocks.ALABASTER_BLOCK.get());
        this.dropSelf(ModBlocks.ALABASTER_STAIRS.get());
        this.dropSelf(ModBlocks.ALABASTER_WALL.get());
        this.dropSelf(ModBlocks.RUSSET_BLOCK.get());
        this.dropSelf(ModBlocks.RUSSET_STAIRS.get());
        this.dropSelf(ModBlocks.RUSSET_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_BLOCK.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_ALABASTER_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_ALABASTER_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_RUSSET_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_RUSSET_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.RUSSET_BRICKS.get());
        this.dropSelf(ModBlocks.RUSSET_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RUSSET_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_RUSSET_BLOCK.get());
        this.dropSelf(ModBlocks.CRACKED_RUSSET_BRICKS.get());
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
        this.add(ModBlocks.IGNEOT_BLOCK.get(), (p_124195_) -> {
            return createSingleItemTableWithSilkTouch(p_124195_, ModBlocks.DRIED_IGNEOT_BLOCK.get());
        });
        this.dropSelf(ModBlocks.IGNEOT_WALL.get());
        this.dropSelf(ModBlocks.IGNEOT_STAIRS.get());
        this.add(ModBlocks.IGNEOT_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.IGNEOT_SLAB.get());
        });
        this.dropSelf(ModBlocks.IGNEOT_BRICKS.get());
        this.dropSelf(ModBlocks.IGNEOT_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.IGNEOT_BRICK_WALL.get());
        this.add(ModBlocks.IGNEOT_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.IGNEOT_BRICK_SLAB.get());
        });
        this.dropSelf(ModBlocks.CHISELED_IGNEOT_BRICKS.get());
        this.dropSelf(ModBlocks.DRIED_IGNEOT_BLOCK.get());
        this.dropSelf(ModBlocks.DRIED_IGNEOT_WALL.get());
        this.dropSelf(ModBlocks.DRIED_IGNEOT_STAIRS.get());
        this.add(ModBlocks.DRIED_IGNEOT_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.DRIED_IGNEOT_SLAB.get());
        });
        this.dropSelf(ModBlocks.DRIED_IGNEOT_BRICKS.get());
        this.dropSelf(ModBlocks.DRIED_CHISELED_IGNEOT_BRICKS.get());
        this.dropSelf(ModBlocks.DRIED_IGNEOT_BRICK_WALL.get());
        this.dropSelf(ModBlocks.DRIED_IGNEOT_BRICK_STAIRS.get());
        this.add(ModBlocks.DRIED_IGNEOT_BRICK_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.DRIED_IGNEOT_BRICK_SLAB.get());
        });
        this.dropSelf(ModBlocks.TRAVERTINE_BLOCK.get());
        this.dropSelf(ModBlocks.TRAVERTINE_WALL.get());
        this.dropSelf(ModBlocks.TRAVERTINE_STAIRS.get());
        this.add(ModBlocks.TRAVERTINE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.TRAVERTINE_SLAB.get());
        });
        this.dropSelf(ModBlocks.POLISHED_TRAVERTINE_BLOCK.get());
        this.dropSelf(ModBlocks.POLISHED_TRAVERTINE_STAIRS.get());
        this.add(ModBlocks.POLISHED_TRAVERTINE_SLAB.get(), (block) -> {
            return createSlabItemTable(ModBlocks.POLISHED_TRAVERTINE_SLAB.get());
        });
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
