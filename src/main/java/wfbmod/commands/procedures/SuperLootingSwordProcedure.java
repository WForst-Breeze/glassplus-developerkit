package wfbmod.commands.procedures;

import wfbmod.commands.WfbCommandsMod;

import net.minecraft.world.entity.Entity;

import java.util.Map;

public class SuperLootingSwordProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WfbCommandsMod.LOGGER.warn("Failed to load dependency entity for procedure SuperLootingSword!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/give @s minecraft:diamond_sword{display:{Name:'{\"text\":\"The Sword of Glass+\",\"color\":\"gold\"}'},Enchantments:[{id:\"sharpness\",lvl:5},{id:\"unbreaking\",lvl:3},{id:\"sweeping\",lvl:3},{id:\"looting\",lvl:3}]} 1");
		}
	}
}
