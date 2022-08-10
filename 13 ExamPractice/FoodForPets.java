package ExamPractice;

import java.util.Scanner;

public class ExamFoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double foodQt =Double.parseDouble(scanner.nextLine());
        double biscuits =0;
        double totalDog =0;
        double totalCat=0;
        for (int i = 1; i <= days; i++) {
            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());
            totalCat += catFood;
            totalDog += dogFood;

        if(i%3==0){
                biscuits+=0.1*(catFood+dogFood);

            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n",biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n",(totalCat+totalDog)*100/foodQt);
        System.out.printf("%.2f%% eaten from the dog.%n",totalDog*100/(totalCat+totalDog));
        System.out.printf("%.2f%% eaten from the cat.",totalCat*100/(totalCat+totalDog));
    }
}
