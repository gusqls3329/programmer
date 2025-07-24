import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList <Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    a.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        int[] answer = new int[a.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}