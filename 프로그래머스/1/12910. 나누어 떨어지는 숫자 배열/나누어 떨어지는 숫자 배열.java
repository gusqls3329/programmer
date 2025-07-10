import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList <Integer> a = new ArrayList <>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]%divisor==0){
                a.add(arr[i]);
            }
        }
        int s = a.size();
        if (s==0){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[s];
        for (int i=0;i<a.size();i++){
            answer[i]=a.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}