import java.util.Arrays;

public class main {

    public static void main(String[] args){
        //Weeks 1
        System.out.println(arrayOfMultiples(3,5));
    }

    //challenge week 1
    public static String arrayOfMultiples(int num, int length){
        int[] multiples = new int [length];
        for (int i = 0; i < length; i++){
            multiples[i] = num*(i+1);
        }
        return Arrays.toString(multiples);
    }
}
