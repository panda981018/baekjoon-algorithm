package level8;

import java.util.Scanner;

public class Q2745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // B진법으로 나타내진 수
        int num = scanner.nextInt(); // B진법
        int sum = 0;
        char[] strChar = str.toCharArray();

        for (int i = 0; i < strChar.length; i++) {
            if ('A' <= strChar[i] && 'Z' >= strChar[i]) {
                sum += (int) Math.pow(num, strChar.length - 1 - i) * (strChar[i] - 55);
            } else {
                sum += (int) Math.pow(num, strChar.length - 1 - i) * (strChar[i] - '0');
            }
        }

        System.out.println(sum);
    }
}
