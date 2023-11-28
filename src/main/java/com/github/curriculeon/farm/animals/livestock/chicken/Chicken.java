package com.github.curriculeon.farm.animals.livestock.chicken;

import com.github.curriculeon.farm.animals.AbstractAnimal;
import com.github.curriculeon.farm.ProduceInterface;
import com.github.curriculeon.farm.fields.VegetableInterface;

public class Chicken extends AbstractAnimal<VegetableInterface> implements ProduceInterface<ChickenEgg> {
    private boolean isFertilized;

    public Chicken() {
        super("Cluck!");
    }

    @Override
    public ChickenEgg yield() {
        if (!isFertilized()) {
            return ProduceInterface.super.yield();
        } else {
            throw new RuntimeException("Fertilized chickens cannot produce edible eggs.");
        }
    }

    @Override
    public boolean isFertilized() {
        return isFertilized;
    }

    @Override
    public void fertilize() {
        isFertilized = true;
    }

    @Override
    public void unfertilize() {
        isFertilized = false;
    }
}
