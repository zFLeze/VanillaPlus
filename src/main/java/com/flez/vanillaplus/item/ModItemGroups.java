package com.flez.vanillaplus.item;

import com.flez.vanillaplus.VanillaPlus;
import com.flez.vanillaplus.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

    public class ModItemGroups {
        public static final ItemGroup FIREPROOF_WOOD_BLOCKS = Registry.register(
                Registries.ITEM_GROUP, Identifier.of(VanillaPlus.MOD_ID, "fireproof_wood_blocks"),
                FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.FIREPROOF_OAK_LOG))
                        .displayName(Text.translatable("itemgroup.vanillaplus.fireproof_wood_blocks"))
                        .entries((displayContext, entries) -> {
                            //  Oak
                            entries.add(ModBlocks.FIREPROOF_OAK_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_OAK_LOG);
                            entries.add(ModBlocks.FIREPROOF_OAK_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD);

                            //  Spruce
                            entries.add(ModBlocks.FIREPROOF_SPRUCE_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG);
                            entries.add(ModBlocks.FIREPROOF_SPRUCE_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD);

                            //  Birch
                            entries.add(ModBlocks.FIREPROOF_BIRCH_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_BIRCH_LOG);
                            entries.add(ModBlocks.FIREPROOF_BIRCH_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_BIRCH_WOOD);

                            //  Jungle
                            entries.add(ModBlocks.FIREPROOF_JUNGLE_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_JUNGLE_LOG);
                            entries.add(ModBlocks.FIREPROOF_JUNGLE_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_JUNGLE_WOOD);

                            //  Acacia
                            entries.add(ModBlocks.FIREPROOF_ACACIA_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_ACACIA_LOG);
                            entries.add(ModBlocks.FIREPROOF_ACACIA_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_ACACIA_WOOD);

                            //  Dark Oak
                            entries.add(ModBlocks.FIREPROOF_DARK_OAK_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG);
                            entries.add(ModBlocks.FIREPROOF_DARK_OAK_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD);

                            //  Mangrove
                            entries.add(ModBlocks.FIREPROOF_MANGROVE_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG);
                            entries.add(ModBlocks.FIREPROOF_MANGROVE_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD);

                            //  Cherry
                            entries.add(ModBlocks.FIREPROOF_CHERRY_LOG);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG);
                            entries.add(ModBlocks.FIREPROOF_CHERRY_WOOD);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD);

                            //  Bamboo
                            entries.add(ModBlocks.FIREPROOF_BAMBOO_BLOCK);
                            entries.add(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK);
                        }).build());

        public static void registerItemGroup() {
            VanillaPlus.LOGGER.info("Registering Item groups for " + VanillaPlus.MOD_ID);
        }
    }