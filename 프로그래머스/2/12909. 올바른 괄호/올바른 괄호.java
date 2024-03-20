class Solution {
    boolean solution(String s) {
        int open_count = 0;
        int close_count = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') open_count++;
            else if(s.charAt(i) == ')') close_count++;
            
            if(close_count > open_count) return false;
        }
        if(open_count == close_count) return true;

        return false;
    }
}