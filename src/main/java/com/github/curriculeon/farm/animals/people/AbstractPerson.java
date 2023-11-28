package com.github.curriculeon.farm.animals.people;

import com.github.curriculeon.farm.animals.AbstractAnimal;
import com.github.curriculeon.farm.utils.EdibleInterface;

abstract public class AbstractPerson extends AbstractAnimal<EdibleInterface> {
    public AbstractPerson() {
        super("Hello");
    }
}
