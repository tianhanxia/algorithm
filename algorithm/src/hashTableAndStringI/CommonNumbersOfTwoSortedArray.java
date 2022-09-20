package hashTableAndStringI;

import java.util.ArrayList;
import java.util.List;

public class CommonNumbersOfTwoSortedArray {
    public List<Integer> commonI(int[] a, int[] b) {
        List<Integer> common = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                common.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return common;
    }
}
