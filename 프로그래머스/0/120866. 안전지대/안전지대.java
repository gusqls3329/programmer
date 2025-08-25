class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int m = board[0].length;

        boolean[][] danger = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 1){
                    for(int x = i-1; x <= i+1; x++){
                        for(int y = j-1; y <= j+1; y++){
                            if(x >= 0 && x < n && y >= 0 && y < m){
                                danger[x][y] = true;
                            }
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!danger[i][j]) answer++;
            }
        }
        return answer;
    }
}