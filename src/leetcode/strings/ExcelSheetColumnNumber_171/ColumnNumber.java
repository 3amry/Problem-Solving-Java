package leetcode.strings.ExcelSheetColumnNumber_171;

public class ColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
//        StringBuilder title = new StringBuilder(columnTitle).reverse();

//        for (int i = 0; i < title.length(); i++)
//            result += (int) ((title.charAt(i) - '@') * Math.pow(26, i));

        for (char c : columnTitle.toCharArray())
            result = result * 26 + (c - '@');

        return result;
    }
    private static int charToNumber(char c) {
        return c - '@';
    }
}
