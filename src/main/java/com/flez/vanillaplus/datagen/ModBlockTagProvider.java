package com.flez.vanillaplus.datagen;

import com.flez.vanillaplus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.FIREPROOF_OAK_PLANKS)
                .add(ModBlocks.FIREPROOF_OAK_LOG)
                .add(ModBlocks.FIREPROOF_OAK_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_OAK_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD)

                .add(ModBlocks.FIREPROOF_SPRUCE_PLANKS)
                .add(ModBlocks.FIREPROOF_SPRUCE_LOG)
                .add(ModBlocks.FIREPROOF_SPRUCE_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD)

                .add(ModBlocks.FIREPROOF_DARK_OAK_PLANKS)
                .add(ModBlocks.FIREPROOF_DARK_OAK_LOG)
                .add(ModBlocks.FIREPROOF_DARK_OAK_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD)

                .add(ModBlocks.FIREPROOF_JUNGLE_PLANKS)
                .add(ModBlocks.FIREPROOF_JUNGLE_LOG)
                .add(ModBlocks.FIREPROOF_JUNGLE_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_JUNGLE_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_JUNGLE_WOOD)

                .add(ModBlocks.FIREPROOF_CHERRY_PLANKS)
                .add(ModBlocks.FIREPROOF_CHERRY_LOG)
                .add(ModBlocks.FIREPROOF_CHERRY_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD)

                .add(ModBlocks.FIREPROOF_BAMBOO_PLANKS)
                .add(ModBlocks.FIREPROOF_BAMBOO_BLOCK)
                .add(ModBlocks.FIREPROOF_BAMBOO_MOSAIC)
                .add(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK)

                .add(ModBlocks.FIREPROOF_MANGROVE_PLANKS)
                .add(ModBlocks.FIREPROOF_MANGROVE_LOG)
                .add(ModBlocks.FIREPROOF_MANGROVE_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD)

                .add(ModBlocks.FIREPROOF_ACACIA_PLANKS)
                .add(ModBlocks.FIREPROOF_ACACIA_LOG)
                .add(ModBlocks.FIREPROOF_ACACIA_WOOD)
                .add(ModBlocks.FIREPROOF_STRIPPED_ACACIA_LOG)
                .add(ModBlocks.FIREPROOF_STRIPPED_ACACIA_WOOD);
    }
}
