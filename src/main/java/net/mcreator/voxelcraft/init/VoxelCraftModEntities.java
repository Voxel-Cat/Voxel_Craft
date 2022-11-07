
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.voxelcraft.entity.IcespikeEntity;
import net.mcreator.voxelcraft.entity.IcescepterEntity;
import net.mcreator.voxelcraft.entity.FrosttowerEntity;
import net.mcreator.voxelcraft.VoxelCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VoxelCraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, VoxelCraftMod.MODID);
	public static final RegistryObject<EntityType<IcescepterEntity>> ICESCEPTER = register("projectile_icescepter",
			EntityType.Builder.<IcescepterEntity>of(IcescepterEntity::new, MobCategory.MISC).setCustomClientFactory(IcescepterEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IcespikeEntity>> ICESPIKE = register("projectile_icespike",
			EntityType.Builder.<IcespikeEntity>of(IcespikeEntity::new, MobCategory.MISC).setCustomClientFactory(IcespikeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FrosttowerEntity>> FROSTTOWER = register("frosttower",
			EntityType.Builder.<FrosttowerEntity>of(FrosttowerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(FrosttowerEntity::new)

					.sized(3f, 2.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FrosttowerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FROSTTOWER.get(), FrosttowerEntity.createAttributes().build());
	}
}
