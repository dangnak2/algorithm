class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for(String s : keyinput){
            
            if(s.equals("left")){
              if(validScope(answer[0]-1, answer[1], board[0], board[1])) answer[0]--;  
            }
            if(s.equals("right")){
              if(validScope(answer[0]+1, answer[1], board[0], board[1])) answer[0]++;  
            }
            if(s.equals("up")){
              if(validScope(answer[0], answer[1]+1, board[0], board[1])) answer[1]++;  
            }
            if(s.equals("down")){
              if(validScope(answer[0], answer[1]-1, board[0], board[1])) answer[1]--;  
            }
            
        }
        return answer;
    }
    
    public boolean validScope(int answer0, int answer1, int board0, int board1){
        if(answer0 > board0/2 || answer0 < -board0/2)
            return false;
        if(answer1 > board1/2 || answer1 < -board1/2)
            return false;
        
        return true;
    }
}