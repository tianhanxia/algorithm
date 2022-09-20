package queueAndStack;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithmin {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;
    public StackWithmin() {
        // write your solution here
        stack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        Integer result = stack.pollFirst();
        if (minStack.peekFirst().equals(result)) {
            minStack.pollFirst();
        }
        return result;
    }

    public void push(int element) {
        stack.offerFirst(element);
        if (minStack.isEmpty() || element <= minStack.peekFirst()) {
            minStack.offerFirst(element);
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peekFirst();
    }

    public int min() {
        return minStack.isEmpty() ? -1 : minStack.peekFirst();
    }
}
