package io.github.caleb67.moxplore.register;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ModBlocks implements BlockRegistryContainer {

    public static final Block DOWNSTONE = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block DOWN_GRASS = new Block(FabricBlockSettings.create().strength(4.0f));

}
