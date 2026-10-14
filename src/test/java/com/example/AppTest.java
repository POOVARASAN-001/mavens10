package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGrades() {
        App app = new App();
        assertEquals('A', app.calculateGrade(95));
        assertEquals('B', app.calculateGrade(82));
        assertEquals('C', app.calculateGrade(75));
        assertEquals('D', app.calculateGrade(61));
        assertEquals('F', app.calculateGrade(45));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMarksHigh() {
        App app = new App();
        app.calculateGrade(105);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMarksNegative() {
        App app = new App();
        app.calculateGrade(-5);
    }
}
