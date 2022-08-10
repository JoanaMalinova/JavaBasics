package ConditionalStAdvPrActice;

import java.util.Scanner;

public class NewHouse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double discountSum=0;
        switch(flower){
            case "Roses":
                sum=5*quantity;
                if(quantity>80) {
                    discountSum=sum-0.1*sum;
                }else{
                    discountSum=sum;
                }
                break;
            case"Dahlias":
                sum=quantity*3.8;
                if(quantity>90){
                    discountSum=sum-0.15*sum;
                }else{
                    discountSum= sum;
                }
                break;
            case"Tulips":
                sum=quantity*2.8;
                if(quantity>80){
                    discountSum=sum-0.15*sum;
                }else {
                    discountSum=sum;
                }
                break;
            case"Narcissus":
                sum=quantity*3;
                if(quantity<120){
                    discountSum=sum-0.15*sum;
                }else{
                    discountSum=sum;
                }
                break;
            case"Gladiolus":
                sum=quantity*2.5;
                if(quantity<80){
                    discountSum=sum+0.2*sum;

                }else{
                    discountSum=sum;
                }
                break;
        }
        double difference = Math.abs(discountSum-budget);
        if(budget>=discountSum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",quantity,flower,difference);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",difference);
        }
    }
}
