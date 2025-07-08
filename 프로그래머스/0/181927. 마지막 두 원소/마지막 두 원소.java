class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list.length;
        int[] answer = new int[a + 1];

        // 기존 값 복사
        for (int i = 0; i < a; i++) {
            answer[i] = num_list[i];
        }

        // 마지막 원소 비교 후 새 원소 추가
        if (num_list[a - 1] > num_list[a - 2]) {
            answer[a] = num_list[a - 1] - num_list[a - 2];
        } else {
            answer[a] = num_list[a - 1] * 2;
        }

        return answer;
    }
}
