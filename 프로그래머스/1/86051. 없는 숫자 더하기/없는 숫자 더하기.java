import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> number = new ArrayList<>();
        for(int i : numbers){
            number.add(i);
        }
        
        for(int i=0; i<10; i++){
            if(number.contains(i) == false) answer += i;
        }
   
        return answer;
    }
}