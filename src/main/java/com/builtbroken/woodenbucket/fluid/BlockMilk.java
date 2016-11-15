package com.builtbroken.woodenbucket.fluid;

import com.builtbroken.woodenbucket.WoodenBucket;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Dark on 8/8/2015.
 */
public class BlockMilk extends BlockFluidClassic
{
    IIcon blockFlowing;

    public BlockMilk(Fluid fluid)
    {
        super(fluid, Material.WATER);
        setBlockName(WoodenBucket.PREFIX + "milk");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.blockIcon = reg.registerIcon(WoodenBucket.PREFIX + "milk_still");
        this.blockFlowing = reg.registerIcon(WoodenBucket.PREFIX + "milk_flow");
        getFluid().setFlowingIcon(blockFlowing);
        getFluid().setStillIcon(blockIcon);
    }
}
