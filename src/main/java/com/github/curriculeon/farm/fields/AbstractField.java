package com.github.curriculeon.farm.fields;

import com.github.curriculeon.farm.utils.EdibleInterface;
import com.github.curriculeon.collections.AbstractRepository;

public abstract class AbstractField<
        EdibleType extends EdibleInterface,
        CropType extends CropInterface<EdibleType>,
        CropRowType extends AbstractCropRow<CropType>>
        extends AbstractRepository<CropType> {
}
