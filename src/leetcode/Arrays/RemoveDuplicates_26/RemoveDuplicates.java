package leetcode.Arrays.RemoveDuplicates_26;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int k = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[k] != nums[i])
                nums[++k] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return ++k;
    }
}
