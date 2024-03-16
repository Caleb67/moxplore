package io.github.caleb67.moxplore.register;

import io.github.caleb67.moxplore.content.items.WaterOrb;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;


public class ModItems implements ItemRegistryContainer{
    
    public static Item WATER_FILTER = new WaterOrb(new FabricItemSettings());

}
