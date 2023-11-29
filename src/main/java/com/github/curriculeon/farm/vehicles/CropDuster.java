package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.animals.people.PilotInterface;
import com.github.curriculeon.farm.fields.AbstractCropRow;

public class CropDuster<
        PilotType extends PilotInterface>
        extends AbstractFarmVehicle<PilotType>
        implements FlyableInterface<PilotType> {
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