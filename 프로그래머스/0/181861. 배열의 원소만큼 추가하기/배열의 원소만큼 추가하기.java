import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int a = 0;
        ArrayList<Integer> list = new ArrayList <>();        
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i];j++){
                list.add(arr[i]);
                a++;
                }
        }
         int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}