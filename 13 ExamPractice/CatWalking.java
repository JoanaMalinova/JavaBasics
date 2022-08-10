package ExamPractice;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minWalkPerDay = Integer.parseInt(scanner.nextLine());
        int walksPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());
        double calories = minWalkPerDay*5*walksPerDay;
        if (caloriesPerDay*0.5<=calories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.",calories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.",calories);
        }
    }
}
