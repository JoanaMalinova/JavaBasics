package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruitType= scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price =0;
        if (dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Thursday")||
                dayOfWeek.equals("Wednesday")||dayOfWeek.equals("Friday")){
            if(fruitType.equals("banana")){
                price =quantity*2.5;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("apple")){
                  price=quantity*1.20;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("orange")){
                  price=quantity*0.85;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("grapefruit")){
                  price = quantity*1.45;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("kiwi")){
                price = quantity*2.7;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("pineapple")){
                price=quantity*5.5;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("grapes")){
                price = quantity*3.85;
                System.out.printf("%.2f",price);
            }else {
                System.out.println("error");
            }
        }else if (dayOfWeek.equals("Saturday")||dayOfWeek.equals("Sunday")){
            if(fruitType.equals("banana")){
                price =quantity*2.7;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("apple")){
                price=quantity*1.25;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("orange")){
                price=quantity*0.9;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("grapefruit")){
                price = quantity*1.6;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("kiwi")){
                price = quantity*3;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("pineapple")){
                price=quantity*5.6;
                System.out.printf("%.2f",price);
            }else if(fruitType.equals("grapes")){
                price = quantity*4.2;
                System.out.printf("%.2f",price);
            }else {
                System.out.println("error");
            }

        }else {
            System.out.println("error");
        }

    }
}
