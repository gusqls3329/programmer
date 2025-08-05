class Solution {
    public String solution(String bin1, String bin2) {       
        int a1 = 1;
        int b1 = 0;
        int a2 = 1;
        int b2 = 0;
        for(int i=bin1.length()-1; i>=0;i--){
            b1 += Integer.parseInt(String.valueOf(bin1.charAt(i))) == 1 ? a1:0;
            a1=a1*2;
        }
        for(int i=bin2.length()-1; i>=0;i--){
            b2 += Integer.parseInt(String.valueOf(bin2.charAt(i))) == 1 ? a2:0;
            a2=a2*2;
        }
        String binary = Integer.toBinaryString(b1+b2);
        return binary;
    }
}