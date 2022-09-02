
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.glasspp.init;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import dev.glasspp.command.ToTheNetherCommand;
import dev.glasspp.command.ToTheEndCommand;
import dev.glasspp.command.ToOverworldCCommand;
import dev.glasspp.command.GlassPpStrengthCommand;
import dev.glasspp.command.GlassPpRCBCommand;
import dev.glasspp.command.GlassPpNightvisionCommand;
import dev.glasspp.command.GlassPpKeepInventoryFCommand;
import dev.glasspp.command.GlassPpKeepInventoryCommand;
import dev.glasspp.command.GlassPpHasteCommand;
import dev.glasspp.command.GlassPpDeathCommand;
import dev.glasspp.command.GlassPpCCBCommand;
import dev.glasspp.command.GlassPpCBCommand;
import dev.glasspp.command.GlassPpBarrierCommand;
import dev.glasspp.command.GlassPPStickCommand;
import dev.glasspp.command.GlassPPInfoCommand;

public class GlassppModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			GlassPPInfoCommand.register(dispatcher, commandBuildContext);
			GlassPPStickCommand.register(dispatcher, commandBuildContext);
			GlassPpCBCommand.register(dispatcher, commandBuildContext);
			GlassPpCCBCommand.register(dispatcher, commandBuildContext);
			GlassPpRCBCommand.register(dispatcher, commandBuildContext);
			GlassPpBarrierCommand.register(dispatcher, commandBuildContext);
			GlassPpHasteCommand.register(dispatcher, commandBuildContext);
			GlassPpStrengthCommand.register(dispatcher, commandBuildContext);
			GlassPpNightvisionCommand.register(dispatcher, commandBuildContext);
			GlassPpDeathCommand.register(dispatcher, commandBuildContext);
			GlassPpKeepInventoryCommand.register(dispatcher, commandBuildContext);
			GlassPpKeepInventoryFCommand.register(dispatcher, commandBuildContext);
			ToOverworldCCommand.register(dispatcher, commandBuildContext);
			ToTheNetherCommand.register(dispatcher, commandBuildContext);
			ToTheEndCommand.register(dispatcher, commandBuildContext);
		});
	}
}
