package NestedLoopPr;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 0;
        int num = 0;
        while (num < n) {
            if (row >= 1) {
                System.out.println();
            }
            row++;
            for (int j = 1; j <= row; j++) {
                num++;
                if (num <= n) {
                    System.out.print(num+" ");
                } else {
                    break;
                }
            }
        }
    }
}
