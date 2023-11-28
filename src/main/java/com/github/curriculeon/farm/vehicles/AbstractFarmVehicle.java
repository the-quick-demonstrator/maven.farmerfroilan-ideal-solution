package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.animals.people.RiderInterface;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractFarmVehicle<
        RiderType extends RiderInterface>
        implements VehicleInterface<RiderType> {
    private final int capacity;
    private final String noise;
    private final List<RiderType> list;

    public AbstractFarmVehicle(int capacity, String noise, List<RiderType> list) {
        this.capacity = capacity;
        this.noise = noise;
        this.list = list;
    }

    public AbstractFarmVehicle(String noise, List<RiderType> list) {
        this(1, noise, list);
    }

    public AbstractFarmVehicle(String noise) {
        this(noise, new ArrayList<>());
    }

    @Override
    public String makeNoise() {
        return this.noise;
    }

    @Override
    public List<RiderType> getRiders() {
        return this.list;
    }

    @Override
    public int getRiderCapacity() {
        return this.capacity;
    }
}
