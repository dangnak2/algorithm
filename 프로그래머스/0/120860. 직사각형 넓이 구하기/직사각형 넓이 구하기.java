import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = -9999;
        int minX = 9999;
        int maxY = -9999;
        int minY = 9999;
        
        for(int i=0; i<dots.length; i++){
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
        }
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
}