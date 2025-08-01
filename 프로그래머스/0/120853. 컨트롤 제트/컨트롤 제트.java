class Solution {
    public int solution(String s) {
        String [] slist = s.split(" ");
        int answer = 0;
        for(int i=0; i<slist.length; i++){
            System.out.println(slist[i]);
            if(slist[i].equals("Z")){
                answer -= Integer.parseInt(slist[i-1]);
            }else{
                answer += Integer.parseInt(slist[i]);
            }
        }
        
        return answer;
    }
}