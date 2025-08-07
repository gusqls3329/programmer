class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String [] list = my_string.split(" ");
        int a = Integer.parseInt(list[0]);
        
        for(int i=1; i<list.length; i+=2){
            int num = Integer.parseInt(list[i + 1]);
            if(list[i].equals("+")){
                a +=num;
            }else if(list[i].equals("-")){
                a -=num;
            }
        }
        return a;
    }
}