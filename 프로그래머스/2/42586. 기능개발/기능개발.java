import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] works = new int[progresses.length];
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<progresses.length; i++){
            works[i] = (100 - progresses[i]) / speeds[i];
            if((100-progresses[i]) % speeds[i] > 0) works[i]++;
        }
        
        int x = works[0];
        int cnt = 0;
        for(int i=0; i<works.length; i++){
            if(works[i] <= x) cnt+= 1;
            else {
                list.add(cnt);
                cnt = 1;
                x = works[i];
            }
        }
        list.add(cnt);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}