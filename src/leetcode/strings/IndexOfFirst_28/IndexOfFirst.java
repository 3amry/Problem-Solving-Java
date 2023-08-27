package leetcode.strings.IndexOfFirst_28;

public class IndexOfFirst {
    public static int find(String haystack, String needle){
        int index = -1;
        for (int i = 0; i < haystack.length(); i++){
                if (
                        needle.charAt(0) == haystack.charAt(i) &&
                        haystack.startsWith(needle, i)
                    )
                    return i;
        }
        return index;
    }
}
