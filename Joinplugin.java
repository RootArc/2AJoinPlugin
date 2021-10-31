package com.zashiki.genbako.joinplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Joinplugin extends JavaPlugin {
    public class PlayerJoinEvent implements Listener {}

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}


@EventHandler
public void hello(PlayerJoinEvent e){}
        Player player = e.getPlayer();
        player.sendMessage
