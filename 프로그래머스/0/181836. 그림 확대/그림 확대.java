class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for (int i = 0; i < picture.length; i++) {
            for (int z = 0; z < k; z++) {
                idx = i * k + z;
                answer[idx] = "";
                for (int j = 0; j < picture[i].length(); j++) {
                    for (int repeat = 0; repeat < k; repeat++) {
                        answer[idx] += picture[i].charAt(j);
                    }
                }
            }
        }
        return answer;
    }
}
