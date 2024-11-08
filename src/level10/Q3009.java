package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine(), " ");
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(r.readLine(), " ");
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(r.readLine(), " ");
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        int x4 = 0, y4 = 0;
        // x좌표 확인
        if ((x1 == x2) && (x2 != x3)) {
            x4 = x3;
        } else if ((x1 == x3) && (x3 != x2)) {
            x4 = x2;
        } else if ((x2 == x3) && (x3 != x1)) {
            x4 = x1;
        }

        // y좌표 확인
        if ((y1 == y2) && (y2 != y3)) {
            y4 = y3;
        } else if ((y1 == y3) && (y3 != y2)) {
            y4 = y2;
        } else if ((y2 == y3) && (y3 != y1)) {
            y4 = y1;
        }

        System.out.println(x4 + " " + y4);
    }
}
