package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    //    @Test
//    public void testAdd(){
//        Calculator calculator = new Calculator();
//        int actual = calculator.add( 10, 5);
//        int expected = 15;
//        Assert.assertEquals(actual, expected);
//    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(10, 2);
        int expected = 8;
        Assert.assertEquals(actual, expected);
    }

    //tanpa redundan
    @Test
    public void testing() {
        Calculator testing = new Calculator();
        Assert.assertEquals(testing.subtract(5, 1), 4);
    }
}
