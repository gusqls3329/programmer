class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (arr1.length<arr2.length){
            return -1;
        } else if (arr1.length>arr2.length){
            return 1;
        } else if (arr1.length==arr2.length){
            for (int i=0;i<arr1.length;i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
                //System.out.print(sum2);
                
            }
            if (sum1 > sum2){
                    return 1;
                }else if (sum1 < sum2){
                    return -1;
                }else{
                    return 0;
                }
        }
        
        return answer;
    }
}