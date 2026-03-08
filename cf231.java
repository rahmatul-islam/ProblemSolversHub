package codeforces;
import  java.util.Scanner;

public class cf231 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int a;
            int b;
            int c;
            int count = 0;

            for (int i = 0; i < n; i++) {
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                if (a + b + c >= 2) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
