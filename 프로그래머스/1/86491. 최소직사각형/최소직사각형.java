class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int [][]a = new int[sizes.length][2];
        for(int i=0; i<sizes.length; i++){
            if (sizes[i][0]>sizes[i][1]){
                a[i][0] = sizes[i][0];
                a[i][1] = sizes[i][1];
            }else{
                a[i][1] = sizes[i][0];
                a[i][0] = sizes[i][1];
            }
        }
        int max1 = 0;
        int max2 = 0;
        for(int i=0; i<a.length; i++){
            if(max1<a[i][0]){
                max1 = a[i][0];
            }
            if(max2<a[i][1]){
                max2 = a[i][1];
            }
        }
        return max1*max2;
    }
}