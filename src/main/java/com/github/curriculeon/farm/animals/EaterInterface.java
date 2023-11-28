package com.github.curriculeon.farm.animals;

import com.github.curriculeon.farm.utils.EdibleInterface;

import java.util.List;

public interface EaterInterface<EdibleType extends EdibleInterface> {
    List<EdibleType> getConsumptionList();

    default void eat(EdibleType edibleType) {
        getConsumptionList().add(edibleType);
    }

    default void purge() {
        getConsumptionList().clear();
    }
}
