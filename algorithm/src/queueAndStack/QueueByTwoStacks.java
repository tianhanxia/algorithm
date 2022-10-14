package queueAndStack;

import java.util.Deque;
import java.util.LinkedList;

public class QueueByTwoStacks {
    // the only stack to store new elements when add a new element
    // into the queue
    // the in stack
    private LinkedList<Integer> in;

    // the only stack to pop old element out of the queue
    // Case 1: if out is not empty, just pop -O(1)
    // Case 2: if out is empty, move all elements from in to out
    // one by one, and then pop out the top element from out -O(n)
    // the out stack
    private LinkedList<Integer> out;

    public QueueByTwoStacks() {
        in = new LinkedList<Integer>();
        out = new LinkedList<Integer>();
    }

    public Integer poll() {
        move();
        return out.isEmpty() ? null : out.pollFirst();
    }

    public void offer(int element) {
        // push into the in stack
        in.offerFirst(element);
    }

    public Integer peek() {
        move();
        return out.isEmpty() ? null : out.peekFirst();
    }

    private void move() {
        // when out is empty, move the elements from in to out
        if (out.isEmpty()) {
            while(!in.isEmpty()) {
                out.offerFirst(in.pollFirst());
            }
        }
    }

    public int size() {
        return in.size() + out.size();
    }

    public boolean isEmpty() {
        return in.size() == 0 && out.size() == 0;
    }

    public static void main(String[] args) {
        QueueByTwoStacks queue = new QueueByTwoStacks();
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
