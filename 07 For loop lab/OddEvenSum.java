package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven=0;
        int sumOdd=0;
        for(int i =1;i<=n;i++) {
            int num = Integer.parseInt(scanner.nextLine());
            {
                if (i % 2 == 0) {
                    int numEven =num;
                    sumEven+=numEven;
                } else {
                    int numOdd =num;
                    sumOdd+=numOdd;
                }
            }
        }if (sumEven==sumOdd){
            System.out.println("Yes");
            System.out.println("Sum = "+sumEven);
        }else{
            int diff = Math.abs(sumEven-sumOdd);
            System.out.println("No");
            System.out.println("Diff = "+diff);


        }


    }
}
