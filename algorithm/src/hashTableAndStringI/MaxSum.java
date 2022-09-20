package hashTableAndStringI;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxSum {
    public int MaximumSum(int[] A) {
        int maxSum = -1;
        Map<Integer, Queue<Integer>> map = buildMap(A);
        for (Queue<Integer> q : map.values()) {
            if (q.size() < 2) {
                continue;
            }
            maxSum = Math.max(maxSum, q.poll() + q.poll());
        }
        return maxSum;
    }

    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private Map<Integer, Queue<Integer>> buildMap(int[] A) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for (int n : A) {
            int digitSum = digitSum(n);
            map.putIfAbsent(digitSum, new PriorityQueue<Integer>());
            Queue<Integer> q = map.get(digitSum);
            q.offer(n);
            if (q.size() > 2) {
                q.poll();
            }
        }
        return map;
    }
}
