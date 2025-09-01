import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        if (score.length < m) return 0;
        int [][] list = new int [score.length/m][m];
        int j=0;
        int z=0;
        for(int i=score.length-1; i>=0; i--){
            list[j][z] = score[i];
            z++;
            if(z==m){
                z=0;
                j++;
            }
            if(j==list.length){
                break;
            }
        }
        int sum = 0;
        
        for (int i = 0; i < list.length; i++) {
            Arrays.sort(list[i]);
            int min = list[i][0];
            sum += min * m;
        }
        return sum;
    }
}