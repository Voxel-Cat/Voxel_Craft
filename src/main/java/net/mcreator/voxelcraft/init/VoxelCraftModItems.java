
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.voxelcraft.item.ThelibraryItem;
import net.mcreator.voxelcraft.item.QuartzenrichedironItem;
import net.mcreator.voxelcraft.item.IcespikeItem;
import net.mcreator.voxelcraft.item.IcescepterItem;
import net.mcreator.voxelcraft.item.ElementalcoreItem;
import net.mcreator.voxelcraft.item.DecrypterItem;
import net.mcreator.voxelcraft.item.CorecasingItem;
import net.mcreator.voxelcraft.VoxelCraftMod;

public class VoxelCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VoxelCraftMod.MODID);
	public static final RegistryObject<Item> THELIBRARY = REGISTRY.register("thelibrary", () -> new ThelibraryItem());
	public static final RegistryObject<Item> DECRYPTER = REGISTRY.register("decrypter", () -> new DecrypterItem());
	public static final RegistryObject<Item> ELEMENTALCORE = REGISTRY.register("elementalcore", () -> new ElementalcoreItem());
	public static final RegistryObject<Item> CORECASING = REGISTRY.register("corecasing", () -> new CorecasingItem());
	public static final RegistryObject<Item> QUARTZENRICHEDIRON = REGISTRY.register("quartzenrichediron", () -> new QuartzenrichedironItem());
	public static final RegistryObject<Item> ICESCEPTER = REGISTRY.register("icescepter", () -> new IcescepterItem());
	public static final RegistryObject<Item> ICESPIKE = REGISTRY.register("icespike", () -> new IcespikeItem());
	public static final RegistryObject<Item> FROSTTOWER = REGISTRY.register("frosttower_spawn_egg",
			() -> new ForgeSpawnEggItem(VoxelCraftModEntities.FROSTTOWER, -13369345, -6710887,
					new Item.Properties().tab(VoxelCraftModTabs.TAB_ELEMENTALITEMS)));
	public static final RegistryObject<Item> FROSTTOWERPEDESTAL = block(VoxelCraftModBlocks.FROSTTOWERPEDESTAL, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
