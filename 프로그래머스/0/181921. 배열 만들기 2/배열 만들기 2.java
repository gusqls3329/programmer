import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String s = String.valueOf(i);
            if(s.matches("[05]+")){
                list.add(Integer.parseInt(s));
            }
        }
        if(list.isEmpty()){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}