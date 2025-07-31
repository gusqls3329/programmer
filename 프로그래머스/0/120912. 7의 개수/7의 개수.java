class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String tmp = "";
        for(int i=0; i<array.length; i++){
            tmp = String.valueOf(array[i]);
            for(int j=0; j<tmp.length(); j++){
                if(tmp.charAt(j)=='7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}