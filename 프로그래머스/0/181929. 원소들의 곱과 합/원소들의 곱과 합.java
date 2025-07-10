import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<num_list.length;i++){
            answer = answer*num_list[i];
            sum +=num_list[i]; 
        }
        sum1 = sum*sum;
        return answer>sum1?0:1;
    }
}