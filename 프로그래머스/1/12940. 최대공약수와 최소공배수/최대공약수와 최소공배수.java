class Solution{
    public int[] solution(int n, int m) {

        int[] answer = new int[2];
        answer[0] = gcd(Math.max(n, m), Math.min(n, m));
        answer[1] = n * m / answer[0];
        
        return answer;
    }

    private int gcd(int max, int min) {
        if(max % min == 0) return min;
        return gcd(min, max % min);
    }
}
