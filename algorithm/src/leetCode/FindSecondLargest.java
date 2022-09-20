package leetCode;

public class FindSecondLargest {
    private int findSecondLargest(int[] nums) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (firstLargest < nums[i]) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }

            if (secondLargest < nums[i] && nums[i] != firstLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        FindSecondLargest test = new FindSecondLargest();
        int[] input = {99, 87, 99, 83};
        int result = test.findSecondLargest(input);
        System.out.println(result);
    }
}
