
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package wfbmod.commands.init;

import wfbmod.commands.command.ToTheNetherCommand;
import wfbmod.commands.command.ToTheEndCommand;
import wfbmod.commands.command.ToOverworldCCommand;
import wfbmod.commands.command.SwordUnbreakableCommand;
import wfbmod.commands.command.SwordLootingCommand;
import wfbmod.commands.command.SwordBasicCommand;
import wfbmod.commands.command.PlassPpGm0Command;
import wfbmod.commands.command.LuckyoffCommand;
import wfbmod.commands.command.LuckyCommand;
import wfbmod.commands.command.LevitationCommand;
import wfbmod.commands.command.HardCommand;
import wfbmod.commands.command.GlassPpWorldSpawnPointCommand;
import wfbmod.commands.command.GlassPpStrengthCommand;
import wfbmod.commands.command.GlassPpRCBCommand;
import wfbmod.commands.command.GlassPpPotionCommand;
import wfbmod.commands.command.GlassPpPeacefulCommand;
import wfbmod.commands.command.GlassPpNoonCommand;
import wfbmod.commands.command.GlassPpNightvisionCommand;
import wfbmod.commands.command.GlassPpNightCommand;
import wfbmod.commands.command.GlassPpMidnightCommand;
import wfbmod.commands.command.GlassPpMaxLevelCommand;
import wfbmod.commands.command.GlassPpKeepInventoryFCommand;
import wfbmod.commands.command.GlassPpKeepInventoryCommand;
import wfbmod.commands.command.GlassPpInfoCommand;
import wfbmod.commands.command.GlassPpHasteCommand;
import wfbmod.commands.command.GlassPpGm3Command;
import wfbmod.commands.command.GlassPpGm2Command;
import wfbmod.commands.command.GlassPpGm1Command;
import wfbmod.commands.command.GlassPpDeathCommand;
import wfbmod.commands.command.GlassPpDayCommand;
import wfbmod.commands.command.GlassPpCCBCommand;
import wfbmod.commands.command.GlassPpCBCommand;
import wfbmod.commands.command.GlassPpBarrierCommand;
import wfbmod.commands.command.GlassPPStickCommand;
import wfbmod.commands.command.CheckPointCommand;

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
