import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rank = new HashMap<>();
        for(int i=0; i<players.length; i++){
            rank.put(players[i], i);          
        }
        
        for(String call : callings){
            int fasterIdx = rank.get(call);
            String lower = players[fasterIdx-1];
            
            players[fasterIdx-1] = call;
            players[fasterIdx] = lower;
            
            rank.put(call, fasterIdx-1);
            rank.put(lower, fasterIdx);
        }
        return players;
    }
    
}