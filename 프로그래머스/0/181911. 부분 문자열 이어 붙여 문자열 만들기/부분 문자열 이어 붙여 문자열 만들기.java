class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i=0; i<my_strings.length; i++){
            int a = parts[i][0];
            int b = parts[i][1]+1;
            answer+= my_strings[i].substring(a,b);
        }
        return answer;
    }
}