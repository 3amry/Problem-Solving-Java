package leetcode.HashTables.ContainsDuplicate_217;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean contains(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num))
                return true;
        }
        return false;
    }
}
