class Solution {
    public int solution(int order) {
        int answer = 0;
        int number = 0;
        String snumber = String.valueOf(order);
        for(int i=0;i<snumber.length();i++){
            number = Integer.parseInt(String.valueOf(snumber.charAt(i)));
            if(number == 3|| number == 6|| number == 9){
                answer++;
            }
        }
        return answer;
    }
}