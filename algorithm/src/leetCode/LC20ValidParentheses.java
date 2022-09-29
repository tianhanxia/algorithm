package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

//Given a string s containing just the characters '(', ')',
// '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
public class LC20ValidParentheses {
//    public boolean isValid(String s) {
//        if (s == null || s.length() < 2) {
//            return false;
//        }
//
//        Deque<Character> stack = new ArrayDeque<>();
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                stack.offerLast(')');
//            } else if (c == '[') {
//                stack.offerLast(']');
//            } else if (c == '{') {
//                stack.offerLast('}');
//            } else if (stack.isEmpty() || stack.pollLast() != c) {
//                return false;
//            }
//        }
//
//
//        return stack.isEmpty();
//    }
    public boolean isValid(String s) {
        HashMap<Character,Character> maps=new HashMap<>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)){
                if(stack.isEmpty()||stack.pollLast() != maps.get(c)){
                    return false;
                }
            } else {
                stack.offerLast(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LC20ValidParentheses test = new LC20ValidParentheses();
        String s = "({})";
        System.out.println(test.isValid(s));
    }
}
