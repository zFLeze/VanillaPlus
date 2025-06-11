package com.flez.vanillaplus.datagen;

import com.flez.vanillaplus.block.ModBlocks;
import com.flez.vanillaplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private void registerLogPair(BlockStateModelGenerator blockStateModelGenerator,
                                Block log, Block wood,
                                Block strippedLog, Block strippedWood) {
        blockStateModelGenerator.registerLog(log).log(log).wood(wood);
        blockStateModelGenerator.registerLog(strippedLog).log(strippedLog).wood(strippedWood);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //  PLANKS
        BlockStateModelGenerator.BlockTexturePool fireproofOakPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofSprucePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_SPRUCE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofDarkOakPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_DARK_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofJunglePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofCherryPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_CHERRY_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofAcaciaPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_ACACIA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofMangrovePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_MANGROVE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofBambooPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool fireproofBirchPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREPROOF_BIRCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIREPROOF_BAMBOO_MOSAIC);


        //  NON BLOCK FIREPROOF WOOD BLOCKS
        //  OAK
        fireproofOakPlanksPool.slab(ModBlocks.FIREPROOF_OAK_SLAB);
        fireproofOakPlanksPool.fence(ModBlocks.FIREPROOF_OAK_FENCE);
        fireproofOakPlanksPool.fenceGate(ModBlocks.FIREPROOF_OAK_FENCE_GATE);
        fireproofOakPlanksPool.pressurePlate(ModBlocks.FIREPROOF_OAK_PRESSURE_PLATE);
        fireproofOakPlanksPool.button(ModBlocks.FIREPROOF_OAK_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_OAK_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_OAK_DOOR);

        //  SPRUCE
        fireproofSprucePlanksPool.slab(ModBlocks.FIREPROOF_SPRUCE_SLAB);
        fireproofSprucePlanksPool.fence(ModBlocks.FIREPROOF_SPRUCE_FENCE);
        fireproofSprucePlanksPool.fenceGate(ModBlocks.FIREPROOF_SPRUCE_FENCE_GATE);
        fireproofSprucePlanksPool.pressurePlate(ModBlocks.FIREPROOF_SPRUCE_PRESSURE_PLATE);
        fireproofSprucePlanksPool.button(ModBlocks.FIREPROOF_SPRUCE_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_SPRUCE_DOOR);

        //  DARK OAK
        fireproofDarkOakPlanksPool.slab(ModBlocks.FIREPROOF_DARK_OAK_SLAB);
        fireproofDarkOakPlanksPool.fence(ModBlocks.FIREPROOF_DARK_OAK_FENCE);
        fireproofDarkOakPlanksPool.fenceGate(ModBlocks.FIREPROOF_DARK_OAK_FENCE_GATE);
        fireproofDarkOakPlanksPool.pressurePlate(ModBlocks.FIREPROOF_DARK_OAK_PRESSURE_PLATE);
        fireproofDarkOakPlanksPool.button(ModBlocks.FIREPROOF_DARK_OAK_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_DARK_OAK_DOOR);

        //  JUNGLE
        fireproofJunglePlanksPool.slab(ModBlocks.FIREPROOF_JUNGLE_SLAB);
        fireproofJunglePlanksPool.fence(ModBlocks.FIREPROOF_JUNGLE_FENCE);
        fireproofJunglePlanksPool.fenceGate(ModBlocks.FIREPROOF_JUNGLE_FENCE_GATE);
        fireproofJunglePlanksPool.pressurePlate(ModBlocks.FIREPROOF_JUNGLE_PRESSURE_PLATE);
        fireproofJunglePlanksPool.button(ModBlocks.FIREPROOF_JUNGLE_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_JUNGLE_DOOR);

        //  ACACIA
        fireproofAcaciaPlanksPool.slab(ModBlocks.FIREPROOF_ACACIA_SLAB);
        fireproofAcaciaPlanksPool.fence(ModBlocks.FIREPROOF_ACACIA_FENCE);
        fireproofAcaciaPlanksPool.fenceGate(ModBlocks.FIREPROOF_ACACIA_FENCE_GATE);
        fireproofAcaciaPlanksPool.pressurePlate(ModBlocks.FIREPROOF_ACACIA_PRESSURE_PLATE);
        fireproofAcaciaPlanksPool.button(ModBlocks.FIREPROOF_ACACIA_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_ACACIA_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_ACACIA_DOOR);

        //  MANGROVE
        fireproofMangrovePlanksPool.slab(ModBlocks.FIREPROOF_MANGROVE_SLAB);
        fireproofMangrovePlanksPool.fence(ModBlocks.FIREPROOF_MANGROVE_FENCE);
        fireproofMangrovePlanksPool.fenceGate(ModBlocks.FIREPROOF_MANGROVE_FENCE_GATE);
        fireproofMangrovePlanksPool.pressurePlate(ModBlocks.FIREPROOF_MANGROVE_PRESSURE_PLATE);
        fireproofMangrovePlanksPool.button(ModBlocks.FIREPROOF_MANGROVE_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_MANGROVE_DOOR);

        //  CHERRY
        fireproofCherryPlanksPool.slab(ModBlocks.FIREPROOF_CHERRY_SLAB);
        fireproofCherryPlanksPool.fence(ModBlocks.FIREPROOF_CHERRY_FENCE);
        fireproofCherryPlanksPool.fenceGate(ModBlocks.FIREPROOF_CHERRY_FENCE_GATE);
        fireproofCherryPlanksPool.pressurePlate(ModBlocks.FIREPROOF_CHERRY_PRESSURE_PLATE);
        fireproofCherryPlanksPool.button(ModBlocks.FIREPROOF_CHERRY_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_CHERRY_DOOR);

        //  BAMBOO
        fireproofBambooPlanksPool.slab(ModBlocks.FIREPROOF_BAMBOO_SLAB);
        fireproofBambooPlanksPool.fence(ModBlocks.FIREPROOF_BAMBOO_FENCE);
        fireproofBambooPlanksPool.fenceGate(ModBlocks.FIREPROOF_BAMBOO_FENCE_GATE);
        fireproofBambooPlanksPool.pressurePlate(ModBlocks.FIREPROOF_BAMBOO_PRESSURE_PLATE);
        fireproofBambooPlanksPool.button(ModBlocks.FIREPROOF_BAMBOO_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_BAMBOO_DOOR);

        //  BIRCH
        fireproofBirchPlanksPool.slab(ModBlocks.FIREPROOF_BIRCH_SLAB);
        fireproofBirchPlanksPool.fence(ModBlocks.FIREPROOF_BIRCH_FENCE);
        fireproofBirchPlanksPool.fenceGate(ModBlocks.FIREPROOF_BIRCH_FENCE_GATE);
        fireproofBirchPlanksPool.pressurePlate(ModBlocks.FIREPROOF_BIRCH_PRESSURE_PLATE);
        fireproofBirchPlanksPool.button(ModBlocks.FIREPROOF_BIRCH_BUTTON);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREPROOF_BIRCH_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.FIREPROOF_BIRCH_DOOR);


        //  LOGS & WOODS
        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_OAK_LOG,
                ModBlocks.FIREPROOF_OAK_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_OAK_LOG,
                ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_SPRUCE_LOG,
                ModBlocks.FIREPROOF_SPRUCE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_DARK_OAK_LOG,
                ModBlocks.FIREPROOF_DARK_OAK_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_JUNGLE_LOG,
                ModBlocks.FIREPROOF_JUNGLE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_JUNGLE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_JUNGLE_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_ACACIA_LOG,
                ModBlocks.FIREPROOF_ACACIA_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_LOG,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_MANGROVE_LOG,
                ModBlocks.FIREPROOF_MANGROVE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_CHERRY_LOG,
                ModBlocks.FIREPROOF_CHERRY_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD);

        registerLogPair(blockStateModelGenerator,
                ModBlocks.FIREPROOF_BIRCH_LOG,
                ModBlocks.FIREPROOF_BIRCH_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_BIRCH_LOG,
                ModBlocks.FIREPROOF_STRIPPED_BIRCH_WOOD);

        blockStateModelGenerator.registerLog(ModBlocks.FIREPROOF_BAMBOO_BLOCK)
                .log(ModBlocks.FIREPROOF_BAMBOO_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK)
                .log(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK);
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