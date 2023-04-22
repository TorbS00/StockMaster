/*
 * stock-api
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

package com.github.torbs00.stockmaster.api;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Torbjørn on 22.04.2023.
 * @project StockMaster.
 */
public class StockTraderPlayer extends StockTrader {

    private final UUID uuid;

    public StockTraderPlayer(UUID uuid) {
        this.uuid = Objects.requireNonNull(uuid, "UUID must not be null");
    }

    /**
     * Static factory method for creating a StockTraderPlayer using a UUID.
     *
     * @param uuid the stocktrader
     * @return a stock trader individual
     */
    public static StockTraderPlayer of(UUID uuid) {
        return new StockTraderPlayer(uuid);
    }

    /**
     * Gets the stock traders UUID.
     *
     * @return the stock trader individual UUID
     */
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public StockTraderType getType() {
        return StockTraderType.PLAYER;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockTraderPlayer that = (StockTraderPlayer) o;
        return that.equals(that.uuid);
    }

    @Override
    public String toString() {
        return "StockTraderPlayer{" +
                "uuid=" + uuid +
                '}';
    }
}
