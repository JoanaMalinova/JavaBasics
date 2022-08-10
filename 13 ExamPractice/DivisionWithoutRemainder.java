package ExamPractice;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                num2 += 1;

            }
            if (num % 3 == 0) {
                num3 += 1;

            }
            if(num % 4 == 0){
                num4 += 1;

            }

        }
        System.out.printf("%.2f%%%n",num2*100.0/n);
        System.out.printf("%.2f%%%n",num3*100.0/n);
        System.out.printf("%.2f%%%n",num4*100.0/n);
    }
}
