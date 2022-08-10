package CoditionalStPractical;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVacation =Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int dollNum = Integer.parseInt(scanner.nextLine());
        int teddyNum = Integer.parseInt(scanner.nextLine());
        int minionNum =Integer.parseInt(scanner.nextLine());
        int truckNum = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = puzzleNum*2.6;
        double dollPrice = dollNum*3;
        double teddyPrice = teddyNum*4.1;
        double minionPrice = minionNum*8.2;
        double truckPrice = truckNum*2;
        double totalPrice = puzzlePrice+dollPrice+teddyPrice+minionPrice+truckPrice;
        int totalNum = puzzleNum+dollNum+teddyNum+minionNum+truckNum;
        double finalPrice = 0;

        if(totalNum>=50){
             finalPrice = totalPrice-0.25*totalPrice;
        }else {
            finalPrice=totalPrice;
        }
        double income= finalPrice-0.1*finalPrice;
        double left = Math.abs(income-priceVacation);
        if(income>=priceVacation){
            System.out.printf(" Yes! %.2f lv left.",left);
        }else

            System.out.printf("Not enough money! %.2f lv needed.",left);




    }
}
