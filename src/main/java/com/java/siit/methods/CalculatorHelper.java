package com.java.siit.methods;

public class CalculatorHelper {

    int a;


    static void calculator(int n1, int n2, String operation) {
        CalculatorHelper calculatorHelperObject = new CalculatorHelper();
        calculatorHelperObject.a += 2;

        switch (operation) {
            case "+": //in case-uri se pot folosi numere intregi si stringuri si booleeni
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case "-":
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case "*":
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case "/":
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default:
                System.out.println("Bad operation!");
        }

    }
}
