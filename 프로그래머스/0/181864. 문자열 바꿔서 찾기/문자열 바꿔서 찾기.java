class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = "";
        for (int i=0;i<myString.length();i++){
            if (myString.charAt(i)=='A'){
                a += 'B';
            }else if (myString.charAt(i)=='B'){
                a += 'A';
            } else{
                a +=myString.charAt(i);
            }
        }
        
        return a.contains(pat) ? 1:0;
    }
}