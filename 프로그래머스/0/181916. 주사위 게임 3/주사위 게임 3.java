import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : dice) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        if (countMap.size() == 1) { 
            int p = a;
            return 1111 * p;
        } else if (countMap.size() == 2) {
            for (int key : countMap.keySet()) {
                int cnt = countMap.get(key);
                if (cnt == 3) {
                    int p = key;
                    int q = 0;
                    for (int k : countMap.keySet()) {
                        if (k != p) q = k;
                    }
                    return (10 * p + q) * (10 * p + q);
                } else if (cnt == 2) {
                    int p = key;
                    int q = 0;
                    for (int k : countMap.keySet()) {
                        if (k != p) q = k;
                    }
                    return (p + q) * Math.abs(p - q);
                }
            }
        } else if (countMap.size() == 3) {
            int p = 0, q = 0, r = 0;
            for (int key : countMap.keySet()) {
                int cnt = countMap.get(key);
                if (cnt == 2) p = key;
                else if (q == 0) q = key;
                else r = key;
            }
            return q * r;
        } else {
            int min = Math.min(Math.min(a, b), Math.min(c, d));
            return min;
        }
        
        return 0;
    }
}
