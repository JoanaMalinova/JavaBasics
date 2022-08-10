package ExamPractice;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double stayPrice = Double.parseDouble(scanner.nextLine());
        int percentExp = Integer.parseInt(scanner.nextLine());
        if (nights>7){
           stayPrice-=stayPrice*0.05;
        }
        double totalSum = nights*stayPrice + percentExp*1.0/100*budget;

        double diff =Math.abs(totalSum-budget);
        if(totalSum<=budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",diff);
        }else {
            System.out.printf("%.2f leva needed.",diff);
        }

    }
}
