package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine(), " ");

        int totalCount = 0;
        for (int i = 0; i < N; i++) {
            int divisorCounter = 0;
            int n = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= n; j++) {
                if (n % j == 0)
                    divisorCounter++;
            }

            if (divisorCounter == 2) {
                totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
