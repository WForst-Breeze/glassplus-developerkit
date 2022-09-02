package dev.glasspp.procedures;

import net.minecraft.world.entity.Entity;

import java.util.Map;

import dev.glasspp.GlassppMod;

public class ModGpInfoProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GlassppMod.LOGGER.warn("Failed to load dependency entity for procedure ModGpInfo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/tellraw @p {\"text\":\"/tellraw @a {\"text\":\"Mod Version: v.1.3.3\\nChangelog:\\n-Added /gm0, /gm1, /gm2, /gm3 to change player's gamemode to survival, creative, adventure, spectator mode\\n-Added /wspoint to check world spawn point\"}\"}");
		}
	}
}
