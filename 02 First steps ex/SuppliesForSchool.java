package FirstStepsPractical;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPen = Integer.parseInt(scanner.nextLine());
        int numMar = Integer.parseInt(scanner.nextLine());
        int ltr =Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());
        double price = numPen*5.8 + numMar*7.2 + ltr*1.2;
        double finalPrice = price-price * discountPercent/100;
        System.out.println(finalPrice);


    }
}
