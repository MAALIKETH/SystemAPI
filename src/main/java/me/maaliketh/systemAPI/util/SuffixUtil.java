package me.maaliketh.systemAPI.util;

import me.clip.placeholderapi.PlaceholderAPI;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.query.QueryOptions;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SuffixUtil {

    public static String getSuffix(Player player) {
        LuckPerms luckPerms = LuckPermsProvider.get();

        User user = luckPerms.getUserManager().getUser(player.getUniqueId());
        if (user == null) return "";

        QueryOptions queryOptions = luckPerms.getContextManager().getQueryOptions(user).orElse(null);
        if (queryOptions == null) return "";

        String suffix = user.getCachedData().getMetaData(queryOptions).getPrefix();
        return (suffix != null) ? ChatColor.translateAlternateColorCodes('&', suffix) : "";
    }
}
