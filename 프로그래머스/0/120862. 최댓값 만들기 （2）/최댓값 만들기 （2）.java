import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        Arrays.sort(numbers);
        int max1 = numbers[0]*numbers[1];
        int max2 = numbers[len-1]*numbers[len-2];
        answer = max1 > max2 ? max1:max2;
        return answer;
    }
}