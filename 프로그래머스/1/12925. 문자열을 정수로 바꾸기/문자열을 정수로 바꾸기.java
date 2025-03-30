class Solution {
    public int solution(String s) {
    
        if(s.contains("-")) return 0-Integer.parseInt(s.substring(1));
        return Integer.parseInt(s);
    }
}