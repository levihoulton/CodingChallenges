# CodingChallenges

Week 1 Challenge:

Java:

Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

Examples

arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]


Notes

Notice that num is also included in the returned array.

Week 2 Challenge:


        There's a great war between the even and odd numbers. Many numbers already lost their lives in this war and it's your task to end this. You have to determine which group sums larger: the evens, or the odds. The larger group wins.

        Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.



        Examples

        warOfNumbers([2, 8, 7, 5]) ➞ 2

// 2 + 8 = 10

// 7 + 5 = 12

// 12 is larger than 10

// So we return 12 - 10 = 2



        warOfNumbers([12, 90, 75]) ➞ 27

        warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
        
Week 3: 

Week 4: 
a) Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

b) Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
DEFINITION:
Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
EXAMPLE
Input: A -> B -> C -> D -> E -> C [the same C as earlier]
Output: C
