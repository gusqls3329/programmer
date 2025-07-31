import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] diff= new int[array.length];
        
        for(int i=0; i<array.length; i++){
            diff[i] = array[i]-n;
        }
        
        int len = 0;
        int min = Math.abs(diff[len]);
        
        for(int i=0; i<diff.length; i++){
            if(min > Math.abs(diff[i])){
                len = i;
                min = Math.abs(diff[len]);
            }else if(min == Math.abs(diff[i])){
                if(min > diff[i]){
                    len = i;
                    min = Math.abs(diff[len]);
                }
            }
        }
        return array[len];
    }
}