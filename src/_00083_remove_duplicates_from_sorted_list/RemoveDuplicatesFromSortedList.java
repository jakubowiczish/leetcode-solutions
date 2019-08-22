package _00083_remove_duplicates_from_sorted_list;

public class RemoveDuplicatesFromSortedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }

}
