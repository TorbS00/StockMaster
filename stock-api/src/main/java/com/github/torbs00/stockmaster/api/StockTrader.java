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

import java.util.UUID;

/**
 * The base foundation of a StockTrader during a stock transaction.
 *
 * @author Torbjørn on 22.04.2023.
 * @project StockMaster.
 */
public abstract class StockTrader {

    StockTrader() {}

    /**
     * Gets the type of the StockTrader
     *
     * @return the StockTrader type
     */
    public abstract StockTraderType getType();

    public enum StockTraderType {
        /**
         * An individual stock trader, identified by UUID
         *
         */
        PLAYER,
        /**
         * An investment company, identified by name
         *
         */
        COMPANY,
        /**
         * A combination of a stock trader and a company
         *
         */
        COMPOSITE;
    }

    @Override
    public abstract int hashCode();

    /**
     * Assesses whether this StockTrader matches another.
     *
     */
    @Override
    public abstract boolean equals(Object object);

    @Override
    public abstract String toString();

}
