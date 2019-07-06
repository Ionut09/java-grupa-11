package com.java.siit.oop.lambda;

import com.java.siit.oop.interfaces.Animal;

public class InterafataFunctionalaImpl implements AnonimousClass.InterfataFunctionala {
    @Override
    public boolean test(Animal a) {
        System.out.println(a.getClass().getSimpleName());
        return true;
    }
}
