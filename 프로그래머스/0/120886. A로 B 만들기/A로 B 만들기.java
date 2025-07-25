import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        if(before.length()!= after.length()){
            return answer;
        }
        String [] beList = new String [before.length()];
        String [] afList = new String [after.length()];
        for(int i=0; i<before.length();i++){
            beList[i] = String.valueOf(before.charAt(i));
            afList[i] = String.valueOf(after.charAt(i));
        }
        Arrays.sort(beList);
        Arrays.sort(afList);
        for(int i=0; i<beList.length;i++){
            System.out.println("b:"+beList[i]+", a:"+afList[i]);
        }
        if(Arrays.equals(beList,afList)){
            return 1;
        }
        return answer;
    }
}