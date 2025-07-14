class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long a = 0;
        for(int i=1;i<=count;i++){
            a+=price*i;
        }
        if(money > a){
            return answer;
        }else{
            return (long)a-money;
        }
        
    }
}