package com.java.siit.junit;

import lombok.Data;

@Data
public class Calculator {

    private String regex = "\\+";

    public int sum(String expression) {
        int sum = 0;
        String[] splittedInput = expression.split(regex);
        for (String element : splittedInput) {
            sum += Integer.parseInt(element);
        }
        return sum;
    }
}
