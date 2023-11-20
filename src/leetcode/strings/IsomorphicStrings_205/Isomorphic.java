package leetcode.strings.IsomorphicStrings_205;

import java.sql.Array;
import java.util.*;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> mapS = new LinkedHashMap<>();
        Map<Character, List<Integer>> mapT = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapS.putIfAbsent(s.charAt(i), new ArrayList<>());
            mapS.get(s.charAt(i)).add(i);

            mapT.putIfAbsent(t.charAt(i), new ArrayList<>());
            mapT.get(t.charAt(i)).add(i);
        }
        return Arrays.equals(mapS.values().toArray(), mapT.values().toArray());
    }

    public static boolean isIsomorphic2(String s, String t) {
        int[] mapS = new int[200];
        int[] mapT = new int[200];

        for (int i = 0; i < s.length(); i++) {
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)])
                return false;

            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
