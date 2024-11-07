package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(r.readLine());
        int sum = 0;

        int[][] paper = new int[100][100];

        for (int i = 0; i < N; i++) {
            String line = r.readLine();
            st = new StringTokenizer(line, " ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            for (int j = X; j < X + 10; j++) {
                for (int k = Y; k < Y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += paper[i][j];
            }
        }
        System.out.println(sum);
    }
}
