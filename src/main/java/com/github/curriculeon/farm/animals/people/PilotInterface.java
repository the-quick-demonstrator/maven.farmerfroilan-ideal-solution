package com.github.curriculeon.farm.animals.people;

import com.github.curriculeon.farm.vehicles.FlyableInterface;

public interface PilotInterface<
        FlyableType extends FlyableInterface>
        extends RiderInterface<FlyableType> {
}
