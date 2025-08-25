class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total/num;
        int j =0;
        int s = middle- ((num-1)/2);
        for(int i=s; i<s+num; i++){
            answer[j] =i;
            j++;
        }
    
        
        return answer;
    }
}