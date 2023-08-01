import leetcode.strings.LongestCommonPrefix.LongestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        System.out.println(
        LongestCommonPrefix.longestPrefix(new String[]{"flower", "flow", "flight"})
        );
        System.out.println(
        LongestCommonPrefix.longestPrefix(new String[]{"dog","racecar","car"})
        );
        System.out.println(
        LongestCommonPrefix.longestPrefix(new String[]{"a", "a"})
        );
        System.out.println(
        LongestCommonPrefix.longestPrefix(new String[]{"ab", "a"})
        );
    }
}