package com.jtrent238.doritos.items;

import com.jtrent238.doritos.Main;

import net.minecraft.item.ItemFood;

public class ItemDoritosBag extends ItemFood {

	public ItemDoritosBag(int amount, float saturation, boolean isWolfFood, String unlocalizedName, String registryName) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setCreativeTab(Main.tab_DoritosMod);
		System.out.println(this.getRegistryName() + " | " + this.getUnlocalizedName() + " | " + this.hashCode());
	}
	
}
