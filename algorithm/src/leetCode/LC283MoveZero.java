package leetCode;

import java.util.Arrays;

public class LC283MoveZero {
    public void moveZero(int[] input) {
        if (input == null || input.length == 0) {
            return;
        }

        int zero = 0;
        for (int num : input) {
            if (num != 0) {
                input[zero] = num;
                zero++;
            }
        }

        while (zero < input.length) {
            input[zero] = 0;
            zero++;
        }
    }

    //3 2 1 0 0
    //          z
    //        n

    public static void main(String[] args) {
        LC283MoveZero test = new LC283MoveZero();
        int[] input = {3, 0, 2, 0, 1};
        test.moveZero(input);
        System.out.println(Arrays.toString(input));
    }
}
