package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.animals.people.RiderInterface;

public interface FlyableInterface<
        RiderType extends RiderInterface>
        extends RideableInterface<RiderType>, AircraftInterface {
}
