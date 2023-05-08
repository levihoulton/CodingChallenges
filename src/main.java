import Challenges.Week1Revature.Week1Revature;
import Challenges.Week2Revature.Week2Revature;
import Challenges.Week3Revature.Week3Revature_part1;
import Challenges.Week3Revature.Week3Revature_part2;

import java.util.LinkedList;

public class main {

    public static void main(String[] args){
        //Weeks 1
        int[] intArr = {1,2};
        int[] intArr2 = {3,4};
        LinkedList<Integer> lList1 = new LinkedList<>();
        LinkedList<Integer> lList2 = new LinkedList<>();
        lList1.add(2);
        lList1.add(5);
        lList1.add(1);
        lList2.add(99);
        lList2.add(2);
        lList2.add(7);
        LinkedList<Integer>[] lListArr = new LinkedList[2];
        lListArr[0] = lList1;
        lListArr[1] = lList2;


        System.out.println(Week1Revature.arrayOfMultiples(3,8));
        System.out.println(Week2Revature.warOfNumbers(intArr2));
        System.out.println(Week3Revature_part1.medOfTwoArr(intArr, intArr2));
        System.out.println(Week3Revature_part2.mergeTwoLists(lListArr));
    }

}
