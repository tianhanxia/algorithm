package DFS;

import java.util.ArrayList;
import java.util.List;

public class PermutationsI {
    public List<String> permutations(String input) {
        List<String> result = new ArrayList<>();
        if (input == null) {
            return result;
        }
        char[] array = input.toCharArray();
        helper(array, 0, result);
        return result;
    }

    private void helper(char[] array, int index, List<String> result) {
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
