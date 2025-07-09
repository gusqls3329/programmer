class Solution {
    public int solution(int num, int k) {
        String a = String.valueOf(num);
        String b = String.valueOf(k);

        for (int i = 0; i < a.length(); i++) {
            if (String.valueOf(a.charAt(i)).equals(b)) {
                return i + 1; // 1-based index
            }
        }
        return -1;
    }
}
