package Structures.HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Checker {
    public char findFirstNonRepeated(String string){
    Map<Character, Integer> map = new HashMap<>();
    var chars = string.toCharArray();

        for (char ch : chars){
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);

            map.put(ch, 1);
        }
        for (char ch : chars){
            if (map.get(ch) == 1){
            return ch;
            }
        }
        return Character.MIN_VALUE;
    }
    public char findFirstRepeated(String string){
    Set<Character> set = new HashSet<>();
    var chars = string.toCharArray();

        for (char ch : chars){
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
