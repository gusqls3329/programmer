import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int [] rank = new int[3];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == su1[i%5]){
                count1++;
            }
            if(answers[i] == su2[i%8]){
                count2++;
            }
            if(answers[i] == su3[i%10]){
                count3++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(count1,  Math.max(count2, count3));
        if(max==count1){
            list.add(1);
        }
        if(max==count2){
            list.add(2);
        }
        if(max==count3){
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}