import java.util.*;

class Solution {
    public String solution(String s) {
      String answer = "";
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            // 추가한 if문
            if(arr[i].length() == 0){
                answer += " ";
            }
            else{
                answer += arr[i].substring(0, 1).toUpperCase();
                answer += arr[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
        // 추가한 if문
        if(s.substring(s.length()-1, s.length()).equals(" ")) 
            return answer;
        return answer = answer.substring(0, answer.length()-1);
    }
}