import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> over = new TreeMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(over.containsKey(s.charAt(i))){
                over.put(s.charAt(i), over.get(s.charAt(i))+1);
            }else{
                over.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character, Integer> ent : over.entrySet()){
            if(ent.getValue() == 1){
                answer+= ent.getKey();
            }
        }
        
        return answer;
    }
}