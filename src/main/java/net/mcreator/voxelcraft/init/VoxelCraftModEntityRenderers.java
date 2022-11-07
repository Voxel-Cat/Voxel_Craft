
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.voxelcraft.client.renderer.FrosttowerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VoxelCraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(VoxelCraftModEntities.ICESCEPTER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(VoxelCraftModEntities.ICESPIKE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(VoxelCraftModEntities.FROSTTOWER.get(), FrosttowerRenderer::new);
	}
}
