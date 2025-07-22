import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int k=0;
        for(int i=0;i<commands.length;i++){
            int[] arri = new int[(commands[i][1]-commands[i][0])+1];
            int z = 0;
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                arri[z] = array[j];
                z++;
            }
            Arrays.sort(arri);
            answer[k] = arri[commands[i][2]-1];
            k++;
        }
        
        return answer;
    }
}