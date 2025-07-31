class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int front = slicer[0];
        int back = slicer[1];
        int interval = 1;
        if(n==1){
            front = 0;
        }else if(n==2){
            back = num_list.length-1;
        }else if(n==4){
            interval = slicer[2];
        }
        
        int[] answer = new int [(back-front)/interval+1];
        int j=0;
        for(int i=front; i<=back;){
            answer[j] = num_list[i];
            j++;
            i = i+interval;
        }
        return answer;
    }
}