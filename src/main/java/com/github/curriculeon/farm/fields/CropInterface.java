package com.github.curriculeon.farm.fields;

import com.github.curriculeon.farm.EdibleInterface;
import com.github.curriculeon.farm.ProduceInterface;

public interface CropInterface<
        EdibleType extends EdibleInterface>
        extends ProduceInterface<EdibleType> {
    EdibleType yield();
}
