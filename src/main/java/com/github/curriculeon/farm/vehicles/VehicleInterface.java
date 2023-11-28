package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.NoiseMakerInterface;
import com.github.curriculeon.farm.animals.people.RiderInterface;

public interface VehicleInterface<
        RiderType extends RiderInterface>
        extends NoiseMakerInterface, RideableInterface<RiderType> {
}
