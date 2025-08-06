class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = "";
        
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            StringBuilder resb = new StringBuilder(sb.substring(start, end+1));
            resb = resb.reverse();
            sb = sb.replace(start,end+1, resb.toString());
        }
        return sb.toString();
    }
}