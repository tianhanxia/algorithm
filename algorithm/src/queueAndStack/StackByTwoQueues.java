package queueAndStack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackByTwoQueues {
    // push() q1.enqueue()
    // pop(): move all but the last elements from q1 to q2
    // dequeue the last element from q1
    // swap the reference of q1 and q2
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackByTwoQueues() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public Integer pop() {
        Integer prev = q1.poll();
        Integer cur = q1.poll();
        while (cur != null) {
            q2.offer(prev);
            prev = cur;
            cur = q1.poll();
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return prev;
    }

    /** Get the top element. */
    public Integer top() {
        Integer ret = pop();
        if (ret != null) {
            q1.offer(ret);
        }
        return ret;
    }

    /** Returns whether the stack is empty. */
    public boolean isEmpty() {
        return q1.isEmpty();
    }
//    private Queue<Integer> q;
//
//    public StackByTwoQueues() {
//        q = new ArrayDeque<>();
//    }
//    // push element onto stack
//    public void push(int x) {
//        q.offer(x);
//    }
//
//    /** Removes the element on top of the stack and returns that element. */
//    public Integer pop() {
//        if (q.isEmpty()) {
//            return null;
//        }
//        int size = q.size();
//        while (--size != 0) {
//            q.offer(q.poll());
//        }
//        return q.poll();
//    }
//
//    /** Get the top element. */
//    public Integer top() {
//        if (q.isEmpty()) {
//            return null;
//        }
//        int ret = pop();
//        q.offer(ret);
//        return ret;
//    }
//
//    /** Returns whether the stack is empty. */
//    public boolean isEmpty() {
//        return q.isEmpty();
//    }

}
