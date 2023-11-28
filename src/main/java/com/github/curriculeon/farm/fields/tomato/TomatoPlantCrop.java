package com.github.curriculeon.farm.fields.tomato;

import com.github.curriculeon.farm.fields.AbstractCrop;

public class TomatoPlantCrop extends AbstractCrop<Tomato> {
    @Override
    public Tomato yield() {
        return new Tomato();
    }
}
