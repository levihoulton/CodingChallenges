import Challenges.Week1Revature.Week1Revature;
import Challenges.Week2Revature.Week2Revature;
import Challenges.Week3Revature.Week3Revature_part1;
import Challenges.Week3Revature.Week3Revature_part2;
import Challenges.Week4Revature.Week4_part1;
import Challenges.Week4Revature.Week4_part2;
import Challenges.tools.ListNode;

import java.util.Arrays;
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

        ListNode intersectingNode = new ListNode(5);

        // Create the first linked list: 1 -> 2 -> 3 -> 5 -> 6
        LinkedList<ListNode> listA = new LinkedList<>();
        listA.add(new ListNode(1));
        listA.add(new ListNode(2));
        listA.add(new ListNode(3));
        listA.add(intersectingNode);
        listA.add(new ListNode(6));

        // Create the second linked list: 4 -> 7 -> 5 -> 6
        LinkedList<ListNode> listB = new LinkedList<>();
        listB.add(new ListNode(4));
        listB.add(new ListNode(7));
        listB.add(intersectingNode);

        // Create the nodes
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        // Create the linked list
        LinkedList<ListNode> linkedListCircular = new LinkedList<>();
        linkedListCircular.add(head);
        linkedListCircular.add(node2);
        linkedListCircular.add(node3);
        linkedListCircular.add(node4);
        linkedListCircular.add(node5);
        linkedListCircular.add(node6);
        linkedListCircular.add(node3); // Create the loop


        System.out.println(Week1Revature.arrayOfMultiples(3,8));
        System.out.println(Week2Revature.warOfNumbers(intArr2));
        System.out.println(Week3Revature_part1.medOfTwoArr(intArr, intArr2));
        System.out.println(Week3Revature_part2.mergeTwoLists(lListArr));
        System.out.println(Week4_part1.intersection(listA,listB).equals(intersectingNode));
        Week4_part2.loopDetection(linkedListCircular).forEach(e -> System.out.println(e.equals(node3)));

    }

}
