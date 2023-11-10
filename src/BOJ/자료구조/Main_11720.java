package BOJ.자료구조;
// 숫자의 합

import java.util.Scanner;

public class Main_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for (int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환
        }

        System.out.println(sum);
    }
}
