package com.github.curriculeon.farm.utils;

import java.util.Iterator;
import java.util.List;

public interface RepositoryInterface<EntityType> extends Iterable<EntityType> {
    List<EntityType> getEntityList();
    default boolean add(EntityType entity) {
        final boolean listChangedUponInsertion = getEntityList().contains(entity);
        getEntityList().add(entity);
        return !listChangedUponInsertion;
    }

    default boolean remove(EntityType entity) {
        final boolean listChangedUponDeletion = getEntityList().contains(entity);
        getEntityList().remove(entity);
        return listChangedUponDeletion;
    }

    default EntityType get(int index) {
        return getEntityList().get(index);
    }

    default boolean update(int index, EntityType newData) {
        try {
            getEntityList().add(index, newData);
            return true;
        } catch(Throwable t) {
            return false;
        }
    }

    @Override
    default Iterator<EntityType> iterator() {
        return getEntityList().iterator();
    }
}
