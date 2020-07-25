package com.testmaximum;

public class FindMaximum {
    public static <E extends Comparable<E>> E testMax(E firstNumber, E secondNumber, E thirdNumber) {
        E max = firstNumber;
        if (secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if (thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }

}
