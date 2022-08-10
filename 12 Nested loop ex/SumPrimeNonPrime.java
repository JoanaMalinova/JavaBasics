package NestedLoopPr;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        while(!command.equals("stop")) {

            int num = Integer.parseInt(command);
            if (num < 0) {

                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            if((num >2 && num%2 == 0 ) || (num > 3 && num%3 ==0) || (num >5 && num%5 == 0)){

                sumNonPrime +=num;

            }else {

                sumPrime += num;

            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d",sumPrime,sumNonPrime);
    }
}
