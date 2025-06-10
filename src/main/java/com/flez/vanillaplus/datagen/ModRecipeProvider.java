package com.flez.vanillaplus.datagen;

import com.flez.vanillaplus.VanillaPlus;
import com.flez.vanillaplus.block.ModBlocks;
import com.flez.vanillaplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    //  Craft Fireproof Planks from Logs/Woods
    private void offerCraftPlanksRecipe(RecipeExporter exporter, Item logOrWood, Item planks, String name) {
        String logOrWoodName = Registries.ITEM.getId(logOrWood.asItem()).getPath();
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, planks, 4)
                .input(logOrWood)
                .criterion("has_fireproof_log", conditionsFromItem(logOrWood))
                .offerTo(exporter, Identifier.of(VanillaPlus.MOD_ID, name + "_from_" + logOrWoodName));
    }
    //  Craft Fireproof Wood
    private void offerFireproofLogRecipe(RecipeExporter exporter, Item inputLogOrWood, Item resultFireproofLog, String name) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, resultFireproofLog, 1)
                .input(inputLogOrWood)
                .input(Items.HONEYCOMB)
                .criterion("has_log", conditionsFromItem(inputLogOrWood))
                .criterion("has_honeycomb", conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, Identifier.of(VanillaPlus.MOD_ID, name));
    }

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        // Oxidized Copper Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_COPPER)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.OXIDIZED_COPPER_INGOT)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter, Identifier.of("vanillaplus", "oxidized_copper_block_from_ingots"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OXIDIZED_COPPER_INGOT, 9)
                .input(Blocks.OXIDIZED_COPPER)
                .criterion(hasItem(Blocks.OXIDIZED_COPPER), conditionsFromItem(Blocks.OXIDIZED_COPPER))
                .offerTo(recipeExporter, Identifier.of("vanillaplus", "oxidized_copper_ingots_from_block"));



        //  Fireproof Logs, Planks And Wood Blocks
        //  PLANKS
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_OAK_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_OAK_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_OAK_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_OAK_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_oak_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_SPRUCE_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_SPRUCE_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_SPRUCE_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_SPRUCE_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_spruce_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_DARK_OAK_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_DARK_OAK_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_DARK_OAK_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_DARK_OAK_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_dark_oak_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_JUNGLE_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_JUNGLE_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_JUNGLE_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_JUNGLE_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_jungle_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_BIRCH_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_BIRCH_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_BIRCH_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_BIRCH_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_birch_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_ACACIA_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_ACACIA_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_ACACIA_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_ACACIA_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_acacia_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_MANGROVE_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_MANGROVE_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_MANGROVE_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_MANGROVE_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_mangrove_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_BAMBOO_PLANKS, 1)
                .input(ModBlocks.FIREPROOF_BAMBOO_PLANKS)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_BAMBOO_PLANKS), conditionsFromItem(ModBlocks.FIREPROOF_BAMBOO_PLANKS))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_bamboo_planks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_BAMBOO_MOSAIC, 1)
                .input(ModBlocks.FIREPROOF_BAMBOO_MOSAIC)
                .input(Items.HONEYCOMB)
                .criterion(hasItem(ModBlocks.FIREPROOF_BAMBOO_MOSAIC), conditionsFromItem(ModBlocks.FIREPROOF_BAMBOO_MOSAIC))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "normal_crafting_fireproof_bamboo_mosaic"));


        //  LOGS & WOOD Blocks
        //  Logs & Woods
        //  Oak
        offerFireproofLogRecipe(recipeExporter,
                Items.OAK_LOG,
                ModBlocks.FIREPROOF_OAK_LOG.asItem(),
                "fireproof_oak_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.OAK_WOOD,
                ModBlocks.FIREPROOF_OAK_WOOD.asItem(),
                "fireproof_oak_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_OAK_LOG,
                ModBlocks.FIREPROOF_STRIPPED_OAK_LOG.asItem(),
                "fireproof_stripped_oak_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_OAK_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD.asItem(),
                "fireproof_stripped_oak_wood");




        //  Spruce
        offerFireproofLogRecipe(recipeExporter,
                Items.SPRUCE_LOG,
                ModBlocks.FIREPROOF_SPRUCE_LOG.asItem(),
                "fireproof_spruce_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.SPRUCE_WOOD,
                ModBlocks.FIREPROOF_SPRUCE_WOOD.asItem(),
                "fireproof_spruce_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_SPRUCE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG.asItem(),
                "fireproof_stripped_spruce_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_SPRUCE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD.asItem(),
                "fireproof_stripped_spruce_wood");



        //  DARK OAK
        offerFireproofLogRecipe(recipeExporter,
                Items.DARK_OAK_LOG,
                ModBlocks.FIREPROOF_DARK_OAK_LOG.asItem(),
                "fireproof_dark_oak_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.DARK_OAK_WOOD,
                ModBlocks.FIREPROOF_DARK_OAK_WOOD.asItem(),
                "fireproof_dark_oak_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_DARK_OAK_LOG,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG.asItem(),
                "fireproof_stripped_dark_oak_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_DARK_OAK_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD.asItem(),
                "fireproof_stripped_dark_oak_wood");



        //  JUNGLE
        offerFireproofLogRecipe(recipeExporter,
                Items.JUNGLE_LOG,
                ModBlocks.FIREPROOF_JUNGLE_LOG.asItem(),
                "fireproof_jungle_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.JUNGLE_WOOD,
                ModBlocks.FIREPROOF_JUNGLE_WOOD.asItem(),
                "fireproof_jungle_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_JUNGLE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_JUNGLE_LOG.asItem(),
                "fireproof_stripped_jungle_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_JUNGLE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_JUNGLE_WOOD.asItem(),
                "fireproof_stripped_jungle_wood");



        //  ACACIA
        offerFireproofLogRecipe(recipeExporter,
                Items.ACACIA_LOG,
                ModBlocks.FIREPROOF_ACACIA_LOG.asItem(),
                "fireproof_acacia_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.ACACIA_WOOD,
                ModBlocks.FIREPROOF_ACACIA_WOOD.asItem(),
                "fireproof_acacia_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_ACACIA_LOG,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_LOG.asItem(),
                "fireproof_stripped_acacia_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_ACACIA_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_WOOD.asItem(),
                "fireproof_stripped_acacia_wood");



        //  MANGROVE
        offerFireproofLogRecipe(recipeExporter,
                Items.MANGROVE_LOG,
                ModBlocks.FIREPROOF_MANGROVE_LOG.asItem(),
                "fireproof_mangrove_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.MANGROVE_WOOD,
                ModBlocks.FIREPROOF_MANGROVE_WOOD.asItem(),
                "fireproof_mangrove_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_MANGROVE_LOG,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG.asItem(),
                "fireproof_stripped_mangrove_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_MANGROVE_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD.asItem(),
                "fireproof_stripped_mangrove_wood");



        //  CHERRY
        offerFireproofLogRecipe(recipeExporter,
                Items.CHERRY_LOG,
                ModBlocks.FIREPROOF_CHERRY_LOG.asItem(),
                "fireproof_cherry_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.CHERRY_WOOD,
                ModBlocks.FIREPROOF_CHERRY_WOOD.asItem(),
                "fireproof_cherry_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_CHERRY_LOG,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG.asItem(),
                "fireproof_stripped_cherry_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_CHERRY_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD.asItem(),
                "fireproof_stripped_cherry_wood");

        // Birch
        offerFireproofLogRecipe(recipeExporter,
                Items.BIRCH_LOG,
                ModBlocks.FIREPROOF_BIRCH_LOG.asItem(),
                "fireproof_birch_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.BIRCH_WOOD,
                ModBlocks.FIREPROOF_BIRCH_WOOD.asItem(),
                "fireproof_birch_wood");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_BIRCH_LOG,
                ModBlocks.FIREPROOF_STRIPPED_BIRCH_LOG.asItem(),
                "fireproof_stripped_birch_log");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_BIRCH_WOOD,
                ModBlocks.FIREPROOF_STRIPPED_BIRCH_WOOD.asItem(),
                "fireproof_stripped_birch_wood");

        // Bamboo
        offerFireproofLogRecipe(recipeExporter,
                Items.BAMBOO_BLOCK,
                ModBlocks.FIREPROOF_BAMBOO_BLOCK.asItem(),
                "fireproof_bamboo_block");

        offerFireproofLogRecipe(recipeExporter,
                Items.STRIPPED_BAMBOO_BLOCK,
                ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK.asItem(),
                "fireproof_stripped_bamboo_block");

        //  Log/Wood ---> 4 Planks
        //  OAK

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_OAK_LOG.asItem(),
                ModBlocks.FIREPROOF_OAK_PLANKS.asItem(),
                "fireproof_oak_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_OAK_WOOD.asItem(),
                ModBlocks.FIREPROOF_OAK_PLANKS.asItem(),
                "fireproof_oak_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_OAK_LOG.asItem(),
                ModBlocks.FIREPROOF_OAK_PLANKS.asItem(),
                "fireproof_oak_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_OAK_WOOD.asItem(),
                ModBlocks.FIREPROOF_OAK_PLANKS.asItem(),
                "fireproof_oak_planks");



        //  SPRUCE
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_SPRUCE_LOG.asItem(),
                ModBlocks.FIREPROOF_SPRUCE_PLANKS.asItem(),
                "fireproof_spruce_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_SPRUCE_WOOD.asItem(),
                ModBlocks.FIREPROOF_SPRUCE_PLANKS.asItem(),
                "fireproof_spruce_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_LOG.asItem(),
                ModBlocks.FIREPROOF_SPRUCE_PLANKS.asItem(),
                "fireproof_spruce_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_SPRUCE_WOOD.asItem(),
                ModBlocks.FIREPROOF_SPRUCE_PLANKS.asItem(),
                "fireproof_spruce_planks");



        //  DARK OAK
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_DARK_OAK_LOG.asItem(),
                ModBlocks.FIREPROOF_DARK_OAK_PLANKS.asItem(),
                "fireproof_dark_oak_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_DARK_OAK_WOOD.asItem(),
                ModBlocks.FIREPROOF_DARK_OAK_PLANKS.asItem(),
                "fireproof_dark_oak_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_LOG.asItem(),
                ModBlocks.FIREPROOF_DARK_OAK_PLANKS.asItem(),
                "fireproof_dark_oak_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_DARK_OAK_WOOD.asItem(),
                ModBlocks.FIREPROOF_DARK_OAK_PLANKS.asItem(),
                "fireproof_dark_oak_planks");



        //  JUNGLE
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_JUNGLE_LOG.asItem(),
                ModBlocks.FIREPROOF_JUNGLE_PLANKS.asItem(),
                "fireproof_jungle_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_JUNGLE_WOOD.asItem(),
                ModBlocks.FIREPROOF_JUNGLE_PLANKS.asItem(),
                "fireproof_jungle_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_JUNGLE_LOG.asItem(),
                ModBlocks.FIREPROOF_JUNGLE_PLANKS.asItem(),
                "fireproof_jungle_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_JUNGLE_WOOD.asItem(),
                ModBlocks.FIREPROOF_JUNGLE_PLANKS.asItem(),
                "fireproof_jungle_planks");



        //  BIRCH
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_BIRCH_LOG.asItem(),
                ModBlocks.FIREPROOF_BIRCH_PLANKS.asItem(),
                "fireproof_birch_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_BIRCH_WOOD.asItem(),
                ModBlocks.FIREPROOF_SPRUCE_PLANKS.asItem(),
                "fireproof_birch_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_BIRCH_LOG.asItem(),
                ModBlocks.FIREPROOF_BIRCH_PLANKS.asItem(),
                "fireproof_birch_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_BIRCH_WOOD.asItem(),
                ModBlocks.FIREPROOF_BIRCH_PLANKS.asItem(),
                "fireproof_birch_planks");



        //  CHERRY
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_CHERRY_LOG.asItem(),
                ModBlocks.FIREPROOF_CHERRY_PLANKS.asItem(),
                "fireproof_cherry_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_CHERRY_WOOD.asItem(),
                ModBlocks.FIREPROOF_CHERRY_PLANKS.asItem(),
                "fireproof_cherry_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_LOG.asItem(),
                ModBlocks.FIREPROOF_CHERRY_PLANKS.asItem(),
                "fireproof_cherry_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_CHERRY_WOOD.asItem(),
                ModBlocks.FIREPROOF_CHERRY_PLANKS.asItem(),
                "fireproof_cherry_planks");



        // ACACIA
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_ACACIA_LOG.asItem(),
                ModBlocks.FIREPROOF_ACACIA_PLANKS.asItem(),
                "fireproof_acacia_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_ACACIA_WOOD.asItem(),
                ModBlocks.FIREPROOF_ACACIA_PLANKS.asItem(),
                "fireproof_acacia_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_LOG.asItem(),
                ModBlocks.FIREPROOF_ACACIA_PLANKS.asItem(),
                "fireproof_acacia_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_ACACIA_WOOD.asItem(),
                ModBlocks.FIREPROOF_ACACIA_PLANKS.asItem(),
                "fireproof_acacia_planks");



        //  MANGROVE
        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_MANGROVE_LOG.asItem(),
                ModBlocks.FIREPROOF_MANGROVE_PLANKS.asItem(),
                "fireproof_mangrove_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_MANGROVE_WOOD.asItem(),
                ModBlocks.FIREPROOF_MANGROVE_PLANKS.asItem(),
                "fireproof_mangrove_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_LOG.asItem(),
                ModBlocks.FIREPROOF_MANGROVE_PLANKS.asItem(),
                "fireproof_mangrove_planks");

        offerCraftPlanksRecipe(recipeExporter,
                ModBlocks.FIREPROOF_STRIPPED_MANGROVE_WOOD.asItem(),
                ModBlocks.FIREPROOF_MANGROVE_PLANKS.asItem(),
                "fireproof_mangrove_planks");


        //  BAMBOO
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_BAMBOO_PLANKS.asItem(), 2)
                .input(ModBlocks.FIREPROOF_BAMBOO_BLOCK.asItem())
                .criterion(hasItem(ModBlocks.FIREPROOF_BAMBOO_BLOCK.asItem()), conditionsFromItem(ModBlocks.FIREPROOF_BAMBOO_BLOCK.asItem()))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "fireproof_bamboo_planks_from_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIREPROOF_BAMBOO_PLANKS.asItem(), 2)
                .input(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK.asItem())
                .criterion(hasItem(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK.asItem()), conditionsFromItem(ModBlocks.FIREPROOF_STRIPPED_BAMBOO_BLOCK.asItem()))
                .offerTo(recipeExporter, Identifier.of(VanillaPlus.MOD_ID, "fireproof_bamboo_planks_from_stripped_block"));

    }
}
