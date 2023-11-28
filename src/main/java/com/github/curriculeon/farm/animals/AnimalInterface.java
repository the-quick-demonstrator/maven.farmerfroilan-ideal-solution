package com.github.curriculeon.farm.animals;

import com.github.curriculeon.farm.utils.EdibleInterface;
import com.github.curriculeon.farm.utils.NoiseMakerInterface;

public interface AnimalInterface<
        EdibleType extends EdibleInterface>
        extends NoiseMakerInterface, EaterInterface<EdibleType> {
}
