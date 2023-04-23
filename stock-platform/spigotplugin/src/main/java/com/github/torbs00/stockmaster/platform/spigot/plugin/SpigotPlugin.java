/*
 * spigotplugin
 * Copyright © 2023 TorbS00
 *
 * StockMaster is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * StockMaster is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with StockMaster. If not, see https://www.gnu.org/licenses/
 * and navigate to version 3 of the GNU Affero General Public License.
 */

package com.github.torbs00.stockmaster.platform.spigot.plugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * This will run once the server platform is detected.
 * SQL operations will need to be performed when the server terminates.
 * Therefore, in case the main thread becomes unresponsive, I don't want it killed by the watchdog thread; Hence the synchronized methods.
 *
 * @author Torbjørn on 23.04.2023.
 * @project StockMaster.
 */
public class SpigotPlugin extends JavaPlugin {

    @Override
    public synchronized void onEnable() {

    }

    @Override
    public synchronized void onDisable() {

    }

}
