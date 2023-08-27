package leetcode.Arrays.RemoveElement_27;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val)
                nums[k++] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
