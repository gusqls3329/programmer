class Solution {
    public int[] solution(long n) {
        int len = String.valueOf(n).length();
        int[] answer = new int [len];
        int b = 0;
        while(n > 0){
            answer[b] = (int) (n % 10);
            n /= 10;
            b++;
            
        }
        return answer;
    }
}