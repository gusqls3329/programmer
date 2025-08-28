import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list =new ArrayList<>();
        int sum = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int z=j+1; z<nums.length; z++){
                    sum = nums[i]+nums[j]+nums[z];
                    list.add(sum);
                    
                }
            }   
        }
        // 소수 판별
        for(int i = 0; i < list.size(); i++){
            int n = list.get(i);
            if(n < 2) continue;
            boolean isPrime = true;
            for(int j = 2; j * j <= n; j++){ 
                if(n % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                answer++;
            }
        }

        return answer;
    }
}