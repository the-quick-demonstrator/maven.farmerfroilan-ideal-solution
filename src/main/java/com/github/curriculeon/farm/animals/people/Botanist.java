package com.github.curriculeon.farm.animals.people;

import com.github.curriculeon.farm.fields.AbstractCropRow;
import com.github.curriculeon.farm.fields.CropInterface;

public interface Botanist {
    default <CropType extends CropInterface<?>> void plant(CropType crop, AbstractCropRow<CropType> cropRow) {
        cropRow.add(crop);
    }
}
