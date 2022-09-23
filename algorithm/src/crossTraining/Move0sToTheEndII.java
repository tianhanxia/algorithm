package crossTraining;

public class Move0sToTheEndII {
    // need to maintain the relative order of the elements
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        // the slow pointer is not included in the non-zero subarray
        int slow = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[slow++] = nums[i];
            }
        }
        //fill in the right part with 0
        for(int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }

        return;
    }
}
