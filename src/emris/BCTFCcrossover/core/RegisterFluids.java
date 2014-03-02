/**
 *  Copyright (C) 2013  emris
 *  https://github.com/emris/BCTFCcrossover
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package emris.BCTFCcrossover.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import TFC.TFCItems;
import emris.BCTFCcrossover.BCTFCcrossover;
import emris.BCTFCcrossover.Blocks;
import emris.BCTFCcrossover.Items;

public class RegisterFluids {

	public static final Fluid LATEX = new Fluid("latex").setBlockID(IDProvider.Latex).setUnlocalizedName("Latex").setDensity(6000).setViscosity(6000);

	public static void register() {
		FluidRegistry.registerFluid(LATEX);
	}

	public static void registerFluidContainers() {
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("latex", FluidContainerRegistry.BUCKET_VOLUME / 4), new ItemStack(Items.LatexBowl), new ItemStack(Item.bowlEmpty));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("latex", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.Buckets, 1, 0), new ItemStack(TFCItems.WoodenBucketEmpty));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("water", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.Buckets, 1, 2), new ItemStack(Items.Buckets, 1, 1));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("oil", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.Buckets, 1, 4), new ItemStack(Items.Buckets, 1, 3));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fuel", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.Buckets, 1, 5), new ItemStack(Items.Buckets, 1, 3));
	}

	public static void registerFluidIcons() {
		BCTFCcrossover.proxy.registerFluidIcons(LATEX);
	}
}
