class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remaint=0;
        while (n >= a) {
            int exchanged = (n / a) * b; 
            answer += exchanged;
            n = (n % a) + exchanged; 
        }
       
        return answer;
    }
}