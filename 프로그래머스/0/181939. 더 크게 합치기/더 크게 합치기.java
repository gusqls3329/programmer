class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        String ab = sa+sb;
        String ba = sb+sa;
        int iab = Integer.parseInt(ab);
        int iba = Integer.parseInt(ba);
        return iab > iba ? iab:iba;
    }
}