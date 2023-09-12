package leetcode.HashTables.ContainsDuplicate2_219;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsNearbyDuplicates {
//    O(n)
    public static boolean contains(int[] arr, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer prev = numbers.put(arr[i], i);

            if (prev != null && i - prev <= k)
                    return true;
        }
        return false;
    }

    public static boolean containsBySlidingWindow(int[] arr, int k) {
        Set<Integer> window = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(i > k) window.remove(arr[i-k-1]);
            if(!window.add(arr[i])) return true;
        }
        return false;
    }
}
