package com.rold.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class CalculatorTest {
    @BeforeEach
    void setUp(){
        System.out.println("Creation d'une nouvelle instance de calculator");
        Calculator calculator=new Calculator();

    }
    @Test
    public void testAddition()
    {
        Calculator calculator=new Calculator();
        int result=calculator.add(2,3);
        assertEquals(5,result,"2 + 3 doit etre egale à 5 ");
    }
    @AfterEach
    void tearDown(){
        Calculator calcultor = null;
    }
}