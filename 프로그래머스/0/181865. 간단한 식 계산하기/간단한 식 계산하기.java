class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] a = binomial.split(" ");
        int b = Integer.parseInt(a[0]);
        System.out.print(b);
        int c = Integer.parseInt(a[2]);
        if(a[1].equals("*")){
            return b*c;
        }else if(a[1].equals("-")){
            return b-c;
        }else if(a[1].equals("+")){
            return b+c;
        }
        return answer;
    }
}