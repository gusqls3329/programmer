class Solution {
    public int[] solution(int[] arr) {
        
        int count = 0;
        int front = -1;
        int back = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                front = i;
                break;
            }
        }
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] == 2){
                back = i;
                break;
            }
        }
        int j = 0;
        System.out.println("front: "+ front + ", back:"+ back);
        if(front == -1 && back == -1){
            return new int[] {-1};
        } else if(front == back){
            return new int[] {2};
        } else{
            int[] answer = new int [back-front+1];
            for(int i=front; i<=back; i++){
                answer[j] = arr[i];
                j++;
            }
            return answer;
        }
        
    }
}