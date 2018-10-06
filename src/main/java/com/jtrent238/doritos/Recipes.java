package com.jtrent238.doritos;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
	
			//Recipes for The Doritos Bags
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 0), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 0));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 1), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 1));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 2), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 2));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 3), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 3));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 4), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 4));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 5), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 5));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 6), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 6));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 7), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 7));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 8), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 8));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 9), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 9));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 10), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 10));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 11), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 11));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 12), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 12));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 13), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 13));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 14), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 14));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosBag, 1 , 15), "XXX", "XXX", "XXX", 'X', new ItemStack(ItemLoader.ItemDoritosChip, 1 , 15));

			//Recipes for the Doritos Chips
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 0), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 0));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 1), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 1));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 2), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 2));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 3), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 3));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 4), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 4));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 5), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 5));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 6), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 6));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 7), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 7));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 8), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 8));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 9), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 9));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 10), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 10));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 11), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 11));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 12), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 12));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 13), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 13));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 14), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 14));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDoritosChip, 9 , 15), "X", 'X', new ItemStack(ItemLoader.ItemDoritosBag, 1 , 15));
			
	}
	
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		//nothing here
		}
	
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		//nothing here
			   }
	
    }

	
	
	