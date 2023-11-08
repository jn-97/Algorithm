package SWEA.D3;
// 원 안의 점

import java.util.Scanner;

public class Solution_16910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc=1; tc<=T; tc++) {

            int N = sc.nextInt();
            int cnt = 0;

            // 만약 N=1 이면, -1부터 1까지 차례대로 검사하면서 x*x + y*y <= N*N 을 만족하는지 확인
            for (int x=-N; x<=N; x++) {
                for (int y=-N; y<=N; y++) {

                    if ((x*x) + (y*y) <= N*N) {
                        cnt += 1;
                    }
                }
            }

            System.out.println("#" + tc + " " + cnt);
        }
    }
}
