package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenIntegerMaxNumber_AtFirstPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        int result = findMaximum.testMax(80,20,50);
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenIntegerMaxNumber_AtSecondPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        int result = findMaximum.testMax(20,80,50);
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenIntegerMaxNumber_AtThirdPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        int result = findMaximum.testMax(50,20,80);
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenFloatMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum();
        float result = findMaximum.testMax(56.12f,30.16f,28.14f);
       Assert.assertEquals(56.12f, result, 1.0);

    }
    @Test
    public void givenFloatMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum();
        float result = findMaximum.testMax(30.16f,56.12f,28.14f);
        Assert.assertEquals(56.12f, result, 1.0);
    }
    @Test
    public void givenFloatMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum();
        float result = findMaximum.testMax(30.16f,28.14f,56.12f);
        Assert.assertEquals(56.12f, result, 1.0);
    }



}
