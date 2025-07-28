class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            String a = "";
            for(int j=2; j<i; j++){
                if(i%j==0){
                    System.out.println(i);
                    a = "Yes";
                    break;
                }
            }if(a.equals("Yes")){
                answer++;
            }
        }
        
        return answer;
    }
}