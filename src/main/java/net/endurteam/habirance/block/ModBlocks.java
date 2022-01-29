package net.endurteam.habirance.block;

import net.endurteam.habirance.Habirance;
import net.endurteam.habirance.block.custom.RedrockRedstoneOreBlock;
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
    public static final RegistryObject<Block> REDROCK_BLOCK = registerBlock("redrock_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_WALL = registerBlock("redrock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_STAIRS = registerBlock("redrock_stairs",
            () -> new StairBlock(() -> ModBlocks.REDROCK_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_SLAB = registerBlock("redrock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_REDROCK_BLOCK = registerBlock("polished_redrock_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_REDROCK_STAIRS = registerBlock("polished_redrock_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_REDROCK_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_REDROCK_SLAB = registerBlock("polished_redrock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_BRICKS = registerBlock("redrock_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_BRICK_WALL = registerBlock("redrock_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_BRICK_STAIRS = registerBlock("redrock_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.REDROCK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_BRICK_SLAB = registerBlock("redrock_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CHISELED_REDROCK_BLOCK = registerBlock("chiseled_redrock_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CRACKED_REDROCK_BRICKS = registerBlock("cracked_redrock_bricks",
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
    public static final RegistryObject<Block> REDROCK_REDSTONE_ORE = registerBlock("redrock_redstone_ore",
            () -> new RedrockRedstoneOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);

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
