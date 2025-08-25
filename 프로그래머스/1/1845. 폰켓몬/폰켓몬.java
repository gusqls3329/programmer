import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int count = 0;
        for(Integer key : map.keySet()){
            count++;
        }
        System.out.println(count);
        int len = nums.length/2;
        return len>count?count:len;
    }
}