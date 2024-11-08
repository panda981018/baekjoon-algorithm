package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());

        for (int i = 2; i <= Math.sqrt(N); i++) {
            int divisorCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    divisorCount++;
            }
            if (divisorCount == 2) {
                while (N % i == 0) {
                    System.out.println(i);
                    N /= i;
                }
            }
        }

        if (N != 1) {
            System.out.println(N);
        }
    }
}
