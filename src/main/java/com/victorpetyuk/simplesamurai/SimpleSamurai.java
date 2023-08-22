package com.victorpetyuk.simplesamurai;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.victorpetyuk.simplesamurai.item.ModItems;
import com.victorpetyuk.simplesamurai.item.ModItemGroups;

public class SimpleSamurai implements ModInitializer {
	public static final String MOD_ID = "simplesamurai";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}