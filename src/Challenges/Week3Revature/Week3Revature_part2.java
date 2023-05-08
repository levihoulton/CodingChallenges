package Challenges.Week3Revature;

//        2) Mergek Sorted Lists
//        You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//        Merge all the linked-lists into one sorted linked-list and return it.
//
//        Example1:
//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//        Output:[1,1,2,3,4,4,5,6]
//        Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//        merging them into one sorted list:
//        1->1->2->3->4->4->5->6
//
//        Example2:
//        Input: lists= []
//        Output: []
//
//        Example3:
//        Input: lists = [[]]
//        Output: []
//
//        Constraints:
//
//
//
//        k == lists.length
//
//        0 <= k <= 104
//
//        0 <= lists[i].length <= 500
//
//        -104 <= lists[i][j] <= 104
//
//        lists[i] is sorted in ascending order.
//
//        The sum of lists[i].length will not exceed 104.

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Week3Revature_part2 {
    public static String mergeTwoLists(LinkedList<Integer>[] listArr) {
        LinkedList<Integer> result = new LinkedList<>();
        for (LinkedList<Integer> list : listArr) {
            for (Integer i : list) {
                result.add(i);
            }
        }

        Collections.sort(result);
        return result.toString();
    }
}
