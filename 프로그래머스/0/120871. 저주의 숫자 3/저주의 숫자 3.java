class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for(int i=1; i<=10000; i++){
            String s = String.valueOf(i);
            if (i%3 !=0 && !s.contains("3")){
                answer = i;
                count++;
            }
            if(count == n){break;}
        }
        return answer;
    }
}