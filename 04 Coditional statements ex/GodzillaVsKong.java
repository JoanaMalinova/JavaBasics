package CoditionalStPractical;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = 0.1*budget;

        double clothingTotalPrice= clothingPrice*statists;
        if(statists>150){
            clothingTotalPrice=clothingTotalPrice-0.1*clothingTotalPrice;

        }
        double left = budget-(clothingTotalPrice+decorPrice);
        double needed = Math.abs(left);
        if (left<0){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",needed);

        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",left);

        }
        }
    }

