package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "maphider";
    public static final String VERSION = "1.0";

    public static boolean maphider = true;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("2muu OP");
    }
}
