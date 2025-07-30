class Solution {
    public int solution(int n) {
        int answer = 1;
        int fact = 1;
        while (true) {
            fact *= answer;
            if (fact > n) break;
            answer++;
        }
        return answer-1;
    }
}