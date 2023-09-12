import leetcode.HashTables.ContainsDuplicate2_219.ContainsNearbyDuplicates;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        System.out.println(ContainsNearbyDuplicates.contains(new int[]{1,2,3,1}, 3));
        System.out.println(ContainsNearbyDuplicates.
                containsBySlidingWindow(new int[]{1,2,3,1}, 3));
        System.out.println(ContainsNearbyDuplicates.contains(new int[]{1,0,1,1}, 1));
        System.out.println(ContainsNearbyDuplicates.
                containsBySlidingWindow(new int[]{1,0,1,1}, 1));
        System.out.println(ContainsNearbyDuplicates.contains(new int[]{1,2,3,1,2,3}, 2));
        System.out.println(ContainsNearbyDuplicates.
                containsBySlidingWindow(new int[]{1,2,3,1,2,3}, 2));
    }
}