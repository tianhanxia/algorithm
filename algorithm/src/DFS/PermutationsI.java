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
            return null;
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

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        helper(nums, new ArrayList<Integer>(), res);
//        return res;
//    }
//
//    private void helper(int[] nums, ArrayList<Integer> temp, List<List<Integer>> res) {
//        if (temp.size() == nums.length) {
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (temp.contains(nums[i])) continue;
//            temp.add(nums[i]);
//            helper(nums, temp, res);
//            temp.remove(temp.size() - 1);
//        }
//    }

}
