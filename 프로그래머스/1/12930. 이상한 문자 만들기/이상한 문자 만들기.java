class Solution {
    public String solution(String s) {
        String answer = "";
        String[] listS = s.split(" ", -1);

        for (int idx = 0; idx < listS.length; idx++) {
            String strs = listS[idx];
            for (int i = 0; i < strs.length(); i++) {
                if (i % 2 == 0) {
                    answer += Character.toUpperCase(strs.charAt(i));
                } else {
                    answer += Character.toLowerCase(strs.charAt(i));
                }
            }
            // 단어 사이에 공백 추가 (마지막 단어 뒤에는 추가 안 함)
            if (idx != listS.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
}
