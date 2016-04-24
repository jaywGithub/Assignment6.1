package com.example.jayson.assignment6.factories.courierCost;

import com.example.jayson.assignment6.domain.courierCost.settings.DistanceCostType;
import com.example.jayson.assignment6.factories.courierCost.settings.DistanceCostTypeFactory;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class Test_DistanceCostTypeFactory {
    @Test
    public void testCreate()throws Exception
    {
        DistanceCostType distanceCostType = DistanceCostTypeFactory.getDistanceCostType(150.0, 75.0);

        Assert.assertEquals(75.0, distanceCostType.getCost());
    }

    @Test
    public void testUpdate() throws Exception
    {
        DistanceCostType distanceCostType = DistanceCostTypeFactory.getDistanceCostType(150.0, 75.0);
        DistanceCostType newDistanceCostType = new DistanceCostType
                .Builder()
                .copy(distanceCostType)
                .distance(250.0)
                .build();


        Assert.assertEquals(150.0, newDistanceCostType.getCost());
    }
}
