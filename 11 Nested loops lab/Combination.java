package NestedLoops;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        int x3 = 0;
        int x2 = 0;
        for (int x1 = 0; x1 <= n; x1++) {

            for ( x2 = 0; x2 <= n; x2++) {

                for (x3 = 0; x3 <= n; x3++) {
                    sum = x1 + x2 + x3;
                    if (sum == n) {
                        counter++;
                    }
                }

            }

        }
        System.out.println(counter);
    }
}
