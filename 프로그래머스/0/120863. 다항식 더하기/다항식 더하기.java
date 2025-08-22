class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] list = polynomial.split(" ");
        int a = 0;
        int b = 0;
        
        for(int i=0; i<list.length; i++){
            if(list[i].contains("x")){
                if(list[i].equals("x")){
                    list[i] = "1x";
                }
                String s = list[i].replace("x", "");
                a+=Integer.parseInt(s);
            }else if(!list[i].contains("x") && !list[i].contains("+")){
                b+=Integer.parseInt(list[i]);
            }
        }
        if(a != 0 && b != 0){
            return (a == 1 ? "x" : a + "x") + " + " + b;
        }else if(a != 0){
            return (a == 1 ? "x" : a + "x");
        }else{
            return String.valueOf(b);
        }
    }
}