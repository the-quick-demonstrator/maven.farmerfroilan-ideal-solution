package com.github.curriculeon.farm.fields;

import com.github.curriculeon.farm.utils.EdibleInterface;

abstract public class AbstractCrop<EdibleType extends EdibleInterface> implements CropInterface<EdibleType> {
    private boolean isFertilized;

    @Override
    public boolean isFertilized() {
        return isFertilized;
    }

    @Override
    public void fertilize() {
        this.isFertilized = true;
    }

    @Override
    public void unfertilize() {
        this.isFertilized = false;
    }
}
// you can only extend 1 concrete or 1 abstract class
// you can extend as many interfaces as you'd like
// therefore, extending a concrete or abstract class is a high-commitment design decision