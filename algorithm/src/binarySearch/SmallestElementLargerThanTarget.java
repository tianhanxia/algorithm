package binarySearch;

public class SmallestElementLargerThanTarget {
    private int smallestElementLargerThanTarget(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid + 1;
            } else {
                right= mid;
            }
        }
        if (array[left] > target) {
            return left;
        } else if (array[right] > target) {
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        SmallestElementLargerThanTarget test = new SmallestElementLargerThanTarget();
        int[] array = {1};
        int target = 9;
        int result = test.smallestElementLargerThanTarget(array, target);
        System.out.println(result);
    }
}
