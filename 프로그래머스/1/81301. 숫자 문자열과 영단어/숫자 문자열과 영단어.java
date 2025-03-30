class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", 
                    "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<numbers.length; i++){
            if(s.contains(numbers[i])){
                s = s.replace(numbers[i], String.valueOf(i));
            }
        }
        
        // System.out.println(s);
        
        answer = Integer.parseInt(s);
        return answer;
    }
}