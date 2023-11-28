package com.github.curriculeon.farm.fields;

import com.github.curriculeon.collections.AbstractRepository;

public abstract class AbstractCropRow<
        CropType extends CropInterface>
        extends AbstractRepository<CropType> {
    public void fertilize() {
        for (CropType crop : this) {
            crop.fertilize();
        }
    }
}
