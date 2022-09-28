package hashTableAndStringI;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAdjacentRepeatedCharactersIV {
    // method 1 use stack
    // time = O(n)
    // a b b b b a z w
    //                 f
    // s[zw
    public String deDupStack(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] array = input.toCharArray();
        // all the processed letters that should be kept
        Deque<Character> stack = new ArrayDeque<>();
        // the character that's being processed [0, j)
        int fast = 0;
        while (fast < array.length) {
            char curChar = array[fast];
            // Case 1: a[f] == stack.top, move f until case 2, stack.pop
            // Case 2: a[f] != stack.top, stack.push, ++f
            if (!stack.isEmpty() && stack.peekFirst() == curChar) {
                while (fast < array.length && array[fast] == curChar) {
                    fast++;
                }
                stack.pollFirst();
            } else {
                stack.offerFirst(curChar);
                fast++;
            }
        }
        int len = stack.size();
        for (int i = len - 1; i >= 0 ; i--) {
            array[i] = stack.pollFirst();
        }
        return new String(array, 0, len);
    }
    // method 2 fast and slow pointer, in place
//    public String deDup(String input) {
//        if (input == null || input.length() <= 1) {
//            return input;
//        }
//        char[] array = input.toCharArray();
//        // instead using an extra stack, we can reuse the left side of original char[]
//        // as the stack.
//        // end: where the top of the stack is
//        int end = 0;
//        for (int i = 1; i < array.length; i++) {
//            // if the stack is empty(end == -1) or there is no duplicate chars, we are
//            // able to push the character into the stack
//            if (end == -1 || array[i] != array[end]) {
//                array[++end] = array[i];
//            } else {
//                // otherwise, we need pop the top element by end--
//                // and ignore all the consecutive duplicate chars
//                end--;
//                while (i + 1 < array.length && array[i] == array[i + 1]) {
//                    i++;
//                }
//            }
//        }
//        return new String(array, 0 , end + 1);
//    }

    public static void main(String[] args) {
        RemoveAdjacentRepeatedCharactersIV test = new RemoveAdjacentRepeatedCharactersIV();
        String input = "abbaca";
        System.out.println(test.deDupStack(input));
    }
}
