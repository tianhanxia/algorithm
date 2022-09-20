package hashTableAndStringI;

public class DetermineIfOneStringIsAnothersSub {
    public int strstr(String large, String small) {
        if (large.length() < small.length()) {
            return -1;
        }
        if (small.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= large.length() - small.length(); i++) {
            if (equals(large)) {
                return i;
            }
        }
        return  -1;
    }
}
