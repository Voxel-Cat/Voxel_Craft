package net.mcreator.voxelcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class IcescepterProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.FREEZE, 10);
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.POWDER_SNOW.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 2, z), Blocks.POWDER_SNOW.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 3, z), Blocks.POWDER_SNOW.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 4, z), Blocks.POWDER_SNOW.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 2, z), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), Blocks.ICE.defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Stray(EntityType.STRAY, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
