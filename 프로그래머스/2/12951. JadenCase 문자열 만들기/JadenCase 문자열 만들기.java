class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder bui = new StringBuilder(s);
        for (int i = 0; i < bui.length(); i++) {
            bui.setCharAt(i, Character.toLowerCase(bui.charAt(i)));
        }
        bui.setCharAt(0, Character.toUpperCase(bui.charAt(0)));
        for(int i=1; i<bui.length(); i++){
            if(bui.charAt(i) == ' ' && i + 1 < bui.length()){
                bui.setCharAt(i + 1, Character.toUpperCase(bui.charAt(i + 1)));
            }
        }
        return bui.toString();
    }
}