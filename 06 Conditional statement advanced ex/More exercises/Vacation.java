package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String placeToStay ="";
        String location = "";
        double expenses = 0;

        if (budget<=1000){
            placeToStay= "Camp";
            switch(season){
                case "Summer":
                    location="Alaska";
                    expenses=0.65*budget;
                    break;
                case"Winter":
                    location="Morocco";
                    expenses= 0.45*budget;
                    break;
            }
        }else if (budget<=3000){
            placeToStay= "Hut";
            switch(season){
                case "Summer":
                    location="Alaska";
                    expenses=0.8*budget;
                    break;
                case"Winter":
                    location="Morocco";
                    expenses= 0.6*budget;
                    break;
            }
        }else {
            placeToStay="Hotel";
            expenses=0.9*budget;
            switch(season){
                case"Summer":
                    location="Alaska";
                    break;
                case"Winter":
                    location="Morocco";
                    break;
            }

        }
        System.out.printf("%s - %s - %.2f",location,placeToStay,expenses);
    }
}
