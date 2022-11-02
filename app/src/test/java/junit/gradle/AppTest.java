package junit.gradle;

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
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void getAdd() {
        int result = app.getAdd(a, b);
        assertEquals(15, result);
    }

    @Test
    void getSubtract() {
        int result = app.getSubtract(a, b);
        assertEquals(9, result);
    }

    @Test
    void getMultiply() {
        int result = app.getMultiply(a, b);
        assertEquals(36, result);
    }

    @Test
    void getSplit() {
        int result = app.getSplit(a, b);
        assertEquals(4, result);
    }
}
