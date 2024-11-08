package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27323 {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(r.readLine());
        int B = Integer.parseInt(r.readLine());

        System.out.println(A * B);
    }
}
