package net.endurteam.habirance.data;

import net.endurteam.habirance.Habirance;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Habirance.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        /**
         * Block Items
         */
        withExistingParent("alabaster_block", modLoc("block/alabaster_block"));
        withExistingParent("chiseled_russet_block", modLoc("block/chiseled_russet_block"));
        withExistingParent("chiseled_slate_block", modLoc("block/chiseled_slate_block"));
        withExistingParent("cobbled_slate_block", modLoc("block/cobbled_slate_block"));
        withExistingParent("cobblestone_bricks", modLoc("block/cobblestone_bricks"));
        withExistingParent("cracked_cobblestone_bricks", modLoc("block/cracked_cobblestone_bricks"));
        withExistingParent("cracked_polished_cobblestone_bricks", modLoc("block/cracked_polished_cobblestone_bricks"));
        withExistingParent("cracked_russet_bricks", modLoc("block/cracked_russet_bricks"));
        withExistingParent("granite_copper_ore", modLoc("block/granite_copper_ore"));
        withExistingParent("limestone_block", modLoc("block/limestone_block"));
        withExistingParent("polished_alabaster_block", modLoc("block/polished_alabaster_block"));
        withExistingParent("polished_cobblestone_block", modLoc("block/polished_cobblestone_block"));
        withExistingParent("polished_cobblestone_bricks", modLoc("block/polished_cobblestone_bricks"));
        withExistingParent("polished_limestone_block", modLoc("block/polished_limestone_block"));
        withExistingParent("polished_russet_block", modLoc("block/polished_russet_block"));
        withExistingParent("polished_slate_block", modLoc("block/polished_slate_block"));
        withExistingParent("russet_block", modLoc("block/russet_block"));
        withExistingParent("russet_bricks", modLoc("block/russet_bricks"));
        withExistingParent("russet_redstone_ore", modLoc("block/russet_redstone_ore"));
        withExistingParent("slate_block", modLoc("block/slate_block"));
        withExistingParent("slate_bricks", modLoc("block/slate_bricks"));
        withExistingParent("tuff_iron_ore", modLoc("block/tuff_iron_ore"));
        withExistingParent("igneot_block", modLoc("block/igneot_block"));
        withExistingParent("igneot_bricks", modLoc("block/igneot_bricks"));
        withExistingParent("chiseled_igneot_bricks", modLoc("block/chiseled_igneot_bricks"));
        withExistingParent("dried_igneot_block", modLoc("block/dried_igneot_block"));
        withExistingParent("dried_igneot_bricks", modLoc("block/dried_igneot_bricks"));
        withExistingParent("dried_chiseled_igneot_bricks", modLoc("block/dried_chiseled_igneot_bricks"));

        /**
         * Stair block items
         */
        withExistingParent("alabaster_stairs", modLoc("block/alabaster_stairs"));
        withExistingParent("cobbled_slate_stairs", modLoc("block/cobbled_slate_stairs"));
        withExistingParent("cobblestone_brick_stairs", modLoc("block/cobblestone_brick_stairs"));
        withExistingParent("limestone_stairs", modLoc("block/limestone_stairs"));
        withExistingParent("polished_alabaster_stairs", modLoc("block/polished_alabaster_stairs"));
        withExistingParent("polished_cobblestone_brick_stairs", modLoc("block/polished_cobblestone_brick_stairs"));
        withExistingParent("polished_cobblestone_stairs", modLoc("block/polished_cobblestone_stairs"));
        withExistingParent("polished_limestone_stairs", modLoc("block/polished_limestone_stairs"));
        withExistingParent("polished_russet_stairs", modLoc("block/polished_russet_stairs"));
        withExistingParent("polished_slate_stairs", modLoc("block/polished_slate_stairs"));
        withExistingParent("russet_brick_stairs", modLoc("block/russet_brick_stairs"));
        withExistingParent("russet_stairs", modLoc("block/russet_stairs"));
        withExistingParent("slate_stairs", modLoc("block/slate_stairs"));
        withExistingParent("slate_brick_stairs", modLoc("block/slate_brick_stairs"));
        withExistingParent("igneot_stairs", modLoc("block/igneot_stairs"));
        withExistingParent("igneot_brick_stairs", modLoc("block/igneot_brick_stairs"));
        withExistingParent("dried_igneot_stairs", modLoc("block/dried_igneot_stairs"));
        withExistingParent("dried_igneot_brick_stairs", modLoc("block/dried_igneot_brick_stairs"));

        /**
         * Slab Block Items
         */
        withExistingParent("alabaster_slab", modLoc("block/alabaster_slab"));
        withExistingParent("cobbled_slate_slab", modLoc("block/cobbled_slate_slab"));
        withExistingParent("cobblestone_brick_slab", modLoc("block/cobblestone_brick_slab"));
        withExistingParent("limestone_slab", modLoc("block/limestone_slab"));
        withExistingParent("polished_alabaster_slab", modLoc("block/polished_alabaster_slab"));
        withExistingParent("polished_cobblestone_brick_slab", modLoc("block/polished_cobblestone_brick_slab"));
        withExistingParent("polished_cobblestone_slab", modLoc("block/polished_cobblestone_slab"));
        withExistingParent("polished_limestone_slab", modLoc("block/polished_limestone_slab"));
        withExistingParent("polished_russet_slab", modLoc("block/polished_russet_slab"));
        withExistingParent("polished_slate_slab", modLoc("block/polished_slate_slab"));
        withExistingParent("russet_brick_slab", modLoc("block/russet_brick_slab"));
        withExistingParent("russet_slab", modLoc("block/russet_slab"));
        withExistingParent("slate_brick_slab", modLoc("block/slate_brick_slab"));
        withExistingParent("slate_slab", modLoc("block/slate_slab"));
        withExistingParent("igneot_slab", modLoc("block/igneot_slab"));
        withExistingParent("igneot_brick_slab", modLoc("block/igneot_brick_slab"));
        withExistingParent("dried_igneot_slab", modLoc("block/dried_igneot_slab"));
        withExistingParent("dried_igneot_brick_slab", modLoc("block/dried_igneot_brick_slab"));

        /**
         * Wall Block Items
         */
        withExistingParent("alabaster_wall", modLoc("block/alabaster_wall_inventory"));
        withExistingParent("cobbled_slate_wall", modLoc("block/cobbled_slate_wall_inventory"));
        withExistingParent("cobblestone_brick_wall", modLoc("block/cobblestone_brick_wall_inventory"));
        withExistingParent("limestone_wall", modLoc("block/limestone_wall_inventory"));
        withExistingParent("russet_brick_wall", modLoc("block/russet_brick_wall_inventory"));
        withExistingParent("russet_wall", modLoc("block/russet_wall_inventory"));
        withExistingParent("slate_brick_wall", modLoc("block/slate_brick_wall_inventory"));
        withExistingParent("slate_wall", modLoc("block/slate_wall_inventory"));
        withExistingParent("igneot_wall", modLoc("block/igneot_wall_inventory"));
        withExistingParent("igneot_brick_wall", modLoc("block/igneot_brick_wall_inventory"));
        withExistingParent("dried_igneot_wall", modLoc("block/dried_igneot_wall_inventory"));
        withExistingParent("dried_igneot_brick_wall", modLoc("block/dried_igneot_brick_wall_inventory"));

        /**
         * How to generate basic item models
         */
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        //builder(itemGenerated,"copper_ingot");
    }


    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
            return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
