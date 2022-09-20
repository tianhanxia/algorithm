package recursionIAndSortingAlgorithms;

public class FibonacciNuberLite {
    public int fibonacci(int K) {
        // Write your solution here
        if (K <= 0){
            return 0;
        } else if (K == 1){
            return 1;
        } else{
            return fibonacci(K - 1) + fibonacci(K - 2);
        }
    }
}
