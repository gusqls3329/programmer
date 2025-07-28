import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] tmp = myString.split("x");
        List<String> list = new ArrayList<>(); 
        for(int i=0;i<tmp.length;i++){
            if(!tmp[i].isEmpty()){
                list.add(tmp[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}