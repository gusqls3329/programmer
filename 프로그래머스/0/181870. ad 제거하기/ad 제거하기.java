class Solution {
    public String[] solution(String[] strArr) {
        int a = 0;
        int b = 0;
        for (int i=0; i<strArr.length; i++){
            if (strArr[i].contains("ad")){
                a++;
            }
        }
        String[] answer = new String[strArr.length-a];
        for (int i=0; i<strArr.length; i++){
            if (!strArr[i].contains("ad")){
                answer[b]=strArr[i];
                b++;
            }
        }
        return answer;
    }
}