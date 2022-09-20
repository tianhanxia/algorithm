package leetCode;


public class MaxRank {
    public static int maxNetworkRank(int[] A, int[] B, int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        int[] edgeCount = new int[n];

        int m = A.length;
        int maxRank = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            edgeCount[A[i] - 1]++;
            edgeCount[B[i] - 1]++;
        }
        for (int i = 0; i < m; i++) {
            int rank = edgeCount[A[i] - 1] + edgeCount[B[i] - 1] - 1;
            if (rank > maxRank) {
                maxRank = rank;
            }
        }
        return maxRank;
    }

}
