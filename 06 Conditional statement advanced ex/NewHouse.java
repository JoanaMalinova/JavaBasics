package ConditionalStAdvPrActice;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        if (flower.equals("Roses")){
            if(quantity>80) {
                sum=quantity*5-0.1*quantity*5;
            }else{
                sum=quantity*5;
            }

        }else if(flower.equals("Dahlias")){
            if(quantity>90){
                sum=quantity*3.8-0.15*quantity*3.8;
            }else{
                sum= quantity*3.8;
            }

        }else if(flower.equals("Tulips")){
            if(quantity>80){
                sum=quantity*2.8-0.15*quantity*2.8;
            }else {
                sum=quantity*2.8;
            }

        }else if(flower.equals("Narcissus")){
            if(quantity<120){
                sum=quantity*3+0.15*quantity*3;
            }else{
                sum=quantity*3;
            }

        } else if(flower.equals("Gladiolus")){
             if(quantity<80){
                 sum=quantity*2.5+0.2*quantity*2.5;

             }else{
                 sum=quantity*2.5;
             }
        }
        double difference = Math.abs(sum-budget);
        if(budget>=sum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",quantity,flower,difference);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",difference);
        }

    }
}
