package SWEA.D2;
// 쉬운 거스름돈

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_1970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc=1; tc<=T; tc++) {

            List<Integer> list = new ArrayList<>();

            int m = sc.nextInt();

            list.add((m/50000));
            m %= 50000;

            list.add((m/10000));
            m %= 10000;

            list.add((m/5000));
            m %= 5000;

            list.add((m/1000));
            m %= 1000;

            list.add((m/500));
            m %= 500;

            list.add((m/100));
            m %= 100;

            list.add((m/50));
            m %= 50;

            list.add((m/10));
            m %= 10;

            System.out.println("#" + tc);
            for (Integer l : list) {
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
    }
}
