class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        String sk = String.valueOf(k);
        for(int z=i; z<=j; z++){
            s = String.valueOf(z);
            for (int x = 0; x < s.length(); x++) {
                if (String.valueOf(s.charAt(x)).equals(sk)) {
                    answer++;
                }
            }
            
            
            
        }
        return answer;
    }
}