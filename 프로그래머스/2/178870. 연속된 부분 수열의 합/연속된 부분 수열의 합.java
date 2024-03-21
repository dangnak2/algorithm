class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int end = 0;
        int crr_len = -1;
        
        int sum = 0;
        for(int start = 0; start<sequence.length; start++){
            while(end < sequence.length && sum < k){
                sum += sequence[end++];
            }
            
            if(sum == k){
                
                if(crr_len == -1 || crr_len > end-start){
                    answer[0] = start;
                    answer[1] = end-1;
                    crr_len = end - start;   
                }
            }
            
            sum -= sequence[start];
        }
        return answer;
    }
}