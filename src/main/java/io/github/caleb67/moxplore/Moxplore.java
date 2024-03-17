package io.github.caleb67.moxplore;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.caleb67.moxplore.register.ModEquipment;
import io.github.caleb67.moxplore.register.ModBlocks;
import io.github.caleb67.moxplore.register.ModItems;
import io.github.caleb67.moxplore.register.ModPortals;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;

public class Moxplore implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("moxplore");
	public static final String MOD_ID = "moxplore";

	private static final ItemGroup MOXLPORE_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModEquipment.COPPER_HAMMER))
			.displayName(Text.translatable("itemGroup.moxplore.moxplore_group"))
			.entries((context, entries) -> {
				entries.add(ModEquipment.COPPER_HAMMER);
				entries.add(ModEquipment.IRON_HAMMER);
				entries.add(ModEquipment.GOLD_HAMMER);
				entries.add(ModEquipment.DIAMOND_HAMMER);
				entries.add(ModEquipment.NETHERITE_HAMMER);
				entries.add(ModEquipment.COPPER_AXE);
				entries.add(ModEquipment.COPPER_HOE);
				entries.add(ModEquipment.COPPER_PICKAXE);
				entries.add(ModEquipment.COPPER_SHOVEL);
				entries.add(ModEquipment.COPPER_SWORD);
				entries.add(ModItems.WATER_FILTER);
				entries.add(ModBlocks.CHISELED_ACACIA_PLANKS);
				entries.add(ModBlocks.CHISELED_BAMBOO_PLANKS);
				entries.add(ModBlocks.CHISELED_BIRCH_PLANKS);
				entries.add(ModBlocks.CHISELED_CHERRY_PLANKS);
				entries.add(ModBlocks.CHISELED_CRIMSON_PLANKS);
				entries.add(ModBlocks.CHISELED_DARK_OAK_PLANKS);
				entries.add(ModBlocks.CHISELED_JUNGLE_PLANKS);
				entries.add(ModBlocks.CHISELED_MANGROVE_PLANKS);
				entries.add(ModBlocks.CHISELED_OAK_PLANKS);
				entries.add(ModBlocks.CHISELED_SPRUCE_PLANKS);
				entries.add(ModBlocks.CHISELED_WARPED_PLANKS);
				entries.add(ModBlocks.NEAT_COBBLED_DEEPSLATE);
				entries.add(ModBlocks.NEAT_COBBLESTONE);
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Expanding the minecraft world...");

		FieldRegistrationHandler.register(ModEquipment.class, MOD_ID, false);
		FieldRegistrationHandler.register(ModBlocks.class, MOD_ID, false);
		FieldRegistrationHandler.register(ModItems.class, MOD_ID, false);


		Registry.register(Registries.ITEM_GROUP, new Identifier("moxplore", "moxplore"), MOXLPORE_GROUP);
		
		ModPortals.init();
		
		
	}
}

