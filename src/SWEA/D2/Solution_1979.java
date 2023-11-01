package SWEA.D2;
// 어디에 단어가 들어갈 수 있을까

import java.util.Scanner;

public class Solution_1979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt(); int K = sc.nextInt();
            int[][] arr = new int[N][N];
            int result = 0;

            for (int i=0; i<N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i=0; i<N; i++) {
                int a_score = 0; // 가로 score

                for (int j=0; j<N; j++) {
                    if (arr[i][j] == 0) {
                        if (a_score == K) {
                            result += 1;
                        }
                        a_score = 0;
                    } else {
                        a_score += 1;
                    }
                }
                if (a_score == K) {
                    result += 1;
                }
            }

            for (int i=0; i<N; i++) {
                int b_score = 0; // 세로 score

                for (int j=0; j<N; j++) {
                    if (arr[j][i] == 0) {
                        if (b_score == K) {
                            result += 1;
                        }
                        b_score = 0;
                    } else {
                        b_score += 1;
                    }
                }
                if (b_score == K) {
                    result += 1;
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
