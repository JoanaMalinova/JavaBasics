package WhileLoopPractice;

import java.util.Scanner;

public class ExtraDishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottle= Integer.parseInt(scanner.nextLine());
        String end = scanner.nextLine();
        int counter = 0;
        int quantity = 0;
        int diff = 0;
        int pots = 0;
        int dishes = 0;
        boolean isEnough = true;
        while (!end.equals("End")) {
            int dishesPots = Integer.parseInt(end);
            counter ++;
            if(counter%3==0) {
                quantity += dishesPots * 15;
                pots += dishesPots;
            }else {
                quantity +=dishesPots * 5;
                dishes += dishesPots;
            }
            diff = Math.abs(750*bottle - quantity);
            if (quantity>750*bottle) {
                isEnough = false;
                System.out.printf("Not enough detergent, %d ml. more necessary!",diff);
                break;
            }
            end = scanner.nextLine();
        }
        if(isEnough){
        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n",dishes,pots);
        System.out.printf("Leftover detergent %d ml.",diff);
        }
    }
}
