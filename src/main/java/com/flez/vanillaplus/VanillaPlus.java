package com.flez.vanillaplus;

import com.flez.vanillaplus.block.ModBlocks;
import com.flez.vanillaplus.item.ModItemGroups;
import com.flez.vanillaplus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaPlus implements ModInitializer {
	public static final String MOD_ID = "vanillaplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroup();
	}
}