package SWEA.D2;
// 조교의 성적 매기기

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt(); int K = sc.nextInt();
            double[] arr = new double[N];

            for (int n=0; n<N; n++) {

                double sum = 0;
                int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();

                sum = (a * 0.35) + (b * 0.45) + (c * 0.2);
                arr[n] = sum;
            }

            double k_score = arr[K-1];
            Arrays.sort(arr);

            for (int i=0; i<N; i++) {
                if (k_score == arr[i]) {
                    System.out.println("#" + tc + " " + score[i/(N/10)]);
                }
            }
        }
    }
}
