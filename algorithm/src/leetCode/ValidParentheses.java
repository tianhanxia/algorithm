package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.offerLast(')');
            else if (c == '{')
                stack.offerLast('}');
            else if (c == '[')
                stack.offerLast(']');
            else if (stack.isEmpty() || stack.pollLast() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses test = new ValidParentheses();
        String s = "{([])}";
        Boolean result = test.isValid(s);
        System.out.println(result);
    }
}
