/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.core.genetics;

import net.minecraft.world.World;

import forestry.api.genetics.IAllele;
import forestry.api.genetics.IGenome;
import forestry.api.genetics.IMutationCondition;

public class MutationConditionDaytime implements IMutationCondition {

	private final boolean daytime;

	public MutationConditionDaytime(boolean daytime) {
		this.daytime = daytime;
	}

	@Override
	public float getChance(World world, int x, int y, int z, IAllele allele0, IAllele allele1, IGenome genome0, IGenome genome1) {
		if (world.isDaytime() == daytime) {
			return 1;
		}
		return 0;
	}

	@Override
	public String getDescription() {
		if (daytime) {
			return "Can only occur during the day.";
		} else {
			return "Can only occur during the night.";
		}
	}
}