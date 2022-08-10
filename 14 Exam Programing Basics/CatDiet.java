package ExamProgramingBasics;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbohydratesPer = Integer.parseInt(scanner.nextLine());
        int totalCalorie = Integer.parseInt(scanner.nextLine());
        int waterPer = Integer.parseInt(scanner.nextLine());
        double foodWeight = fatPercentage*totalCalorie/(100.0*9) + proteinPercentage*totalCalorie/(100.0*4) + carbohydratesPer*totalCalorie/(100.0*4);
        double calPerGram = totalCalorie/foodWeight;
        double calWithoutWater = (100-waterPer)*calPerGram/100.0;
        System.out.printf("%.4f",calWithoutWater);

    }
}
