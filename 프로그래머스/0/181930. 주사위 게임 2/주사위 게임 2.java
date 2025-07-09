class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int aa = (int) Math.pow(a,2);
        int bb = (int) Math.pow(b,2);
        int cc = (int) Math.pow(c,2);
        if (a==b && b==c && c == a){
            int aaa= (int) Math.pow(a,3);
            int bbb= (int) Math.pow(b,3);
            int ccc= (int) Math.pow(c,3);
            return (a+b+c)*(aa+bb+cc)*(aaa+bbb+ccc);
        } else if (a!=b && b!=c && c!=a){
            return a+b+c;
        }else{
            return (a+b+c)*(aa+bb+cc);
        }
        
    }
}