class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int [n/k];
        int a=0;
        int b=1;
        for (int i=0; i<answer.length; i++){
            a =a+k;
            answer[i] = a;
        }
        return answer;
    }
}