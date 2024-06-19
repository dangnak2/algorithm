import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int answer = getHansu(n);
        System.out.println(answer);
    }

    public static int getHansu(int n) {
        int cnt = 0;

        if (n < 100) {
            return n;
        }else{
            cnt = 99;
            for (int i = 100; i <= n; i++) {
                int h = i/100;
                int m = (i / 10) % 10;
                int l = i % 10;

                if((h - m) == (m-l)) cnt++;
            }
        }

        return cnt;
    }
}
