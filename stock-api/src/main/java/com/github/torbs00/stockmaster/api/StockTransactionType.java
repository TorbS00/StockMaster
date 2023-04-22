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

import java.util.Locale;

/**
 * The type of transaction made by a StockTrader
 *
 * @author Torbjørn on 23.04.2023.
 * @project StockMaster.
 */
public enum StockTransactionType {

    BUY,
    SHORT,
    SELL;

    /**
     * Gets the Stock transaction type as a string.
     *
     * @return a string value representing the stock transaction type into lowercase
     */
    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
