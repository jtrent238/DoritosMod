package com.jtrent238.doritos;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public static ArrayList<ItemStack> doritos = new ArrayList<ItemStack>();

	LootRegistry(){
		add_doritos_as_Loot();
		addToChests();
	}

	public static void registerLoot() {
		add_doritos_as_Loot();
		addToChests();
	}
	public static void add_doritos_as_Loot() {
		
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,0 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,1 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,2 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,3 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,4 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,5 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,6 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,7 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,8 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,9 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,10 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,11 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,12 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,13 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,14 ));
		doritos.add(new ItemStack(ItemLoader.ItemDoritosBag,15 ));
	}

	public static void addToChests() {
		//int numdoritos = 98;
		int numdoritos = 12;//HammerMod.numdoritos;
		for (int i = 0; i < numdoritos ; i++) {
			
				//if(HammerMod.DEBUG_MODE == true) {
				//	System.out.println("DEBUG: Injected Hammer with ID " + i + " into the Minecraft LootChests.");
				//}
				
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
		 	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(doritos.get(i), 0, 1, 1));
		}
		
	}
	
}