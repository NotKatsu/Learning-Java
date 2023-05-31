package com.notkatsu.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has stopped.. :(");
    }
}
