package leetcode.strings.RomanToInteger13;

import java.util.HashMap;
import java.util.Map;

//  TC: O(n)
public class RomanToInteger {
    private final Map<Character, Integer> ROMANS = new HashMap<>();
    public RomanToInteger() {
        ROMANS.put('I', 1);
        ROMANS.put('V', 5);
        ROMANS.put('X', 10);
        ROMANS.put('L', 50);
        ROMANS.put('C', 100);
        ROMANS.put('D', 500);
        ROMANS.put('M', 1000);
    }
    public int parseRoman(String s)  {
        int sum = ROMANS.get(s.charAt(s.length()-1));
        int current;
        int next;
        for (int i = s.length()-2; i >= 0; i--){
            current = ROMANS.get(s.charAt(i));
            next = ROMANS.get(s.charAt(i + 1));

            if (current < next)
                sum -= current;
            else sum += current;
        }

        System.out.println(sum);
        return sum;
    }
}
