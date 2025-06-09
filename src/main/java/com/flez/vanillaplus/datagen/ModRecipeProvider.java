package com.flez.vanillaplus.datagen;

import com.flez.vanillaplus.block.ModBlocks;
import com.flez.vanillaplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        // 9 oxidized copper ingot -> 1 oxidized copper
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_COPPER)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.OXIDIZED_COPPER_INGOT)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter, Identifier.of("vanillaplus", "oxidized_copper_block_from_ingots"));

        // Shapeless: 1 vanilla oxidized copper block → 9 custom ingots
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OXIDIZED_COPPER_INGOT, 9)
                .input(Blocks.OXIDIZED_COPPER)
                .criterion(hasItem(Blocks.OXIDIZED_COPPER), conditionsFromItem(Blocks.OXIDIZED_COPPER))
                .offerTo(recipeExporter, Identifier.of("vanillaplus", "oxidized_copper_ingots_from_block"));

        
    }
}
