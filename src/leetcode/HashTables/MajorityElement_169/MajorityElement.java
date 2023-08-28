package leetcode.HashTables.MajorityElement_169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//  Time complexity: O(n)
//  Space Complexity: O(1)
public class MajorityElement {
    public static int majorityElement(int[] nums){
        int count = 0;
        int major = nums[0];

        int n = nums.length / 2;

//  Approach 1: sorting in place and return the nth/2
//  Time complexity: O(nlog(n))
//  Space Complexity: O(1)

//        Arrays.sort(nums);
//        return nums[n];


//  Approach 2: using map
//  Time complexity: O(n)
//  Space Complexity: O(n)

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                count = map.get(num) + 1;
//                if (count > n)
//                    return num;
//                map.put(num, count);
//            } else map.put(num, 1);
//        }


//  Approach 3: Moore Voting Algorithm
//  Time complexity: O(n)
//  Space Complexity: O(1)

        for (int num : nums){
            if (count == 0) major = num;

            count = (major == num) ? count + 1 : count - 1;
        }

        return major;
    }
}
