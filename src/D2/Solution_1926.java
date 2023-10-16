package D2;
// 간단한 369게임

import java.util.Scanner;

public class Solution_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {

            String result = "";
            int x = i;

            while (x!=0) {
                if (x%10 == 0) {
                    x/=10;
                    if (x%10 == 0) {
                        x/=10;
                    }
                }

                if ((x%10) % 3 == 0) {
                    x/=10;
                    result += "-";
                } else {
                    x/=10;
                }
            }

            if (result.length() > 0) {
                System.out.print(result + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
