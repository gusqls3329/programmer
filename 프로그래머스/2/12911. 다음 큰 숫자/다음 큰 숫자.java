class Solution {
    public int solution(int n) {
        int nn = n;
        int count = 0;
        while(nn > 0){
            if(nn % 2 == 1) count++;
            nn = nn / 2;
        }

        for(int i = n + 1;; i++){
            int temp = i;
            int countTemp = 0;

            while(temp > 0){
                if(temp % 2 == 1) countTemp++;
                temp = temp / 2;
            }

            if(countTemp == count) return i;
        }
    }
}
