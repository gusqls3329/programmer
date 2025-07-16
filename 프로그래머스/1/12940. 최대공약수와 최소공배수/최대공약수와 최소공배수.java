class Solution {
    int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp = 0;
        if(n > m){
            tmp = n;
            n = m;
            m = tmp;
        }
        answer[0]=gcd(n,m);
        answer[1]=(n*m)/answer[0];
        return answer;
    }
}