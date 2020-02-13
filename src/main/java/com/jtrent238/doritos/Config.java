package com.jtrent238.doritos;

import org.apache.logging.log4j.Level;

import com.jtrent238.doritos.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_DEBUG = "debug";
	private static final String CATEGORY_SETTINGS = "settings";
	
	public static boolean debugMode;
	public static boolean DEBUG_MODE;
	public static boolean DOG_FOOD;
	
	// Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

	private static void initGeneralConfig(Configuration cfg) {
		// TODO Auto-generated method stub
  		DEBUG_MODE  = cfg.get(CATEGORY_SETTINGS, "DebugMode", false).getBoolean(false);
  		DOG_FOOD = cfg.get(CATEGORY_SETTINGS, "DogFood", false).getBoolean(false);
	}
}
