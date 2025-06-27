class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int a = 0;
        for (int i=0;i<todo_list.length;i++){
            if(finished[i]==false){
                a +=1;
            }
        }
        
        String[] answer = new String[a];
        a = 0;
        for (int j=0;j<todo_list.length;j++){
            if(finished[j]==false){
                answer[a] =todo_list[j];
                a++;
            }
        }
        return answer;
    }
}