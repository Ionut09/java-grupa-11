package com.java.siit.oop.lambda;

import com.java.siit.oop.interfaces.Animal;
import com.java.siit.oop.interfaces.Cat;

public class AnonimousClass {
    static void metodaCuParametruLambda(InterfataFunctionala lambda) {
        lambda.test(new Cat());
    }

    public static void main(String[] args) {
//        interface Runnable {
//            void run();
//        }

        Runnable r = new Runnable() {
            public void run() {
                System.out.println("run method implementation, heavy logic");
                System.out.println("run method implementation, heavy logic");
                System.out.println("run method implementation, heavy logic");
            }
        };

        //type inference
        Runnable rAsLambda = () -> {
            System.out.println("run method implementation, heavy logic -- as lambda");
            System.out.println("run method implementation, heavy logic -- as lambda");
            System.out.println("run method implementation, heavy logic -- as lambda");
        };

        r.run();
        rAsLambda.run();

        InterfataFunctionala lambda = (Animal a) -> { //am definit implementarea metodei test
            //heavy logic
            System.out.println(a.getClass().getSimpleName());
            return true;
        };

        //varianta 1
        metodaCuParametruLambda(new InterafataFunctionalaImpl());

        //varianta 2
        metodaCuParametruLambda(new InterfataFunctionala() {
            @Override
            public boolean test(Animal a) {
                System.out.println(a.getClass().getSimpleName());
                return true;
            }
        });

        //varianta 3
        metodaCuParametruLambda(a -> {
            System.out.println(a.getClass().getSimpleName());
            return true;
        });

        Cat catAnonim = new Cat(){

        };

    }

    static interface InterfataFunctionala {
        boolean test(Animal a);
    }
}
