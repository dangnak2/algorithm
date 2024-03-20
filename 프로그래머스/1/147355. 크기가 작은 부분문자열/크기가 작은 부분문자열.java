class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int n= p.length();
        
        for(int i=0; i<=t.length()-n; i++){
            Long diff= Long.valueOf(t.substring(i, i+n));
            if(diff <= Long.valueOf(p)) answer++;
        }
        
        return answer;
    }
}