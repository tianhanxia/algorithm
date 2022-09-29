package DFS;

import java.util.ArrayList;
import java.util.List;

// Given a string with no duplicate character, return a list with all
// permutation of the characters
public class PermutationsI {
    // DFS with swapping
    public List<String> permutations(String input) {
        List<String> result = new ArrayList<>();
        if (input == null) {
            return result;
        }
        char[] array = input.toCharArray();
        helper(array, 0, result);
        return result;
    }

    // choose the character to be at the position of "index"
    // all the already chosen positions are (0, index-1)
    // all the candidate characters can be at position "index"
    // are in the subarray of (index, array.length-1)
    private void helper(char[] array, int index, List<String> result) {
        // terminate condition:
        // only when we have already chosen the characters or all the
        // position, we can have a complete permutation
        if (index == array.length) {
            result.add(new String(array));
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(array, index, i);
            helper(array, index + 1, result);
            swap(array, index, i);
        }
    }

    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
