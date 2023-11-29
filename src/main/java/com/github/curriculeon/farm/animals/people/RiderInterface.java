package com.github.curriculeon.farm.animals.people;


import com.github.curriculeon.farm.vehicles.RideableInterface;

public interface RiderInterface<RideableType extends RideableInterface> {
    default void mount(RideableType rideable) {
        rideable.mount(this);
    }

    default void dismount(RideableType rideable) {
        rideable.dismount(this);
    }

    int getMileage();

    void ride(int distanceInMiles);
}
