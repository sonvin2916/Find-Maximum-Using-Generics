package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        int result = findMaximum.testMax(80,20,50);
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        int result = findMaximum.testMax(20,80,50);
        Assert.assertEquals(80,result);
    }
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        int result = findMaximum.testMax(50,20,80);
        Assert.assertEquals(80,result);
    }
}
