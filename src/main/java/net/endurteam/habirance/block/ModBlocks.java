package net.endurteam.habirance.block;

import net.endurteam.habirance.Habirance;
import net.endurteam.habirance.item.ModCreativeModeTab;
import net.endurteam.habirance.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Habirance.MOD_ID);

    public static final RegistryObject<Block> ALABASTER_BLOCK = registerBlock("alabaster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_ALABASTER_BLOCK = registerBlock("polished_alabaster_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_BLOCK = registerBlock("redrock_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> POLISHED_REDROCK_BLOCK = registerBlock("polished_redrock_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> REDROCK_BRICKS = registerBlock("redrock_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CHISELED_REDROCK_BLOCK = registerBlock("chiseled_redrock_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);
    public static final RegistryObject<Block> CRACKED_REDROCK_BRICKS = registerBlock("cracked_redrock_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ModCreativeModeTab.HABIRANCE_TAB);

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
