import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = getSum(queue1);
        long sum2 = getSum(queue2);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i=0; i<queue1.length; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        
        while(sum1 != sum2){
            if(answer > (queue1.length + queue2.length) * 2) 
                return -1;
            
            int value = 0;
            if(sum1 < sum2){
                value = q2.poll();
                q1.add(value);
                
                sum1 += (long)value;
                sum2 -= (long)value;
            } else if (sum1 > sum2){
                value = q1.poll();
                q2.add(value);
                
                sum1 -= (long)value;
                sum2 += (long)value;
            } else {
                return answer;
            }
            answer++;
        }
        
        return answer;
    }
    
    public long getSum(int[] queue){
        long sum = 0;
        for(int i=0; i<queue.length; i++){
            sum += (long)queue[i];
        }
        return sum;
    }
}