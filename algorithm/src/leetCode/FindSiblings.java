package leetCode;

import java.util.Arrays;

public class FindSiblings {
    private int[] findSiblings(int input1, int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return new int[] {-1};
        }
        int pos = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                pos = i + 1;
            }
        }
        int start = Integer.highestOneBit(pos);
        int end = start * 2 - 1 >= arr.length ? arr.length: start * 2 - 1;
        int len = end - start;
        if (len == 0) {
            return new int[] {-1};
        }
        int[] res = new int[len];
        for (int i = 0; i < len;) {
            if (target != arr[start - 1]) {
                res[i] = arr[start - 1];
                i++;
            }
            start++;
        }
        return res;
    }

    public static void main(String[] args) {
        FindSiblings fs = new FindSiblings();
        int[] arr = {1, 2};
        int target = 2;
        int[] result = fs.findSiblings(1, arr, target);
        System.out.println(Arrays.toString(result));
    }
}
