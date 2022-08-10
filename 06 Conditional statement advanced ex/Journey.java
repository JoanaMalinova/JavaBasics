package ConditionalStAdvPrActice;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination ="";
        String placeToStay ="";
        double expenses = 0;
        if (budget<=100){
            destination="Bulgaria";
            if(season.equals("summer")){
                placeToStay="Camp";
                expenses=0.3*budget;
            }else if(season.equals("winter")){
                placeToStay="Hotel";
                expenses=0.7*budget;
            }
        }else if(budget<=1000){
            destination = "Balkans";
            if(season.equals("summer")){
                placeToStay="Camp";
                expenses=0.4*budget;
            }else if(season.equals("winter")){
                placeToStay="Hotel";
                expenses=0.8*budget;
            }
        }else if(budget>1000){
            destination="Europe";
            placeToStay="Hotel";
            expenses =0.9*budget;
        }
        System.out.printf("Somewhere in %s",destination);
        System.out.println();
        System.out.printf("%s - %.2f",placeToStay,expenses);

    }
}
