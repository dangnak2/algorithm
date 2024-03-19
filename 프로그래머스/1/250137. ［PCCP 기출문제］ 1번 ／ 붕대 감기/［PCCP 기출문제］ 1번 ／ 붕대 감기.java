class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int last_time = attacks[attacks.length-1][0]; // 마지막 공격 시간
        int now_h = health; // 현재 체력
        int a_idx = 0; // 공격 횟수
        int h_idx = 0; // 회복 횟수
        int si_time = bandage[0]; // 시전 시간
        int healing = bandage[1]; // 초당 회복량
        int b_healing = bandage[2]; // 추가 회복량
        
        for(int i=1; i<=last_time; i++){
            
            if(attacks[a_idx][0] == i){
                now_h -= attacks[a_idx][1];
                a_idx++;
                h_idx = 0;
                  if (now_h <= 0){
                    return -1;
                }
            }
            
            else{
                if(now_h < health) {
                    h_idx++;
                    now_h += healing;
                    if(h_idx == si_time){
                        now_h += b_healing;
                        h_idx = 0;
                    }
                    if(now_h > health){
                        now_h = health;
                    }
                }
            }
        }
        return now_h;
    }
}