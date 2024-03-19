class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0; int num = 0;
        
        for(String s : polynomial.split(" ")){
            if(s.contains("x")){
                xNum += s.equals("x") ? 1 : Integer.valueOf(s.replace("x", ""));
            } else if(!s.contains("+")){
                num += Integer.valueOf(s);
            }
        }
        
        return IntegerToString(xNum, num);
    }
    
    public String IntegerToString(int xNum, int num) {

        if(xNum == 0){
            if(num == 0) return "";
            if(num != 0) return String.valueOf(num);
        }
        
        if(xNum == 1){
            if(num == 0) return "x";
            if(num != 0) return "x + " + String.valueOf(num);
        }
        
        if(xNum > 1){
            if(num == 0) return String.valueOf(xNum) + "x";
            if(num != 0) return String.valueOf(xNum) + "x + " + String.valueOf(num);
        }
        
        return "";
    }
}