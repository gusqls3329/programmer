class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cp = 0;
        int cy = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        for(int i=0;i<s.length(); i++){
            if ('P' == s.charAt(i) || s.charAt(i) == 'p'){
                //System.out.println(s.charAt(i));
                cp++;
            }else if ('y' == s.charAt(i) || s.charAt(i) == 'Y'){
                cy++;
            }
        }
        System.out.println(cy);
        System.out.println(cp);
        if (cp == cy){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}