package com.syntax.youtubeVIdeos;

public class VariableLengthArguments {

    // .. is called ellipses
    public static int sum (int ... numbers ) {
        int sum = 0;
        for ( int i=0; i< numbers.length; i ++ ) {
            sum += numbers[i];
        }
        return sum;


    }
}
