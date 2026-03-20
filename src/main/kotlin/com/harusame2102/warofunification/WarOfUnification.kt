package com.harusame2102.warofunification

import org.bukkit.plugin.java.JavaPlugin

class WarOfUnification : JavaPlugin() {

    override fun onEnable() {
        logger.info("War of Unification が有効になりました！")
    }

    override fun onDisable() {
        logger.info("War of Unification が無効になりました。")
    }
}