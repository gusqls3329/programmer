class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        int a = 0;
        for(int i=0; i<answer.length;i++){
            if (!answer[i].equals("")){
                a++;
            }
        }
        String[] b = new String[a];
        int c = 0;
        for(int i=0; i<answer.length;i++){
            if (!answer[i].equals("")){
                b[c] =answer[i];
                c++;
            }
        }
        return b;
    }
}