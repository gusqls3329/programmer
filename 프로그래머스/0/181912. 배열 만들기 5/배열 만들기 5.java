import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList <Integer> anList = new ArrayList<>();
        int Strsint = 0;
        for(int i=0; i<intStrs.length; i++){
            String cutStr = "";
            for(int j=s; j<s+l; j++){
                cutStr+= intStrs[i].charAt(j);
                
            }
            Strsint = Integer.parseInt(cutStr);
            if(Strsint > k){
                anList.add(Strsint);
            }
        }
        int[] answer = new int [anList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = anList.get(i);
        }
        return answer;
    }
}