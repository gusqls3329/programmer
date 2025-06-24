import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-z]","");
        my_string = my_string.replaceAll("[A-Z]","");
        int[] answer = new int [my_string.length()];
        for (int i=0; i<my_string.length(); i++){
            answer[i] = Character.getNumericValue(my_string.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}