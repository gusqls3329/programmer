import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){      
            budget = budget-d[i];
            if(budget<0){
                break;
            }
            answer++;
            System.out.println(budget);
            if(budget<0){
                break;
            }
            
        }
        return answer;
    }
}