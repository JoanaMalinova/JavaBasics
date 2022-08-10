package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double totalMoneySaved = 0;
        while(!destination.equals("End")){
            while(moneyNeeded > totalMoneySaved ){
                double moneySaved = Double.parseDouble(scanner.nextLine());
                totalMoneySaved +=moneySaved;
            }
            totalMoneySaved = 0;
            System.out.printf("Going to %s!%n",destination);

            destination = scanner.nextLine();
            if(!destination.equals("End")){
            moneyNeeded = Double.parseDouble(scanner.nextLine());
            }

        }
    }
}
