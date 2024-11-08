package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xToW = w - x;
        int yToH = h - y;
        int xToZero = x;
        int yToZero = y;

        int minX = 0;
        int minY = 0;
        // x축 비교
        minX = Math.min(xToW, xToZero);
        // y축 비교
        minY = Math.min(yToH, yToZero);

        System.out.println(Math.min(minX, minY));
    }
}
