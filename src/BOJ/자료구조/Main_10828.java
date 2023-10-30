package BOJ.자료구조;

import java.io.*;
import java.util.Stack;

public class Main_10828 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int n=0; n<N; n++) {
            String[] s = br.readLine().split(" "); //push 1

            switch (s[0]) {
                case "push" :
                    stack.push(Integer.parseInt(s[1]));
                    break;
                case "pop" :
                    if (stack.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case "size" :
                    bw.write(stack.size()  + "\n");
                    break;
                case "empty" :
                    if (stack.empty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "top" :
                    if (stack.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush(); // 버퍼에 남아있는 문자열을 출력해서 버퍼를 비움
        bw.close();

    }
}
