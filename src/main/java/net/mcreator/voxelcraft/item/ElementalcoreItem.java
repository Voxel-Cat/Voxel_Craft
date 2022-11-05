
package net.mcreator.voxelcraft.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.voxelcraft.init.VoxelCraftModTabs;

public class ElementalcoreItem extends Item {
	public ElementalcoreItem() {
		super(new Item.Properties().tab(VoxelCraftModTabs.TAB_ELEMENTALITEMS).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
