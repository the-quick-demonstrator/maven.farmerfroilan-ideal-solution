package com.github.curriculeon.collections;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractRepository<EntityType> implements RepositoryInterface<EntityType> {

    private List<EntityType> list;

    public AbstractRepository() {
        this(new ArrayList<>());
    }

    public AbstractRepository(List<EntityType> list) {
        this.list = list;
    }

    @Override
    public List<EntityType> getEntityList() {
        return this.list;
    }
}
