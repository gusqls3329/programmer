class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int brfore = 0;
        while(chicken > 0){
            answer += chicken/10;
            chicken = chicken/10 + chicken%10;
            System.out.println(answer);
            if(chicken != brfore){
                brfore = chicken;
            } else{
                break;
            }
        }
        return answer;
    }
}