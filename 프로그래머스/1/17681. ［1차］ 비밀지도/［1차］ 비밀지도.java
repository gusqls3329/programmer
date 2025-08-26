class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        String[] s1 = new String [n];
        String[] s2 = new String [n];
        for(int i=0; i<n; i++){
            String a1 = "";
            String a2 = "";
            while(arr1[i]>0 || arr2[i]>0){
                a1 = arr1[i]%2 +a1;
                arr1[i] = arr1[i]/2;
                a2 = arr2[i]%2 +a2;
                arr2[i] = arr2[i]/2;
            }
            s1[i] = a1;
            s2[i] = a2;
            
        
            while(a1.length() < n) a1 = "0" + a1;
            while(a2.length() < n) a2 = "0" + a2;
            String result = "";
            for(int j=0; j<n; j++){
                if(a1.charAt(j)=='0' && a2.charAt(j)=='0'){
                    result+=" ";
                } else {
                    result+="#";
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}