class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        int z = 0;
        int min = 0;
        for(int i=0; i<queries.length;i++){
            min = Integer.MAX_VALUE;
            for(int j=queries[i][0];j<= queries[i][1]; j++){
                //System.out.println(arr[j]);
                if(arr[j] > queries[i][2]){
                   if (arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
             answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        return answer;
    }
}