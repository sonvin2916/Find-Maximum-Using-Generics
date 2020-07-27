package com.testmaximum;

public class FindMaximum <E extends Comparable<E>>
{
    E firstDigit, secondDigit, thirdDigit;

    public FindMaximum(E firstDigit, E secondDigit, E thirdDigit)
    {
        this.firstDigit=firstDigit;
        this.secondDigit=secondDigit;
        this.thirdDigit=thirdDigit;
    }

    public E testMax()
    {
        return testMax(firstDigit,secondDigit,thirdDigit);
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
        printMax(firstNumber,secondNumber,thirdNumber,max);
        return max;
    }
    private static <E extends Comparable<E>> void printMax(E firstNumber, E secondNumber, E thirdNumber, E max) {
        System.out.println("Maximum of"+firstNumber+" "+secondNumber+" "+thirdNumber+":"+max);
    }

    public static void main(String args[])
    {

        Integer firstInt = 50, secondInt = 80, thirdInt = 20;
        Float firstFloat = 56.12f, secondFloat = 30.16f, thirdFloat = 28.14f;
        String firstString = "Banana", secondString = "Orange", thirdString = "Mango";
        new FindMaximum<Integer>(firstInt, secondInt, thirdInt).testMax();
        new FindMaximum<Float>(firstFloat, secondFloat, thirdFloat).testMax();
        new FindMaximum<String>(firstString, secondString, thirdString).testMax();
    }
}





