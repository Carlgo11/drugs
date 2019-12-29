package com.carlgo11.meow;

import com.carlgo11.meow.player.Interact;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Interact(), this);
    }
}