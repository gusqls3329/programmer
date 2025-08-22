import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList <Integer> list = new ArrayList<>();
        int min = 0;
        for(int i=0; i<score.length; i++){
            if(list.size() >= k){
                if(min > score[i]){
                    answer[i] = min;
                }else{
                    Collections.sort(list);
                    list.set( 0,score[i]);
                    min = Collections.min(list);
                    answer[i] = min;
                }
            }else{
                list.add(score[i]);
                min = Collections.min(list);
                answer[i] = min;
            }
        }
        return answer;
    }
}