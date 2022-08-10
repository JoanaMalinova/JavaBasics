package ExamPractice;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());
        double costumeTotal = statists*costumePrice;
        double decor = 0.1*budget;
        if(statists>150){
            costumeTotal-=0.1*costumeTotal;
        }
        double totalSum = decor+costumeTotal;
        double diff =Math.abs(budget-totalSum);
        if(budget>=totalSum){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);
        }

    }
}
