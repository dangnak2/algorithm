class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] data = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<data.length; j++){
                if(babbling[i].contains(data[j])){
                    babbling[i] = babbling[i].replaceAll(data[j], " ");
                }
            }
            if(babbling[i].trim().equals("")) answer++;
        }
        return answer;
    }
}