import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int j=B.length;
        for(int i=0; i<A.length;i++){
            j--;
            answer+=A[i]*B[j];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}