package binarySearch;

public class FirstOccurrence {
    public static int firstOccurrence(int[] array, int target){
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1){
            int mid = left + (right - left) / 2;
            if (array[mid] < target)
                left = mid;
            else
                right = mid;
        }
        if (array[left] == target)
            return left;
        if (array[right] == target)
            return right;
        return -1;
    }

    public static void main(String[] args) {
        int array1[] = {0, 1, 2, 2, 3, 4, 4, 4, 4, 10, 100};
        int n = 4;
        int result = firstOccurrence(array1, n);
        System.out.println(result);
    }
}
