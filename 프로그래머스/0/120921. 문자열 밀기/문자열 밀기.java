class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String s = "";
        
        if(A.equals(B)){
            return 0;
        }
        while(true){
            if(A.equals(B)){
                break;
            }else if(answer==A.length()){
                return -1;
            }else{
                s=A.substring(A.length()-1);
                s+=A.substring(0,A.length()-1);
                A=s;
                answer++;
            }
            
        }
        return answer;
    }
}