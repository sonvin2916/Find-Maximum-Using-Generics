package com.testmaximum;

public class FindMaximum <E extends Comparable<E>>
{
    E myXArray, myYArray, myZArray;

    public FindMaximum(E myXArray, E myYArray, E myZArray)
    {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public E testMax()
    {
        return testMax(myXArray, myYArray, myZArray);
    }

    public static <E extends Comparable<E>> E testMax(E firstNumber, E secondNumber, E thirdNumber)
    {
        E max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        return max;

    }

    public static void main(String args[])
    {

        Integer firstInt = 50, secondInt = 80, thirdInt = 20;
        Float firstFloat = 56.12f, secondFloat = 30.16f, thirdFloat = 28.14f;
        String firstString = "Banana", secondString = "Orange", thirdString = "Mango";
        new FindMaximum<Integer>(firstInt, secondInt, thirdInt);
        new FindMaximum<Float>(firstFloat, secondFloat, thirdFloat);
        new FindMaximum<String>(firstString, secondString, thirdString);
    }
}





