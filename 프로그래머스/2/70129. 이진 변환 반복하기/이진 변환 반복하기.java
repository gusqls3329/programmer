class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        answer[0] = 1;
        answer[1] = 0;
        while(s.length() > 1){
            int len = 0;
            for(int i=0; i<s.length();i++){            
                if (s.charAt(i)=='1'){
                    len++;
                }else{
                    answer[1]++;
                }
            }
            s = Integer.toBinaryString(len);
            if (s.length() <= 1) break;
            answer[0]++;
        }
        
        return answer;
    }
}