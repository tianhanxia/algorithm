package queueAndStack;


import java.util.Deque;
import java.util.LinkedList;

public class SortWith2Stacks {
    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<>();
        sort(s1, s2);
    }

    private void sort(Deque<Integer> input, Deque<Integer> buffer) {
        while (!input.isEmpty()) {
            int curMin = Integer.MAX_VALUE;
            int count = 0;
            while (!input.isEmpty()) {
                int cur = input.pollFirst();
                if (cur < curMin) {
                    curMin = cur;
                    count = 1;
                } else if (cur == curMin) {
                    count++;
                }
                buffer.offerFirst(cur);
            }
            while (!buffer.isEmpty() && buffer.peekFirst() >= curMin) {
                int temp = buffer.pollFirst();
                if (temp != curMin) {
                    input.offerFirst(temp);
                }
            }
            while (count-- > 0) {
                buffer.offerFirst(curMin);
            }
        }
        while (!buffer.isEmpty()) {
            input.offerFirst(buffer.pollFirst());
        }
    }

}
