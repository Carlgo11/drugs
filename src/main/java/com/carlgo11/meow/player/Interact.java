package com.carlgo11.meow.player;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.Collection;

public class Interact implements Listener {

    Collection<PotionEffect> effects = Arrays.asList(
            new PotionEffect(PotionEffectType.CONFUSION, 1200, 20),
            new PotionEffect(PotionEffectType.SPEED, 1200, 20),
            new PotionEffect(PotionEffectType.JUMP, 1200, 20),
            new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 20),
            new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1260, 20)
    );

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerUse(PlayerInteractEvent event) {
        Player p = event.getPlayer();

        ItemStack item = p.getInventory().getItemInMainHand();
        if (item.getType() == Material.SUGAR) {
            p.getWorld().playSound(p.getLocation(), Sound.ENTITY_CAT_AMBIENT, 1, 1);
            p.addPotionEffects(effects);
            item.setAmount(item.getAmount() - 1);
        }
    }
}