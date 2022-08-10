package WhileLoopPractice;

import java.util.Scanner;

public class CareOfPuppyExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodQnt = Integer.parseInt(scanner.nextLine());
        String adopted = scanner.nextLine();
        int totalFoodEaten = 0;
        while(!adopted.equals("Adopted")) {
            int foodEaten = Integer.parseInt(adopted);
            totalFoodEaten += foodEaten;
            adopted = scanner.nextLine();
        }
        int diff = Math.abs(totalFoodEaten - foodQnt*1000);
        if(totalFoodEaten > foodQnt*1000) {
            System.out.printf("Food is not enough. You need %d grams more.",diff);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.",diff);
        }
    }
}
