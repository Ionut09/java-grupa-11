package com.java.siit.methods;

public class CalculatorHelper {

    int a;


    static int calculator(int n1, int n2, String operation) {
        CalculatorHelper calculatorHelperObject = new CalculatorHelper();
        calculatorHelperObject.a += 2;

        switch (operation) {
            case "+": //in case-uri se pot folosi numere intregi si stringuri si booleeni
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                return n1 + n2;
            case "-":
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                return n1 - n2;
            case "*":
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                return n1 * n2;
            case "/":
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                return n1 / n2;
            default:
                throw new IllegalArgumentException("Ai introdus o operatie gresita!!!");
        }
        //daca adaugam cod aici n-o sa compileze
        //pt ca sub nicio forma executia metodei nu va ajunge aici
        // la fel la if de mai jos

//        if (n1 == 4) {
//            return 2;
//        } else {
//            return 4;
//        }

    }
}
