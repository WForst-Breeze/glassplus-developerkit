
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wfb.commands.init;

import wfb.commands.command.ToTheNetherCommand;
import wfb.commands.command.ToTheEndCommand;
import wfb.commands.command.ToOverworldCCommand;
import wfb.commands.command.SwordUnbreakableCommand;
import wfb.commands.command.SwordLootingCommand;
import wfb.commands.command.SwordBasicCommand;
import wfb.commands.command.PlassPpGm0Command;
import wfb.commands.command.LuckyoffCommand;
import wfb.commands.command.LuckyCommand;
import wfb.commands.command.LevitationCommand;
import wfb.commands.command.HardCommand;
import wfb.commands.command.GlassPpWorldSpawnPointCommand;
import wfb.commands.command.GlassPpStrengthCommand;
import wfb.commands.command.GlassPpRCBCommand;
import wfb.commands.command.GlassPpPotionCommand;
import wfb.commands.command.GlassPpPeacefulCommand;
import wfb.commands.command.GlassPpNoonCommand;
import wfb.commands.command.GlassPpNightvisionCommand;
import wfb.commands.command.GlassPpNightCommand;
import wfb.commands.command.GlassPpMidnightCommand;
import wfb.commands.command.GlassPpMaxLevelCommand;
import wfb.commands.command.GlassPpKeepInventoryFCommand;
import wfb.commands.command.GlassPpKeepInventoryCommand;
import wfb.commands.command.GlassPpInfoCommand;
import wfb.commands.command.GlassPpHasteCommand;
import wfb.commands.command.GlassPpGm3Command;
import wfb.commands.command.GlassPpGm2Command;
import wfb.commands.command.GlassPpGm1Command;
import wfb.commands.command.GlassPpDeathCommand;
import wfb.commands.command.GlassPpDayCommand;
import wfb.commands.command.GlassPpCCBCommand;
import wfb.commands.command.GlassPpCBCommand;
import wfb.commands.command.GlassPpBarrierCommand;
import wfb.commands.command.GlassPPStickCommand;
import wfb.commands.command.CheckPointCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class WfbCommandsModCommands {
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
			LuckyCommand.register(dispatcher, commandBuildContext);
			LuckyoffCommand.register(dispatcher, commandBuildContext);
			LevitationCommand.register(dispatcher, commandBuildContext);
			HardCommand.register(dispatcher, commandBuildContext);
			GlassPpPeacefulCommand.register(dispatcher, commandBuildContext);
		});
	}
}
