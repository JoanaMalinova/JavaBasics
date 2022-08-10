package ConditionalStAdvPrActice;

import java.util.Scanner;

public class SummerOutfit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        switch(timeOfDay){
            case "Morning":
                if(temperature>=10&&temperature<=18){
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.",temperature);
                }else if(temperature>18&&temperature<=24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
                }else if(temperature>=25){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",temperature);
                }
                break;
            case"Afternoon":
                if(temperature>=10&&temperature<=18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);
                }else if(temperature>18&&temperature<=24){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",temperature);
                }else if(temperature>=25){
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",temperature);
                }
                break;
            case"Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.",temperature);

                break;
        }

    }
}
