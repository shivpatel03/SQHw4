package com.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * Unit test for simple App.
 */
@Tag("Tests for NextDate method")
public class AppTest {

    @BeforeAll
    public static void shouldAnswerWithTrue() {
        System.out.println("Testing Starting.");
        ;
    }

    /**
     * Testing to check output when valid date is given
     */
    @DisplayName("Valid test date - 15/6/2000")
    @Tag("Valid Test")
    @Test
    public void test1() {
        assertEquals("16/6/2000", App.NextDate(15, 6, 2000));
    }

    /**
     * Testing to check output whne a valid date at beginning of the year is given
     */
    @DisplayName("Valid Test date - 1/1/2022")
    @Tag("Valid Test")
    @Test
    public void test2() {
        assertEquals("2/1/2022", App.NextDate(1, 1, 2022));
    }

    /**
     * Testing to check output when a valid date at end of the year is given
     */
    @DisplayName("Valid Test Date - 31/12/1999")
    @Tag("Valid Test")
    @Test
    public void test3() {
        assertEquals("1/1/2000", App.NextDate(31, 12, 1999));
    }

    /**
     * Testing to check output when a valid date at the end of a month is given
     */
    @DisplayName("Valid Test Date - 30/4/2024")
    @Tag("Valid Test")
    @Test
    public void test4() {
        assertEquals("1/5/2024", App.NextDate(30, 4, 2024));
    }

    /**
     * Testing to check output when a valid date when it is not a leap year
     */
    @DisplayName("Valid Test Date - 28/2/2023")
    @Tag("Valid Test")
    @Test
    public void test5() {
        assertEquals("1/3/2023", App.NextDate(28, 2, 2023));
    }

    /**
     * Testing to check output when minimum year value is given
     */
    @DisplayName("Boundary Test Date - 1/1/1812")
    @Tag("Boundary Test")
    @Test
    public void test6() {
        assertEquals("2/1/1812", App.NextDate(1, 1, 1812));
    }

    /**
     * Testing to check output when last day of the maximum year
     */
    @DisplayName("Boundary Test Date - 31/12/2212")
    @Tag("Boundary Test")
    @Test
    public void test7() {
        assertEquals("1/1/2213", App.NextDate(31, 12, 2212));
    }

    /**
     * Testing to check output with minimum date and month input
     */
    @DisplayName("Boundary Test Date - 1/1/2000")
    @Tag("Boundary Test")
    @Test
    public void test8() {
        assertEquals("2/1/2000", App.NextDate(1, 1, 2000));
    }

    /**
     * Testing to check maximum date and month input
     */
    @DisplayName("Boundary Test Date - 31/12/2003")
    @Tag("Boundary Test")
    @Test
    public void test9() {
        assertEquals("1/1/2004", App.NextDate(31, 12, 2003));
    }

    /**
     * Testing to check maximum date input in minimum month
     */
    @DisplayName("Boundary Test Date - 31/1/2000")
    @Tag("Boundary Test")
    @Test
    public void test10() {
        assertEquals("1/2/2000", App.NextDate(31, 1, 2000));
    }

    /**
     * Testing to check when maximum month value exceeded
     */
    @DisplayName("Invalid Test Date - 15/13/2022")
    @Tag("Invalid Test")
    @Test
    public void test11() {
        assertEquals("ERROR: input out of range", App.NextDate(15, 13, 2022));
    }

    /**
     * Testing to check when maximum year value exceeded
     */
    @DisplayName("Invalid Test Date - 1/1/2213")
    @Tag("Invalid Test")
    @Test
    public void test12() {
        assertEquals("ERROR: input out of range", App.NextDate(1, 1, 2213));
    }

    /**
     * Testing to check when maximum day value exceeded
     */
    @DisplayName("Invalid Test Date - 29/2/2021")
    @Tag("Invalid Test")
    @Test
    public void test13() {
        assertEquals("ERROR: input out of range", App.NextDate(29, 2, 2021));
    }

    /**
     * Testing to check when minimum year value exceeded
     */
    @DisplayName("Invalid Test Date - 1/1/1811")
    @Tag("Invalid Test")
    @Test
    public void test14() {
        assertEquals("ERROR: input out of range", App.NextDate(1, 1, 1811));
    }

    /**
     * Testing to check when maximum day value exceeded
     */
    @DisplayName("Invalid Test Date - 32/3/2021")
    @Tag("Invalid Test")
    @Test
    public void test15() {
        assertEquals("ERROR: input out of range", App.NextDate(32, 3, 2021));
    }

    /**
     * Testing to check for a valid date on a leap year
     */
    @DisplayName("Leap Year Test Date - 28/2/2024")
    @Tag("Leap Year Test")
    @Test
    public void test16() {
        assertEquals("29/2/2024", App.NextDate(28, 2, 2024));
    }

    /**
     * Testing to check witha maximum date in February on a leap year
     */
    @DisplayName("Leap Year Test Date - 29/2/2020")
    @Tag("Leap Year Test")
    @Test
    public void test17() {
        assertEquals("1/3/2020", App.NextDate(29, 2, 2020));
    }

}
