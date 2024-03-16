package io.github.caleb67.moxplore;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.caleb67.moxplore.register.ModEquipment;
import io.github.caleb67.moxplore.register.ModBlocks;
import io.github.caleb67.moxplore.register.ModItems;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;

public class Moxplore implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("moxplore");
	public static final String MOD_ID = "moxplore";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Expanding the minecraft world...");

		FieldRegistrationHandler.register(ModEquipment.class, MOD_ID, false);
		FieldRegistrationHandler.register(ModBlocks.class, MOD_ID, false);
		FieldRegistrationHandler.register(ModItems.class, MOD_ID, false);
		
		CustomPortalBuilder.beginPortal()  
        .frameBlock(Blocks.CRYING_OBSIDIAN)  
        .lightWithItem(Items.POTION)  
        .destDimID(new Identifier("moxplore:downside"))  
        .tintColor(84, 65, 136)  
        .registerPortal();

		CustomPortalBuilder.beginPortal()  
        .frameBlock(Blocks.POLISHED_DEEPSLATE)  
        .destDimID(new Identifier("moxplore:plains"))  
        .tintColor(95, 199, 45)  
        .registerPortal();
		
		
	}
}

