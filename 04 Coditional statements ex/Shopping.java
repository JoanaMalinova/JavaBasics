package CoditionalStPractical;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double videoCardPrice = videoCardCount*250;
        double processorPrice = processorCount*0.35*videoCardPrice;
        double ramPrice = ramCount*0.1*videoCardPrice;
        double totalPrice = videoCardPrice+processorPrice+ramPrice;
        if (videoCardCount>processorCount){
            totalPrice = totalPrice- 0.15*totalPrice;
        }
        double left = Math.abs(budget-totalPrice);
        if (budget>=totalPrice){
            System.out.printf("You have %.2f leva left!",left);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",left);
        }
    }
}
