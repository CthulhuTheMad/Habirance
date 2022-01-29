package net.endurteam.habirance.data;

import net.endurteam.habirance.Habirance;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Habirance.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        String locale = this.getName().replace("Languages: ", "");

        switch (locale) {
            case "en_us":
                add("block.habirance.alabaster_block", "Alabaster");
                add("block.habirance.alabaster_stairs", "Alabaster Stairs");
                add("block.habirance.alabaster_slab", "Alabaster Slab");
                add("block.habirance.alabaster_wall", "Alabaster Wall");
                add("block.habirance.polished_alabaster_block", "Polished Alabaster");
                add("block.habirance.polished_alabaster_stairs", "Polished Alabaster Stairs");
                add("block.habirance.polished_alabaster_slab", "Polished Alabaster Slab");
                add("block.habirance.redrock_block", "Redrock");
                add("block.habirance.redrock_stairs", "Redrock Stairs");
                add("block.habirance.redrock_slab", "Redrock Slab");
                add("block.habirance.redrock_wall", "Redrock Wall");
                add("block.habirance.redrock_bricks", "Redrock Bricks");
                add("block.habirance.redrock_brick_stairs", "Redrock Brick Stairs");
                add("block.habirance.redrock_brick_slab", "Redrock Brick Slab");
                add("block.habirance.redrock_brick_wall", "Redrock Brick Wall");
                add("block.habirance.chiseled_redrock_block", "Chiseled Redrock");
                add("block.habirance.cracked_redrock_bricks", "Cracked Redrock Bricks");
                add("block.habirance.polished_redrock_block", "Polished Redrock");
                add("block.habirance.polished_redrock_stairs", "Polished Redrock Stairs");
                add("block.habirance.polished_redrock_slab", "Polished Redrock Slab");
                add("block.habirance.limestone_block", "Limestone");
                add("block.habirance.limestone_stairs", "Limestone Stairs");
                add("block.habirance.limestone_slab", "Limestone Slab");
                add("block.habirance.limestone_wall", "Limestone Wall");
                add("block.habirance.polished_limestone_block", "Polished Limestone");
                add("block.habirance.polished_limestone_stairs", "Polished Limestone Stairs");
                add("block.habirance.polished_limestone_slab", "Polished Limestone Slab");
                add("block.habirance.tuff_iron_ore", "Tuff Iron Ore");
                add("block.habirance.granite_copper_ore", "Granite Copper Ore");
                add("block.habirance.redrock_redstone_ore", "Redrock Redstone Ore");
                add("block.habirance.chiseled_slate_block", "Chiseled Slate");
                add("block.habirance.slate_block", "Slate");
                add("block.habirance.slate_stairs", "Slate Stairs");
                add("block.habirance.slate_slab", "Slate Slab");
                add("block.habirance.slate_wall", "Slate Wall");
                add("block.habirance.slate_bricks", "Slate Bricks");
                add("block.habirance.slate_brick_stairs", "Slate Brick Stairs");
                add("block.habirance.slate_brick_slab", "Slate Brick Slab");
                add("block.habirance.slate_brick_wall", "Slate Brick Wall");
                add("block.habirance.polished_slate_block", "Polished Slate");
                add("block.habirance.polished_slate_stairs", "Polished Slate Stairs");
                add("block.habirance.polished_slate_slab", "Polished Slate Slab");
                add("block.habirance.cobbled_slate_block", "Cobbled Slate");
                add("block.habirance.cobbled_slate_stairs", "Cobbled Slate Stairs");
                add("block.habirance.cobbled_slate_slab", "Cobbled Slate Slab");
                add("block.habirance.cobbled_slate_wall", "Cobbled Slate Wall");
                add("block.habirance.cobblestone_bricks", "Cobblestone Bricks");
                add("block.habirance.cobblestone_brick_stairs", "Cobblestone Brick Stairs");
                add("block.habirance.cobblestone_brick_slab", "Cobblestone Brick Slab");
                add("block.habirance.cobblestone_brick_wall", "Cobblestone Brick Wall");
                add("block.habirance.cracked_cobblestone_bricks", "Cracked Cobblestone Bricks");
                add("block.habirance.polished_cobblestone_bricks", "Polished Cobblestone Bricks");
                add("block.habirance.polished_cobblestone_brick_stairs", "Polished Cobblestone Brick Stairs");
                add("block.habirance.polished_cobblestone_brick_slab", "Polished Cobblestone Brick Slab");
                add("block.habirance.cracked_polished_cobblestone_bricks", "Cracked Polished Cobblestone Bricks");
                add("block.habirance.polished_cobblestone_block", "Polished Cobblestone");
                add("block.habirance.polished_cobblestone_stairs", "Polished Cobblestone Stairs");
                add("block.habirance.polished_cobblestone_slab", "Polished Cobblestone Slab");
                add("itemGroup.habirancetab", "Habirance");
                break;
            default:
                break;
        }
    }
}
