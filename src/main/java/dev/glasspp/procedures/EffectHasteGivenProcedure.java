package dev.glasspp.procedures;

import net.minecraft.world.entity.Entity;

import java.util.Map;

import dev.glasspp.GlassppMod;

public class EffectHasteGivenProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GlassppMod.LOGGER.warn("Failed to load dependency entity for procedure EffectHasteGiven!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/effect give @p haste 999999 127 true");
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"tellraw @p \"HASTE!\"");
		}
	}
}
