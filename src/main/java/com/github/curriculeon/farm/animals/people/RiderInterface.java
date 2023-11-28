package com.github.curriculeon.farm.animals.people;


import com.github.curriculeon.farm.vehicles.RideableInterface;

public interface RiderInterface {
    default void mount(RideableInterface rideable) {
        rideable.mount(this);
    }

    default void dismount(RideableInterface rideable) {
        rideable.dismount(this);
    }

    int getMileage();

    void ride(int distanceInMiles);
}
