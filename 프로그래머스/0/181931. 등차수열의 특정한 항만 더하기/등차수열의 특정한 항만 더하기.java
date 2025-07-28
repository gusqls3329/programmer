class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int j = 0;
        int len = (included.length-1)*d + a;
        for(int i=a;i<=len;){
            if(included[j] == true){
                answer += i;
            }
            i = i+d;
            j++;
        }
        return answer;
    }
}