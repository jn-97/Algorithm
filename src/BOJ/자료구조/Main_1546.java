package BOJ.자료구조;
// 평균 구하기

import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N]; // 과목 점수 저장할 배열

        for (int n=0; n<N; n++) {
            A[n] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for (int i=0; i<N; i++) {
            if (A[i] > max) max = A[i];
            sum += A[i];
        }

        System.out.println(sum * 100.0 / max / N);
        /**
         * ".0"을 추가하지 않는다면, 나눗셈은 정수 나눗셈으로 수행됨
         * 이는 결과가 정수가 되어 소수 부분이 손실될 수 있다는 것을 의미
         */
    }
}
