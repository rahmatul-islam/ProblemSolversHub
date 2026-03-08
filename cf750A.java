
import java.util.Scanner;

public class cf750A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int timeLeft = 240 - k;
            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (timeLeft >= 5 * i) {
                    timeLeft -= 5 * i;
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}