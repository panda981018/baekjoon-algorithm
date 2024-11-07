package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(r.readLine());
        int end = Integer.parseInt(r.readLine());
        int primeSum = 0;
        List<Integer> prime = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int divisorCounter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCounter++;
                }
            }
            if (divisorCounter == 2) {
                primeSum += i;
                prime.add(i);
            }
        }

        if (primeSum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(primeSum);
            System.out.println(prime.get(0));
        }
    }
}
