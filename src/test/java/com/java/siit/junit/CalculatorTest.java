package com.java.siit.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Before
    public void setup(){
        //initialize resources before every test
    }
    @BeforeClass
    public void setupClass(){
        //initialize resources before all tests
        //populate database with test data
    }
    @After
    public void after(){

    }
    @AfterClass
    public void afterClass(){
        //repo.deleteAllObjects();
    }

    @Test //pt fiecare metoda cu @Test se creaza o noua instanta din clasa de test (CalculatorTest)
    public void sumTest() {
        String input = "1+2+3+4";
        int sum = calculator.sum(input);
        assertEquals(10, sum);
    }
}
