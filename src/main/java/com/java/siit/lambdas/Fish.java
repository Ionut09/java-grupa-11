package com.java.siit.lambdas;

import lombok.Data;

@Data
public class Fish extends Animal {

    @Override
    boolean canHop() {
        return false;
    }

    @Override
    boolean canRun() {
        return false;
    }

    @Override
    boolean canSwim() {
        return true;
    }
}
