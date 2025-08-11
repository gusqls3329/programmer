import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> tmpList = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                tmpList.add(i);
            }
        }
        int[] answer = new int [tmpList.size()];
        for(int i = 0; i <tmpList.size(); i++) {
            answer[i] = tmpList.get(i);
        }
        
        
        return answer;
    }
}