import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int [2];
        ArrayList <String> check = new ArrayList<>();
        check.add(words[0]);
        for(int i=1 ;i< words.length; i++){
            if(words[i].charAt(0)!= words[i-1].charAt(words[i-1].length()-1) || check.contains(words[i])){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }else {
                check.add(words[i]);
            }
        }
        return answer;
    }
}