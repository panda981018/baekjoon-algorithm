package level11;

import java.util.Scanner;

public class Q24265 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        // 1 -> 2 ~ 7 | 6
        // 2 -> 3 ~ 7 | 5
        // 3 -> 4 ~ 7 | 4
        // 4 -> 5 ~ 7 | 3
        // 5 -> 6 ~ 7 | 2
        // 6 -> 7 ~ 7 | 1
        // 1 ~ n까지의 합 = n (n + 1) / 2
        // 1 ~ 6까지의 합 = 6 * 7 / 2
        System.out.println((n - 1) * (n) / 2);
        System.out.println(2);
    }
}
