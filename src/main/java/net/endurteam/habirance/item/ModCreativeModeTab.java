package net.endurteam.habirance.item;

import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HABIRANCE_TAB = new CreativeModeTab("habirancetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.LIMESTONE_BLOCK.get());
        }
    };
}