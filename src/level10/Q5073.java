package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        while (!(str = r.readLine()).equals("0 0 0")) {
            st = new StringTokenizer(str, " ");
            int[] lengths = new int[3];
            lengths[0] = Integer.parseInt(st.nextToken());
            lengths[1] = Integer.parseInt(st.nextToken());
            lengths[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(lengths);
            if (lengths[2] >= lengths[0] + lengths[1]) {
                System.out.println("Invalid");
            } else {
                if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
                    System.out.println("Equilateral");
                } else if ((lengths[0] == lengths[1] && lengths[1] != lengths[2])
                            || (lengths[0] == lengths[2] && lengths[2] != lengths[1])
                            || (lengths[1] == lengths[2] && lengths[2] != lengths[0])) {
                    System.out.println("Isosceles");
                } else if (lengths[0] != lengths[1] && lengths[1] != lengths[2]) {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
