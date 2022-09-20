package linkedList;

import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode merge(List<ListNode> listOfLists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (ListNode node : listOfLists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        while (!minHeap.isEmpty()) {
            cur.next = minHeap.poll();
            if (cur.next.next != null) {
                minHeap.offer(cur.next.next);
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
