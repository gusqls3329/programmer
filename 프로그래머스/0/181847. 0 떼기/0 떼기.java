class Solution {
    public String solution(String n_str) {
        String answer = "";
        int a = 0;
        while(true){
            if (n_str.charAt(a) == '0'){
                a++;
            } else{
                break;
            }
        }
        answer = n_str.substring(a);
                
        
        return answer;
    }
}