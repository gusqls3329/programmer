class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        for(int i=0; i<quiz.length; i++){
            String [] list = quiz[i].split(" ");
            int result = 0; 
            if(list[1].equals("+")){
                result = Integer.parseInt(list[0])+Integer.parseInt(list[2]);
            }else{
                result = Integer.parseInt(list[0])-Integer.parseInt(list[2]);
            }
            int test = Integer.parseInt(list[4]);
            if(test ==result){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}