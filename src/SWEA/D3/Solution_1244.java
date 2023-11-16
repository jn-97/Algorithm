import java.util.Scanner;

public class Solution_1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[100][100];

        for (int tc = 1; tc <= 10; tc++) {

            int N = sc.nextInt();

            // 입력 받은 배열 초기화
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = Integer.MIN_VALUE; // 1. 최대값 초기화를 아주 작은 값으로 설정
            int temp_w, temp_h;

            // 가로로 숫자 바꿔가며 최대 상금 찾기
            for (int i = 0; i < 100; i++) {
                temp_w = 0;
                temp_h = 0;

                for (int j = 0; j < 100; j++) {
                    temp_w += arr[i][j];
                    temp_h += arr[j][i];
                }

                // 2. 최대 가로 합과 세로 합 각각 비교
                if (temp_w > max) {
                    max = temp_w;
                }

                if (temp_h > max) {
                    max = temp_h;
                }
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}
