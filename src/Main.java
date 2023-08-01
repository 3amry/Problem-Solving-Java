import leetcode.strings.ValidParentheses.ValidParentheses;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        System.out.println(ValidParentheses.validate("()"));
        System.out.println(ValidParentheses.validate("()[]{}"));
        System.out.println(ValidParentheses.validate("{[]}"));
        System.out.println(ValidParentheses.validate("(]"));
        System.out.println(ValidParentheses.validate("["));
    }
}