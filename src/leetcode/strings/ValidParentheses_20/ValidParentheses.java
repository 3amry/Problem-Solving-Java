package leetcode.strings.ValidParentheses_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private static Stack<Character> stack = new Stack<>();
    public static boolean validate(String sample){
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        var leftBrackets = map.keySet();
        for (var ch: sample.toCharArray()){
            if (leftBrackets.contains(ch))
                stack.push(ch);
            else if (stack.isEmpty() || map.get(stack.pop()) != ch)
                return false;
        }
        return stack.isEmpty();
    }
}
