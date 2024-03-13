package leetcode.HashTables.LinkedListCycle_141;

import leetcode.LinkedLists.ListNode;

import java.util.HashSet;

public class LinkedListCycle {
    public static boolean hasCycle1(ListNode head) {
        if (head == null) return false;
        ListNode walker = head;
        ListNode runner = head;

        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) return true;
        }
        return false;
    }
    public static boolean hasCycle2(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode currentNode = head;

        while (currentNode != null) {
            if (visitedNodes.contains(currentNode)) return true;
            visitedNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}
