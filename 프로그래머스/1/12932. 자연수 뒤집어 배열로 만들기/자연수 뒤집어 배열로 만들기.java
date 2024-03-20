class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        
        int j = 0;
        for(int i=num.length()-1; i>=0; i--){
            answer[j] = num.charAt(i) - 48;
            j++;
        }
        return answer;
    }
}