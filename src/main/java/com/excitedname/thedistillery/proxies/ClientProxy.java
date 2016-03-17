package com.excitedname.thedistillery.proxies;

import com.excitedname.thedistillery.distilleries.Dis;
import com.excitedname.thedistillery.entities.EntIroPearl;
import com.excitedname.thedistillery.entities.EntIroPearlE;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy {
		
	
	@Override
	public void registerPearlRenders() {

		RenderingRegistry.registerEntityRenderingHandler(EntIroPearl.class, 
				new RenderSnowball(Dis.IroPearl));
		
		RenderingRegistry.registerEntityRenderingHandler(EntIroPearlE.class, 
				new RenderSnowball(Dis.IroPearlE));
		
	}
	
}
