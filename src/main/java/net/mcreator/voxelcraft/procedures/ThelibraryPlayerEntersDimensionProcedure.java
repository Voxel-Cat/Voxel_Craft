package net.mcreator.voxelcraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ThelibraryPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600, 1000));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run fill ~-10 ~-2 ~-10 ~10 ~15 ~10 minecraft:bookshelf hollow");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run fill ~-2 ~-1 ~-12 ~2 ~14 ~12 minecraft:air");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run fill ~-12 ~-1 ~-2 ~12 ~14 ~2 minecraft:air");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run clone ~-10 ~-2 ~-10 ~10 ~15 ~10 ~-10 ~-2 ~-31 replace force");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run clone ~-10 ~-2 ~-31 ~10 ~15 ~10 ~-31 ~-2 ~-31");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run clone ~-10 ~-2 ~-31 ~10 ~15 ~10 ~11 ~-2 ~-31");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/execute at @p run clone ~-31 ~-2 ~-10 ~31 ~15 ~10 ~-31 ~-2 ~11 replace force");
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
	}
}
