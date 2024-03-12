import leetcode.TwoPointers.MergeSortedArray_88.MergeSortedArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        MergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        MergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1);
        MergeSortedArray.merge(new int[]{1,0}, 1, new int[]{2}, 1);
        MergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        MergeSortedArray.merge(new int[]{2,0}, 1, new int[]{1}, 1);
    }
}