package com.carlgo11.drugs;

import org.bukkit.plugin.java.JavaPlugin;
import player.Interact;

public class Main extends JavaPlugin {
    
public void onEnable(){
    getServer().getPluginManager().registerEvents(new Interact(), this);
}
}
