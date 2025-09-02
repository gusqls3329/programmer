import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        Arrays.sort(stages);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<stages.length; i++){
            map.put(stages[i], map.getOrDefault(stages[i],0)+1);
        }
        double [][] ratio = new double [N][2];
        int a=0;
        int len =stages.length;
        for (int i = 1; i <= N; i++) {
            int notClear = map.getOrDefault(i, 0); 
            if (len == 0) {
                ratio[i - 1][0] = i;
                ratio[i - 1][1] = 0.0;
            } else {
                ratio[i - 1][0] = i;
                ratio[i - 1][1] = (double) notClear / len;
                len -= notClear;
            }
        }
        
        Arrays.sort(ratio, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Double.compare(o1[0], o2[0]);
            } else {
                return Double.compare(o2[1], o1[1]);
            }
        });

        for (int i = 0; i < N; i++) {
            answer[i] = (int) ratio[i][0];
        }

        return answer;
    }
}