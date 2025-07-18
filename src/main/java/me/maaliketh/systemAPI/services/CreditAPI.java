package me.maaliketh.systemAPI.services;

import org.bukkit.Bukkit;

public class CreditAPI {

    public static CreditService get(){
        return Bukkit.getServicesManager().load(CreditService.class);
    }
}
