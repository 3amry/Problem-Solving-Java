package leetcode.strings.WordPattern_290;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character, String> index = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (index.containsKey(pattern.charAt(i)) && !index.get(pattern.charAt(i)).equals(words[i]))
                return false;
            index.put(pattern.charAt(i), words[i]);
//            System.out.println(map.values());
        }

        if ((new HashSet<String>(index.values())).size() < index.values().size()) return false;
        return true;
    }

    public static boolean wordPatternV2(String pattern, String s) {
            String[] words = s.split(" ");
            if (words.length != pattern.length())
                return false;
        HashMap index = new HashMap();
            for (Integer i=0; i<words.length; ++i)
                if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                    return false;
            return true;
    }
}
