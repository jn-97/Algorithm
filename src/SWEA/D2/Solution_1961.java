package SWEA.D2;
// 숫자 배열 회전

import java.util.Scanner;

public class Solution_1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc=1; tc<=T; tc++) {
            System.out.println("#" + tc);

            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    arr[j][i] = sc.nextInt();
                }
            }

            // 90도
            String[] arr_90 = new String[N];
            int s_90 = 0;

            for (int i=0; i<N; i++) {

                arr_90[i] = ""; // 이걸 해줘야 숫자 앞에 null이 안나옴

                for (int j=N-1; j>=0; j--) {

                    arr_90[s_90] += arr[i][j]; // 741, 852, 963
                }

                s_90 += 1;
            }

            // 180도
            String[] arr_180 = new String[N];
            int s_180 = 0;

            for (int i=N-1; i>=0; i--) {

                arr_180[s_180] = ""; // 이걸 해줘야 숫자 앞에 null이 안나옴

                for (int j=N-1; j>=0; j--) {
                    arr_180[s_180] += arr[j][i]; // 987, 654, 321
                }

                s_180 += 1;
            }

            // 270도
            String[] arr_270 = new String[N];
            int s_270 = 0;

            for (int i=N-1; i>=0; i--) {

                arr_270[s_270] = ""; // 이걸 해줘야 숫자 앞에 null이 안나옴

                for (int j=0; j<N; j++) {
                    arr_270[s_270] += arr[i][j];
                }

                s_270 += 1;
            }

            for (int i=0; i<N; i++) {
                System.out.print(arr_90[i] + " ");
                System.out.print(arr_180[i] + " ");
                System.out.print(arr_270[i] + " ");
                System.out.println(" ");
            }
        }
    }
}
