import leetcode.strings.ExcelSheetColumnNumber_171.ColumnNumber;
import leetcode.strings.ExcelSheetColumnTitle_168.ColumnTitle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");


        System.out.println(ColumnTitle.getTitle(0));
        System.out.println(ColumnTitle.getTitle(26));
        System.out.println(ColumnTitle.getTitle(27));
        System.out.println(ColumnTitle.getTitle(28));
        System.out.println(ColumnTitle.getTitle(701));
        System.out.println(ColumnTitle.getTitle(703));
        System.out.println(ColumnTitle.getTitle(2147483647)); //FXSHRXW

        System.out.println(ColumnNumber.titleToNumber("Z"));
        System.out.println(ColumnNumber.titleToNumber("AA"));
        System.out.println(ColumnNumber.titleToNumber("AB"));
        System.out.println(ColumnNumber.titleToNumber("ZY"));
        System.out.println(ColumnNumber.titleToNumber("AAA"));
    }
}