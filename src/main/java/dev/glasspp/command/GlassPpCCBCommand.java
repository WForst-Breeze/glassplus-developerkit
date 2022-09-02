
package dev.glasspp.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandBuildContext;

import com.mojang.brigadier.CommandDispatcher;

public class GlassPpCCBCommand {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext) {
		dispatcher.register(Commands.literal("gccb").requires(s -> s.hasPermission(4))

		);
	}
}
