package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (!(str = r.readLine()).equals("-1")) {
            StringBuilder sb = new StringBuilder();
            List<Integer> divisor = new ArrayList<>();
            int n = Integer.parseInt(str);
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisor.add(i);
                    sum += i;
                }
            }

            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
            } else {
                sb.append(n + " = ");
                for (int i = 0; i < divisor.size(); i++) {
                    if (i == divisor.size() - 1) {
                        sb.append(divisor.get(i));
                    } else {
                        sb.append(divisor.get(i) + " + ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}
