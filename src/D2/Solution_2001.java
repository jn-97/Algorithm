package D2;
// 파리 퇴치

import java.util.Scanner;

public class Solution_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int arr[][] = new int[N][N];

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;

            for (int i=0; i<N-M+1; i++) {
                for (int j=0; j<N-M+1; j++) {
                    int sum = 0;

                    for (int h=i; h<i+M; h++) {
                        for (int k=j; k<j+M; k++) {
                            sum += arr[h][k];
                        }
                    }

                    if (sum > max) {
                        max = sum;
                    }
                }
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}
