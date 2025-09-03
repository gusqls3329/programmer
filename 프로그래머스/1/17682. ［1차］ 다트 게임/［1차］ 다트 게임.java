import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList <Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            // 숫자 처리 (10도 고려)
            if (Character.isDigit(c)) {
                if (c == '0' && i > 0 && dartResult.charAt(i-1) == '1') {
                    num = 10; // "10" 처리
                } else {
                    num = c - '0'; // 한 자리 숫자
                }
            } 
            else if (c == 'S') {
                list.add(num);
            } else if (c == 'D') {
                list.add(num * num);
            } else if (c == 'T') {
                list.add(num * num * num);
            } else if (c == '*') {
                int size = list.size();
                list.set(size-1, list.get(size-1) * 2);
                if (size > 1) {
                    list.set(size-2, list.get(size-2) * 2);
                }
            } else if (c == '#') {
                int size = list.size();
                list.set(size-1, list.get(size-1) * -1);
            }
        }

    
        for (int score : list) {
            answer += score;
        }
        return answer;
    }
}