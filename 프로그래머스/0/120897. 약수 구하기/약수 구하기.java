class Solution {
    public int[] solution(int n) {
        int a = 0;
        int b = 0;
        for(int i=1; i<=n; i++){
            if (n%i == 0){
                a+=1;
            }
            
        }
        int[] answer = new int[a];
         for(int i=1; i<=n; i++){
             if (n%i == 0){
                answer[b++]=i;
             }
        }
        return answer;
    }
}