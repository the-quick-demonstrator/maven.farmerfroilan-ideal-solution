package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.FarmInterface;
import com.github.curriculeon.farm.animals.people.RiderInterface;

public interface FarmVehicle<
        RiderType extends RiderInterface>
        extends VehicleInterface<RiderType> {
    void operate(FarmInterface farm);
}
