class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] numbers = my_string.split("[a-zA-Z]");
        for(int i=0; i<numbers.length;i++){
            if(!numbers[i].isEmpty()){
                answer += Integer.parseInt(numbers[i]);
            }
            
        }
        return answer;
    }
}