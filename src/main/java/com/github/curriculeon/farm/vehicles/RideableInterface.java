package com.github.curriculeon.farm.vehicles;

import com.github.curriculeon.farm.animals.people.RiderInterface;

import java.util.List;

public interface RideableInterface<RiderType extends RiderInterface> {
    List<RiderType> getRiders();
    int getRiderCapacity();

    default boolean hasRider() {
        return !getRiders().isEmpty();
    }
    default void mount(RiderType rider) {
        getRiders().add(rider);
    }
    default void dismount(RiderType rider) {
        getRiders().remove(rider);
    }

    default void removeAllRiders() {
        getRiders().clear();
    }
}
