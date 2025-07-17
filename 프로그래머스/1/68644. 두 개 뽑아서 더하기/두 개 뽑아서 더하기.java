import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList <Integer> a = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!a.contains(numbers[i]+numbers[j])){
                    a.add(numbers[i]+numbers[j]);
                }
                
            }
        }
        int[] answer = new int[a.size()];
        for(int i=0;i<a.size();i++){
            answer[i]=a.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}