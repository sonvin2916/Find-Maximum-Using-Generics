package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenIntegerMaxNumber_AtFirstPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum(80,20,50);
        Comparable result = findMaximum.testMax();
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenIntegerMaxNumber_AtSecondPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum(50,80,20);
        Comparable result = findMaximum.testMax();
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenIntegerMaxNumber_AtThirdPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum(20,50,80);
        Comparable result = findMaximum.testMax();
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenFloatMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum(56.12f,30.16f,28.14f);
        Comparable result = findMaximum.testMax();
        Assert.assertEquals(56.12f,result);

    }
    @Test
    public void givenFloatMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum(28.14f,56.12f,30.16f);
        Comparable result = findMaximum.testMax();
        Assert.assertEquals(56.12f,result);
    }
    @Test
    public void givenFloatMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum(30.16f,28.14f,56.12f);
        Comparable result = findMaximum.testMax();
        Assert.assertEquals(56.12f,result);
    }
    @Test
    public void givenString_AtFirstPosition_ShouldReturnSameString() {
        FindMaximum findMaximum = new FindMaximum("Orange","Mango","Banana");
        Comparable result = findMaximum.testMax();
        Assert.assertEquals("Orange",result);
    }
    @Test
    public void givenString_AtSecondPosition_ShouldReturnSameString() {
        FindMaximum findMaximum = new FindMaximum("Banana","Orange","Mango");
        Comparable result = findMaximum.testMax();
        Assert.assertEquals("Orange",result);
    }
    @Test
    public void givenString_AtThirdPosition_ShouldReturnSameString() {
        FindMaximum findMaximum = new FindMaximum("Mango","Banana","Orange");
        Comparable result = findMaximum.testMax();
        Assert.assertEquals("Orange",result);
    }

}
