package leetcode.SlidingWindow.LongestHarmoniousSubsequence_594;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] numbs) {
        int LHS = 0;
        for (int i = 0; i < numbs.length -1; i++) {
            int countPos = 0;
            int countNeg = 0;
            boolean isHarmon = false;
            for (int j = i; j < numbs.length; j++) {
                if (numbs[i] - numbs[j] == 1) {
                    countPos++;
                    isHarmon = true;
                } else if (numbs[i] - numbs[j] == -1){
                    countNeg++;
                    isHarmon = true;
                } else if (numbs[i] - numbs[j] == 0){
                    countPos++;
                    countNeg++;
                }
            }
            if (isHarmon){
                LHS = countPos > countNeg ? Math.max(countPos, LHS) : Math.max(countNeg, LHS);
            }
        }
        return LHS;
    }
}
