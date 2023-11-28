package com.github.curriculeon.farm.animals;

import com.github.curriculeon.farm.EdibleInterface;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractAnimal<
        EdibleType extends EdibleInterface>
        implements AnimalInterface<EdibleType> {

    private final String noise;
    private final List<EdibleType> list;

    public AbstractAnimal(String noise) {
        this(noise, new ArrayList<>());
    }

    public AbstractAnimal(String noise, List<EdibleType> list) {
        this.noise = noise;
        this.list = list;
    }

    @Override
    public String makeNoise() {
        return this.noise;
    }

    @Override
    public List<EdibleType> getConsumptionList() {
        return this.list;
    }
}
