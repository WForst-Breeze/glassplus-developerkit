
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.glasspp.init;

import dev.glasspp.procedures.ToOverworldProcedure;
import dev.glasspp.procedures.ToNetherProcedure;
import dev.glasspp.procedures.ToEndProcedure;
import dev.glasspp.procedures.RepeatingCommandblockGivenProcedure;
import dev.glasspp.procedures.KeepInventoryProcedure;
import dev.glasspp.procedures.KeepInventoryFalseProcedure;
import dev.glasspp.procedures.EffectStrengthGivenProcedure;
import dev.glasspp.procedures.EffectNightVisionGivenProcedure;
import dev.glasspp.procedures.EffectHasteGivenProcedure;
import dev.glasspp.procedures.DevGppProcedure;
import dev.glasspp.procedures.DebugstickGivenProcedure;
import dev.glasspp.procedures.DeathCountScoreboardProcedure;
import dev.glasspp.procedures.CommandblockGivenProcedure;
import dev.glasspp.procedures.ChainCommandblockGivenProcedure;
import dev.glasspp.procedures.BarrierGivenProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GlassppModProcedures {
	public static void load() {
		new DevGppProcedure();
		new DebugstickGivenProcedure();
		new CommandblockGivenProcedure();
		new ChainCommandblockGivenProcedure();
		new RepeatingCommandblockGivenProcedure();
		new BarrierGivenProcedure();
		new EffectHasteGivenProcedure();
		new EffectStrengthGivenProcedure();
		new EffectNightVisionGivenProcedure();
		new DeathCountScoreboardProcedure();
		new KeepInventoryProcedure();
		new KeepInventoryFalseProcedure();
		new ToOverworldProcedure();
		new ToNetherProcedure();
		new ToEndProcedure();
	}
}
