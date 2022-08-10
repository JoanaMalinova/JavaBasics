package ConditionalStAdvPrActice;

import java.util.Scanner;

public class SummerOutfit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String clothing ="";
        String shoes = "";
        if (timeOfDay.equals("Evening")){
            clothing="Shirt";
            shoes = "Moccasins";
        }else if (timeOfDay.equals("Afternoon")){
            if(temperature>=10&&temperature<=18){
               clothing ="Shirt" ;
               shoes="Moccasins" ;
            }else if(temperature>18&&temperature<=24){
                clothing="T-Shirt";
                shoes ="Sandals";
            }else if(temperature>=25){
                clothing="Swim Suit";
                shoes="Barefoot";
            }
        }else if(timeOfDay.equals("Morning")){
            if(temperature>=10&&temperature<=18){
                clothing ="Sweatshirt" ;
                shoes="Sneakers" ;
            }else if(temperature>18&&temperature<=24){
                clothing="Shirt";
                shoes ="Moccasins";
            }else if(temperature>=25){
                clothing="T-Shirt";
                shoes="Sandals";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",temperature,clothing,shoes);
    }
}
