package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenIntegerMaxNumber_AtFirstPosition_ShouldReturnSameNumber(){
        FindMaximum<Integer> valueInteger = new FindMaximum<Integer>(80,20,50);
        Integer result = valueInteger.testMax();
        Integer expected=80;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void givenIntegerMaxNumber_AtSecondPosition_ShouldReturnSameNumber(){
        FindMaximum<Integer> valueInteger = new FindMaximum<Integer>(50,80,20);
        Integer result = valueInteger.testMax();
        Integer expected=80;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void givenIntegerMaxNumber_AtThirdPosition_ShouldReturnSameNumber(){
        FindMaximum<Integer> valueInteger = new FindMaximum<Integer>(20,50,80);
        Integer result = valueInteger.testMax();
        Integer expected=80;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void givenFloatMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximum<Float> valueFloat= new FindMaximum<Float>(56.12f,30.16f,28.14f);
        Float result = valueFloat.testMax();
        Float expected=56.12f;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void givenFloatMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximum<Float> valueFloat = new FindMaximum<Float>(28.14f, 56.12f, 30.16f);
        Float result = valueFloat.testMax();
        Float expected = 56.12f;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void givenFloatMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximum<Float> valueFloat = new FindMaximum<Float>(30.16f,28.14f,56.12f);
        Float result = valueFloat.testMax();
        Float expected = 56.12f;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void givenString_AtFirstPosition_ShouldReturnSameString() {
        FindMaximum<String> valueString = new FindMaximum<String>("Orange","Mango","Banana");
        String result = valueString.testMax();
        String expected = "Orange";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void givenString_AtSecondPosition_ShouldReturnSameString() {
        FindMaximum<String> valueString = new FindMaximum<String>("Banana","Orange","Mango");
        String result = valueString.testMax();
        String expected = "Orange";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void givenString_AtThirdPosition_ShouldReturnSameString() {
        FindMaximum<String> valueString = new FindMaximum<String>("Mango","Banana","Orange");
        String result = valueString.testMax();
        String expected = "Orange";
        Assert.assertEquals(expected, result);

    }

}
