package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(r.readLine());
        int y = Integer.parseInt(r.readLine());
        int z = Integer.parseInt(r.readLine());

        if (x == y && y == z && x == 60) {
            System.out.println("Equilateral");
        } else if (x + y + z == 180) {
            if (((x == y) && (y != z))
                    || (x == z && z != y)
                    || (y == z && z != x)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
