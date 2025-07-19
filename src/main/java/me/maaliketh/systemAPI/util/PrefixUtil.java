package me.maaliketh.systemAPI.util;

import me.clip.placeholderapi.PlaceholderAPI;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.query.QueryOptions;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PrefixUtil {

    public static String getPrefix(Player player) {
        LuckPerms luckPerms = LuckPermsProvider.get();

        User user = luckPerms.getUserManager().getUser(player.getUniqueId());
        if (user == null) return "";

        QueryOptions queryOptions = luckPerms.getContextManager().getQueryOptions(user).orElse(null);
        if (queryOptions == null) return "";

        String prefix = user.getCachedData().getMetaData(queryOptions).getPrefix();
        if (prefix != null) return "";

        prefix = ColorUtil.hexToLegacy(prefix);

        if(Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")){
            prefix = PlaceholderAPI.setPlaceholders(player, prefix);
        }

        return prefix;
    }
}
