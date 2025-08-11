class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        
        int halfWidth = (board[0]-1) / 2;  
        int halfHeight = (board[1]-1) / 2;  

        for (String input : keyinput) {
            if (input.equals("up")) {
                if (y < halfHeight) y++;
            } else if (input.equals("down")) {
                if (y > -halfHeight) y--;
            } else if (input.equals("left")) {
                if (x > -halfWidth) x--;
            } else if (input.equals("right")) {
                if (x < halfWidth) x++;
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
