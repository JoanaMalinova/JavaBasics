package CoditionalStPractical;

import java.util.Scanner;

public class ExtraPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysGone = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayGr =Double.parseDouble(scanner.nextLine());
        double totalFood = daysGone*(dogFoodPerDayKg+catFoodPerDayKg+turtleFoodPerDayGr/1000);
        if(food>=totalFood){
            double foodLeft = Math.floor(food-totalFood);
            System.out.printf("%.0f kilos of food left.",foodLeft);
        }else{
            double foodNeeded= Math.ceil(totalFood-food);
            System.out.printf("%.0f more kilos of food are needed.",foodNeeded);
        }

    }
}
