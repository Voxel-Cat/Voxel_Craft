
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.voxelcraft.block.ThelibraryPortalBlock;
import net.mcreator.voxelcraft.block.FrosttowerpedestalBlock;
import net.mcreator.voxelcraft.VoxelCraftMod;

public class VoxelCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VoxelCraftMod.MODID);
	public static final RegistryObject<Block> THELIBRARY_PORTAL = REGISTRY.register("thelibrary_portal", () -> new ThelibraryPortalBlock());
	public static final RegistryObject<Block> FROSTTOWERPEDESTAL = REGISTRY.register("frosttowerpedestal", () -> new FrosttowerpedestalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ThelibraryPortalBlock.registerRenderLayer();
			FrosttowerpedestalBlock.registerRenderLayer();
		}
	}
}
