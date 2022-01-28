package net.endurteam.habirance.data;

import com.google.common.collect.ImmutableList;
import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    private static final ImmutableList<ItemLike> IRON_SMELTABLES = ImmutableList.of(Items.IRON_ORE, Items.DEEPSLATE_IRON_ORE, Items.RAW_IRON, ModBlocks.TUFF_IRON_ORE.get());

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        slabBuilder(ModBlocks.ALABASTER_SLAB.get(), Ingredient.of(ModBlocks.ALABASTER_BLOCK.get())).unlockedBy("has_alabaster_block",has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.ALABASTER_STAIRS.get(), Ingredient.of(ModBlocks.ALABASTER_BLOCK.get())).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer);
        wallBuilder(ModBlocks.ALABASTER_WALL.get(), Ingredient.of(ModBlocks.ALABASTER_BLOCK.get())).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ALABASTER_BLOCK.get()), ModBlocks.ALABASTER_SLAB.get(), 2).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","alabaster_slab_from_alabaster_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ALABASTER_BLOCK.get()), ModBlocks.ALABASTER_STAIRS.get()).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","alabaster_stairs_from_alabaster_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ALABASTER_BLOCK.get()), ModBlocks.ALABASTER_WALL.get()).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","alabaster_wall_from_alabaster_stonecutting"));
        chiseledBuilder(ModBlocks.CHISELED_REDROCK_BLOCK.get(), Ingredient.of(ModBlocks.REDROCK_BRICK_SLAB.get())).unlockedBy("has_redrock_brick_slab", has(ModBlocks.REDROCK_BRICK_SLAB.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BRICKS.get()), ModBlocks.CHISELED_REDROCK_BLOCK.get()).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","chiseled_redrock_from_redrock_brick_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.CHISELED_REDROCK_BLOCK.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","chiseled_redrock_from_redrock_stonecutting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.REDROCK_BRICKS.get()), ModBlocks.CRACKED_REDROCK_BRICKS.get().asItem(), 0.1F, 200).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer);
        polishedBuilder(ModBlocks.POLISHED_ALABASTER_BLOCK.get(), Ingredient.of(ModBlocks.ALABASTER_BLOCK.get())).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ALABASTER_BLOCK.get()), ModBlocks.POLISHED_ALABASTER_BLOCK.get()).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_alabaster_from_alabaster_stonecutting"));
        slabBuilder(ModBlocks.POLISHED_ALABASTER_SLAB.get(), Ingredient.of(ModBlocks.POLISHED_ALABASTER_BLOCK.get())).unlockedBy("has_polished_alabaster_block",has(ModBlocks.POLISHED_ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.POLISHED_ALABASTER_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_ALABASTER_BLOCK.get())).unlockedBy("has_polished_alabaster_block", has(ModBlocks.POLISHED_ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ALABASTER_BLOCK.get()), ModBlocks.POLISHED_ALABASTER_SLAB.get(), 2).unlockedBy("has_polished_alabaster_block", has(ModBlocks.POLISHED_ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_alabaster_slab_from_polished_alabaster_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ALABASTER_BLOCK.get()), ModBlocks.POLISHED_ALABASTER_SLAB.get(), 2).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_alabaster_slab_from_alabaster_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ALABASTER_BLOCK.get()), ModBlocks.POLISHED_ALABASTER_STAIRS.get()).unlockedBy("has_polished_alabaster_block", has(ModBlocks.POLISHED_ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_alabaster_stairs_from_polished_alabaster_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ALABASTER_BLOCK.get()), ModBlocks.POLISHED_ALABASTER_STAIRS.get()).unlockedBy("has_alabaster_block", has(ModBlocks.ALABASTER_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_alabaster_stairs_from_alabaster_stonecutting"));
        polishedBuilder(ModBlocks.POLISHED_REDROCK_BLOCK.get(), Ingredient.of(ModBlocks.REDROCK_BLOCK.get())).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.POLISHED_REDROCK_BLOCK.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_redrock_from_redrock_stonecutting"));
        slabBuilder(ModBlocks.POLISHED_REDROCK_SLAB.get(), Ingredient.of(ModBlocks.POLISHED_REDROCK_BLOCK.get())).unlockedBy("has_polished_redrock_block",has(ModBlocks.POLISHED_REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.POLISHED_REDROCK_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_REDROCK_BLOCK.get())).unlockedBy("has_polished_redrock_block", has(ModBlocks.POLISHED_REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_REDROCK_BLOCK.get()), ModBlocks.POLISHED_REDROCK_SLAB.get(), 2).unlockedBy("has_polished_redrock_block", has(ModBlocks.POLISHED_REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_redrock_slab_from_polished_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.POLISHED_REDROCK_SLAB.get(), 2).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_redrock_slab_from_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_REDROCK_BLOCK.get()), ModBlocks.POLISHED_REDROCK_STAIRS.get()).unlockedBy("has_polished_redrock_block", has(ModBlocks.POLISHED_REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_redrock_stairs_from_polished_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.POLISHED_REDROCK_STAIRS.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_redrock_stairs_from_redrock_stonecutting"));
        ShapedRecipeBuilder.shaped(ModBlocks.REDROCK_BRICKS.get(), 4).define('#', ModBlocks.REDROCK_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_BRICKS.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_bricks_from_redrock_stonecutting"));
        slabBuilder(ModBlocks.REDROCK_BRICK_SLAB.get(), Ingredient.of(ModBlocks.REDROCK_BRICKS.get())).unlockedBy("has_redrock_bricks",has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.REDROCK_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.REDROCK_BRICKS.get())).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer);
        wallBuilder(ModBlocks.REDROCK_BRICK_WALL.get(), Ingredient.of(ModBlocks.REDROCK_BRICKS.get())).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BRICKS.get()), ModBlocks.REDROCK_BRICK_SLAB.get(), 2).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_brick_slab_from_redrock_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_BRICK_SLAB.get(), 2).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_brick_slab_from_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BRICKS.get()), ModBlocks.REDROCK_BRICK_STAIRS.get()).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_brick_stairs_from_redrock_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_BRICK_STAIRS.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_brick_stairs_from_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BRICKS.get()), ModBlocks.REDROCK_BRICK_WALL.get()).unlockedBy("has_redrock_bricks", has(ModBlocks.REDROCK_BRICKS.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_brick_wall_from_redrock_brick_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_BRICK_WALL.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_brick_wall_from_redrock_stonecutting"));
        slabBuilder(ModBlocks.REDROCK_SLAB.get(), Ingredient.of(ModBlocks.REDROCK_BLOCK.get())).unlockedBy("has_redrock_block",has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.REDROCK_STAIRS.get(), Ingredient.of(ModBlocks.REDROCK_BLOCK.get())).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        wallBuilder(ModBlocks.REDROCK_WALL.get(), Ingredient.of(ModBlocks.REDROCK_BLOCK.get())).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_SLAB.get(), 2).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_slab_from_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_STAIRS.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_stairs_from_redrock_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.REDROCK_BLOCK.get()), ModBlocks.REDROCK_WALL.get()).unlockedBy("has_redrock_block", has(ModBlocks.REDROCK_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","redrock_wall_from_redrock_stonecutting"));
        slabBuilder(ModBlocks.LIMESTONE_SLAB.get(), Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get())).unlockedBy("has_limestone_block",has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.LIMESTONE_STAIRS.get(), Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get())).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer);
        wallBuilder(ModBlocks.LIMESTONE_WALL.get(), Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get())).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get()), ModBlocks.LIMESTONE_SLAB.get(), 2).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","limestone_slab_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get()), ModBlocks.LIMESTONE_STAIRS.get()).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","limestone_stairs_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get()), ModBlocks.LIMESTONE_WALL.get()).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","limestone_wall_from_limestone_stonecutting"));
        polishedBuilder(ModBlocks.POLISHED_LIMESTONE_BLOCK.get(), Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get())).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get()), ModBlocks.POLISHED_LIMESTONE_BLOCK.get()).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_limestone_from_limestone_stonecutting"));
        slabBuilder(ModBlocks.POLISHED_LIMESTONE_SLAB.get(), Ingredient.of(ModBlocks.POLISHED_LIMESTONE_BLOCK.get())).unlockedBy("has_polished_limestone_block",has(ModBlocks.POLISHED_LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer);
        stairBuilder(ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_LIMESTONE_BLOCK.get())).unlockedBy("has_polished_limestone_block", has(ModBlocks.POLISHED_LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_LIMESTONE_BLOCK.get()), ModBlocks.POLISHED_LIMESTONE_SLAB.get(), 2).unlockedBy("has_polished_limestone_block", has(ModBlocks.POLISHED_LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_limestone_slab_from_polished_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get()), ModBlocks.POLISHED_LIMESTONE_SLAB.get(), 2).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_limestone_slab_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_LIMESTONE_BLOCK.get()), ModBlocks.POLISHED_LIMESTONE_STAIRS.get()).unlockedBy("has_polished_limestone_block", has(ModBlocks.POLISHED_LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_limestone_stairs_from_polished_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BLOCK.get()), ModBlocks.POLISHED_LIMESTONE_STAIRS.get()).unlockedBy("has_limestone_block", has(ModBlocks.LIMESTONE_BLOCK.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance","polished_limestone_stairs_from_limestone_stonecutting"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TUFF_IRON_ORE.get()), Items.IRON_INGOT, 0.7F, 200).unlockedBy("has_tuff_iron_ore", has(ModBlocks.TUFF_IRON_ORE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance", "iron_ingot_from_tuff_iron_ore_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.GRANITE_COPPER_ORE.get()), Items.COPPER_INGOT, 0.7F, 200).unlockedBy("has_granite_copper_ore", has(ModBlocks.GRANITE_COPPER_ORE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance", "copper_ingot_from_granite_copper_ore_smelting"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.REDROCK_REDSTONE_ORE.get()), Items.REDSTONE, 0.7F, 200).unlockedBy("has_redrock_redstone_ore", has(ModBlocks.REDROCK_REDSTONE_ORE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance", "redstone_from_redrock_redstone_ore_smelting"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.TUFF_IRON_ORE.get()), Items.IRON_INGOT, 0.7F, 100).unlockedBy("has_tuff_iron_ore", has(ModBlocks.TUFF_IRON_ORE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance", "iron_ingot_from_tuff_iron_ore_blasting"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.GRANITE_COPPER_ORE.get()), Items.COPPER_INGOT, 0.7F, 100).unlockedBy("has_granite_copper_ore", has(ModBlocks.GRANITE_COPPER_ORE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance", "copper_ingot_from_granite_copper_ore_blasting"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.REDROCK_REDSTONE_ORE.get()), Items.REDSTONE, 0.7F, 100).unlockedBy("has_redrock_redstone_ore", has(ModBlocks.REDROCK_REDSTONE_ORE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("habirance", "redstone_from_redrock_redstone_ore_blasting"));
    }

    public static ShapedRecipeBuilder chiseledBuilder(ItemLike pChiseledResult, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pChiseledResult).define('#', pMaterial).pattern("#").pattern("#");
    }

    public static RecipeBuilder polishedBuilder(ItemLike pResult, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pResult, 4).define('S', pMaterial).pattern("SS").pattern("SS");
    }

    public static RecipeBuilder wallBuilder(ItemLike pWall, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pWall, 6).define('#', pMaterial).pattern("###").pattern("###");
    }

    private static RecipeBuilder stairBuilder(ItemLike pStairs, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pStairs, 4).define('#', pMaterial).pattern("#  ").pattern("## ").pattern("###");
    }

    public static SingleItemRecipeBuilder stonecutting(ItemLike pResult, Ingredient pIngredient) {
        return new SingleItemRecipeBuilder(RecipeSerializer.STONECUTTER, pIngredient, pResult, 1);
    }

    public static SingleItemRecipeBuilder stonecutting(Ingredient pIngredient, ItemLike pResult, int pCount) {
        return new SingleItemRecipeBuilder(RecipeSerializer.STONECUTTER, pIngredient, pResult, pCount);
    }

    private static RecipeBuilder slabBuilder(ItemLike pSlab, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pSlab, 6).define('#', pMaterial).pattern("###");
    }
}
