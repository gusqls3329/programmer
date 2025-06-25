import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char arrs[] = new char [my_string.length()];
        for (int i=0;i<my_string.length();i++){
            
            arrs[i] = Character.toLowerCase(my_string.charAt(i));
            
        }
        Arrays.sort(arrs);
        for (int i=0;i<arrs.length;i++){
            answer+=arrs[i];
        }
        return answer;
    }
}