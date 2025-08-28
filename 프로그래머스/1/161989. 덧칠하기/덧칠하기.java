import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        for(int line : section){
            if(line>painted){
                answer++;
                painted = line+m-1;
            }
        }
        return answer;
    }
}