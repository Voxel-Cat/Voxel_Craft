
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.voxelcraft.item.ThelibraryItem;
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
}
