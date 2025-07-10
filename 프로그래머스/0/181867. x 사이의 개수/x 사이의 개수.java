class Solution {
    public int[] solution(String myString) {
        
        String [] a = myString.split("x");
        int l = a.length;
        if (myString.charAt(myString.length()-1) == 'x'){
            l = a.length+1;
        }
        int[] answer = new int [l];
        for(int i=0;i<a.length;i++){
            answer[i]= a[i].length();
            if (myString.charAt(myString.length()-1) == 'x'){
                answer[l-1]=0;
        }   
        }
        
        return answer;
    }
}