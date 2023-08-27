package leetcode.strings.ValidPalindrome_125;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        var string = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();

        for (int i = 0; i < string.length/2; i++){
            if (string[i] != string[string.length-1 -i])
                return false;
        }
            return true;
    }
}
