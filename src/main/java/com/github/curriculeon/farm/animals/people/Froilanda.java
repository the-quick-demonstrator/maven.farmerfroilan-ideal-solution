package com.github.curriculeon.farm.animals.people;

import com.github.curriculeon.farm.vehicles.CropDuster;

public class Froilanda extends AbstractPerson implements PilotInterface<CropDuster> {
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
