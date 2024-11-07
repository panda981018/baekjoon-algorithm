package level8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(); // 10진법으로 나타내진 수
        int B = scanner.nextInt(); // 나타내야 할 진법
        List<Character> arr = new ArrayList<>();

        do {
            if (N % B >= 10) {
                arr.add((char) ((N % B) + 55));
            } else {
                arr.add((char) ((N % B) + '0'));
            }
            N /= B;
        } while (N != 0);

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }
    }
}
