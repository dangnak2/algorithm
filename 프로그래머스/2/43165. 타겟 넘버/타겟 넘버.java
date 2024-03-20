class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int depth, int target, int result){
        
        // numbers의 끝까지 탐색했을 때
        if(depth == numbers.length){
            // 수의 합이 target과 일치하면 count
            if(result == target){
              answer++;  
            }
            return;
        }
        
        int plus = result + numbers[depth];
        int minus = result - numbers[depth];
        
        // 더하는 경우 탐색
        dfs(numbers, depth+1, target, plus);
        // 빼는 경우 탐색
        dfs(numbers, depth+1, target, minus);
    }

}