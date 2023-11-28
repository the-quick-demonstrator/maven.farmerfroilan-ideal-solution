package com.github.curriculeon.farm.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface ProduceInterface<EdibleType extends EdibleInterface> {
    boolean isFertilized();
    void fertilize();
    void unfertilize();


    default EdibleType yield() {
        try {
            final Type superclass = getClass().getGenericSuperclass();
            final Type[] types = ((ParameterizedType) superclass).getActualTypeArguments();
            final String parameterizedTypeName = types[0].getTypeName();
            final Class<?> clazz = Class.forName(parameterizedTypeName);
            return (EdibleType) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
