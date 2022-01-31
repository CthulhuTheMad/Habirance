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
                add("block.habirance.russet_block", "Russet");
                add("block.habirance.russet_stairs", "Russet Stairs");
                add("block.habirance.russet_slab", "Russet Slab");
                add("block.habirance.russet_wall", "Russet Wall");
                add("block.habirance.russet_bricks", "Russet Bricks");
                add("block.habirance.russet_brick_stairs", "Russet Brick Stairs");
                add("block.habirance.russet_brick_slab", "Russet Brick Slab");
                add("block.habirance.russet_brick_wall", "Russet Brick Wall");
                add("block.habirance.chiseled_russet_block", "Chiseled Russet");
                add("block.habirance.cracked_russet_bricks", "Cracked Russet Bricks");
                add("block.habirance.polished_russet_block", "Polished Russet");
                add("block.habirance.polished_russet_stairs", "Polished Russet Stairs");
                add("block.habirance.polished_russet_slab", "Polished Russet Slab");
                add("block.habirance.limestone_block", "Limestone");
                add("block.habirance.limestone_stairs", "Limestone Stairs");
                add("block.habirance.limestone_slab", "Limestone Slab");
                add("block.habirance.limestone_wall", "Limestone Wall");
                add("block.habirance.polished_limestone_block", "Polished Limestone");
                add("block.habirance.polished_limestone_stairs", "Polished Limestone Stairs");
                add("block.habirance.polished_limestone_slab", "Polished Limestone Slab");
                add("block.habirance.tuff_iron_ore", "Tuff Iron Ore");
                add("block.habirance.granite_copper_ore", "Granite Copper Ore");
                add("block.habirance.russet_redstone_ore", "Russet Redstone Ore");
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
                add("block.habirance.igneot_block", "Igneot");
                add("block.habirance.igneot_stairs", "Igneot Stairs");
                add("block.habirance.igneot_slab", "Igneot Slab");
                add("block.habirance.igneot_wall", "Igneot Wall");
                add("block.habirance.igneot_bricks", "Igneot Bricks");
                add("block.habirance.chiseled_igneot_bricks", "Chiseled Igneot Bricks");
                add("block.habirance.igneot_brick_stairs", "Igneot Brick Stairs");
                add("block.habirance.igneot_brick_slab", "Igneot Brick Slab");
                add("block.habirance.igneot_brick_wall", "Igneot Brick Wall");
                add("block.habirance.cobbled_igneot_block", "Cobbled Igneot");
                add("block.habirance.cobbled_igneot_stairs", "Cobbled Igneot Stairs");
                add("block.habirance.cobbled_igneot_slab", "Cobbled Igneot Slab");
                add("block.habirance.cobbled_igneot_wall", "Cobbled Igneot Wall");
                add("block.habirance.cobbled_igneot_bricks", "Cobbled Igneot Bricks");
                add("block.habirance.cobbled_igneot_brick_stairs", "Cobbled Igneot Brick Stairs");
                add("block.habirance.cobbled_igneot_brick_slab", "Cobbled Igneot Brick Slab");
                add("block.habirance.cobbled_igneot_brick_wall", "Cobbled Igneot Brick Wall");
                add("block.habirance.cobbled_chiseled_igneot_bricks", "Cobbled Chiseled Igneot Bricks");
                add("itemGroup.habirancetab", "Habirance");
                break;
            default:
                break;
        }
    }
}
