class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String babble : babbling) {
            if (babble.matches("(aya|ye|woo|ma)+") && 
                !babble.matches(".*(ayaaya|yeye|woowoo|mama).*")) {
                answer++;
            }
        }
        return answer;
    }
}
