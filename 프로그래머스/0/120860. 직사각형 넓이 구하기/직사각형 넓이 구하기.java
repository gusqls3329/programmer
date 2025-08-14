import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int x2 = 0;
        int y1 = dots[0][1];
        int y2 = 0;
        for(int i=1; i<dots.length; i++){
            if(dots[i][0] != x1){
                x2 = dots[i][0];
            }
            if(dots[i][1] != y1){
                y2 = dots[i][1];
            }
        }
        answer = Math.abs(x1-x2) * Math.abs(y1-y2);
        
        return answer;
    }
}