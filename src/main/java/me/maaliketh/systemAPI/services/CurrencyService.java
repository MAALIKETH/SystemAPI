package me.maaliketh.systemAPI.services;

import org.bukkit.entity.Player;

public interface CurrencyService {
    int getCurrency(Player player);
    void addCurrency(Player player, int amount);
    void decCurrency(Player player, int amount);
}
