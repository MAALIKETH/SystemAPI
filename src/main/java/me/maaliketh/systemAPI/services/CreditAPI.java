package me.maaliketh.systemAPI.services;

public class CreditAPI {
    private static CreditService instance;

    public static void set(CreditService service) {
        instance = service;
    }

    public static CreditService get() {
        return instance;
    }
}