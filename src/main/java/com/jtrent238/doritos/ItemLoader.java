package com.jtrent238.doritos;

import com.jtrent238.doritos.items.ItemDoritosBag;
import com.jtrent238.doritos.items.ItemDoritosChip;
import com.jtrent238.doritos.items.tools.weapons.swords.ItemDoritosSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemLoader {

	public static Item ItemDoritosChip;
	public static Item ItemDoritosBag;
	public static Item ItemDoritosSword;


	/**
	 * Load Items.
	 */
public static void LoadItems() {
	//ItemNinjaStar  = new ItemNinjaStar(0, ItemNinjaStar, null, null, null).setUnlocalizedName("ItemNinjaStar").setTextureName("ninjastarmod:ItemNinjaStar").setCreativeTab(NinjaStarMod.NinjaStarTab).setHasSubtypes(true);
	ItemDoritosChip  = new ItemDoritosChip(0, 0, ItemDoritosChip).setUnlocalizedName("ItemDoritosChip").setTextureName(Main.MODID + ":" + "ItemDoritosChip").setCreativeTab(Main.DoritosTab);
	ItemDoritosBag  = new ItemDoritosBag(0, 0, ItemDoritosBag).setUnlocalizedName("ItemDoritosBag").setTextureName(Main.MODID + ":" + "ItemDoritosBag").setCreativeTab(Main.DoritosTab);
	ItemDoritosSword  = new ItemDoritosSword(ToolMaterial.EMERALD).setUnlocalizedName("ItemDoritosSword").setTextureName(Main.MODID + ":" + "ItemDoritosSword").setCreativeTab(Main.DoritosTab);
	
		registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	//GameRegistry.registerItem(ItemNinjaStar, ItemNinjaStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemDoritosChip, ItemDoritosChip.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemDoritosBag, ItemDoritosBag.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemDoritosSword, ItemDoritosSword.getUnlocalizedName().substring(5));
}

}