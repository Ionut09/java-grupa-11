package com.java.siit.methods;

import java.util.Scanner;

import static com.java.siit.methods.CalculatorHelper.calculator;

public class Calculator {
    //daca e la nivel de clasa inseamna ca e field (camp) sau instance/static variable
    static Scanner scannerObject = new Scanner(System.in); //Rename shortcut Shift+F6
    //pt ca sa putem folosi scannerObject in main (care e statica) trebuie ca
    //scannerObject sa fie definit tot cu keywordul static

    public static void main(String[] args) {
        System.out.println("Calculator de nre!");

        System.out.println("Introduceti primul numar: ");
        int first = scannerObject.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int second = scannerObject.nextInt();
        System.out.println("Introduceti operatia dorita: ");
        String sign = scannerObject.next();

        calculator((int) 2.3, second, sign);

        calculator(5, 6, "*");


        System.out.println("La revedere!");
    }


}
