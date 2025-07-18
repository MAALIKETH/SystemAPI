package me.maaliketh.systemAPI.services;

import org.bukkit.entity.Player;

public interface CreditService {

    int getCredit(Player player);
    void addCredit(Player player, int amount);
    void decCredit(Player player, int amount);
}
