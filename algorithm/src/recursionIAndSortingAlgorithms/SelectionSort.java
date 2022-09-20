package recursionIAndSortingAlgorithms;

public class SelectionSort {
    public int[] solve(int[] array) {
        // Write your solution here
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap (array, i, minIndex);
        }
        return array;
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
