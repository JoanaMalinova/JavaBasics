package WhileLoopPractice;

import java.util.Scanner;

public class ExtraReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNeeded = Integer.parseInt(scanner.nextLine());
        String end = scanner.nextLine();
        int counter = 0;
        int totalSumCs = 0;
        int totalSumCC = 0;
        int counterCS = 0;
        int counterCC = 0;
        boolean isEnough = false;
        while(!end.equals("End")) {
            int objectPrice = Integer.parseInt(end);
            counter ++;
            if(counter%2!=0){
                if(objectPrice>100){
                    System.out.println("Error in transaction!");
                }else {
                    totalSumCs +=objectPrice;
                    counterCS++;
                    System.out.println("Product sold!");
                }

            }else {
                if(objectPrice<10) {
                    System.out.println("Error in transaction!");
                }else {
                    totalSumCC +=objectPrice;
                    counterCC++;
                    System.out.println("Product sold!");
                }
            }
            if(sumNeeded<=totalSumCs+totalSumCC){
                isEnough = true;
                break;
            }
            end = scanner.nextLine();
        }
        if (isEnough) {
            double averageCS = totalSumCs*1.0/counterCS;
            double averageCC= totalSumCC*1.0/ counterCC;
            System.out.printf("Average CS: %.2f%n",averageCS);
            System.out.printf("Average CC: %.2f",averageCC);
        }else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
