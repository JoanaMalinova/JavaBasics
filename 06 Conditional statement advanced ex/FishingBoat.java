package ConditionalStAdvPrActice;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season= scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        int rent = 0;
        switch (season) {
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;

            case "Spring":
                rent = 3000;
                break;

            case "Winter":
                rent = 2600;
                break;
        }
        double rentPlusBonus= 0;
        if(fisherman<=6){
            rentPlusBonus=rent -0.1*rent;
        }else if(fisherman>=7&&fisherman<=11){
            rentPlusBonus=rent-0.15*rent;
        }else {
            rentPlusBonus=rent-0.25*rent;
        }
        double finalPrice=0;
        if(fisherman%2==0&&(season.equals("Spring")||season.equals("Summer")||season.equals("Winter"))){
            finalPrice=rentPlusBonus-0.05*rentPlusBonus;
        }else{
            finalPrice=rentPlusBonus;
        }
        double difference = Math.abs(budget-finalPrice);
        if(budget>=finalPrice){
            System.out.printf("Yes! You have %.2f leva left.",difference);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",difference);
        }

    }
}
