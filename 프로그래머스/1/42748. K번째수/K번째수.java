import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // commands 실행횟수 - 3회
        for(int i=0; i<commands.length; i++){
            
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            // i부터, j까지 부분 배열
            int [] arr = Arrays.copyOfRange(array, start-1, end);
            
            // 추출한 부분배열 정렬
            Arrays.sort(arr);
            
            // 인덱스k 값 답안지에 추가
            answer[i] = arr[k-1];
            
        }
        return answer;
    }
}