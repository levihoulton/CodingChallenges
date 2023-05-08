package Challenges.Week3Revature;

//1) Median of Two Sorted Arrays
//        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//        The overall run time complexity should be O(log (m+n)).
//
//        Example1:
//        Input:nums1 = [1,3], nums2 = [2]
//        Output:2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//
//        Example2:
//        Input:nums1 = [1,2], nums2 = [3,4]
//        Output:2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//        Constraints:
//
//
//        nums1.length == m
//
//        nums2.length == n
//
//        0 <= m <= 1000
//
//        0 <= n <= 1000
//
//        1 <= m + n <= 2000
//
//        -106 <= nums1[i], nums2[i] <= 106
//
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Week3Revature_part1 {
    public static double medOfTwoArr(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.stream(arr1).forEach(e -> list.add(e));
        Arrays.stream(arr2).forEach(e -> list.add(e));
        Collections.sort(list);
        int med = list.size()/2;

        if (list.size()%2 == 0){
            double one = list.get(med);
            double two = list.get(med-1);
            double result = (one + two) /2;
            return result;
        } else {
            return list.get(med);
        }
    }
}
