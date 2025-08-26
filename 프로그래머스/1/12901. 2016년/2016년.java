class Solution {
    public String solution(int a, int b) {
        int [] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String [] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String answer = "";
        int sum = b;
        for(int i=0; i<a-1; i++){
            sum+= month[i];
        }
        return days[(sum-1) % 7];
    }
}