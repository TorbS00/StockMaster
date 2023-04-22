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

/**
 * @author Torbjørn on 23.04.2023.
 * @project StockMaster.
 */
public class StockTraderCompany extends StockTrader {

    private final String name;

    public StockTraderCompany(String name) {
        this.name = Objects.requireNonNull(name, "Name must not be null");
    }

    /**
     * Static factory method for creating a StockTraderCompany using a company name.
     *
     * @param name the name of the company
     * @return a stock trader company
     */
    public static StockTraderCompany of(String name) {
        return new StockTraderCompany(name);
    }

    /**
     * Gets the stock trader company's name
     *
     * @return the stock trader company's name
     */
    public String getName() {
        return name;
    }

    @Override
    public StockTraderType getType() {
        return StockTraderType.COMPANY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockTraderCompany that = (StockTraderCompany) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "StockTraderCompany{" +
                "name='" + name + '\'' +
                '}';
    }
}
