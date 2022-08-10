package ExamPractice;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String beverage = scanner.nextLine();
        String sugarAmt = scanner.nextLine();
        int bevNum = Integer.parseInt(scanner.nextLine());
        double price= 0;
        switch (beverage){
            case"Espresso":
                switch(sugarAmt){
                    case "Without":
                        price=0.9*bevNum-0.35*bevNum*0.9;
                        break;
                    case"Normal":
                        price =bevNum;
                        break;
                    case "Extra":
                        price = 1.2*bevNum;
                        break;
                }
                if(bevNum>=5){
                    price-=price*0.25;
                }
                break;

            case"Cappuccino":
                switch(sugarAmt){
                    case "Without":
                        price=bevNum-0.35*bevNum;
                        break;
                    case"Normal":
                        price =1.2*bevNum;
                        break;
                    case "Extra":
                        price = 1.6*bevNum;
                        break;
                }
                break;
            case"Tea":
                switch(sugarAmt){
                    case "Without":
                        price=0.5*bevNum-0.35*bevNum*0.5;
                        break;
                    case"Normal":
                        price =0.6*bevNum;
                        break;
                    case "Extra":
                        price = 0.7*bevNum;
                        break;
                }
                break;
        }
        if (price>15){
            price-=0.2*price;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",bevNum,beverage,price);
    }
}
