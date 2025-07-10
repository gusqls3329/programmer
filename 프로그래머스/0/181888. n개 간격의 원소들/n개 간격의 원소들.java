class Solution {
    public int[] solution(int[] num_list, int n) {
        int a = num_list.length%n ==0?(num_list.length/n):(num_list.length/n)+1;
        int[] answer = new int [a];
        int b = 0;
        for(int i=0; i<num_list.length;){
            answer[b]=num_list[i];
            b++;
            i=i+n;
        }
        return answer;
    }
}