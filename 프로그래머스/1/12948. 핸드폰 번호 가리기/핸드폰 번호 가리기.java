class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int l = phone_number.length()-4;
        for (int i=0;i<l;i++){
            answer+="*";
        }
        for (int i=l;i<phone_number.length();i++){
            answer+=String.valueOf(phone_number.charAt(i));
        }
        return answer;
    }
}