package Challenges.Week1Revature;

import java.util.Arrays;

public class Week1Revature {
    public static String arrayOfMultiples(int num, int length){
        int[] multiples = new int [length];
        for (int i = 0; i < length; i++){
            multiples[i] = num*(i+1);
        }
        return Arrays.toString(multiples);
    }
}
