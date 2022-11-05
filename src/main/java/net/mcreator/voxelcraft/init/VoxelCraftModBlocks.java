
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.voxelcraft.block.ThelibraryPortalBlock;
import net.mcreator.voxelcraft.VoxelCraftMod;

public class VoxelCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VoxelCraftMod.MODID);
	public static final RegistryObject<Block> THELIBRARY_PORTAL = REGISTRY.register("thelibrary_portal", () -> new ThelibraryPortalBlock());
}
