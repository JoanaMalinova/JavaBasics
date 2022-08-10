package ExamProgramingBasics;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seaExcursion = Integer.parseInt(scanner.nextLine());
        int mountExcursion = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalIncome = 0;
        boolean alIsSold = false;
        while (!input.equals("Stop")) {

            if (input.equals("sea")) {

                if (seaExcursion == 0) {

                } else {
                    totalIncome += 680;
                    seaExcursion -= 1;
                }

            } else if (input.equals("mountain")) {

                if (mountExcursion == 0) {

                } else {
                    totalIncome += 499;
                    mountExcursion -= 1;

                }

            }
            if (seaExcursion == 0 && mountExcursion == 0) {
                alIsSold = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (alIsSold) {
            System.out.println(" Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", totalIncome);

    }
}
