class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for (int i=0; i<number.length();i++){
            sum += number.charAt(i)-'0';
        }
        System.out.print(sum);
        answer = sum%9;
        return answer;
    }
}