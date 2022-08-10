package ForLoopPr;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                sum1 += 1;
            } else if (num < 400) {
                sum2 += 1;

            } else if (num < 600) {
                sum3 += 1;

            } else if (num < 800) {
                sum4 += 1;

            } else {
                sum5 += 1;
            }
        }
        System.out.printf("%.2f%%%n", 100.00 * sum1 / n);
        System.out.printf("%.2f%%%n", 100.00 * sum2 / n);
        System.out.printf("%.2f%%%n", 100.00 * sum3 / n);
        System.out.printf("%.2f%%%n", 100.00 * sum4 / n);
        System.out.printf("%.2f%%", 100.00 * sum5 / n);

    }
}

