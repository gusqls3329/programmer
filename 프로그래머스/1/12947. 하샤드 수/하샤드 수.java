class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String sx = String.valueOf(x);
        int a = 0;
        int sum=0;
        for (int i=0; i<sx.length();i++){
            a = Integer.parseInt(String.valueOf(sx.charAt(i)));
            sum +=a; 
        }
        return x%sum==0?true:false;
    }
}