import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int a = my_string.length();
        String k = "";
        for (int i=0; i<my_string.length();i++){
            a--;
            k=my_string.charAt(a)+k;
            answer[i] = k;
        }
        Arrays.sort(answer);
        return answer;
    }
}