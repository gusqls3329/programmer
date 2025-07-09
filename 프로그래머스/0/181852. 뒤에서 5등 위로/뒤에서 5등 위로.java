import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list.length-5;
        int b = 0;
        int[] answer = new int[a];
        Arrays.sort(num_list);
        for (int i=5;i<num_list.length;i++){
            answer[b] = num_list[i];
            b++;
        }
        return answer;
    }
}