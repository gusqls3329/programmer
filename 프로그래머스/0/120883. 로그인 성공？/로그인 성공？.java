class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int a = -1;
        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                a = i;
            }
        }
        if(a>=0){
           if(id_pw[1].equals(db[a][1])){
                return "login";
            }else {
               return "wrong pw";
           }
        }else{
            return "fail";
        }
    }
}