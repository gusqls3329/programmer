class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()%n==0?my_str.length()/n:my_str.length()/n+1;
        String[] answer = new String [len];
        int j=0;
        for(int i=0; i<my_str.length();){
            int end = Math.min(i + n, my_str.length());
            answer[j] = my_str.substring(i,end);
            i = i+n;
            j++;
        }
        return answer;
    }
}