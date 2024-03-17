package io.github.caleb67.moxplore.register;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModPortals {
    
    public static void init() {

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
