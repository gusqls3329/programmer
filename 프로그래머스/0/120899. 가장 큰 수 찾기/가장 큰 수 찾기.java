class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int len = 0;
        for (int i=0; i<array.length; i++){
            if (max<array[i]){
                max = array[i];
                len = i;
            }
        }
        answer[0] = max;
        answer[1] = len;
        return answer;
    }
}