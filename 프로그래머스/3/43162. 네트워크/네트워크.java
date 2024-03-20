class Solution {
    
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++) {
            if(visited[i] == false){
                answer++;
                dfs(computers, n, i);
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computers, int n, int i){
        visited[i] = true;
        
        for(int j=0; j<n; j++){
            if(visited[j] == false && computers[i][j] == 1){
                dfs(computers, n, j);
            }
        }
    }
}