package SWEA.D3;
// 문자열문자열

import java.util.Scanner;

public class Solution_17319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt(); // 문자열의 길이
            String S = sc.next(); // 문자열

            char[] arr = S.toCharArray();

            Loop1:
            if (S.length()%2 == 0) { // 문자열이 짝수

                for (int i=0; i<N/2; i++) {
                    if (arr[i] != arr[i + (N/2)]) {
                        System.out.println("#" + tc + " " + "No");
                        break Loop1;
                    }
                }
                System.out.println("#" + tc + " " + "Yes");

            } else { // 문자열이 홀수
                System.out.println("#" + tc + " " + "No");
            }
        }
    }
}
