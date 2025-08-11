class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        int k = Math.min(share, balls - share);

        for (int i = 1; i <= k; i++) {
            answer = answer * (balls - k + i) / i;
        }
        return answer;
    }
}