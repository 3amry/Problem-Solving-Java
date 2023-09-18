package leetcode.LinkedLists.MergeTwoSortedLists_21;

import leetcode.LinkedLists.ListNode;

public class MergeSortedLists {
//    TC: O(n)
//    SC: O(n)
    public ListNode merge(ListNode first, ListNode second) {
        var sorted = new ListNode();
        var pointer = sorted;
        if (first == null) return second;
        if (second == null) return first;

        while (first != null && second != null) {
            if (first.val <= second.val) {
                pointer.next = first;
                first = first.next;
            }
            else {
                pointer.next = second;
                second = second.next;
            }
            pointer = pointer.next;
        }

        if (first != null)
            pointer.next = first;
        if (second != null)
            pointer.next = second;

        return sorted.next;
    }

//    TC: O(n)
//    SC: O(1)
    public ListNode recursiveMerge(ListNode first, ListNode second) {
        if (first == null) return second;
        if (second == null) return first;

        ListNode pointer;
        if (first.val <= second.val) {
            pointer = first;
            pointer.next = recursiveMerge(first.next, second);
        }
        else {
            pointer = second;
            pointer.next = recursiveMerge(first, second.next);
        }

        return pointer;
    }
}
