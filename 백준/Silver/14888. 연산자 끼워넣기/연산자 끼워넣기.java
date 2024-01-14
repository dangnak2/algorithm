import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int[] operator = new int[4];
    public static int[] numbers;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        // 숫자 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int number, int idx) {
        if (idx == N) {
            MAX = Math.max(MAX, number);
            MIN = Math.min(MIN, number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0:
                        dfs(number + numbers[idx], idx + 1);
                        break;
                    case 1:
                        dfs(number - numbers[idx], idx + 1);
                        break;
                    case 2:
                        dfs(number * numbers[idx], idx + 1);
                        break;
                    case 3:
                        dfs(number / numbers[idx], idx + 1);
                        break;
                }

                operator[i]++;
            }
        }
    }
}
