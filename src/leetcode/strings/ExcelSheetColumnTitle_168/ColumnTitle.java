package leetcode.strings.ExcelSheetColumnTitle_168;

public class ColumnTitle {
    public static StringBuilder getTitle(int columnNumber){
        var title = new StringBuilder();
        byte remainder;
        int quotient;

        do {
        remainder = (byte) (columnNumber % 26);
        quotient = columnNumber / 26;

        if (remainder == 0){
            remainder = 26;
            quotient--;
        }

        title.append(getNthChar(remainder));
        if (quotient >= 1 && quotient <= 26)
            title.append(getNthChar(quotient));

        columnNumber = quotient;
        } while (quotient > 26);

        return title.reverse();

//        Recursive solution
//        return columnNumber == 0 ? "" : getTitle(--columnNumber / 26) + (char)('A' + (columnNumber % 26));
    }

    private static char getNthChar(int i){
        return (char) ('@' + i);
    }
}
