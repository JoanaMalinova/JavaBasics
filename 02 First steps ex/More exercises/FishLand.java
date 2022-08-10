package FirstStepsPractical;

import java.util.Scanner;

public class ExtraFishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        double musselKg = Double.parseDouble(scanner.nextLine());
        double bonitoPrice= bonitoKg*(0.6*mackerelPrice+mackerelPrice);
        double scadPrice= scadKg*(0.8*spratPrice+spratPrice);
        double musselPrice= musselKg*7.5;
        double bill = bonitoPrice+musselPrice+scadPrice;
        System.out.printf("%.2f",bill);
    }
}
