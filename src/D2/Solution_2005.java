package D2;
// 파스칼의 삼각형

import java.util.Scanner;

public class Solution_2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();

            int arr[][] = new int[N][N+2];
            arr[0][1] = 1;

            for (int i=1; i<N; i++) {
                for (int j=1; j<N+2; j++) {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }

            System.out.println("#" + tc);

            for (int i=0; i<N; i++) {
                for (int j=0; j<N+2; j++) {
                    if (arr[i][j] != 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
