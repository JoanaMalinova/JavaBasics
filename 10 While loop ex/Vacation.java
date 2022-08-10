package WhileLoopPractice;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int spend = 0;
        int days = 0;
        boolean cantSave = false;
        while (budget < moneyNeeded){
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            days += 1;

            if(action.equals("spend")){
                spend += 1;
                budget -= sum;
                if(budget<0){
                    budget = 0;
                }
                if(spend==5){
                    cantSave = true;
                    System.out.println("You can't save the money.");
                    System.out.println(days);
                    break;
                }

            }else{
                budget +=sum;
                spend = 0;
            }
        }
        if(!cantSave)
        System.out.printf("You saved the money for %d days.",days);

    }
}
