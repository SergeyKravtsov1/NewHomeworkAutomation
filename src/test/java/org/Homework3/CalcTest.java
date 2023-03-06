package org.Homework3;
import org.Homework3.Calculation;
import org.junit.jupiter.api.*;

public class CalcTest {


    private static Calculation calculation;

    @BeforeAll
    public static void init() {
        calculation = new Calculation();
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @Test
    public void testDivision() {
        System.out.println("Test 1");
        int result = calculation.division(5, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("Test 2");
        int result = calculation.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void testAddition() {
        System.out.println("Test 3");
        int result = calculation.addition(5, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("Test subtraction 5 - 5")
    public void testSubtraction() {
        System.out.println("Test 4");
        int result = calculation.subtraction(5, 5);
        Assertions.assertEquals(0, result);

    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");

    }

}

