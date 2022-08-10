package ForLoopPr;

import java.util.Scanner;

public class EqualPairs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxDiff = Integer.MIN_VALUE;
        int sum = 0;
        int sum1 = 0;
        int diff = 0;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int i1 = 1; i1 <= 2; i1++) {
                int num = Integer.parseInt(scanner.nextLine());
                sum += num;
            }
            if (i > 1) {
                diff = Math.abs(sum - sum1);
            }
            if(diff>maxDiff){
                maxDiff=diff;
            }
            sum1 = sum;
            ;

        }
        if (diff==0) {
            System.out.printf("Yes, value=%d", sum1);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }



    }
}

