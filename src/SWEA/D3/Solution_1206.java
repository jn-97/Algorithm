package SWEA.D3;

import java.util.Scanner;

public class Solution_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int N = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;

            for (int i = 2; i <= N - 2; i++) {
                int maxLeft = Math.max(arr[i - 2], arr[i - 1]);
                int maxRight = Math.max(arr[i + 1], arr[i + 2]);
                int maxHeight = Math.max(maxLeft, maxRight);

                if (arr[i] > maxHeight) {
                    sum += arr[i] - maxHeight;
                }
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
