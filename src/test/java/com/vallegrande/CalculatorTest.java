package com.vallegrande;

import com.vallegrande.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator")
public
class CalculatorTest {

    private Calculator calculator = new Calculator();

    private int a = 12;
    private int b = 3;

    @BeforeAll
    static void init(){
        System.out.println("Initializing test of class Calculator");
    }

    @AfterAll
    static void after(){
        System.out.println("Finalizing test of class Calculator");
    }

    @Test
    void add() {
        int result = calculator.add(a, b);
        assertEquals(15, result);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(a, b);
        assertEquals(9, result);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(a, b);
        assertEquals(36, result);
    }

    @Test
    void split() {
        int result = calculator.split(a, b);
        assertEquals(4, result);
    }
}