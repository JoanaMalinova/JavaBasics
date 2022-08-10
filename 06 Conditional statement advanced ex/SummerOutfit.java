package ConditionalStAdvPrActice;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        if (timeOfDay.equals("Evening") ||
                (timeOfDay.equals("Afternoon") && temperature >= 10 && temperature <= 18) ||
                (timeOfDay.equals("Morning") && temperature > 18 && temperature <= 24)) {
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);

        } else if ((timeOfDay.equals("Afternoon") && temperature > 18 && temperature <= 24) ||
                timeOfDay.equals("Morning") && temperature >= 25){
            System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", temperature);

        }else if(timeOfDay.equals("Morning")&&temperature >= 10 && temperature <= 18){
            System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.",temperature);
        }else if(timeOfDay.equals("Afternoon")&&temperature >= 25){
            System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",temperature);
        }

    }
}
