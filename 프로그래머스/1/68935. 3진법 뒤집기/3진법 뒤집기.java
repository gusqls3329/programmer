class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        int b = 0;
        int ia = 0;
        while(n>0){
            a += String.valueOf(n%3);
            n = n/3;
        }
        for(int i=a.length()-1; i>=0;i--){
            ia = Integer.parseInt(String.valueOf(a.charAt(i)));
            answer += (int) Math.pow(3,b)*ia;
            b++;
        }
        
        return answer;
    }
}