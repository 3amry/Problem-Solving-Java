import leetcode.strings.WordPattern_290.WordPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        System.out.println(WordPattern.wordPatternV2("abba", "dog cat cat dog"));
        System.out.println(WordPattern.wordPatternV2("abba", "dog cat cat fish"));
        System.out.println(WordPattern.wordPatternV2("aaaa", "dog cat cat dog"));
        System.out.println(WordPattern.wordPatternV2("abba", "dog dog dog dog"));
    }
}