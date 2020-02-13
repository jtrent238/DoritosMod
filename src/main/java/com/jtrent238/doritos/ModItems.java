package com.jtrent238.doritos;

import com.jtrent238.doritos.items.ItemDoritosBag;
import com.jtrent238.doritos.items.ItemDoritosChip;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Main.MODID)@EventBusSubscriber
public class ModItems {
	
	public static int chipAmount = (int) 0.5F;
	public static int chipSaturation = 2;
	public static int numChipsBag = 9;
	
	/*
	 * Doritos Chips
	 */
	public static final ItemDoritosChip dorito_chip_nachocheese = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "NachoCheeseChip", "nacho_cheese_chip");
	public static final ItemDoritosChip dorito_chip_coolranch = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "CoolRanchChip", "cool_ranch_chip");
	public static final ItemDoritosChip dorito_chip_toastedcorn = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "ToastedCornChip", "toasted_corn_chip");
	public static final ItemDoritosChip dorito_chip_spicynacho = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "SpicyNachoChip", "spicy_nacho_chip");
	public static final ItemDoritosChip dorito_chip_spicysweetchili = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "SpicySweetChiliChip", "spicy_sweet_chili_chip");
	public static final ItemDoritosChip dorito_chip_taco = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "TacoChip", "taco_chip");
	public static final ItemDoritosChip dorito_chip_tapatio = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "TapatioChip", "tapatio_chip");
	public static final ItemDoritosChip dorito_chip_jackranchwingsdiped = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "JackRanchWingDipedChip", "jack_ranch_wing_diped_chip");
	public static final ItemDoritosChip dorito_chip_flamas = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "FlamasChip", "flamas_chip");
	public static final ItemDoritosChip dorito_chip_dinamitafieryhabanero = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "DinamitaFieryHabaneroChip", "dinamita_fiery_habanero_chip");
	public static final ItemDoritosChip dorito_chip_dinamitachilelimon = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "DinamitaChileLimonChip", "dinamita_fiery_chile_limon_chip");
	public static final ItemDoritosChip dorito_chip_wasabi = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "WasabiChip", "wasabi_chip");
	public static final ItemDoritosChip dorito_chip_blaze = new ItemDoritosChip(chipAmount, chipSaturation, Config.DOG_FOOD, "BlazeChip", "blaze_chip");
	
	/*
	 * Doritos Bags
	 */
	public static final ItemDoritosBag dorito_bag_nachocheese = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "NachoCheeseBag", "nacho_cheese_bag");
	public static final ItemDoritosBag dorito_bag_coolranch = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "CoolRanchBag", "cool_ranch_bag");
	public static final ItemDoritosBag dorito_bag_toastedcorn = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "ToastedCornBag", "toasted_corn_bag");
	public static final ItemDoritosBag dorito_bag_spicynacho = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "SpicyNachoBag", "spicy_nacho_bag");
	public static final ItemDoritosBag dorito_bag_spicysweetchili = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "SpicySweetChiliBag", "spicy_sweet_chili_bag");
	public static final ItemDoritosBag dorito_bag_taco = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "TacoBag", "taco_bag");
	public static final ItemDoritosBag dorito_bag_tapatio = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "TapatioBag", "tapatio_bag");
	public static final ItemDoritosBag dorito_bag_jackranchwingsdiped = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "JackRanchWingDipedBag", "jack_ranch_wing_diped_bag");
	public static final ItemDoritosBag dorito_bag_flamas = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "FlamasBag", "flamas_bag");
	public static final ItemDoritosBag dorito_bag_dinamitafieryhabanero = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "DinamitaFieryHabaneroBag", "dinamita_fiery_habanero_bag");
	public static final ItemDoritosBag dorito_bag_dinamitachilelimon = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "DinamitaChileLimonBag", "dinamita_fiery_chile_limon_bag");
	public static final ItemDoritosBag dorito_bag_wasabi = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "WasabiBag", "wasabi_bag");
	public static final ItemDoritosBag dorito_bag_blaze = new ItemDoritosBag(chipAmount * numChipsBag, chipSaturation * numChipsBag, Config.DOG_FOOD, "BlazeBag", "blaze_bag");
	
	@SubscribeEvent
	  public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new Item [] {
			/*
		    * Doritos Chips
		    */
				dorito_chip_nachocheese, dorito_chip_coolranch, dorito_chip_toastedcorn, dorito_chip_spicynacho, dorito_chip_spicysweetchili, 
				dorito_chip_taco, dorito_chip_tapatio, dorito_chip_jackranchwingsdiped, dorito_chip_flamas, dorito_chip_dinamitafieryhabanero, 
				dorito_chip_dinamitachilelimon, dorito_chip_wasabi, dorito_chip_blaze,
				
				/*
				 * Doritos Chips
				*/
				dorito_bag_nachocheese, dorito_bag_coolranch, dorito_bag_toastedcorn, dorito_bag_spicynacho, dorito_bag_spicysweetchili, dorito_bag_taco,
				dorito_bag_tapatio, dorito_bag_jackranchwingsdiped, dorito_bag_flamas, dorito_bag_dinamitafieryhabanero, dorito_bag_dinamitachilelimon, 
				dorito_bag_wasabi, dorito_bag_blaze
				
		});
		registerItemRenders(null);
	}

	@SubscribeEvent
	  public static void registerItemRenders(ModelRegistryEvent event)
	  {
	    registerRender(dorito_chip_nachocheese);
	    registerRender(dorito_chip_coolranch);
	    registerRender(dorito_chip_toastedcorn);
	    registerRender(dorito_chip_spicynacho);
	    registerRender(dorito_chip_spicynacho);
	    registerRender(dorito_chip_spicysweetchili);
	    registerRender(dorito_chip_taco);
	    registerRender(dorito_chip_tapatio);
	    registerRender(dorito_chip_jackranchwingsdiped);
	    registerRender(dorito_chip_flamas);
	    registerRender(dorito_chip_dinamitafieryhabanero);
	    registerRender(dorito_chip_dinamitachilelimon);
	    registerRender(dorito_chip_wasabi);
	    registerRender(dorito_chip_blaze);

	    registerRender(dorito_bag_nachocheese);
	    registerRender(dorito_bag_coolranch);
	    registerRender(dorito_bag_toastedcorn);
	    registerRender(dorito_bag_spicynacho);
	    registerRender(dorito_bag_spicynacho);
	    registerRender(dorito_bag_spicysweetchili);
	    registerRender(dorito_bag_taco);
	    registerRender(dorito_bag_tapatio);
	    registerRender(dorito_bag_jackranchwingsdiped);
	    registerRender(dorito_bag_flamas);
	    registerRender(dorito_bag_dinamitafieryhabanero);
	    registerRender(dorito_bag_dinamitachilelimon);
	    registerRender(dorito_bag_wasabi);
	    registerRender(dorito_bag_blaze);

	    
	  }
	
	public static void registerRender(Item item) {
		   ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(item.getRegistryName().toString()), "inventory"));
		   
			   if(Config.debugMode == true) {
		       	System.out.println("Registered Model for: " + item.getRegistryName());
		       	//System.out.println("Registered Model for: " + ItemWoodHammer.registryName);
	   		}
		}
}
