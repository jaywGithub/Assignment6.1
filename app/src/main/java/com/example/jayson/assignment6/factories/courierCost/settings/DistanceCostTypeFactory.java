package com.example.jayson.assignment6.factories.courierCost.settings;

import com.example.jayson.assignment6.domain.courierCost.settings.DistanceCostType;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class DistanceCostTypeFactory {

    public static DistanceCostType getDistanceCostType(double distance, double cost)
    {
        DistanceCostType distanceCostType = new DistanceCostType.Builder()
                .distance(distance)
                .cost(cost)
                .build();

        return distanceCostType;
    }
}
