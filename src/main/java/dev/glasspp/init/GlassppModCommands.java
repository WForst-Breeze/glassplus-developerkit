
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.glasspp.init;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import dev.glasspp.command.ToTheNetherCommand;
import dev.glasspp.command.ToTheEndCommand;
import dev.glasspp.command.ToOverworldCCommand;
import dev.glasspp.command.SwordUnbreakableCommand;
import dev.glasspp.command.SwordLootingCommand;
import dev.glasspp.command.SwordBasicCommand;
import dev.glasspp.command.PlassPpGm0Command;
import dev.glasspp.command.GlassPpWorldSpawnPointCommand;
import dev.glasspp.command.GlassPpStrengthCommand;
import dev.glasspp.command.GlassPpRCBCommand;
import dev.glasspp.command.GlassPpPotionCommand;
import dev.glasspp.command.GlassPpNoonCommand;
import dev.glasspp.command.GlassPpNightvisionCommand;
import dev.glasspp.command.GlassPpNightCommand;
import dev.glasspp.command.GlassPpMidnightCommand;
import dev.glasspp.command.GlassPpMaxLevelCommand;
import dev.glasspp.command.GlassPpKeepInventoryFCommand;
import dev.glasspp.command.GlassPpKeepInventoryCommand;
import dev.glasspp.command.GlassPpInfoCommand;
import dev.glasspp.command.GlassPpHasteCommand;
import dev.glasspp.command.GlassPpGm3Command;
import dev.glasspp.command.GlassPpGm2Command;
import dev.glasspp.command.GlassPpGm1Command;
import dev.glasspp.command.GlassPpDeathCommand;
import dev.glasspp.command.GlassPpDayCommand;
import dev.glasspp.command.GlassPpCCBCommand;
import dev.glasspp.command.GlassPpCBCommand;
import dev.glasspp.command.GlassPpBarrierCommand;
import dev.glasspp.command.GlassPPStickCommand;
import dev.glasspp.command.CheckPointCommand;

public class GlassppModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
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
			GlassPpWorldSpawnPointCommand.register(dispatcher, commandBuildContext);
			GlassPpGm1Command.register(dispatcher, commandBuildContext);
			PlassPpGm0Command.register(dispatcher, commandBuildContext);
			GlassPpGm2Command.register(dispatcher, commandBuildContext);
			GlassPpGm3Command.register(dispatcher, commandBuildContext);
			GlassPpInfoCommand.register(dispatcher, commandBuildContext);
			GlassPpPotionCommand.register(dispatcher, commandBuildContext);
			GlassPpDayCommand.register(dispatcher, commandBuildContext);
			GlassPpNoonCommand.register(dispatcher, commandBuildContext);
			GlassPpNightCommand.register(dispatcher, commandBuildContext);
			GlassPpMidnightCommand.register(dispatcher, commandBuildContext);
			CheckPointCommand.register(dispatcher, commandBuildContext);
			GlassPpMaxLevelCommand.register(dispatcher, commandBuildContext);
			SwordBasicCommand.register(dispatcher, commandBuildContext);
			SwordLootingCommand.register(dispatcher, commandBuildContext);
			SwordUnbreakableCommand.register(dispatcher, commandBuildContext);
		});
	}
}
