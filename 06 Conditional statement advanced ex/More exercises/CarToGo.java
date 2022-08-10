package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraCarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classType = "";
        String carType = "";
        double price = 0;
        if (budget<=100){
            classType="Economy class";
            if(season.equals("Summer")){
                carType = "Cabrio";
                price = 0.35*budget;
            }else {
                carType = "Jeep";
                price = 0.65 * budget;
            }
        }else if(budget<=500){
            classType ="Compact class";
            if(season.equals("Summer")){
                carType = "Cabrio";
                price  = 0.45*budget;
            }else {
                carType= "Jeep";
                price = 0.8*budget;
            }
        }else if(budget>500){
            classType ="Luxury class";
            carType = "Jeep";
            price = 0.9*budget;
        }
        System.out.println(classType);
        System.out.printf("%s - %.2f",carType,price);




    }
}
