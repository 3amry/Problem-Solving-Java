import leetcode.strings.RomanToInteger13.RomanToInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        RomanToInteger parser = new RomanToInteger();
        parser.parseRoman("III");
        parser.parseRoman("LVIII");
        parser.parseRoman("MCMXCIV");
        parser.parseRoman("MCDLXXVI");
    }
}