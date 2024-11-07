package level8;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 찾아야하는 숫자
        int count = 1;
        int range = 2;

        if (num == 1) {
            System.out.println(1);
        } else {
            while (range <= num) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
