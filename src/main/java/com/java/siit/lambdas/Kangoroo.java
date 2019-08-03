package com.java.siit.lambdas;

import lombok.Data;

@Data
public class Kangoroo extends Animal {
    @Override
    boolean canHop() {
        return true;
    }

    @Override
    boolean canRun() {
        return false;
    }

    @Override
    boolean canSwim() {
        return false;
    }
}
