package com.rold.calculator;

public class Fizzbuzz {
    public static String de(int nbre)
    {
        if(nbre == 3)
            return "Fizz";
        if(nbre == 5)
            return "Buzz";
        if(nbre == 15)
            return "FizzBuzz";
        return String .valueOf(nbre);
    }
}