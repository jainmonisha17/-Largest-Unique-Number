// Name: Monisha Jain
// Qualificaton: MCA
// College: PES(Bengaluru)

// Given an array of integers, identify the highest value that appears only once in the array. If no such number exists, return -1.

// Examples:

// Example 1:

// Input: [5, 7, 3, 7, 5, 8]
// Expected Output: 8
// Justification: The number 8 is the highest value that appears only once in the array.
// Example 2:

// Input: [1, 2, 3, 2, 1, 4, 4]
// Expected Output: 3
// Justification: The number 3 is the highest value that appears only once in the array.
// Example 3:

// Input: [9, 9, 8, 8, 7, 7]
// Expected Output: -1
// Justification: There is no number in the array that appears only once.

import java.util.*;
public class largestUniqueNumber1 {
    public int largestUniqueNumber(int[] A) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for(int num: A) {
            myHashMap.put(num, myHashMap.getOrDefault(num, 0) + 1);
        }
        int maxUnique = -1;
        // travaerse the hashmap to find the largest unique number

        for(int unique: myHashMap.keySet()) {
            if(myHashMap.get(unique) == 1) {
                maxUnique = Math.max(maxUnique, unique);
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        largestUniqueNumber1 sol = new largestUniqueNumber1();
        System.out.println(sol.largestUniqueNumber(new int[]{5, 7, 3, 7, 5, 8}));  // Expected: 8
        System.out.println(sol.largestUniqueNumber(new int[]{1, 2, 3, 2, 1, 4, 4}));  // Expected: 3
        System.out.println(sol.largestUniqueNumber(new int[]{9, 9, 8, 8, 7, 7}));   // Expected: -1
    }
}
