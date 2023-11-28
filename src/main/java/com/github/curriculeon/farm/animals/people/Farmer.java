package com.github.curriculeon.farm.animals.people;

public class Farmer extends AbstractPerson implements Botanist, RiderInterface {
    private int mileage;

    @Override
    public int getMileage() {
        return mileage;
    }

    @Override
    public void ride(int distanceInMiles) {
        this.mileage += distanceInMiles;
    }
}
