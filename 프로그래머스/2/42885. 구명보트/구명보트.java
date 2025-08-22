import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int rigth  = people.length-1;
        while(rigth >= left){
            if(people[left]+people[rigth]<=limit){
                rigth--;
                left++;
            }else{
                rigth--;
            }
            answer++;
        }
        return answer;
    }
}