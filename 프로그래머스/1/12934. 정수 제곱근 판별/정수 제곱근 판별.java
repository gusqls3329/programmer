class Solution {
    public long solution(long n) {
        long answer = 0;
        int a = (int)Math.sqrt(n);
        int b = (int)n;
        if (a*a == b){
            return (long) Math.pow(a+1,2);
        }else{
            return -1;
        }
    }
}