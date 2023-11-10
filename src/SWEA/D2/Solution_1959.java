package SWEA.D2;
// 두 개의 숫자열

import java.util.Scanner;

public class Solution_1959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt(); int M = sc.nextInt();

            int[] A = new int[N];
            for (int i=0; i<N; i++) {
                A[i] = sc.nextInt();
            }

            int[] B = new int[M];
            for (int j=0; j<M; j++) {
                B[j] = sc.nextInt();
            }


            if (N < M) {

                int[] result = new int[M-N+1];

                for (int i=0; i<=M-N; i++) {
                    for (int j=0; j<N; j++) {
                        result[i] += A[j] * B[j+i];
                    }
                }

                int max = Integer.MIN_VALUE;

                for (int i : result) {
                    max = Math.max(max, i);
                }
                System.out.println("#" + tc + " " + max);
            }

            if (M < N) {

                int[] result = new int[N-M+1];

                for (int i=0; i<=N-M; i++) {
                    for (int j=0; j<M; j++) {
                        result[i] += B[j] * A[j+i];
                    }
                }

                int max = Integer.MIN_VALUE;

                for (int i : result) {
                    max = Math.max(max, i);
                }
                System.out.println("#" + tc + " " + max);
            }
        }
    }
}
