import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList <Integer> answerList = new ArrayList <>();
        
        for(int i=0; i<arr.length; i++){
            int a = 0;
            if(flag[i] == true){
                while(true){
                    if(a == (arr[i]*2)){
                        break;
                    }
                    answerList.add(arr[i]);
                    a++;
                }   
            } else {
                while(true){
                    if(a == arr[i]){
                        break;
                    }
                    answerList.remove(answerList.size()-1);
                    a++;
                }   
            }
        }
        int[] answer = new int [answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}