import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        // true의 위치 찾기
        ArrayList<Integer> truelists = new ArrayList<>();
        for(int i=0; i<attendance.length; i++){
            if(attendance[i] == true){
                truelists.add(rank[i]);
            } 
        }
        // true중 가장큰 3개 찾기
        Collections.sort(truelists);   // 오름차순 정렬
        ArrayList<Integer> top3 = new ArrayList<>();
        for(int i=0; i<3 && i<truelists.size(); i++){
            top3.add(truelists.get(i));
        }
        //for(int i=0; i<truelist.size(); i++){
        //    System.out.println(truelist.get(i));
        //}
        int [] list = new int[3];
        int b = 0;
        for(int a=0; a<top3.size(); a++){
            for(int i=0; i<rank.length; i++){
                if(rank[i]==top3.get(a)){
                    list[b] = i;
                    b++;
                }
            }
        }
        
        answer =  (10000 * list[0]) + (100 * list[1]) + (list[2]);
        return answer;
    }
}