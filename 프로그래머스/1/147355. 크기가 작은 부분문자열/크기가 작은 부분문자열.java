class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String a = "";
        long ip = Long.parseLong(p);
        long ia = 0;
        for (int i=0; i<=t.length()-p.length();i++){
            a = t.substring(i,i+p.length());
            ia = Long.parseLong(a);
            if(ia <= ip){
                answer++;
            }
        }
        return answer;
    }
}