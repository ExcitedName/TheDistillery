package com.excitedname.thedistillery.ingredients.material;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ingredients.Ing;
import com.excitedname.thedistillery.ingredients.glass.GJar;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class LavJar extends Item {

	private Block isFull;
	
	public LavJar(BlockLiquid flowingLava) {
		
		this.setUnlocalizedName("LavJar");
		this.setTextureName("LavJar");
		this.setCreativeTab(Tabs.IngTab);
		this.setContainerItem(Ing.GJar);
		this.isFull = flowingLava;
	}

public ItemStack onItemRightClick(ItemStack par1LavJar, World p_77659_2_, EntityPlayer p_77659_3_)
{
    boolean flag = this.isFull == Blocks.air;
    MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(p_77659_2_, p_77659_3_, flag);

    if (movingobjectposition == null)
    {
        return par1LavJar;
    }
    else
    {
        FillBucketEvent event = new FillBucketEvent(p_77659_3_, par1LavJar, p_77659_2_, movingobjectposition);
        if (MinecraftForge.EVENT_BUS.post(event))
        {
            return par1LavJar;
        }

        if (event.getResult() == Event.Result.ALLOW)
        {
            if (p_77659_3_.capabilities.isCreativeMode)
            {
                return par1LavJar;
            }

            if (--par1LavJar.stackSize <= 0)
            {
                return event.result;
            }

            if (!p_77659_3_.inventory.addItemStackToInventory(event.result))
            {
                p_77659_3_.dropPlayerItemWithRandomChoice(event.result, false);
            }

            return par1LavJar;
        }
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
        {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;

            if (!p_77659_2_.canMineBlock(p_77659_3_, i, j, k))
            {
                return par1LavJar;
            }

            if (flag)
            {
                if (!p_77659_3_.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1LavJar))
                {
                    return par1LavJar;
                }

                Material material = p_77659_2_.getBlock(i, j, k).getMaterial();
                int l = p_77659_2_.getBlockMetadata(i, j, k);

                if (material == Material.water && l == 0)
                {
                    p_77659_2_.setBlockToAir(i, j, k);
                    return this.func_150910_a(par1LavJar, p_77659_3_, Ing.H2OJar);
                }

                if (material == Material.lava && l == 0)
                {
                    p_77659_2_.setBlockToAir(i, j, k);
                    return this.func_150910_a(par1LavJar, p_77659_3_, Ing.LavJar);
                }
            }
            else
            {
                if (this.isFull == Blocks.air)
                {
                    return new ItemStack(Ing.GJar);
                }

                if (movingobjectposition.sideHit == 0)
                {
                    --j;
                }

                if (movingobjectposition.sideHit == 1)
                {
                    ++j;
                }

                if (movingobjectposition.sideHit == 2)
                {
                    --k;
                }

                if (movingobjectposition.sideHit == 3)
                {
                    ++k;
                }

                if (movingobjectposition.sideHit == 4)
                {
                    --i;
                }

                if (movingobjectposition.sideHit == 5)
                {
                    ++i;
                }

                if (!p_77659_3_.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1LavJar))
                {
                    return par1LavJar;
                }

                if (this.tryPlaceContainedLiquid(p_77659_2_, i, j, k) && !p_77659_3_.capabilities.isCreativeMode)
                {
                    return new ItemStack(Ing.GJar);
                }
            }
        }

        return par1LavJar;
    }
}

private ItemStack func_150910_a(ItemStack par1LavJar, EntityPlayer p_150910_2_, Item p_150910_3_)
{
    if (p_150910_2_.capabilities.isCreativeMode)
    {
        return par1LavJar;
    }
    else if (--par1LavJar.stackSize <= 0)
    {
        return new ItemStack(p_150910_3_);
    }
    else
    {
        if (!p_150910_2_.inventory.addItemStackToInventory(new ItemStack(p_150910_3_)))
        {
            p_150910_2_.dropPlayerItemWithRandomChoice(new ItemStack(p_150910_3_, 1, 0), false);
        }

        return par1LavJar;
    }
}

/**
 * Attempts to place the liquid contained inside the bucket.
 */
public boolean tryPlaceContainedLiquid(World p_77875_1_, int p_77875_2_, int p_77875_3_, int p_77875_4_)
{
    if (this.isFull == Blocks.air)
    {
        return false;
    }
    else
    {
        Material material = p_77875_1_.getBlock(p_77875_2_, p_77875_3_, p_77875_4_).getMaterial();
        boolean flag = !material.isSolid();

        if (!p_77875_1_.isAirBlock(p_77875_2_, p_77875_3_, p_77875_4_) && !flag)
        {
            return false;
        }
        else
        {
            if (p_77875_1_.provider.isHellWorld && this.isFull == Blocks.flowing_water)
            {
                p_77875_1_.playSoundEffect((double)((float)p_77875_2_ + 0.5F), (double)((float)p_77875_3_ + 0.5F), (double)((float)p_77875_4_ + 0.5F), "random.fizz", 0.5F, 2.6F + (p_77875_1_.rand.nextFloat() - p_77875_1_.rand.nextFloat()) * 0.8F);

            for (int l = 0; l < 8; ++l)
            {
                p_77875_1_.spawnParticle("largesmoke", (double)p_77875_2_ + Math.random(), (double)p_77875_3_ + Math.random(), (double)p_77875_4_ + Math.random(), 0.0D, 0.0D, 0.0D);
                }
            }
            else
            {
                if (!p_77875_1_.isRemote && flag && !material.isLiquid())
                {
                    p_77875_1_.func_147480_a(p_77875_2_, p_77875_3_, p_77875_4_, true);
                }

                p_77875_1_.setBlock(p_77875_2_, p_77875_3_, p_77875_4_, this.isFull, 0, 3);
            }

            return true;
        }
    }
}

	//Texture Icon	
	
	@Override
	@SideOnly(Side.CLIENT)
	
public void registerIcons(IIconRegister iconReg){
	itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
		.substring(this.getUnlocalizedName().indexOf(".")+1));
}
			
}
