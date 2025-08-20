class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean [] boo = new boolean[dic.length];
        
        for(int i=0; i<dic.length; i++){
            for(int j=0; j<spell.length; j++){
                if(dic[i].indexOf(spell[j]) == -1){
                    boo[i] = false;
                    break;
                }else{
                    boo[i] = true;
                }
            }
            
        }
        for(int i=0; i<boo.length; i++){
            if(boo[i] == true){
                return 1;
            }
        }
        return answer;
    }
}