package ConditionalStAdvPrActice;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int lines = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int places = lines*columns;
        double totalSum = 0;
        switch (projection){
            case "Premiere":
                totalSum = places*12;
                break;
            case "Normal":
                totalSum=7.5*places;
                break;
            case"Discount":
                totalSum=5*places;
                break;
        }System.out.printf("%.2f",totalSum);
    }
}
