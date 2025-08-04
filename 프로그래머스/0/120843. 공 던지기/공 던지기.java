class Solution {
    public int solution(int[] numbers, int k) {
        
        int count = 1;
        int loca = 0;
        while(count < k){   
            loca =  loca+2 > numbers.length-1 ? loca+2-numbers.length : loca+2;
            count++;
        }
        return numbers[loca];
    }
}