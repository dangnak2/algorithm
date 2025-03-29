import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            list.add(String.valueOf(numbers[i]));   
        }
        
        list.sort((a, b) -> (b + a).compareTo(a + b)); 
        
        for(String s : list){
            answer += s;
        }
        
        if(answer.charAt(0) == '0'){
            return "0";
        }
        
        return answer;
    }
}