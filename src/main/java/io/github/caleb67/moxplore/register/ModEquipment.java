package io.github.caleb67.moxplore.register;

import io.github.caleb67.moxplore.content.tools.materials.COPPERMATERIAL;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class ModEquipment implements ItemRegistryContainer {

    public static ToolItem COPPER_PICKAXE = new PickaxeItem(COPPERMATERIAL.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static ToolItem COPPER_AXE = new AxeItem(COPPERMATERIAL.INSTANCE, 5.0F, -3.2F, new FabricItemSettings());
    public static ToolItem COPPER_SHOVEL = new ShovelItem(COPPERMATERIAL.INSTANCE, 1, -1.5F, new FabricItemSettings());
    public static ToolItem COPPER_HOE = new HoeItem(COPPERMATERIAL.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static ToolItem COPPER_SWORD = new SwordItem(COPPERMATERIAL.INSTANCE, 3, -2.4F, new FabricItemSettings());
    
}
