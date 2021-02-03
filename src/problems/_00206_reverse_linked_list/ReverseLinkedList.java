package _00206_reverse_linked_list;

public class ReverseLinkedList {

    public ListNode reverseLinkedListIterative(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public ListNode reverseListRecursively(ListNode head) {
        return reverseListRecursivelyHelper(head, null);
    }

    private ListNode reverseListRecursivelyHelper(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListRecursivelyHelper(next, head);
    }
}
