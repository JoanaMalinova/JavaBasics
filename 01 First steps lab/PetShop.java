package FirstStepsPractical;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        int totalCat=4*catFood;
        double totalDog= 2.5*dogFood;
        double total = totalCat+totalDog;
        System.out.println(total);
    }
}
