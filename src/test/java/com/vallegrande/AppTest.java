package com.vallegrande;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("App-Test")
class AppTest {

    public App app = new App();

    int a = 12;
    int b = 3;

    @BeforeAll
    static void init(){
        System.out.println("Initializing test of class App");
    }

    @AfterAll
    static void after(){
        System.out.println("Finalizing test of class App");
    }

    @Test
    @DisplayName("Test add")
    void add() {
        int result = app.add(a, b);
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Test subtract")
    void subtract() {
        int result = app.subtract(a, b);
        assertEquals(9, result);
    }

    @Test
    @DisplayName("Test multiply")
    void multiply() {
        int result = app.multiply(a, b);
        assertEquals(36, result);
    }

    @Test
    @DisplayName("Test split")
    void split() {
        int result = app.split(a, b);
        assertEquals(4, result);
    }
}