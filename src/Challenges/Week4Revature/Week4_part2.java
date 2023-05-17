package Challenges.Week4Revature;
//
//    b) Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
//            DEFINITION:
//            Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
//            EXAMPLE
//            Input: A -> B -> C -> D -> E -> C [the same C as earlier]
//            Output: C

import Challenges.tools.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Week4_part2 {

    public static ArrayList<ListNode> loopDetection(LinkedList<ListNode> list){
        ArrayList<ListNode> nodeList = new ArrayList<>();
        Set<ListNode> nodeSet = new HashSet<ListNode>();

        for (ListNode node : list){
            if (!nodeSet.contains(node)) {
                nodeSet.add(node);
            } else {
                nodeList.add(node);
            }
        }
        return nodeList;

    }
}
