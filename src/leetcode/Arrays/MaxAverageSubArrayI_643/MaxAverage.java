package leetcode.Arrays.MaxAverageSubArrayI_643;

public class MaxAverage {
//    Sliding window O(n)T, O(1)S
    public static double maxAverageWindow(int[] arr, int k) {
        double sumContiguous = 0;
        for (int i = 0; i < k; i++)
            sumContiguous += arr[i];

        double sumMax = sumContiguous;
        for (int i = k; i < arr.length; i++) {
            sumContiguous += arr[i] - arr[i - k];
            sumMax = Math.max(sumContiguous, sumMax);
        }

        return sumMax / k;
    }

//    Cumulative sum O(n)T, O(n)S
    public static double maxAverageCumSum(int[] arr, int k) {
        double max;
        int[] arrSum = new int[arr.length];
        arrSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            arrSum[i] = arr[i] + arrSum[i -1];

        max = arrSum[k - 1];
        for (int i = k; i < arr.length; i++) {
            max = Math.max(max, arrSum[i] - arrSum[i - k]);
        }
        return max / k;
    }
}
