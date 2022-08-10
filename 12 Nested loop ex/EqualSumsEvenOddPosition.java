package NestedLoopPr;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = num1; i <= num2 ; i++) {

            String number1 = Integer.toString(i);
            sumEven = 0;
            sumOdd = 0;
            for (int j = 0; j <= 5; j++) {
                char a = number1.charAt(j);
                String converter = Character.toString(a);
                int currentNum = Integer.parseInt(converter);
               if(j%2 ==0){
                   sumEven += currentNum;
               }else {
                   sumOdd += currentNum;
               }
            }
            if(sumEven == sumOdd){
                System.out.print(i+" ");
            }
        }
    }
}
