import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> maps = new HashMap<>();
        int answer = 0;
        int count = 1;
        for(int i=0; i<strArr.length; i++){
            if(!maps.containsKey(strArr[i].length())){
                maps.put(strArr[i].length(), count);
            }else{
                maps.put(strArr[i].length(), maps.get(strArr[i].length()) + count);
            }
        }
        for(Integer key : maps.keySet()){
            if(maps.get(key) > answer){answer = maps.get(key);}
        }
        return answer;
    }
}