import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        int max = 0;
        for(Integer key : map.keySet()){
            if(max < map.get(key)){
                max = map.get(key);
            }
        }
        int count = 0;
        int mode = -1;
        for(int key : map.keySet()){
            if(map.get(key) == max){
                count++;
                mode = key;
            }
        }
        if(count > 1) return -1;
        return mode;
    }
}