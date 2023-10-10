package D1;

import java.util.Scanner;

public class findTheMeanValue_2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        double[] arr = new double[10];

        for (int tc=1; tc<=T; tc++) {
            double result = 0;

            for (int i=0; i<10; i++) {
                arr[i] = sc.nextDouble();

                result += arr[i];
            }

            System.out.println("#" + tc + " " + String.format("%.0f", result/10));
        }
    }
}
