package leetCode;

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[index] = nums[right] * nums[right];
                right--;
            } else {
                result[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        SortedSquares ss = new SortedSquares();
        int[] input = {0, 1};
        int[] result = ss.sortedSquares(input);
        System.out.println(Arrays.toString(result));
    }
}
