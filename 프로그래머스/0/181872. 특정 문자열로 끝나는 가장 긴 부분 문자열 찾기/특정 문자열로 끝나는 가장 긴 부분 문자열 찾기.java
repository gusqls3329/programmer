class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int loca = 0;
        for(int i=myString.length()-pat.length(); i>=0; i--){
            if (pat.equals(myString.substring(i,i+pat.length()))){
                loca = i;
                break;
            }
        }
        answer = myString.substring(0,loca+pat.length());
        
        return answer;
    }
}