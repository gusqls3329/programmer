class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a = 0;
        for(int i=0;i<arr1.length;i++){
            a = arr1[i].length;
        }
        int[][] answer = new int [arr1.length][a];
        for(int i=0;i<arr1.length;i++){
            
            for(int j=0;j<a;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}