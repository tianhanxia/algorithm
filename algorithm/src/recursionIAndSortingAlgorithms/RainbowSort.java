package recursionIAndSortingAlgorithms;

public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        // Case1: if array[zero] == -1, swap(neg, zero), neg++, zero++
        // Case2: if array[zero] == 0, zero++
        // Case3: if array[zero] == 1, swap(zero, one), one--
        // Time = O(n) Space = O(1)
        if (array == null || array.length <= 1) {
            return array;
        }
        // 1. [0, neg) == -1
        // 2. [neg,zero) == 0
        // 3. [zero, one] is to be discovered
        // 3. (one, array.length - 1] == 1
        int neg = 0;
        int one = array.length - 1;
        int zero = 0;
        while (zero <= one) {
            if (array[zero] == -1) {
                swap(array, neg++, zero++);
            } else if (array[zero] == 0) {
                zero++;
            } else {
                swap(array, zero, one--);
            }
        }
        return array;
    }
    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
