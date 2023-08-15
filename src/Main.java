import leetcode.strings.ExcelSheetColumnTitle.ColumnTitle;

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
    }
}