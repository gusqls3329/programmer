class Solution {
    public String solution(int n) {
        String answer = "";
        String a = "수";
        String b = "박";
        for (int i=0;i<n;i++){
            if (i%2==0){
                answer+=a;
            }else{
                answer+=b;
            }
        }
        return answer;
    }
}