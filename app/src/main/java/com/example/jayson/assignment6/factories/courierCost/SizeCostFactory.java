package com.example.jayson.assignment6.factories.courierCost;

import com.example.jayson.assignment6.domain.courierCost.SizeCost;

/**
 * Created by JAYSON on 2016-04-22.
 */
public class SizeCostFactory {

    public static SizeCost getSizeCost(String size, double cost)
    {
        return new SizeCost.Builder()
                .size(size)
                .cost(cost)
                .build();
    }
}
