package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraMatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double moneyNeeded = 0;
        double transportExpenses = 0;
        switch(category){
            case "VIP":
                moneyNeeded=people*499.99;
                break;
            case"Normal":
                moneyNeeded=people*249.99;
                break;
        }
        if(people<4){
            transportExpenses=0.75*budget;
        }else if(people<=9){
            transportExpenses=0.6*budget;
        }else if(people<=24){
            transportExpenses=0.5*budget;
        }else if(people<=49){
            transportExpenses=0.4*budget;
        }else {
            transportExpenses=0.25*budget;
        }
        double diff = Math.abs(budget-(transportExpenses+moneyNeeded));
        if(moneyNeeded>budget-transportExpenses){
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }else {
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }
    }
}
