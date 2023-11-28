package com.github.curriculeon.farm.animals;

import com.github.curriculeon.farm.EdibleInterface;
import com.github.curriculeon.farm.NoiseMakerInterface;
import com.github.curriculeon.farm.animals.EaterInterface;

public interface AnimalInterface<
        EdibleType extends EdibleInterface>
        extends NoiseMakerInterface, EaterInterface<EdibleType> {
}
