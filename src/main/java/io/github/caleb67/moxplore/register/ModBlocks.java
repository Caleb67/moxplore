package io.github.caleb67.moxplore.register;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import static net.minecraft.sound.BlockSoundGroup.WOOD;
import static net.minecraft.sound.BlockSoundGroup.MOSS_BLOCK;
import static net.minecraft.sound.BlockSoundGroup.STONE;

public class ModBlocks implements BlockRegistryContainer {

    // Downside Blocks

    public static final Block DOWNSTONE = new Block(FabricBlockSettings.create().strength(4.0f).sounds(STONE).requiresTool());
    public static final Block DOWN_GRASS = new Block(FabricBlockSettings.create().strength(2.0f).sounds(MOSS_BLOCK).requiresTool());


    // Chiseled Planks

    public static final Block CHISELED_ACACIA_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_OAK_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_SPRUCE_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_MANGROVE_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_DARK_OAK_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_JUNGLE_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_WARPED_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_CRIMSON_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_BIRCH_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_CHERRY_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));
    public static final Block CHISELED_BAMBOO_PLANKS = new Block(FabricBlockSettings.create().sounds(WOOD).strength(4.0f));


    // Chiseled Stone

    public static final Block NEAT_COBBLESTONE = new Block(FabricBlockSettings.create().sounds(STONE).strength(3.0f).requiresTool());
    public static final Block NEAT_COBBLED_DEEPSLATE = new Block(FabricBlockSettings.create().sounds(STONE).strength(3.0f).requiresTool());
}
