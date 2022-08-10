package WhileLoopPractice;

import java.util.Scanner;

public class ExamClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wantedIncome = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();
        double sum = 0;
        double individualSum = 0;
        boolean targetAcquired = false;
        while (!cocktail.equals("Party!")) {
            int cocktailCount = Integer.parseInt(scanner.nextLine());
            individualSum = cocktailCount*cocktail.length();
            if (individualSum % 2 != 0) {
               individualSum -= 0.25*individualSum;
            }
            sum += Math.round(individualSum*100.0)/100.0;
            if(sum >= wantedIncome){
                targetAcquired = true;
                break;
            }

            cocktail = scanner.nextLine();
        }
        if(targetAcquired ){
            System.out.println("Target acquired.");

        }else {

            System.out.printf("We need %.2f leva more.%n",wantedIncome - sum);
        }
        System.out.printf("Club income - %.2f leva.",sum);

    }
}
