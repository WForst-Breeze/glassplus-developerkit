
package wfbmod.commands.command;

import wfbmod.commands.procedures.WorldSpawnPointProcedure;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandBuildContext;

import com.mojang.brigadier.CommandDispatcher;

public class GlassPpWorldSpawnPointCommand {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext) {
		dispatcher.register(Commands.literal("wspoint").requires(s -> s.hasPermission(4)).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			Direction direction = entity.getDirection();

			WorldSpawnPointProcedure
					.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("entity", entity).build());
			return 0;
		}));
	}
}
