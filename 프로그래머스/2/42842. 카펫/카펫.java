import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
        int y = 0;
        outer:
        for(int x=2; x<size; x++){
            if(size%x==0){
                y = size/x;
                if( (x-2)*(y-2)==yellow){
                    answer[0] = x;
                    answer[1] = y;
                    System.out.println(x+", "+y);
                    
                }
            }
        }
        return answer;
    }
}