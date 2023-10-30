package SWEA.D2;
// 백만 장자 프로젝트

import java.util.Scanner;

public class Solution_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();
            int arr[] = new int[N];


            for (int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }

            // 맨 뒤 인덱스부터 접근
            int c = arr[N-1]; // 체크포인트 (팔아야 할 시점)
            int sum = 0;

            for (int i=N-2; i>=0; i--) {
                if (arr[i] > c || arr[i] == c) {
                    c = arr[i];
                } else {
                    sum += c-arr[i];
                }
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
