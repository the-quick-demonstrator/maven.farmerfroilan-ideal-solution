package com.github.curriculeon.farm;

import com.github.curriculeon.farm.animals.livestock.chicken.ChickenCoop;
import com.github.curriculeon.farm.animals.livestock.horse.HorseStable;
import com.github.curriculeon.farm.animals.people.FarmHouse;
import com.github.curriculeon.farm.utils.Repository;

public class Farm {
    private final Repository<HorseStable> stables;
    private final Repository<ChickenCoop> chickenCoops;
    private final FarmHouse farmHouse;

    public Farm(Repository<HorseStable> stables, Repository<ChickenCoop> chickenCoops, FarmHouse farmHouse) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
    }

    public Repository<HorseStable> getStables() {
        return stables;
    }

    public Repository<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
