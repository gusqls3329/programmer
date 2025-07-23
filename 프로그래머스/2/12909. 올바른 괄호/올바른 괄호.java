class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            } else if(s.charAt(i)==')'){
                count--;
            }
            if(count<0){
                return false;
            }
            
        }
        if(s.startsWith(")") || s.endsWith("(") || s.length() %2 !=0 || count!= 0){
            return false;
        }
        
        return answer;
    }
}