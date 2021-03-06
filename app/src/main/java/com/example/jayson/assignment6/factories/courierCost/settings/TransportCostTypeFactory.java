package com.example.jayson.assignment6.factories.courierCost.settings;

import com.example.jayson.assignment6.domain.courierCost.settings.TransportCostType;

/**
 * Created by JAYSON on 2016-04-22.
 */
public class TransportCostTypeFactory {

    public static TransportCostType getTransportType(String type, double cost)
    {
        TransportCostType transportCostType = new TransportCostType
                .Builder()
                .transportType(type)
                .cost(cost)
                .build();

        return transportCostType;
    }
}
