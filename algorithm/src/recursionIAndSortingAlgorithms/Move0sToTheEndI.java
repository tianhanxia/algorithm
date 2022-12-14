package recursionIAndSortingAlgorithms;

public class Move0sToTheEndI {
    // move all 0s to the end of the array
    // do not need to maintain the relative order of elements
    public int[] moveZero(int[] array) {
        if (array == null || array.length == 0){
            return array;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] != 0) {
                left ++;
            } else if (array[right] == 0) {
                right--;
            } else {
                swap(array, left++, right--);
            }
        }
        return array;
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
