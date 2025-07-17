package me.maaliketh.systemAPI.util;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.query.QueryOptions;
import org.bukkit.entity.Player;

public class PrefixUtil {

    /* For Online Player */
    public static String getPrefix(Player player) {
        LuckPerms luckPerms = LuckPermsProvider.get();

        User user = luckPerms.getUserManager().getUser(player.getUniqueId());
        if (user == null) return "";

        QueryOptions queryOptions = luckPerms.getContextManager().getQueryOptions(user).orElse(null);
        if (queryOptions == null) return "";

        String prefix = user.getCachedData().getMetaData(queryOptions).getPrefix();
        return (prefix != null) ? ColorUtil.hexToLegacy(prefix) : "";
    }
}
