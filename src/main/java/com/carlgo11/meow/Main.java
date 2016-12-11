package com.carlgo11.meow;

import org.bukkit.plugin.java.JavaPlugin;
import com.carlgo11.meow.player.Interact;

public class Main extends JavaPlugin {

    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new Interact(), this);
    }
}
