package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalOpening = Integer.parseInt(scanner.nextLine());
        int intervalClosing = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        int a = 0;
        int b = 0;
        int num1 = 0;
        int num2 = 0;
        boolean isEqual = false;
        for (a = intervalOpening; a <= intervalClosing; a++) {
            if (sum == magicNum) {
                break;
            }
            for (b = intervalOpening; b <= intervalClosing; b++) {
                counter++;
                sum = a + b;

                if (sum == magicNum) {
                    isEqual = true;
                    num1 = a;
                    num2 = b;
                    break;
                }

            }
        }
        if (isEqual) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, num1, num2, sum);
        } else {
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }
    }

}


