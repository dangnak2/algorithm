class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        // 등차인지 등비인지 판별
        boolean isSequence = validationIsSequence(common);
        
        // 등차이면 마지막원소 + 등차
        if(isSequence) {
            int sequence = common[1] - common[0];
            answer = common[common.length - 1] + sequence;
        }
        // 등비이면 마지막원소 * 등비
        else{
            int multiple = common[1] / common[0];
            answer = common[common.length - 1] * multiple;
        }
        
        return answer;
    }
    
    public boolean validationIsSequence(int[] common){
        
        // 최소 3개의 원소가 있음
        // 0,1 차이와 1,2 차이가 동일하면 등차
        if(common[1] - common[0] == common[2] - common[1]) return true;
        // 다르면 등비
        return false;
    }
}