import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, (a, b) -> {
            if(a.charAt(n) == b.charAt(n))
                return a.compareTo(b);
            return a.charAt(n) - b.charAt(n);
        });
        
        for(String s : strings){
            System.out.print(s);
        }
            
        return strings;
    }
}