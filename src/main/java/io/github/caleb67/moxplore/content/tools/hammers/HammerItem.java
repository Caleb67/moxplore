package io.github.caleb67.moxplore.content.tools.hammers;

import java.util.List;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HammerItem extends PickaxeItem {
    

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        // usage tooltip
        tooltip.add(Text.translatable("item.moxplore.hammer.tooltip").formatted(Formatting.AQUA));
    }


    public HammerItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        BlockPos.iterateOutwards(pos, 1, 1, 1).forEach(e -> 
        {
            if (isSuitableFor(world.getBlockState(e))) {
                world.breakBlock(e, true);
            }
         }

        );
        return super.postMine(stack, world, state, pos, miner);
    }
    
}
