package com.github.curriculeon.farm.animals.livestock.horse;

import com.github.curriculeon.farm.animals.AbstractAnimal;
import com.github.curriculeon.farm.fields.VegetableInterface;

public class Horse extends AbstractAnimal<VegetableInterface> {
    public Horse() {
        super("Neigh!");
    }
}