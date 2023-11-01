package SWEA.D2;
// 시각 덧셈

import java.util.Scanner;

public class Solution_1976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int s_h = sc.nextInt(); int s_m = sc.nextInt(); int l_h = sc.nextInt(); int l_m = sc.nextInt();
            int h = ((s_h * 60) + s_m + (l_h * 60) + l_m) / 60;
            int m = ((s_h * 60) + s_m + (l_h * 60) + l_m) % 60;

            if (h > 12) {
                h -= 12;
            }

            System.out.println("#" + tc + " " + h + " " + m);
        }
    }
}
