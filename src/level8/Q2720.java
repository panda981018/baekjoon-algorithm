package level8;

import java.util.Scanner;

public class Q2720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        for (int i = 0 ; i < total; i++) {
            int money = scanner.nextInt();
            int quarter = money / 25;
            money %= 25;
            int dime = money / 10;
            money %= 10;
            int nickel = money / 5;
            money %= 5;

            System.out.println(quarter + " " + dime + " " + nickel + " " + money);
        }
    }
}
