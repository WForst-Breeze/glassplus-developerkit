package wfbmod.commands.procedures;

import wfbmod.commands.WfbCommandsMod;

import net.minecraft.world.entity.Entity;

import java.util.Map;

public class SuperPotionProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WfbCommandsMod.LOGGER.warn("Failed to load dependency entity for procedure SuperPotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/give @p minecraft:potion{CustomPotionEffects:[{Id:1,Amplifier:1,Duration:2147483647,ShowParticles:0b},{Id:3,Amplifier:127,Duration:2147483647,ShowParticles:0b},{Id:5,Amplifier:127,Duration:2147483647,ShowParticles:0b},{Id:8,Amplifier:1,Duration:2147483647,ShowParticles:0b},{Id:10,Amplifier:5,Duration:2147483647,ShowParticles:0b},{Id:11,Amplifier:4,Duration:2147483647,ShowParticles:0b},{Id:12,Duration:2147483647,ShowParticles:0b},{Id:13,Duration:2147483647,ShowParticles:0b},{Id:14,Duration:2147483647,ShowParticles:0b},{Id:16,Duration:2147483647,ShowParticles:0b},{Id:29,Duration:2147483647,ShowParticles:0b},{Id:30,Duration:2147483647,ShowParticles:0b}],CustomPotionColor:0,display:{Name:\"\\\"Glass++ Super Good Potion\\\"\"}}");
		}
	}
}
