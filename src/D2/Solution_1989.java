package D2;
// 초심자의 회문 검사

import java.util.Scanner;

public class Solution_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc=1; tc<=T; tc++) {
            String str = sc.next();

            String reverse = "";
            for (int i=str.length()-1; i>=0; i--) {
                reverse += str.charAt(i);
            }

            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) != reverse.charAt(j)) {
                    System.out.println("#" + tc + " " + "0");
                    break;
                } else {
                    System.out.println("#" + tc + " " + "1");
                    break;
                }
            }
        }
    }
}
