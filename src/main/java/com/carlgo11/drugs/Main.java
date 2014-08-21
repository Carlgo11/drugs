package com.carlgo11.drugs;

import org.bukkit.plugin.java.JavaPlugin;
import com.carlgo11.drugs.player.Interact;

public class Main extends JavaPlugin {
    
public void onEnable(){
    getServer().getPluginManager().registerEvents(new Interact(), this);
}
}
