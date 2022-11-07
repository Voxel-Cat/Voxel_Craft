package net.mcreator.voxelcraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class IcespikeRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setCustomName(new TextComponent("ice spike tower (cooldown)"));
		class IcespikeRangedItemUsedWait2 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(IcespikeRangedItemUsedWait2.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					IcespikeRangedItemUsedWait2.this.ticks += 1;
					if (IcespikeRangedItemUsedWait2.this.ticks >= IcespikeRangedItemUsedWait2.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(IcespikeRangedItemUsedWait2.this);
				entity.setCustomName(new TextComponent("ice spike tower"));
			}
		}
		new IcespikeRangedItemUsedWait2().start(world, 20);
	}
}
