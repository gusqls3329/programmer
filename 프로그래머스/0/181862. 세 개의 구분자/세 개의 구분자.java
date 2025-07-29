import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] split = myStr.split("[abc]");
        List<String> list = new ArrayList<>();

        for (String s : split) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
