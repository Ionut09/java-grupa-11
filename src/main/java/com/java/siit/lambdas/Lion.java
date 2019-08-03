package com.java.siit.lambdas;

import lombok.Data;

@Data
public class Lion extends Animal {
    @Override
    boolean canHop() {
        return true;
    }

    @Override
    boolean canRun() {
        return true;
    }

    @Override
    boolean canSwim() {
        return true;
    }
}
