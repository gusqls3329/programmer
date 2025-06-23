class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = 0;
        int min = 0;
        int m = (int)a-b;
        if ( m < 0 ){
            min = a;
            max = b;
        }else{
            min = b;
            max = a;
        }
        for (int i =min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
}