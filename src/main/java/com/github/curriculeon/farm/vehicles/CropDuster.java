package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.fields.AbstractCropRow;
import com.github.curriculeon.farm.animals.people.Farmer;

public class CropDuster extends AbstractFarmVehicle<Farmer> implements AircraftInterface {
    private int totalDistanceTraveled;

    public CropDuster() {
        super("Zoom! Whir!");
    }

    @Override
    public void fly(int distance) {
        this.totalDistanceTraveled += distance;
    }

    @Override
    public int getDistanceTraveled() {
        return this.totalDistanceTraveled;
    }

    public void fertilize(AbstractCropRow cropRow) {
        cropRow.fertilize();
    }
}