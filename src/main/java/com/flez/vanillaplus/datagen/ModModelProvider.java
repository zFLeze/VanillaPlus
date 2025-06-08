package com.flez.vanillaplus.datagen;

import com.flez.vanillaplus.block.ModBlocks;
import com.flez.vanillaplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.block.Block;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_OAK_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_OAK_LOG,
                ModBlocks.FIREPROOF_STRIPPED_OAK_LOG,
                ModBlocks.FIREPROOF_OAK_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_SPRUCE_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_SPRUCE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG,
                ModBlocks.FIREPROOF_SPRUCE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_DARK_OAK_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_DARK_OAK_LOG,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG,
                ModBlocks.FIREPROOF_DARK_OAK_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_MANGROVE_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_MANGROVE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG,
                ModBlocks.FIREPROOF_MANGROVE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_CHERRY_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_CHERRY_LOG,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG,
                ModBlocks.FIREPROOF_CHERRY_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_ACACIA_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_ACACIA_LOG,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_LOG,
                ModBlocks.FIREPROOF_ACACIA_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_BAMBOO_PLANKS);
        registerLogPair(generator,
                ModBlocks.FIREPROOF_BAMBOO_LOG,
                ModBlocks.FIREPROOF_STRIPPED_BAMBOO_LOG,
                ModBlocks.FIREPROOF_BAMBOO_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_BAMBOO_WOOD);

        generator.registerSimpleCubeAll(ModBlocks.FIREPROOF_BAMBOO_MOSAIC);
    }

    private void registerLogPair(BlockStateModelGenerator generator,
                                 Block log,
                                 Block strippedLog,
                                 Block wood,
                                 Block strippedWood) {
        generator.registerLog(log)
                .log(log)
                .log(strippedLog)
                .wood(wood)
                .wood(strippedWood);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_DUST, Models.GENERATED);
    }
}
