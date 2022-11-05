package com.vallegrande;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("NumberToTest")
class NumberToTextTest {

    private NumberToText numbertotext = new NumberToText();

    int a = 5;

    @BeforeAll
    static void init(){
        System.out.println("Initializing test of class Calculator");
    }

    @AfterAll
    static void after(){
        System.out.println("Finalizing test of class Calculator");
    }

    @Test
    void numLetter() throws Exception {
        String result = numbertotext.numLetter(a);
        assertEquals("CINCO", result);
        /*assertNotNull(result);*/
    }
}