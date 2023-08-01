package leetcode.strings.LongestCommonPrefix;

public class LongestCommonPrefix {
    public static StringBuilder longestPrefix(String[] arr){
        StringBuilder prefix = new StringBuilder();
        String model = arr[0];

        for (int i = 0; i < model.length(); i++){
            for (int j = 0; j < arr.length; j++){
                if (i < arr[j].length() && model.charAt(i) == arr[j].charAt(i)){
                    if (j == arr.length - 1)
                        prefix.append(model.charAt(i));
                }
                else return prefix;
            }
        }
        return prefix;
    }
}
