package wfbmod.commands.procedures;

import wfbmod.commands.WfbCommandsMod;

import net.minecraft.world.entity.Entity;

import java.util.Map;

public class GlassPpHardProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WfbCommandsMod.LOGGER.warn("Failed to load dependency entity for procedure GlassPpHard!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"difficulty hard");
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"tellraw @p \"Difficulty has been set to hard\"");
		}
	}
}
