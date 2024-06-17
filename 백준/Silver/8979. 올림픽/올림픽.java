import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static int n, k;
    static ArrayList<Nation> list = new ArrayList<>();
    static int target;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 국가 수, 타겟 번호 할당
        String[] t = sc.nextLine().split(" ");
        n = Integer.parseInt(t[0]);
        k = Integer.parseInt(t[1]);

        // 국가별 메달 획득 상황, 번호, 스코어 객체에 할당
        for (int i = 0; i < n; i++) {
            String[] sArr = sc.nextLine().split(" ");
            int num = Integer.parseInt(sArr[0]);
            int gold = Integer.parseInt(sArr[1]);
            int silver = Integer.parseInt(sArr[2]);
            int bronze = Integer.parseInt(sArr[3]);
            list.add(new Nation(num, gold, silver, bronze, 0));
        }

        // comparator 정렬
        Collections.sort(list);

        list.get(0).rate =1;         // 정렬을 했으니 리스트의 첫번째 국가는 무조건 1등

        // 동점 처리 로직
        for (int i = 1; i < list.size(); i++) {
            int tmp_gold = list.get(i - 1).gold;
            int tmp_silver = list.get(i - 1).silver;
            int tmp_bronze = list.get(i - 1).bronze;
            Nation now = list.get(i);

            // 타켓 국가 변수 할당
            if (now.num == k) {
                target = i;
            }

            // 현재 국가와 바로 위 등수 국가 메달 수가 같으면
            if (now.gold == tmp_gold && now.silver == tmp_silver && now.bronze == tmp_bronze) {
                // 같은 등수 처리
                now.rate = list.get(i - 1).rate;
            } else {
                // 다르면 위의 국가 수 + 1
                now.rate = i + 1;
            }
        }

        // 타켓 국가 등수 출력
        System.out.println(list.get(target).rate);
    }
}

class Nation implements Comparable<Nation>{

    int num;
    int gold;
    int silver;
    int bronze;
    int rate;

    public Nation(int num, int gold, int silver, int bronze, int rate) {
        this.num = num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.rate = rate;
    }
    
    public int compareTo(Nation o) {
        
        // 금메달 수가 같으면
        if (this.gold == o.gold) {
            // 은메달을 기준으로, 은메달 수가 같으면
            if (this.silver == o.silver) {
                // 동메달을 기준으로 정렬
                return o.bronze - this.bronze;
            } else {
                return o.silver - this.silver;
            }
        } else {
            return o.gold - this.gold;
        }
    }
}
