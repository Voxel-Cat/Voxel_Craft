
package net.mcreator.voxelcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.voxelcraft.init.VoxelCraftModTabs;

public class CorecasingItem extends Item {
	public CorecasingItem() {
		super(new Item.Properties().tab(VoxelCraftModTabs.TAB_MODDEDCRAFTING_COMPONENTS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
