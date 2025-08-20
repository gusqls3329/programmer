import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int mo = b;
        int min = Math.min(a,b);
        
        for(int i=2; i<=min; i++){
            if(a%i == 0 && b%i==0){
                mo = i;
            }
        }
        int na = (mo ==b ? mo:b/mo);
        
        while(na >0){
            if(na%2==0){
                na = na/2;
            }else if(na%5==0){
                na = na/5;
            }else{
                break;
            }
        }
        if(na==1){return 1;}
        return answer;
    }
}