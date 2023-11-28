package com.github.curriculeon.farm.fields.corn;

import com.github.curriculeon.farm.fields.AbstractCrop;

public class CornStalkCrop extends AbstractCrop<EarCorn> {
    @Override
    public EarCorn yield() {
        return new EarCorn();
    }
}
