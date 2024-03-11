package leetcode.strings.ValidAnagram_242;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        return stringToMap(s).equals(stringToMap(t));
    }

    private static Map stringToMap(String sample){
        Map<Character, Integer> map = new HashMap<>();
        for (char key : sample.toCharArray()){
            Integer value = map.getOrDefault(key, 0);
            map.put(key, ++value);
        }
        return map;
    }
}
