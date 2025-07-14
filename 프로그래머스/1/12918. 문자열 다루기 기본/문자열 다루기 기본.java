class Solution {
    public boolean solution(String s) {
        if(s.length()==6 || s.length()==4){
            for(int i=0; i<s.length();i++){
                if(!(Character.isDigit(s.charAt(i)))){
                    return false;
                } 
                   
                
            } return true;
        } else {
            return false;
        }
        
        
    }
}