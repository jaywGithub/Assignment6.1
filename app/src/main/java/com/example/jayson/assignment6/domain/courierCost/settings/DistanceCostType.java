package com.example.jayson.assignment6.domain.courierCost.settings;

import java.io.Serializable;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class DistanceCostType implements Serializable {

    private Long id;
    private double distance;
    private double cost;
    private String state;

    public DistanceCostType(Builder builder)
    {
        this.id = builder.id;
        this.distance = builder.distance;
        this.cost = builder.cost;
        this.state = builder.state;
    }

    public Long getId()
    {
        return id;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getCost()
    {
        if(distance <= 100)
        {
            cost = 50;
        }
        else if(distance <= 150)
        {
            cost = 75;
        }
        else if(distance <= 250)
        {
            cost = 150;
        }
        else if(distance <= 500)
        {
            cost = 275;
        }
        else if(distance <= 1000)
        {
            cost = 400;
        }
        else
        {
            cost = 600;
        }

        return cost;
    }

    public String getState()
    {
        return state;
    }

    public static class Builder
    {
        private Long id;
        private double distance;
        private double cost;
        private String state;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder distance(double value)
        {
            this.distance = value;
            return this;
        }

        public Builder cost(double value)
        {
            this.cost = value;
            return this;
        }

        public Builder state(String value)
        {
            this.state = value;
            return this;
        }

        public Builder copy(DistanceCostType value)
        {
            this.id = value.id;
            this.distance = value.distance;
            this.cost = value.cost;
            this.state = value.state;

            return this;
        }

        public DistanceCostType build()
        {
            return new DistanceCostType(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DistanceCostType distanceCostType = (DistanceCostType) o;

        return id != null ? id.equals(distanceCostType.id) : distanceCostType.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
