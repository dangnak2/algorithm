import java.io.*;
import java.util.*;

public class Main {

    static int M, N;
    static int[][] map;
    static int[] dx = {0,1,0,-1}; // 우, 하, 좌, 상
    static int[] dy = {1,0,-1,0}; // 우, 하, 좌, 상
    static boolean[][] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        sc.close();

        map = new int[M][N];
        visited = new boolean[M][N];

        int chgDirCnt = 0;          // 꺾인 횟수
        int sum = 0;                // 지나온 칸 수 -> 종료 조건

        int idx = 0;                // 다음 칸 탐색에 쓰는 인덱스
        int nowX = 0, nowY = 0;         // 현재 좌표
        visited[nowX][nowY] = true;

        sum = 1;
        while (idx < 4) {
            int nx = nowX + dx[idx];                // 새로운 좌표 업데이트
            int ny = nowY + dy[idx];

            if (sum == M * N) {                     // 그래프를 모두 방문한 경우
                System.out.println(chgDirCnt);      // 꺾은 횟수 출력 후 종료
                return;
            }

            // 달팽이가 이동 가능한 경우 -> 그래프를 벗어나지 않는 경우
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny]) {
                sum++;                          // 지나온 칸 수 증가
                visited[nx][ny] = true;         // 방문 처리
                nowX = nx;
                nowY = ny;
            }
            // 그래프를 벗어난 경우
            else{
                idx++;
                chgDirCnt++;
            }

            // 모든 방향을 탐색해도 끝나지 않았다면 처음 방향으로 복귀
            if (idx >= 4) {
                idx = 0;
            }

        }
    }
}
