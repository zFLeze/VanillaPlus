package com.flez.vanillaplus.block;

import com.flez.vanillaplus.VanillaPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FIREPROOF_OAK_PLANKS = registerBlock("fireproof_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_OAK_LOG = registerBlock("fireproof_oak_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_OAK_WOOD = registerBlock("fireproof_oak_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_OAK_LOG = registerBlock("fireproof_stripped_oak_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_OAK_WOOD = registerBlock("fireproof_stripped_oak_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_SPRUCE_PLANKS = registerBlock("fireproof_spruce_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_SPRUCE_LOG = registerBlock("fireproof_spruce_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_SPRUCE_WOOD = registerBlock("fireproof_spruce_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_SPRUCE_LOG = registerBlock("fireproof_stripped_spruce_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_SPRUCE_WOOD = registerBlock("fireproof_stripped_spruce_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_BIRCH_PLANKS = registerBlock("fireproof_birch_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_BIRCH_LOG = registerBlock("fireproof_birch_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_BIRCH_WOOD = registerBlock("fireproof_birch_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_BIRCH_LOG = registerBlock("fireproof_stripped_birch_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_BIRCH_WOOD = registerBlock("fireproof_stripped_birch_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_DARK_OAK_PLANKS = registerBlock("fireproof_dark_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_DARK_OAK_LOG = registerBlock("fireproof_dark_oak_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_DARK_OAK_WOOD = registerBlock("fireproof_dark_oak_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_DARK_OAK_LOG = registerBlock("fireproof_stripped_dark_oak_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_DARK_OAK_WOOD = registerBlock("fireproof_dark_oak_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_ACACIA_PLANKS = registerBlock("fireproof_acacia_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_ACACIA_LOG = registerBlock("fireproof_acacia_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_ACACIA_WOOD = registerBlock("fireproof_acacia_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_ACACIA_LOG = registerBlock("fireproof_stripped_acacia_log",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_ACACIA_WOOD = registerBlock("fireproof_stripped_acacia_wood",
            new Block(AbstractBlock.Settings.create().strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_CHERRY_PLANKS = registerBlock("fireproof_cherry_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_CHERRY_LOG = registerBlock("fireproof_cherry_log",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_CHERRY_WOOD = registerBlock("fireproof_cherry_wood",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_CHERRY_LOG = registerBlock("fireproof_stripped_cherry_log",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_CHERRY_WOOD = registerBlock("fireproof_stripped_cherry_wood",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_BAMBOO_PLANKS = registerBlock("fireproof_bamboo_planks",
            new Block(AbstractBlock.Settings.create().strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_BAMBOO_LOG = registerBlock("fireproof_bamboo_log",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_BAMBOO_WOOD = registerBlock("fireproof_bamboo_wood",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_BAMBOO_LOG = registerBlock("fireproof_stripped_bamboo_log",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_BAMBOO_WOOD = registerBlock("fireproof_stripped_bamboo_wood",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_BAMBOO_MOSAIC = registerBlock("fireproof_bamboo_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_JUNGLE_PLANKS = registerBlock("fireproof_jungle_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_JUNGLE_LOG = registerBlock("fireproof_jungle_log",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_JUNGLE_WOOD = registerBlock("fireproof_jungle_wood",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_JUNGLE_LOG = registerBlock("fireproof_stripped_jungle_log",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_JUNGLE_WOOD = registerBlock("fireproof_stripped_jungle_wood",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));





    public static final Block FIREPROOF_MANGROVE_PLANKS = registerBlock("fireproof_mangrove_planks", new Block(AbstractBlock.Settings.create()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_MANGROVE_LOG = registerBlock("fireproof_mangrove_log", new Block(AbstractBlock.Settings.create()
            .strength(2f, 2f)
            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_MANGROVE_WOOD = registerBlock("fireproof_mangrove_wood", new Block(AbstractBlock.Settings.create()
            .strength(2f, 2f)
            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_MANGROVE_LOG = registerBlock("fireproof_stripped_mangrove_log", new Block(AbstractBlock.Settings.create()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIREPROOF_STRIPPED_MANGROVE_WOOD = registerBlock("fireproof_stripped_mangrove_wood", new Block(AbstractBlock.Settings.create()
            .strength(2f, 2f)
            .sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaPlus.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaPlus.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VanillaPlus.LOGGER.info("Registering blocks for " + VanillaPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(FIREPROOF_OAK_PLANKS);
            entries.add(FIREPROOF_OAK_LOG);
            entries.add(FIREPROOF_OAK_WOOD);
            entries.add(FIREPROOF_STRIPPED_OAK_LOG);
            entries.add(FIREPROOF_STRIPPED_OAK_WOOD);

            entries.add(FIREPROOF_SPRUCE_PLANKS);
            entries.add(FIREPROOF_SPRUCE_LOG);
            entries.add(FIREPROOF_SPRUCE_WOOD);
            entries.add(FIREPROOF_STRIPPED_SPRUCE_LOG);
            entries.add(FIREPROOF_STRIPPED_SPRUCE_WOOD);

            entries.add(FIREPROOF_BIRCH_PLANKS);
            entries.add(FIREPROOF_BIRCH_LOG);
            entries.add(FIREPROOF_BIRCH_WOOD);
            entries.add(FIREPROOF_STRIPPED_BIRCH_LOG);
            entries.add(FIREPROOF_STRIPPED_BIRCH_WOOD);

            entries.add(FIREPROOF_DARK_OAK_PLANKS);
            entries.add(FIREPROOF_DARK_OAK_LOG);
            entries.add(FIREPROOF_DARK_OAK_WOOD);
            entries.add(FIREPROOF_STRIPPED_DARK_OAK_LOG);
            entries.add(FIREPROOF_STRIPPED_DARK_OAK_WOOD);

            entries.add(FIREPROOF_ACACIA_PLANKS);
            entries.add(FIREPROOF_ACACIA_LOG);
            entries.add(FIREPROOF_ACACIA_WOOD);
            entries.add(FIREPROOF_STRIPPED_ACACIA_LOG);
            entries.add(FIREPROOF_STRIPPED_ACACIA_WOOD);

            entries.add(FIREPROOF_CHERRY_PLANKS);
            entries.add(FIREPROOF_CHERRY_LOG);
            entries.add(FIREPROOF_CHERRY_WOOD);
            entries.add(FIREPROOF_STRIPPED_CHERRY_LOG);
            entries.add(FIREPROOF_STRIPPED_CHERRY_WOOD);

            entries.add(FIREPROOF_BAMBOO_PLANKS);
            entries.add(FIREPROOF_BAMBOO_LOG);
            entries.add(FIREPROOF_BAMBOO_WOOD);
            entries.add(FIREPROOF_BAMBOO_MOSAIC);
            entries.add(FIREPROOF_STRIPPED_BAMBOO_LOG);
            entries.add(FIREPROOF_STRIPPED_BAMBOO_WOOD);

            entries.add(FIREPROOF_JUNGLE_PLANKS);
            entries.add(FIREPROOF_JUNGLE_LOG);
            entries.add(FIREPROOF_JUNGLE_WOOD);
            entries.add(FIREPROOF_STRIPPED_JUNGLE_LOG);
            entries.add(FIREPROOF_STRIPPED_JUNGLE_WOOD);

            entries.add(FIREPROOF_MANGROVE_PLANKS);
            entries.add(FIREPROOF_MANGROVE_LOG);
            entries.add(FIREPROOF_MANGROVE_WOOD);
            entries.add(FIREPROOF_STRIPPED_MANGROVE_LOG);
            entries.add(FIREPROOF_STRIPPED_MANGROVE_WOOD);
        });
    }
}
