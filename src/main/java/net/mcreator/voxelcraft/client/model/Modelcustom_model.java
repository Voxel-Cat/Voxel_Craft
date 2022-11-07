package net.mcreator.voxelcraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("voxel_craft", "modelcustom_model"), "main");
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition
				.addOrReplaceChild(
						"bone", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(0, 67).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 54).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, -0.7854F, 0.0F, 0.7854F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-16.5F, 14.0F, -16.5F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-16.5F, 13.0F, -16.5F));
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(16.5F, 13.0F, -16.5F));
		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(16.5F, 13.0F, -16.5F));
		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(16.5F, 13.0F, 16.5F));
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(16.5F, 13.0F, 16.5F));
		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(0, 43).addBox(10.0F, -5.5F, 10.0F, 13.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(51, 6)
						.addBox(10.0F, -5.5F, -23.0F, 13.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(39, 30)
						.addBox(-23.0F, -5.5F, -23.0F, 13.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-23.0F, -5.5F, 10.0F, 13.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.5F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 67).addBox(-3.5F, -11.0F, 0.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5F, -11.0F, -16.5F, -0.0873F, -0.7854F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(54, 70).addBox(-3.5F, -11.0F, 0.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.5F, -11.0F, -16.5F, -0.0873F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(76, 70).addBox(-3.5F, -11.0F, 0.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.5F, -11.0F, 16.5F, -0.0873F, -0.7854F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 80).addBox(-3.5F, -11.0F, 0.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5F, -11.0F, 16.5F, -0.0873F, 0.7854F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(22, 82).addBox(-3.5F, -11.0F, -4.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5F, -11.0F, -16.5F, 0.0873F, -0.7854F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(84, 54).addBox(-3.5F, -11.0F, -4.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.5F, -11.0F, -16.5F, 0.0873F, 0.7854F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(44, 85).addBox(-3.5F, -11.0F, -4.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.5F, -11.0F, 16.5F, 0.0873F, -0.7854F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(66, 85).addBox(-3.5F, -11.0F, -4.5F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5F, -11.0F, 16.5F, 0.1309F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
