package com.flez.vanillaplus.datagen;

import com.flez.vanillaplus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootableProvider extends FabricBlockLootTableProvider {
    public ModLootableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.FIREPROOF_OAK_PLANKS);
        addDrop(ModBlocks.FIREPROOF_OAK_LOG);
        addDrop(ModBlocks.FIREPROOF_OAK_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_OAK_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD);

        addDrop(ModBlocks.FIREPROOF_SPRUCE_PLANKS);
        addDrop(ModBlocks.FIREPROOF_SPRUCE_LOG);
        addDrop(ModBlocks.FIREPROOF_SPRUCE_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD);

        addDrop(ModBlocks.FIREPROOF_DARK_OAK_PLANKS);
        addDrop(ModBlocks.FIREPROOF_DARK_OAK_LOG);
        addDrop(ModBlocks.FIREPROOF_DARK_OAK_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD);

        addDrop(ModBlocks.FIREPROOF_BIRCH_PLANKS);
        addDrop(ModBlocks.FIREPROOF_BIRCH_LOG);
        addDrop(ModBlocks.FIREPROOF_BIRCH_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_BIRCH_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_BIRCH_WOOD);

        addDrop(ModBlocks.FIREPROOF_JUNGLE_PLANKS);
        addDrop(ModBlocks.FIREPROOF_JUNGLE_LOG);
        addDrop(ModBlocks.FIREPROOF_JUNGLE_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_JUNGLE_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_JUNGLE_WOOD);

        addDrop(ModBlocks.FIREPROOF_CHERRY_PLANKS);
        addDrop(ModBlocks.FIREPROOF_CHERRY_LOG);
        addDrop(ModBlocks.FIREPROOF_CHERRY_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD);

        addDrop(ModBlocks.FIREPROOF_MANGROVE_PLANKS);
        addDrop(ModBlocks.FIREPROOF_MANGROVE_LOG);
        addDrop(ModBlocks.FIREPROOF_MANGROVE_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD);

        addDrop(ModBlocks.FIREPROOF_BAMBOO_PLANKS);
        addDrop(ModBlocks.FIREPROOF_BAMBOO_LOG);
        addDrop(ModBlocks.FIREPROOF_BAMBOO_WOOD);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_LOG);
        addDrop(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_WOOD);
        addDrop(ModBlocks.FIREPROOF_BAMBOO_MOSAIC);
    }
}
