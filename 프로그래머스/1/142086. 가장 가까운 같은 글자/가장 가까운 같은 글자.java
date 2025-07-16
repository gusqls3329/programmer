class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        String b = "";
        int idx = 0;
        for(int i=0;i<s.length();i++){
            if(!b.contains(String.valueOf(s.charAt(i)))){
                b+=String.valueOf(s.charAt(i));
                answer[i] = -1;
            }else{
                idx = b.lastIndexOf(s.charAt(i));
                //System.out.printf("인덱스: %d, 문자: %c, b:%s, 현위치 : %d \n", idx, s.charAt(i),b,i);
                answer[i] = i-idx;
                b+=String.valueOf(s.charAt(i));
            }
        
        }
        return answer;
    }
}