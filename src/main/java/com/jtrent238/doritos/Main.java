package com.jtrent238.doritos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.jtrent238.doritos.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION/*, dependencies = "required-after:jtcoremod@[2.0.0.3,)"*/, useMetadata = true)
public class Main {

    public static final String MODID = "doritos";
	public static final String MODNAME = "jtrent238's Doritos Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MODVERSION = "2.0.0.0-indev";
	public static final String MC = "1.12.2";
	
  @SidedProxy(clientSide = "com.jtrent238.doritos.proxy.ClientProxy", serverSide = "com.jtrent238.doritos.proxy.ServerProxy")
    public static CommonProxy proxy;

  @Mod.Instance
  public static Main instance;

  public static Logger logger;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
      logger = event.getModLog();
      proxy.preInit(event);
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent e, ModelRegistryEvent mre){
      proxy.init(e);
      //ModelRegistryHandler.registerModels(mre);
      ModItems.registerItemRenders(mre);
      //ModRecipes.registerRecpies();
      //LootHandler.registerLoot();
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent e) throws IOException {
      proxy.postInit(e);
      //JTAPI.addNewCreativeTab("tab_HammerMod", ModItems.hammerDiamond, false);
      //UpdateChecker.isUpdateAvailable();
      //UpdateChecker.displayUpdateMsgBox();
      
      
     
  }
  
  public static CreativeTabs tab_DoritosMod = new CreativeTabs("tab_DoritosMod") {
  	
  	public ItemStack getTabIconItem() {
  		
  		return new ItemStack(ModItems.dorito_chip_nachocheese);
  	}
  	
  	public boolean hasSearchBar(){
  		return false;
  	}
  	
  };
}
