package leetcode.HashTables.TwoSum_1;

import java.util.HashMap;
import java.util.Map;

//  Time complexity: O(n)
//  Space Complexity: O(n)
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            map.put((target - nums[i]), i);
        }
        return new int[]{};
    }
}
