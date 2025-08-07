import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger ia = new BigInteger(a);
        BigInteger ib = new BigInteger(b);
        BigInteger sum = ia.add(ib);
        
        String answer = String.valueOf(sum);
        return answer;
    }
}