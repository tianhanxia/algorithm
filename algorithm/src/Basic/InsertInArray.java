package Basic;

import java.util.Arrays;

public class InsertInArray {
    public static int[] insertArray(int[] array, int input, int position) {
        int[] newArray = new int[array.length + 1];
        position = Math.min(position, array.length);
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = input;
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int input = 4;
        int position = 5;
        System.out.println(Arrays.toString(insertArray(array, input, position)));
    }
}
