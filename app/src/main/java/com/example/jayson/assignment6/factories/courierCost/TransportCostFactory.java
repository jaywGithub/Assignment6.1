package com.example.jayson.assignment6.factories.courierCost;

import com.example.jayson.assignment6.domain.courierCost.TransportCost;

/**
 * Created by JAYSON on 2016-04-22.
 */
public class TransportCostFactory {

    public static TransportCost getTransportCost(String type, double cost)
    {
        return new TransportCost.Builder()
                .transportType(type)
                .cost(cost)
                .build();
    }
}
