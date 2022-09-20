package linkedList;


public class ReverseLinkedListIterative {
    public ListNode reverse(ListNode head) {
        // Write your solution here
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
