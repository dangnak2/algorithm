class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temp = A;
        
        for(int i=0; i<temp.length(); i++){
            if(temp.equals(B)) return answer;
            String a = temp.substring(temp.length() - 1);
            temp = a + temp.substring(0, temp.length() - 1);
            answer++;
        }
        
        return -1;
    }
}