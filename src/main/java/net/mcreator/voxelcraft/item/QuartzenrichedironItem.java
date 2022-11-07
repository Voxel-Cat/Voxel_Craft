
package net.mcreator.voxelcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.voxelcraft.init.VoxelCraftModTabs;

import java.util.List;

public class QuartzenrichedironItem extends Item {
	public QuartzenrichedironItem() {
		super(new Item.Properties().tab(VoxelCraftModTabs.TAB_MODDEDCRAFTING_COMPONENTS).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("it is power"));
	}
}
