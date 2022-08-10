package FirstStepsPractical;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = Integer.parseInt(scanner.nextLine());
        double trainers = price-0.4*price;
        double clothing = trainers-0.2*trainers;
        double ball =clothing/4;
        double accessories= ball/5;
        double total = price+trainers+clothing+ball+accessories;
        System.out.println(total);
    }
}
