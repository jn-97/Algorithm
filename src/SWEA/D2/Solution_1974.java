package SWEA.D2;
// 스도쿠 검증

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc=1; tc<=T; tc++) {
            String[][] arr = new String[9][9];

            for (int i=0; i<9; i++) {
                for (int j=0; j<9; j++) {
                    arr[i][j] = sc.next();
                }
            }

            /**
             * 배열에 특정 값이 존재하는지 확인하는 방법
             *
             * 1. 반복문
             * 2. List로 변환 후 값을 확인
             * 3. Stream 클래스에서 제공하는 메서드 사용
             */

            int count = 0;

            // 가로 줄 검사
            Loop1:
            for (int i=0; i<9; i++) {

                List<String> list = new ArrayList<>();

                for (int j=0; j<9; j++) {

                    if (list.contains(arr[i][j])) {
                        System.out.println("#" + tc + " " + "0");

                        count += 1;
                        break Loop1;

                    } else {
                        list.add(arr[i][j]);
                    }
                }
            }

            // 세로 줄 검사
            if (count == 0) {

                Loop1:
                for (int i=0; i<9; i++) {

                    List<String> list = new ArrayList<>();

                    for (int j=0; j<9; j++) {

                        if (list.contains(arr[j][i])) {
                            System.out.println("#" + tc + " " + "0");

                            count += 1;
                            break Loop1;

                        } else {
                            list.add(arr[j][i]);
                        }
                    }
                }
            }

            // 3 X 3 검사
            if (count == 0) {
                Loop1:
                for (int l=0; l<9; l+=3) {

                    List<String> list = new ArrayList<>();

                    for (int i=0+l; i<3+l; i++) {
                        for (int j=0+l; j<3+l; j++) {

                            if (list.contains(arr[i][j])) {
                                System.out.println("#" + tc + " " + "0");

                                count += 1;
                                break Loop1;

                            } else {
                                list.add(arr[i][j]);
                            }
                        }
                    }
                }
            }

            if (count == 0) {
                System.out.println("#" + tc + " " + "1");
            }
        }
    }
}
