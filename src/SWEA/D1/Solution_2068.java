package SWEA.D1;

import java.util.Scanner;

public class Solution_2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int arr[] = new int[10];

        for (int tc=1; tc<=T; tc++) {
            int max = 0;

            for (int i=0; i<10; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("#" + tc + " " + max);

        }
    }
}
