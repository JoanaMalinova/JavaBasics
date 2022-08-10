package CoditionalStPractical;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnoliaCount = Integer.parseInt(scanner.nextLine());
        int hyacinthCount = Integer.parseInt(scanner.nextLine());
        int roseCount = Integer.parseInt(scanner.nextLine());
        int cactusCount = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double flowerPrice = 3.25*magnoliaCount+4*hyacinthCount+3.50*roseCount+8*cactusCount;
        double flowerFinalPrc = flowerPrice-0.05*flowerPrice;
        if (flowerFinalPrc>=giftPrice){
            double moneyLeft = Math.floor(flowerFinalPrc-giftPrice);
            System.out.printf("She is left with %.0f leva.",moneyLeft);
        }else {
            double moneyNeeded = Math.ceil(giftPrice-flowerFinalPrc);
            System.out.printf("She will have to borrow %.0f leva.",moneyNeeded);
        }

    }
}
