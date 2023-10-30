package SWEA.D2;

import java.util.Scanner;

public class Solution_1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int arr[] = new int[10];

            int max = 0; int min = 10001;
            for (int i=0; i<10; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] > max) { // 최댓값 구하기
                    max = arr[i];
                }

                if (arr[i] < min) { // 최솟값 구하기
                    min = arr[i];
                }
            }

            int result = 0;
            for (int j=0; j<10; j++) {

                if (arr[j] != max && arr[j] != min) {
                    result += arr[j];
                }
            }

            System.out.println("#" + tc + " " + (int)Math.round(result/8.0));
        }
    }
}
