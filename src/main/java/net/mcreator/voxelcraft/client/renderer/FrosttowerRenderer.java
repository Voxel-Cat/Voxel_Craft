
package net.mcreator.voxelcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.voxelcraft.entity.FrosttowerEntity;
import net.mcreator.voxelcraft.client.model.Modelcustom_model;

public class FrosttowerRenderer extends MobRenderer<FrosttowerEntity, Modelcustom_model<FrosttowerEntity>> {
	public FrosttowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrosttowerEntity entity) {
		return new ResourceLocation("voxel_craft:textures/entities/frost_tower.png");
	}
}
