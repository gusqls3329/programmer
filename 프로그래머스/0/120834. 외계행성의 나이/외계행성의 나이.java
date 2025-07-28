class Solution {
    public String solution(int age) {
        String answer = "";
        String sage = String.valueOf(age);
        for(int i=0;i<sage.length();i++){
            answer += (char)(sage.charAt(i)-'0'+'a');
        }
        
        return answer;
    }
}