class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a)+String.valueOf(b);
        int isa = Integer.parseInt(sa);
        System.out.println(2*a*b);
        System.out.println(isa);
        int answer = Math.max(isa, 2*a*b);
        return answer;
    }
}