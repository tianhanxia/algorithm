package leetCode;

import java.util.Arrays;

public class RemoveDuplicateArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }


        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicateArray test = new RemoveDuplicateArray();
        int[] nums = {1, 1, 2,2, 2, 3,3,3,3,4,4};
        int result = test.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }
}
