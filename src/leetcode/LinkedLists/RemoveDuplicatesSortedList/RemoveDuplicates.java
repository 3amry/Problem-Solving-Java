package leetcode.LinkedLists.RemoveDuplicatesSortedList;

import leetcode.LinkedLists.ListNode;

public class RemoveDuplicates {
    public ListNode removeDuplicates(ListNode head) {
        var pointer = head;

        while (pointer != null && pointer.next != null) {
            if (pointer.val == pointer.next.val)
                pointer.next = pointer.next.next;

            else pointer = pointer.next;

        }

        return head;
    }
}
