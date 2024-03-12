package leetcode.TwoPointers.MergeSortedArray_88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int num : nums2) nums1[m++] = num;
            System.out.println(Arrays.toString(nums1));
            return;
        }

        m--; n--;
        while (n > -1) {
            if (m > -1 && nums1[m] > nums2[n]) nums1[m + n + 1] = nums1[m--];
            else nums1[m + n + 1] = nums2[n--];
//            nums1[m + n + 1] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
