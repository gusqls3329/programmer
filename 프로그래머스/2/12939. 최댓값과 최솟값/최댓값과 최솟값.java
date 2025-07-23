import java.util.*;
class Solution {
    public String solution(String s) {
        String [] slist = s.split(" ");
        int [] inlist = new int[slist.length];
        for(int i=0;i<slist.length;i++){
            inlist[i]=Integer.parseInt(slist[i]);
        }
        Arrays.sort(inlist);
        String min = String.valueOf(inlist[0]);
        String max = String.valueOf(inlist[inlist.length-1]);
        return min+" "+max;
    }
}