package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q24313 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // 1. 모든 n >= n0에 대하여 f(n) <= c * g(n)인 양의 상수 c와 n0가 존재한다.
        // f(n) = a1 * n + a0 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족한다면 1, 아니면 0
        // a1 * n + a0 <= c * n 이랑 n >= n0 둘다 만족해야함.
        // n의 범위 중 가장 작은 n0에서부터 만족하면 이후로는 다 만족한다고 보면 됨.
        if ((a1 * n0 + a0 <= c * n0) && (c >= a1)) System.out.println(1);
        else System.out.println(0);
    }
}
