package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        long i = Long.parseLong(r.readLine());
        System.out.println(i * 4);
    }
}
