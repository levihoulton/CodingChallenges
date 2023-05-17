package Challenges.Week4Revature;

//        a)Intersection: Given two (singly) linked lists, determine if the two lists intersect.
//        Return the intersecting node. Note that the intersection is defined based on reference,
//        not value. That is, if the kth node of the first linked list is the exact same node (by reference)
//        as the jth node of the second linked list, then they are intersecting.

import Challenges.tools.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Week4_part1 {

    public static ListNode intersection(LinkedList<ListNode> linkedList1, LinkedList<ListNode> linkedList2){
        ArrayList<ListNode> nodeList = new ArrayList<>();
        for (ListNode n : linkedList1){
            nodeList.add(n);
        }

        for (ListNode e : linkedList2){
            if (nodeList.contains(e)){
                return e;
            }
        }
        return nodeList.get(0);

    }

}
