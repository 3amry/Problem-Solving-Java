package Structures.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private static final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private static final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
    public static boolean check(String input){
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()){
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)){
                if (stack.empty()) return false;

                var first = stack.pop();
                if (!bracketsMatch(first, ch)) return false;
            }
        }
        return stack.empty();
    }

    private static boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private static boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private static boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
