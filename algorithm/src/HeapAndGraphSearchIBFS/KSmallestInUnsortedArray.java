package HeapAndGraphSearchIBFS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestInUnsortedArray {
    public int[] kSmallest(int[] array, int k) {
        if (array.length == 0 || k == 0) {
            return new int[0];
        }

//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1.equals(o2)) {
//                    return 0;
//                }
//                return o1 > o2 ? -1 : 1;
//            }
//        });

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a ,b) -> b - a);

        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                maxHeap.offer(array[i]);
            } else if (array[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }

        int[] result = new int[k];
        //reverse and copy the maxHeap
        for (int i = k - 1; i >= 0; i--) {
            result[i] = maxHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 3, 6, 4};
        KSmallestInUnsortedArray ks =  new KSmallestInUnsortedArray();
        int[] result = ks.kSmallest(array, 6);
        System.out.println(Arrays.toString(result));
    }
}
