package level8;

import java.util.Scanner;

public class Q1193 {

    public static void main(String[] args) {
        // x/y라고 가정
        // 대각선 기준 i번째엔
        // 홀수번째에는 y = 1 (1 <= y < i), x = i - y
        // 짝수번째에는 y = i - x, x = 1 (1 <= x < i)
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int currentNum = 1, i = 2;

        String answer = "";
        if (N == 1) {
            answer = "1/1";
        } else {
            while (true) {
                if (currentNum < N && N <= currentNum + i) { // sum + i는 i번째 마지막 번호
                    answer = getFraction(currentNum, i, N);
                    break;
                } else {
                    currentNum += i;
                    i++;
                }
            }
        }

        System.out.println(answer);
    }

    static String getFraction(int current, int i, int x) { // a/b 리턴
        int a = 0, b = 0;
        if (i % 2 == 0) { // i가 짝수일 때
            for (a = 1; a <= i; a++) {
                current++;
                b = (i + 1) - a;
                if (current == x) {
                    break;
                }
            }
        } else { // i가 홀수일 때
            for (b = 1; b <= i; b++) {
                current++;
                a = (i + 1) - b;
                if (current == x) {
                    break;
                }
            }
        }
        return a + "/" + b;
    }
}