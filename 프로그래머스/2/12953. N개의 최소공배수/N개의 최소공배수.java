class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        
        int first = gcd(arr[0], arr[1]);
        int answer =  (arr[0]*arr[1]) / first;
        
        if(arr.length > 2) { 
            for(int i = 2; i < arr.length; i++) {
                first = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / first;
            }
        }
        
        return answer;
    }
    
    private static int gcd(int a, int b){
        int c = a % b;
        if(c ==0){
            return b;
        }
        else return gcd(b, c);
    }
}