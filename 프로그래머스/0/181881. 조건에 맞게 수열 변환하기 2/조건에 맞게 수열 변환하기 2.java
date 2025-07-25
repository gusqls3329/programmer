import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] current = Arrays.copyOf(arr, arr.length);

        while (true) {
            int[] prev = Arrays.copyOf(current, current.length);

            for (int i = 0; i < current.length; i++) {
                if (current[i] < 50 && current[i] % 2 == 1) {
                    current[i] = current[i] * 2 + 1;
                } else if (current[i] >= 50 && current[i] % 2 == 0) {
                    current[i] = current[i] / 2;
                }
            }

            if (Arrays.equals(prev, current)) {
                break;
            }
            answer++;
        }

        return answer;
    }
}