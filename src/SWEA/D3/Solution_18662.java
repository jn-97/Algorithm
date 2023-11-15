package SWEA.D3;
// 등차수열 만들기

import java.util.Scanner;

public class Solution_18662 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            double a = y - x;
            double b = z - y;

            double result = 0;

            if (a == b) {
                // a와 b가 같으면 등차수열이므로 result는 0
                System.out.println("#" + tc + " " + result);
            } else {
                // a와 b가 다르면 등차수열이 아니므로 두 값의 차의 절반을 결과로 설정
                result = Math.abs(a - b) / 2.0;
                System.out.println("#" + tc + " " + result);
            }
        }
    }
}