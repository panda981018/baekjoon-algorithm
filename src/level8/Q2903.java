package level8;

import java.util.Scanner;

public class Q2903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int init = 1;
        int total = 0;
        for (int i = 0; i <= N; i++) {
            total = (int) Math.pow((init + Math.pow(2, i)), 2);
        }

        System.out.println(total);
    }
}
