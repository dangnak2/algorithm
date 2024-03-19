class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] rail = new int[200];
        for(int[] line : lines){
            for(int i=(line[0] + 100); i<(line[1]+100); i++){
                rail[i]++;
            }   
        }
        
        for(int value : rail){
            if(value > 1) answer++;
        }
        
        return answer;
    }
}