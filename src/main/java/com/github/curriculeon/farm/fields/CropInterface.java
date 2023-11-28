package com.github.curriculeon.farm.fields;

import com.github.curriculeon.farm.utils.EdibleInterface;
import com.github.curriculeon.farm.utils.ProduceInterface;

public interface CropInterface<
        EdibleType extends EdibleInterface>
        extends ProduceInterface<EdibleType> {
    EdibleType yield();
}
