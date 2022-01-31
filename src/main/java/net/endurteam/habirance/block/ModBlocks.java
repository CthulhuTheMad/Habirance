package net.endurteam.habirance.block;

import net.endurteam.habirance.Habirance;
import net.endurteam.habirance.block.custom.RussetRedstoneOreBlock;
import net.endurteam.habirance.item.ModCreativeModeTab;
import net.endurteam.habirance.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Habirance.MOD_ID);

    public static final RegistryObject<Block> ALABASTER_BLOCK = registerBlock("alabaster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> ALABASTER_WALL = registerBlock("alabaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> ALABASTER_STAIRS = registerBlock("alabaster_stairs",
            () -> new StairBlock(() -> ModBlocks.ALABASTER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> ALABASTER_SLAB = registerBlock("alabaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_ALABASTER_BLOCK = registerBlock("polished_alabaster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_ALABASTER_STAIRS = registerBlock("polished_alabaster_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_ALABASTER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_ALABASTER_SLAB = registerBlock("polished_alabaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_BLOCK = registerBlock("russet_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_WALL = registerBlock("russet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_STAIRS = registerBlock("russet_stairs",
            () -> new StairBlock(() -> ModBlocks.RUSSET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_SLAB = registerBlock("russet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_RUSSET_BLOCK = registerBlock("polished_russet_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_RUSSET_STAIRS = registerBlock("polished_russet_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_RUSSET_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_RUSSET_SLAB = registerBlock("polished_russet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_BRICKS = registerBlock("russet_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_BRICK_WALL = registerBlock("russet_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_BRICK_STAIRS = registerBlock("russet_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RUSSET_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_BRICK_SLAB = registerBlock("russet_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CHISELED_RUSSET_BLOCK = registerBlock("chiseled_russet_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CRACKED_RUSSET_BRICKS = registerBlock("cracked_russet_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> LIMESTONE_BLOCK = registerBlock("limestone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_LIMESTONE_BLOCK = registerBlock("polished_limestone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.CALCITE)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> GRANITE_COPPER_ORE = registerBlock("granite_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> RUSSET_REDSTONE_ORE = registerBlock("russet_redstone_ore",
            () -> new RussetRedstoneOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_BLOCK = registerBlock("slate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLED_SLATE_BLOCK = registerBlock("cobbled_slate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLED_SLATE_WALL = registerBlock("cobbled_slate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLED_SLATE_STAIRS = registerBlock("cobbled_slate_stairs",
            () -> new StairBlock(() -> ModBlocks.SLATE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLED_SLATE_SLAB = registerBlock("cobbled_slate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_WALL = registerBlock("slate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_STAIRS = registerBlock("slate_stairs",
            () -> new StairBlock(() -> ModBlocks.SLATE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_SLAB = registerBlock("slate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CHISELED_SLATE_BLOCK = registerBlock("chiseled_slate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_SLATE_BLOCK = registerBlock("polished_slate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_SLATE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_BRICKS = registerBlock("slate_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_BRICK_WALL = registerBlock("slate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> SLATE_BRICK_SLAB = registerBlock("slate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CRACKED_COBBLESTONE_BRICKS = registerBlock("cracked_cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_COBBLESTONE_BRICKS = registerBlock("polished_cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_COBBLESTONE_BRICK_STAIRS = registerBlock("polished_cobblestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_COBBLESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_COBBLESTONE_BRICK_SLAB = registerBlock("polished_cobblestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CRACKED_POLISHED_COBBLESTONE_BRICKS = registerBlock("cracked_polished_cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_COBBLESTONE_BLOCK = registerBlock("polished_cobblestone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_COBBLESTONE_STAIRS = registerBlock("polished_cobblestone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_COBBLESTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_COBBLESTONE_SLAB = registerBlock("polished_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_BLOCK = registerBlock("igneot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_WALL = registerBlock("igneot_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_STAIRS = registerBlock("igneot_stairs",
            () -> new StairBlock(() -> ModBlocks.IGNEOT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_SLAB = registerBlock("igneot_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_BRICKS = registerBlock("igneot_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_BRICK_WALL = registerBlock("igneot_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_BRICK_STAIRS = registerBlock("igneot_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.IGNEOT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> IGNEOT_BRICK_SLAB = registerBlock("igneot_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CHISELED_IGNEOT_BRICKS = registerBlock("chiseled_igneot_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_BLOCK = registerBlock("dried_igneot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_WALL = registerBlock("dried_igneot_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_STAIRS = registerBlock("dried_igneot_stairs",
            () -> new StairBlock(() -> ModBlocks.DRIED_IGNEOT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_SLAB = registerBlock("dried_igneot_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_BRICKS = registerBlock("dried_igneot_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_CHISELED_IGNEOT_BRICKS = registerBlock("dried_chiseled_igneot_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_BRICK_WALL = registerBlock("dried_igneot_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_BRICK_STAIRS = registerBlock("dried_igneot_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DRIED_IGNEOT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> DRIED_IGNEOT_BRICK_SLAB = registerBlock("dried_igneot_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> TRAVERTINE_BLOCK = registerBlock("travertine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> TRAVERTINE_WALL = registerBlock("travertine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> TRAVERTINE_STAIRS = registerBlock("travertine_stairs",
            () -> new StairBlock(() -> ModBlocks.TRAVERTINE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> TRAVERTINE_SLAB = registerBlock("travertine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_TRAVERTINE_BLOCK = registerBlock("polished_travertine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_TRAVERTINE_STAIRS = registerBlock("polished_travertine_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TRAVERTINE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_TRAVERTINE_SLAB = registerBlock("polished_travertine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);




    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
        };
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
