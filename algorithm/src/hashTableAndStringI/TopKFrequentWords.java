package hashTableAndStringI;

import java.util.*;

public class TopKFrequentWords {
    public String[] topKFrequent(String[] combo, int k) {
        if (combo.length == 0) {
            return new String[0];
        }
        Map<String, Integer> freqMap = getFreqMap(combo);
//        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k,
//                new Comparator<Map.Entry<String, Integer>>() {
//                    @Override
//                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                        return o1.getValue().compareTo(o2.getValue());
//                    }
//                });
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else if (entry.getValue() > minHeap.peek().getValue()) {
                minHeap.poll();
                minHeap.offer(entry);
            }
        }
        return freqArray(minHeap);
    }

    private Map<String, Integer> getFreqMap(String[] combo) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : combo) {
            Integer freq = freqMap.get(s);
            if (freq == null) {
                freqMap.put(s, 1);
            } else {
                freqMap.put(s, freq + 1);
            }
        }
        return freqMap;
    }

    private String[] freqArray(PriorityQueue<Map.Entry<String, Integer>> minHeap) {
        String[] result = new String[minHeap.size()];
        for (int i = minHeap.size() - 1; i >= 0 ; i--) {
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentWords test = new TopKFrequentWords();
        String[] combo = {"a", "a", "a", "b", "b", "c", "c", "c"};
        int k = 2;
        String[] result = test.topKFrequent(combo, k);
        System.out.println(Arrays.toString(result));
    }
}
