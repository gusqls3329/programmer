import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length<2){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int tmp = arr[0];
        for(int i=1; i<arr.length;i++){
            if(tmp>arr[i]){
                tmp = arr[i];
            }
        }
        int a =0;
        for(int i=0; i<arr.length;i++){
            if(tmp==arr[i]){
                continue;
            }else{
                answer[a] = arr[i];
                a++;
            }
        }
        return answer;
    }
}