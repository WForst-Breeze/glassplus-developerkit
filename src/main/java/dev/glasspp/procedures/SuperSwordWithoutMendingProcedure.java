package dev.glasspp.procedures;

import net.minecraft.world.entity.Entity;

import java.util.Map;

import dev.glasspp.GlassppMod;

public class SuperSwordWithoutMendingProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GlassppMod.LOGGER.warn("Failed to load dependency entity for procedure SuperSwordWithoutMending!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/give @s minecraft:diamond_sword{display:{Name:'{\"text\":\"The Sword of GlassPlus\",\"color\":\"gold\"}'},Enchantments:[{id:\"sharpness\",lvl:5},{id:\"unbreaking\",lvl:3},{id:\"sweeping\",lvl:3}]} 1");
		}
	}
}
