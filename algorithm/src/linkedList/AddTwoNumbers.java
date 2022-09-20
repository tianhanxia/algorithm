package linkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Write your solution here
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int val = 0;
        while (l1 != null || l2 != null || val != 0) {
            if (l1 != null) {
                val += l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.value;
                l2 = l2.next;
            }
            cur.next = new ListNode(val % 10);
            val = val / 10;
            cur = cur.next;
        }
        return dummy.next;
    }

    private static void printListNode (ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AddTwoNumbers test = new AddTwoNumbers();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(4);

        ListNode result = test.addTwoNumbers(l1, l2);
        printListNode(result);
    }
}
