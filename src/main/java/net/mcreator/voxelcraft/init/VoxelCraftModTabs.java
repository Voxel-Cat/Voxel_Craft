
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class VoxelCraftModTabs {
	public static CreativeModeTab TAB_TECHNOLOGY;
	public static CreativeModeTab TAB_ELEMENTALITEMS;
	public static CreativeModeTab TAB_MODDEDCRAFTING_COMPONENTS;

	public static void load() {
		TAB_TECHNOLOGY = new CreativeModeTab("tabtechnology") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.COMMAND_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ELEMENTALITEMS = new CreativeModeTab("tabelementalitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(VoxelCraftModItems.ELEMENTALCORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MODDEDCRAFTING_COMPONENTS = new CreativeModeTab("tabmoddedcrafting_components") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CRAFTING_TABLE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
