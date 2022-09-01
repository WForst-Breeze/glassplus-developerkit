
package dev.glasspp.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandBuildContext;

import dev.glasspp.procedures.KeepInventoryProcedure;

import com.mojang.brigadier.CommandDispatcher;

public class GlassPpKeepInventoryCommand {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext) {
		dispatcher.register(Commands.literal("ckeepintrue").requires(s -> s.hasPermission(4)).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			Direction direction = entity.getDirection();

			KeepInventoryProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
			return 0;
		}));
	}
}
