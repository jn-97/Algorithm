package BOJ.자료구조;
// 구간 합 구하기

import java.io.*;
import java.util.StringTokenizer;

public class Main_11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N+1];

        st = new StringTokenizer(br.readLine());

        for (int i=1; i<=N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int m=0; m<M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(S[j] - S[i-1]);
        }
    }
}