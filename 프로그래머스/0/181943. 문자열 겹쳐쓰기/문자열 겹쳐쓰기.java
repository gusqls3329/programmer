class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            if(i<s){
                answer += my_string.charAt(i);
            }   
        }
        answer += overwrite_string;
        if(answer.length()<my_string.length()){
            for(int i=answer.length();i<my_string.length();i++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}